
import java.awt.Color; //para colocar color en la matriz
import javax.swing.text.BadLocationException; //para capturar error de "no hay texto"
import javax.swing.text.DefaultHighlighter; //para inicializar el poder subrayar texto
import javax.swing.text.Highlighter; //para subrayar
import javax.swing.text.Highlighter.HighlightPainter; //para subrayar tambien

//MATRICES PARA PALABRAS, NUMEROS Y COMENTARIOS

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author foto
 */
public class Matriz1 extends javax.swing.JFrame {

    /**
     * Creates new form Matriz1
     */
    public Matriz1() {
        initComponents();
    }

    public class MyThread extends Thread { //CLASE THREADS

        private String tipoToken, token; //parametros
        //metodos

        public MyThread(String tT, String t) { //constructor, obtenemos los valores enviados desde AnalizadorLexico
            tipoToken = tT;
            token = t;
        }

        public void run() { //METODO RUN DE LA CLASE THREADS
            Highlighter h = areaTexto.getHighlighter(); //inicializar objeto para subrayar
            HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.pink); //inicializar color de subrayado
            int i = 2; //para inicializar el ciclo while
            int largo = token.length(); //para saber cuantos caracteres hay
            boolean error = true; //para saber si se cerró correctamente el comentario
            char[] palabra = token.toCharArray(); //pasar el token a un arreglo de caracteres, para imprimirlo uno a uno en el form
            //MATRIZ DE NUMEROS
            if (tipoToken.equals("Numero:")) { //automata para numero
                while (i < 3) { //ciclo es infinito, se hará hasta que el usuario cierre la ventana
                    try {
                        h.addHighlight(63, 68, painter); //AÑADIR SUBRAYADO
                        palabraForm.setText(""); //INICIALIZAR LABEL CON PALABRA VACÍO
                    } catch (BadLocationException ex) { //ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500); //AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) { //ATRAPAR ERRORES
                    }
                    h.removeAllHighlights(); //REMOVER SUBRAYADO
                    try {
                        h.addHighlight(72, 74, painter);//AÑADIR SUBRAYADO
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO
                    try {
                        h.addHighlight(88, 90, painter);//AÑADIR SUBRAYADO
                        palabraForm.setText(" " + token.charAt(0));//colocar primer caracter en label
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO
                    try {
                        h.addHighlight(206, 208, painter);//AÑADIR SUBRAYADO
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO
                    for (int j = 1; j < largo; j++) { //ciclo para imprimir cada letra o caracter del token y subrayarlos
                        try {
                            h.addHighlight(222, 224, painter);//AÑADIR SUBRAYADO
                            palabraForm.setText(palabraForm.getText() + palabra[j]);//llenar label con los demas caracteres usando el for
                        } catch (BadLocationException ex) {//ATRAPAR ERRORES
                        }
                        try {
                            MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                        h.removeAllHighlights();//REMOVER SUBRAYADO
                        try {
                            MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                    }
                    try {
                        h.addHighlight(258, 265, painter);//AÑADIR SUBRAYADO
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO
                }

            } //MATRIZ DE IDENTIFICADORES O PALABRAS
            else if (tipoToken.equals("Identificador:")) {//automata para palabra
                boolean inicialNum = false;
                while (i < 3) {//ciclo es infinito, se hará hasta que el usuario cierre la ventana
                    int j = 0;
                    try {
                        h.addHighlight(63, 68, painter);//AÑADIR SUBRAYADO
                        palabraForm.setText("");//INICIALIZAR LABEL CON PALABRA VACÍO
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO
                    try {
                        h.addHighlight(72, 74, painter);//AÑADIR SUBRAYADO
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO

                    //SI EL PRIMER CARACTER ES UN NUMERO:
                    if (Character.isDigit(token.charAt(j))) {
                        inicialNum = true;
                        try {
                            h.addHighlight(88, 90, painter);//AÑADIR SUBRAYADO
                            palabraForm.setText(" " + token.charAt(j));//colocar primer caracter en label
                        } catch (BadLocationException ex) {//ATRAPAR ERRORES
                        }
                        try {
                            MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                        h.removeAllHighlights();//REMOVER SUBRAYADO
                        try {
                            h.addHighlight(206, 208, painter);//AÑADIR SUBRAYADO
                        } catch (BadLocationException ex) {//ATRAPAR ERRORES
                        }
                        try {
                            MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                        h.removeAllHighlights();//REMOVER SUBRAYADO
                        j++;
                        while (Character.isDigit(token.charAt(j))) {
                            try {
                                h.addHighlight(222, 224, painter);//AÑADIR SUBRAYADO
                                palabraForm.setText(palabraForm.getText() + palabra[j]);//llenar label con los demas caracteres usando el for
                            } catch (BadLocationException ex) {//ATRAPAR ERRORES
                            }
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            h.removeAllHighlights();//REMOVER SUBRAYADO
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            j++;
                        }
                    }

                    //CUANDO ENCUENTRE UNA LETRA VA A q1:
                    if (inicialNum == false) {
                        try {
                            h.addHighlight(78, 80, painter);//AÑADIR SUBRAYADO
                            palabraForm.setText(" " + token.charAt(0));//colocar primer caracter en label
                        } catch (BadLocationException ex) {//ATRAPAR ERRORES
                        }
                        try {
                            MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                        h.removeAllHighlights();//REMOVER SUBRAYADO
                    } else {
                        try {
                            h.addHighlight(212, 214, painter);//AÑADIR SUBRAYADO
                        } catch (BadLocationException ex) {//ATRAPAR ERRORES
                        }
                        try {
                            MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                        h.removeAllHighlights();//REMOVER SUBRAYADO
                    }
                    try {
                        h.addHighlight(138, 140, painter);//AÑADIR SUBRAYADO
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO
                    for (j = j; j < largo; j++) {//ciclo para imprimir cada letra o caracter del token y subrayarlos

                        if (Character.isAlphabetic(token.charAt(j))) {
                            try {
                                h.addHighlight(144, 146, painter);//AÑADIR SUBRAYADO
                                palabraForm.setText(palabraForm.getText() + palabra[j]);//llenar label con los demas caracteres usando el for
                            } catch (BadLocationException ex) {//ATRAPAR ERRORES
                            }
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            h.removeAllHighlights();//REMOVER SUBRAYADO
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                        } else if (Character.isDigit(token.charAt(j))) {
                            try {
                                h.addHighlight(154, 156, painter);//AÑADIR SUBRAYADO
                                palabraForm.setText(palabraForm.getText() + palabra[j]);//llenar label con los demas caracteres usando el for
                            } catch (BadLocationException ex) {//ATRAPAR ERRORES
                            }
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            h.removeAllHighlights();//REMOVER SUBRAYADO
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                        }
                    }
                    try {
                        h.addHighlight(190, 197, painter);//AÑADIR SUBRAYADO
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO

                }

                //MATRIZ DE COMENTARIOS
            } else if (tipoToken.equals("Comentario:")) {//automata para comentario
                while (i < 3) {//ciclo es infinito, se hará hasta que el usuario cierre la ventana
                    try {
                        h.addHighlight(63, 68, painter);//AÑADIR SUBRAYADO
                        palabraForm.setText("");//INICIALIZAR LABEL CON PALABRA VACÍO
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO
                    try {
                        h.addHighlight(72, 74, painter);//AÑADIR SUBRAYADO
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO
                    try {
                        h.addHighlight(96, 98, painter);//AÑADIR SUBRAYADO
                        palabraForm.setText(" " + token.charAt(0));//colocar primer caracter en label
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO
                    try {
                        h.addHighlight(274, 276, painter);//AÑADIR SUBRAYADO
                    } catch (BadLocationException ex) {//ATRAPAR ERRORES
                    }
                    try {
                        MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                    } catch (InterruptedException ex) {//ATRAPAR ERRORES
                    }
                    h.removeAllHighlights();//REMOVER SUBRAYADO
                    for (int j = 1; j < largo; j++) {//ciclo para imprimir cada letra o caracter del token y subrayarlos
                        palabraForm.setText(palabraForm.getText() + palabra[j]);//llenar label con los demas caracteres usando el for
                        //si es digito, mostrar digito en matriz
                        if (Character.isDigit(token.charAt(j))) {
                            try {
                                h.addHighlight(290, 292, painter);//AÑADIR SUBRAYADO
                            } catch (BadLocationException ex) {//ATRAPAR ERRORES
                            }
                            try {
                                MyThread.sleep(400);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            h.removeAllHighlights();//REMOVER SUBRAYADO
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            //si es letra, mostrar letra en matriz
                        } else if (Character.isAlphabetic(token.charAt(j))) {
                            try {
                                h.addHighlight(280, 282, painter);//AÑADIR SUBRAYADO
                            } catch (BadLocationException ex) {//ATRAPAR ERRORES
                            }
                            try {
                                MyThread.sleep(400);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            h.removeAllHighlights();//REMOVER SUBRAYADO
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            //si es espacio, mostrar espacio en matriz
                        } else if (Character.isWhitespace(token.charAt(j))) {
                            try {
                                h.addHighlight(310, 312, painter);//AÑADIR SUBRAYADO
                            } catch (BadLocationException ex) {//ATRAPAR ERRORES
                            }
                            try {
                                MyThread.sleep(400);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            h.removeAllHighlights();//REMOVER SUBRAYADO
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                        } //si es corchete, mostrar corchete en matriz
                        else if (palabra[j] == '[') {
                            try {
                                h.addHighlight(298, 300, painter);//AÑADIR SUBRAYADO
                            } catch (BadLocationException ex) {//ATRAPAR ERRORES
                            }
                            try {
                                MyThread.sleep(400);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            h.removeAllHighlights();//REMOVER SUBRAYADO
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                        } //si es fin de comentario, mostrar fin de comentario en matriz
                        else if (palabra[j] == ']') {
                            error = false; //se escribio correctamente
                            try {
                                h.addHighlight(303, 305, painter);//AÑADIR SUBRAYADO
                            } catch (BadLocationException ex) {//ATRAPAR ERRORES
                            }
                            try {
                                MyThread.sleep(400);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            h.removeAllHighlights();//REMOVER SUBRAYADO
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                        } //si es simbolo, mostrar simbolo en matriz
                        else {
                            try {
                                h.addHighlight(319, 321, painter);//AÑADIR SUBRAYADO
                            } catch (BadLocationException ex) {//ATRAPAR ERRORES
                            }
                            try {
                                MyThread.sleep(400);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                            h.removeAllHighlights();//REMOVER SUBRAYADO
                            try {
                                MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                            } catch (InterruptedException ex) {//ATRAPAR ERRORES
                            }
                        }
                    }
                    if (error == false) {//si se cerró el comentario correctamente
                        try {
                            h.addHighlight(340, 342, painter);//AÑADIR SUBRAYADO
                        } catch (BadLocationException ex) {//ATRAPAR ERRORES
                        }
                        try {
                            MyThread.sleep(400);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                        h.removeAllHighlights();//REMOVER SUBRAYADO
                        try {
                            MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                        try {
                            h.addHighlight(392, 399, painter);//AÑADIR SUBRAYADO
                        } catch (BadLocationException ex) {//ATRAPAR ERRORES
                        }
                        try {
                            MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                        h.removeAllHighlights();//REMOVER SUBRAYADO
                    } else {//si no se cerró el comentario correctamente...
                        try {
                            h.addHighlight(326, 332, painter);//AÑADIR SUBRAYADO
                        } catch (BadLocationException ex) {//ATRAPAR ERRORES
                        }
                        try {
                            MyThread.sleep(500);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                        h.removeAllHighlights();//REMOVER SUBRAYADO
                        try {
                            MyThread.sleep(250);//AÑADIR PAUSA A LA EJECUCIÓN
                        } catch (InterruptedException ex) {//ATRAPAR ERRORES
                        }
                    }

                }
            }

        }
    }

    public Matriz1(String tipoToken, String token) throws BadLocationException { //constructor para que se ejecute apenas abra
        initComponents();
        areaTexto.setEditable(false); //para que el usuario no edite la tabla
        MyThread parar = new MyThread(tipoToken, token); //objeto thread
        parar.start(); //se inicia el thread (ciclo con interrupciones)
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        palabraForm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaTexto.setColumns(20);
        areaTexto.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        areaTexto.setRows(5);
        areaTexto.setText("Estado  Q    Letra    Número    [    ]    Espacio   Sim.    fdc\n--->    q0    q1        q2      q3   q4     q4       q4     error\n*       q1    q1        q1      --   --     --       --     aceptar\n*       q2    q1        q2      --   --     --       --     aceptar\n        q3    q3        q3      q3   q4     q3       q3     error\n*       q4    --        --      --   --     --       --     aceptar");
        jScrollPane2.setViewportView(areaTexto);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Matriz de Transición");

        palabraForm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        palabraForm.setText("Matriz de Transición");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                            .addComponent(palabraForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(palabraForm)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Matriz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel palabraForm;
    // End of variables declaration//GEN-END:variables
}
