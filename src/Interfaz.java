//Ezequiel Abrego
//Cesar Aparicio
//Oriel Camaño

//CODIGO PRINCIPAL, FORM PRINCIPAL
import java.awt.Desktop;
import java.io.BufferedReader; //libreria para obtener palabras de archivos
import java.io.File; //libreria para crear archivos
import java.io.FileNotFoundException;
import java.io.FileReader; //libreria para leer archivos
import java.io.FileWriter; //libreria para escribir en un archivo
import java.io.IOException; //libreria para manejar excepciones
import javax.swing.table.DefaultTableModel; //libreria para la tabla de tokens
import java.util.StringTokenizer; //libreria para tokenizar cadenas
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; //libreria para mostrar mensajes
import javax.swing.text.BadLocationException; //libreria para subrayar en la matriz

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    /**
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elegirArchivo = new javax.swing.JFileChooser();
        guardarArchivo = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        analisis = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaFinal = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        crearArchivo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTextoErrores = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        archivoAnalizar = new javax.swing.JMenuItem();
        archivoCerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        abrirPReservadas = new javax.swing.JMenuItem();
        abrirSimbolos = new javax.swing.JMenuItem();

        elegirArchivo.setDialogTitle("Eliga un archivo de texto...");
        elegirArchivo.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Escriba un texto:");

        limpiar.setText("Borrar Todo");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        analisis.setText("Analizar");
        analisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisisActionPerformed(evt);
            }
        });

        tablaFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Tipo", "Token"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFinal.setSurrendersFocusOnKeystroke(true);
        tablaFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFinalMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaFinal);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Analizador Sintáctico");

        crearArchivo.setText("Crear Archivo");
        crearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearArchivoActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione un elemento de la tabla para ver su matriz");

        jLabel4.setText("Por: Ezequiel Abrego, Cesar Aparicio, Oriel Camaño");

        areaTextoErrores.setEditable(false);
        areaTextoErrores.setColumns(20);
        areaTextoErrores.setRows(5);
        jScrollPane2.setViewportView(areaTextoErrores);

        jMenu1.setText("Archivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        archivoAnalizar.setText("Analizar archivo...");
        archivoAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoAnalizarActionPerformed(evt);
            }
        });
        jMenu1.add(archivoAnalizar);

        archivoCerrar.setText("Cerrar programa");
        archivoCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(archivoCerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ver");

        abrirPReservadas.setText("Palabras Reservadas...");
        abrirPReservadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirPReservadasActionPerformed(evt);
            }
        });
        jMenu2.add(abrirPReservadas);

        abrirSimbolos.setText("Símbolos y Operadores...");
        abrirSimbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirSimbolosActionPerformed(evt);
            }
        });
        jMenu2.add(abrirSimbolos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crearArchivo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(analisis)
                                        .addGap(18, 18, 18)
                                        .addComponent(limpiar))))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(analisis)
                            .addComponent(limpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(crearArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //CÓDIGO DEL BOTÓN DE ANÁLISIS.
    private void analisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisisActionPerformed
        try {
            analizadorLexico(); //llamamos a una funcion
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_analisisActionPerformed

    //CODIGO PARA ANALIZAR TEXTO
    public void analizadorLexico() throws IOException {
        //linea para obtener el diseño de la tabla
        DefaultTableModel tabla = (DefaultTableModel) tablaFinal.getModel();
        tabla.setRowCount(0); //cantidad de filas es 0 cada vez que se presiona este boton.

        String texto = "";
        String hc = "";

        try {
            FileWriter escribir = new FileWriter("utext.txt", false);//inicializar un texto
            escribir.write(areaTexto.getText()); //colocar el area de texto en el documento.
            escribir.close();//cerramos el archivo al terminar de usarlo.
        } catch (IOException ex) {
            //se atrapa el error de "no se guardo correctamente"
        }

        try {
            FileReader f = new FileReader("utext.txt");
            BufferedReader archivo = new BufferedReader(f);
            while ((hc = archivo.readLine()) != null) {
                texto = texto + " " + hc;
            };

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "El archivo 'utext.txt' no fue encontrado...");
        }

        //lineas de codigo para abrir un archivo de palabras reservadas
        String[] pReservadas = new String[15];
        try {
            FileReader f = new FileReader("testlectura.txt"); //leemos el archivo que esta en la carpeta del proyecto
            BufferedReader archivo = new BufferedReader(f); //extraemos el texto del archivo
            for (int i = 0; i < 15; i++) { //ciclo for para leer linea por linea las palabras reservadas
                pReservadas[i] = archivo.readLine(); //asignamos cada palabra a una cadena de strings
            }
        } catch (IOException e) { //try catch para capturar error "no se encontro el archivo"
            JOptionPane.showMessageDialog(null, "El archivo 'testlectura.txt' no fue encontrado...");
        }

        //lineas de codigo para abrir un archivo de simbolos especiales
        String separadores = ""; //string para guardar los simbolos
        try {
            FileReader f = new FileReader("separador.txt");//leemos el archivo que esta en la carpeta del proyecto
            BufferedReader archivo = new BufferedReader(f); //extraemos el texto del archivo
            separadores = archivo.readLine(); //leemos los simbolos especiales, estos estan en una sola linea
        } catch (IOException e) { //try catch para capturar error "no se encontro el archivo"
            JOptionPane.showMessageDialog(null, "El archivo 'separador.txt' no fue encontrado...");
        }
        // String separadores = " !#$%&=?¿¡,;.:_-+*/<>[]{}()0123456789";

        boolean pCom = false; //verificar si se esta leyendo un comentario para evitar errores
        boolean pRes = false; //palabra reservada
        boolean pIgual = false;
        boolean pComa = false;

        int posLinea = 0; //para saber en cuál linea estamos.
        int posPila = 0; //para guardar la info de la pila del usuario
        int pos = 1; //para saber en qué token estamos. es la primera columna del analizador
        String pilaUsuario = "";
        StringTokenizer cantPalTexto = new StringTokenizer(texto, separadores + System.getProperty("line.separator"), true);
        String[] comentario = new String[cantPalTexto.countTokens()]; //cadena para salvar comentarios

        StringTokenizer lineas = new StringTokenizer(areaTexto.getText(), System.getProperty("line.separator")); //tokenizamos el texto

        while (lineas.hasMoreTokens()) {
            posLinea++;
            posPila = 0;
            //creamos objeto de StringTokenizer, este tomará un texto y lo separará en una cadena de strings
            //parametros enviados: texto a tokenizar, delimitadores, true para que los delimitadores sean tokens
            StringTokenizer palabras = new StringTokenizer(lineas.nextToken(), separadores + System.getProperty("line.separator"), true); //tokenizamos el texto
            String palabra;
            pilaUsuario = "";

            while (palabras.hasMoreTokens()) {//el ciclo se repetira por cada Token
                palabra = palabras.nextToken(); //para navegar por el arreglo de strings
                int cantPalabras = 0; //contador para numeros

                //DETERMINAR SI ES PALABRAS RESERVADAS
                for (int i = 0; i < pReservadas.length; i++) {//ciclo para revisar cada palabra reservada 
                    if (palabra.equals(pReservadas[i])) { //si la palabra es palabra reservada...
                        esAlgo(palabra, 1, pos, tabla);//funcion para Token, enviar palabra, numero para switch, posicion y var tabla
                        pilaUsuario = pilaUsuario + " " + "tipoDato";
                        pRes = true;
                    }
                }

                if (palabra.equals("[")) {
                    while (!palabra.equals("]")) {
                        comentario[cantPalabras] = palabra;
                        cantPalabras++;
                        try {
                            palabra = palabras.nextToken();
                        } catch (java.util.NoSuchElementException e) {
                            /*try {
                                lineas.nextToken();
                                palabras = new StringTokenizer(lineas.nextToken(), separadores + System.getProperty("line.separator"), true); //tokenizamos el texto
                                palabra = palabras.nextToken();
                                posLinea++;
                            } catch (java.util.NoSuchElementException ex) {
                                break;
                            }*/
                            break;
                        }
                    }

                    if (palabra.equals("]")) {
                        comentario[cantPalabras++] = palabra;
                    }

                    String[] comentarioUnir = new String[cantPalabras];//arreglo para guardar la cadena
                    for (int i = 0; i < cantPalabras; i++) {
                        comentarioUnir[i] = comentario[i];//guardamos los datos en la nueva cadena
                        //para evitar errores, pasamos las lineas a otro arreglo.
                    }
                    String comentarioFinal = String.join("", comentarioUnir);//unimos el arreglo 

                    esAlgo(comentarioFinal, 2, pos, tabla);//funcion para Token, enviar cadena, cantidad de caracteres, posicion y var tabla
                    pCom = true;
                }

                if (palabra.matches("\\d+")) {//VERIFICAR SI LA PALABRA ES UN NUMERO
                    esAlgo(palabra, 3, pos, tabla);//funcion para Token, enviar palabra, numero para switch, posicion y var tabla}
                    pilaUsuario = pilaUsuario + " " + "numero";
                } else if (palabra.equals(";") || (palabra.equals("]") && pCom == false)) { //DETERMINAR SIMBOLO
                    esAlgo(palabra, 4, pos, tabla);//funcion para Token, enviar palabra, numero para switch, posicion y var tabla
                    pilaUsuario = pilaUsuario + " " + "terminal";
                } else if (palabra.matches("[+|%|*|/]") || palabra.matches("-")) { //DETERMINAR OPERANDO
                    esAlgo(palabra, 5, pos, tabla);//funcion para Token, enviar palabra, numero para switch, posicion y var tabla
                    pilaUsuario = pilaUsuario + " " + "operador";
                } else if (palabra.equals("=")) { //DETERMINAR OPERANDO
                    esAlgo(palabra, 5, pos, tabla);//funcion para Token, enviar palabra, numero para switch, posicion y var tabla
                    pilaUsuario = pilaUsuario + " " + "igual";
                    pIgual = true;
                } else if (palabra.matches("[:|_]")) { //DETERMINAR OPERANDO
                    esAlgo(palabra, 5, pos, tabla);//funcion para Token, enviar palabra, numero para switch, posicion y var tabla
                    pilaUsuario = pilaUsuario + " " + "booleano";
                } else if (palabra.equals(",")) { //DETERMINAR OPERANDO
                    esAlgo(palabra, 5, pos, tabla);//funcion para Token, enviar palabra, numero para switch, posicion y var tabla
                    pComa = true;
                    pilaUsuario = pilaUsuario + " " + "coma";
                } else if (pCom == false && pRes == false && !palabra.matches("[ |\n|\r|\t]") && !palabra.matches(System.getProperty("line.separator"))) {//DETERMINAR IDENTIFICADOR
                    esAlgo(palabra, 6, pos, tabla);//funcion para Token, enviar palabra, numero para switch, posicion y var tabla
                    if (pIgual == true && pComa == false) {
                        pilaUsuario = pilaUsuario + " " + "identificador2";
                    } else {
                        pilaUsuario = pilaUsuario + " " + "identificador";
                        pComa=false;
                    }
                }
                pCom = false; //se hace false la variable de comentarios
                pRes = false; //se hace false la variable de palabras reservadas
                if (!palabra.matches("[ |\n|\r|\t]") && !palabra.matches(System.getProperty("line.separator"))) {
                    pos++; //se incrementa pos en el arreglo de tokens
                    posPila++;
                }
            }//termina el ciclo por token

            StringTokenizer pila = new StringTokenizer(pilaUsuario, " ");
            String[] pilaUser = new String[pila.countTokens()];
            for (int p = 0; p < pilaUser.length; p++) {
                pilaUser[p] = pila.nextToken();
            }
            analizadorSintactico(pilaUser, posLinea);
            pIgual = false;
        } //termina el ciclo por linea
    }

    //funcion llamada desde Analizar para mostrar datos en la tabla
    public void esAlgo(String palabra, int num, int pos, DefaultTableModel tabla) {
        String tipoToken = ""; //inicializacion
        switch (num) {
            case 1: //num 1 es reservado
                tipoToken = "Reservado:";
                break;
            case 2: //num 2 es reservado
                tipoToken = "Comentario:";
                break;
            case 3: //num 2 es reservado
                tipoToken = "Numero:";
                break;
            case 4: //num 2 es reservado
                tipoToken = "Simbolo:";
                break;
            case 5: //num 2 es reservado
                tipoToken = "Operador:";
                break;
            case 6: //num 3 es reservado
                tipoToken = "Identificador:";
                break;
        }
        //añadirmos una fila con la posicion, el tipo de token y el token.
        tabla.addRow(new Object[]{pos, tipoToken, palabra});
    }

    public void analizadorSintactico(String[] pilaUsuario, int posLinea) {
        int huboerror = 0;
        if (pilaUsuario.length <= 1) {
            areaTextoErrores.setText("Se encontró un error cerca de: " + pilaUsuario[0] + ", en la linea: " + posLinea + ". SENTENCIA NO VÁLIDA.");
        } else {
            if ((pilaUsuario[0].equals("tipoDato")) && (pilaUsuario[pilaUsuario.length - 1].equals("terminal"))) {
                String[] producciones = {"tipoDato", "identificador", "coma", "igual", "numero", "operador", "identificador2", "booleano", "terminal"};
                int validacion[][] = {
                    {0, 1, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 1, 0, 0, 0, 0, 1},
                    {0, 1, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 0, 1, 1, 0},
                    {0, 0, 1, 0, 0, 1, 0, 0, 1},
                    {0, 0, 0, 0, 1, 0, 1, 0, 0},
                    {0, 0, 1, 0, 0, 1, 0, 0, 1},
                    {0, 0, 1, 0, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0}};

                int antToken = -1, actToken;
                for (int i = 0; i < pilaUsuario.length; i++) {

                    actToken = obtenerProduccion(pilaUsuario[i], 1);
                    if (antToken >= 0) {
                        if (validacion[antToken][actToken] == 0) {
                            areaTextoErrores.setText("Se encontró un error cerca de: " + producciones[antToken] + ", en la linea: " + posLinea);
                            huboerror = 1;
                        }
                    }
                    antToken = actToken;
                }
            } else {
                areaTextoErrores.setText("Se encontró un error cerca de: " + pilaUsuario[0] + ", en la linea: " + posLinea);
                huboerror = 1;
            }

            /*   if (false) {
                String[] producciones = {"tipoDato", "identificador", "igual", "numero", "operador", "identificador2", "booleano", "terminal"};
                int validacion[][] = {
                    {0, 1, 0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0, 0, 1},
                    {0, 0, 0, 1, 0, 1, 0},
                    {0, 0, 0, 0, 1, 0, 1},
                    {0, 0, 0, 1, 0, 1, 0},
                    {0, 0, 0, 0, 1, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0}};

                int antToken = -1, actToken;
                for (int i = 0; i < pilaUsuario.length; i++) {

                    actToken = obtenerProduccion(pilaUsuario[i], 2);
                    if (antToken >= 0) {
                        if (validacion[antToken][actToken] == 0) {
                            areaTextoErrores.setText("Se encontró un error cerca de: " + producciones[antToken] + ", en la linea: " + posLinea);
                            huboerror = 1;
                        }
                    }
                    antToken = actToken;
                }
            } else {
                areaTextoErrores.setText("Se encontró un error cerca de: " + pilaUsuario[0] + ", en la linea: " + posLinea);
                huboerror = 1;
            } */
            if (huboerror == 0) {
                areaTextoErrores.setText("compilación exitosa :D");
            }
        }
    }

    public int obtenerProduccion(String tipoToken, int p) {
        int produccion = 0;
        switch (p) {

            case 1: {
                String[] producciones = {"tipoDato", "identificador", "coma", "igual", "numero", "operador", "identificador2", "booleano", "terminal"};

                for (int i = 0; i < producciones.length; i++) {
                    if (tipoToken.equals(producciones[i])) {
                        produccion = i;
                        break;
                    }
                }

            }

            case 2: {

            }

        }
        return produccion;
    }

    //BOTON PARA BORRAR TABLA
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        //linea para obtener el diseño de la tabla
        DefaultTableModel tabla = (DefaultTableModel) tablaFinal.getModel();
        tabla.setRowCount(0); //cantidad de filas es 0 cada vez que se presiona este boton.
        areaTexto.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    //BOTON PARA BUSCAR ARCHIVO
    private void archivoAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoAnalizarActionPerformed
        int returnVal = elegirArchivo.showOpenDialog(this);//codigo para la ventana
        if (returnVal == elegirArchivo.APPROVE_OPTION) { //si se presiona OPEN
            File f = elegirArchivo.getSelectedFile(); //creamos un file con el file
            try {
                //colocamos el texto del file en el area de texto.
                areaTexto.read(new FileReader(f.getAbsolutePath()), null);
            } catch (IOException ex) {
            }//se coloca el try catch para atrapar el error de "no se encontró"
        }
    }//GEN-LAST:event_archivoAnalizarActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    class MyCustomFilter extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            // permitir solo carpetas y archivos 
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }

        @Override
        public String getDescription() {
            return "Text documents (*.txt)";
        }
    }

    //BOTON DEL MENU PARA CERRAR LA APLICACION.
    private void archivoCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_archivoCerrarActionPerformed

    //BOTON PARA CREAR ARCHIVO
    private void crearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearArchivoActionPerformed
        int opcion = guardarArchivo.showSaveDialog(this);//codigo para la ventana
        if (opcion == guardarArchivo.APPROVE_OPTION) {//si se presiona SAVE
            //direccion del archivo guardado
            String direccion = guardarArchivo.getSelectedFile().getAbsolutePath();
            File archivo = new File(direccion);//se crea el archivo en esa direccion
            try {
                FileWriter escribir = new FileWriter(archivo, false);//inicializar un texto
                escribir.write(areaTexto.getText()); //colocar el area de texto en el documento.
                escribir.close();//cerramos el archivo al terminar de usarlo.
            } catch (IOException ex) {
                //se atrapa el error de "no se guardo correctamente"
            }
            areaTexto.setText("");//borro el texto ingresado
        }
    }//GEN-LAST:event_crearArchivoActionPerformed

