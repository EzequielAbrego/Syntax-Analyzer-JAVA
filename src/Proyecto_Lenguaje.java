/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


/**
 *
 * @author analuo
 */
public class Proyecto_Lenguaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String texto = "@Michael";
        int po=2, pa=4, pe=0;
System.out.println();
        String[] palabrasR = new String[15];
        
        try {
            FileReader f = new FileReader("PalabrasR.txt");
            BufferedReader archivo = new BufferedReader(f);
            for(int i=0;i<15;i++){
                palabrasR[i]=archivo.readLine();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "El archivo 'PalabrasR.txt' no fue encontrado...");
        }
        
        String separadores="";
        
         try {
            FileReader f = new FileReader("separadores.txt");
            BufferedReader archivo = new BufferedReader(f);
            separadores = archivo.readLine();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "El archivo 'separadores.txt' no fue encontrado...");
        }
    
        
        StringTokenizer palabras = new StringTokenizer(texto, separadores+System.getProperty("line.separator"), true);
        String palabra = "";

        String[] coment = new String[palabras.countTokens()];
        String comentarioTotal = "";
        int cantPalCom = 1;

        int numToken = 1;
        boolean esReservado = false;
        boolean esComentario = false;

        while (palabras.hasMoreTokens()) {
            palabra = palabras.nextToken();

            //PALABRAS RESERVADAS
            for (int i = 0; i < palabrasR.length; i++) {
                if (palabra.equals(palabrasR[i])) {
                    System.out.println(numToken + ") " + "PALABRA RESERVADA: " + palabra);
                    esReservado = true;
                }
            }

            if (palabra.equals("@")) {
                coment[0] = "@";
                try {
                    palabra = palabras.nextToken();
                } catch (NoSuchElementException e) {
                    System.out.println(numToken + ") " + "SIMBOLO: " + palabra);
                    break;
                }
                while (!palabra.equals("@")) {
                    try {
                        coment[cantPalCom] = palabra;
                        cantPalCom++;
                        palabra = palabras.nextToken();
                    } catch (NoSuchElementException e) {
                        break;
                    }
                }
                if (palabra.equals("@")) {
                    coment[cantPalCom++] = palabra;
                    
                }

                String[] comentario = new String[cantPalCom];

                for (int i = 0; i < cantPalCom; i++) {
                    comentario[i] = coment[i];
                }

                comentarioTotal = String.join("", comentario);
                System.out.println(numToken + ") " + "COMENTARIO: " + comentarioTotal);
                
                esComentario = true;
                cantPalCom = 1;
            }

            if (palabra.matches("\\d+")) {
                System.out.println(numToken + ") " + "NUMERO: " + palabra);
            } else if (palabra.matches("[,|.|;|:|_|!|#|$|&|¡|?|¿]")) {
                System.out.println(numToken + ") " + "SIMBOLO: " + palabra);
            } else if (palabra.matches("[%|+|-|*|/|^|¬|<|>|(|=|{|}|)]")) {
                System.out.println(numToken + ") " + "OPERADOR: " + palabra);
            } else if (esReservado == false && esComentario == false && !palabra.equals(" ") && !palabra.equals(System.getProperty("line.separator"))) {
                System.out.println(numToken + ") " + "IDENTIFICADOR: " + palabra);
            }

            esReservado = false;
            esComentario = false;

            if (!palabra.equals(" ")) {
                numToken++;
            }

        }

    }

}