//BOTON PARA VER LAS MATRICES
    private void tablaFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFinalMouseClicked
        try {
            verMatriz();//llamo a la funcion que enseña la matriz
        } catch (BadLocationException ex) { //capturo errores      
        } catch (InterruptedException ex) { //capturo errores
        }
    }//GEN-LAST:event_tablaFinalMouseClicked

    //FUNCION PARA LLAMAR A LAS MATRICES DESDE LA TABLA DE TOKENS
    public void verMatriz() throws BadLocationException, InterruptedException { //capturo errores
        int fila = tablaFinal.getSelectedRow(); //guardar el numero de fila
        //obtener la informacion de tipo de token
        String tipoToken = tablaFinal.getModel().getValueAt(fila, 1).toString();
        //obtener la palabra del token
        String token = tablaFinal.getModel().getValueAt(fila, 2).toString();
        //cuando la informacion encuentre su pareja, se sabra que automata mostrar.
        if (tipoToken.equals("Numero:") || tipoToken.equals("Identificador:") || tipoToken.equals("Comentario:")) { //automata para numero
            Matriz1 matriz = new Matriz1(tipoToken, token);//inicializamos un objeto de la funcion constructor con los parametros necesarios
            matriz.setVisible(true);//mostrar matriz
            matriz.pack();//ajustar matriz
            matriz.setDefaultCloseOperation(Matriz1.DISPOSE_ON_CLOSE);
        } else if (tipoToken.equals("Reservado:") || tipoToken.equals("Simbolo:") || tipoToken.equals("Operador:")) {//automata para pReservada
            Matriz2 matriz = new Matriz2(tipoToken);//inicializamos un objeto de la funcion constructor con los parametros necesarios
            matriz.setVisible(true);//mostrar matriz
            matriz.pack();//ajustar matriz
            matriz.setDefaultCloseOperation(Matriz2.DISPOSE_ON_CLOSE);
        }
    }


    private void abrirPReservadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirPReservadasActionPerformed
        // TODO add your handling code here:
        File f = new File("testlectura.txt"); //obtengo el archivo pedido
        try {
            Desktop.getDesktop().open(f); //lo abro con esta funcion

        } catch (IOException ex) { //capturo error en caso de que no se encuentre el archivo
            JOptionPane.showMessageDialog(null, "El archivo 'separador.txt' no fue encontrado...");
        }

    }//GEN-LAST:event_abrirPReservadasActionPerformed

    private void abrirSimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirSimbolosActionPerformed
        // TODO add your handling code here:
        File f = new File("separador.txt");//obtengo el archivo pedido
        try {
            Desktop.getDesktop().open(f);//lo abro con esta funcion

        } catch (IOException ex) {//capturo error en caso de que no se encuentre el archivo
            JOptionPane.showMessageDialog(null, "El archivo solicitado no fue encontrado...");
        }
    }//GEN-LAST:event_abrirSimbolosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirPReservadas;
    private javax.swing.JMenuItem abrirSimbolos;
    private javax.swing.JButton analisis;
    private javax.swing.JMenuItem archivoAnalizar;
    private javax.swing.JMenuItem archivoCerrar;
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JTextArea areaTextoErrores;
    private javax.swing.JButton crearArchivo;
    private javax.swing.JFileChooser elegirArchivo;
    private javax.swing.JFileChooser guardarArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton limpiar;
    private javax.swing.JTable tablaFinal;
    // End of variables declaration//GEN-END:variables
}
