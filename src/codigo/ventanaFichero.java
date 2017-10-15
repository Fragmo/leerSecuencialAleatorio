/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

/**
 *
 * @author marcf
 */
public class ventanaFichero extends javax.swing.JFrame {

    /**
     * Creates new form ventanaFichero
     */
    
    String direccion = "";
    Boolean ayuda = false;
    int codigoMenu = 0; 
    public ventanaFichero() {
        initComponents();
        dialogSelecionaFicheroParaHistorial.setSize(400,400);
        dialogLeerOEscribirArchivos.setSize(400,400);
//        dialogSelecionaFicheroParaHistorial.setModal(true);
//        dialogSelecionaFicheroParaHistorial.setVisible(true);
        dialogLeerOEscribirArchivos.setModal(true);
        dialogLeerOEscribirArchivos.setVisible(true);
        
    }
    
        public String leeArchivoSecuencial( String archivo){
        String textoTotal = ""; 
        String copiaLinea ="";
       
        try{
         FileReader fr = new FileReader(archivo);
         BufferedReader br = new BufferedReader (fr);
         
         while((copiaLinea = br.readLine()) != null){
             textoTotal = textoTotal + copiaLinea+ "/n";
         }
         
         br.close();
        }        
        catch(java.io.FileNotFoundException fnfex){   
        System.out.println("Archivo no encontrado!!!" + fnfex); 
        } 
        catch(java.io.IOException ioex){}
        return textoTotal;
    }
        
        public void escribeArchivoSecuencial(String archivo, Boolean bool){
            if(bool == false){// se sobreescribe el texto
                try{
                // System.out.println(textoArriba.getText());
                FileWriter puenteEscribir = new FileWriter(archivo, false);
                BufferedWriter buffEscribir = new BufferedWriter(puenteEscribir);
                buffEscribir.write(textoArriba.getText());
                buffEscribir.close();
                }catch(java.io.IOException ioex){}
            }else{// verdaderoooooooooo. se acumula el texto, no se sobreescribe
                try{
                // System.out.println(textoArriba.getText());
                FileWriter puenteEscribir = new FileWriter(archivo, true);
                BufferedWriter buffEscribir = new BufferedWriter(puenteEscribir);
                buffEscribir.write(textoArriba.getText());
                buffEscribir.close();
                }catch(java.io.IOException ioex){}
            }
        }
        
        
              


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogSelecionaFicheroParaHistorial = new javax.swing.JDialog();
        labelInformativoNombreCarpeta = new javax.swing.JLabel();
        nombreCarpeta = new javax.swing.JTextField();
        labelInformativoDireccionCarpeta = new javax.swing.JLabel();
        nombreDireccionCarpeta = new javax.swing.JTextField();
        listo = new javax.swing.JButton();
        dialogLeerOEscribirArchivos = new javax.swing.JDialog();
        archivoAleatorio = new javax.swing.JButton();
        archivoSecuencial = new javax.swing.JButton();
        copiarFichero = new javax.swing.JButton();
        crearFicheroOCarpeta = new javax.swing.JButton();
        labelOpcion = new javax.swing.JLabel();
        botonAyuda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoArriba = new javax.swing.JTextArea();
        guardaTexto = new javax.swing.JButton();
        textoAyuda = new javax.swing.JTextField();
        textoBuscaPalabra = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSecuencial = new javax.swing.JMenu();
        leerFicheroS = new javax.swing.JMenuItem();
        escribirFicheroS = new javax.swing.JMenu();
        escribirFInalFicheroS = new javax.swing.JMenuItem();
        sobreescribirFicheroS = new javax.swing.JMenuItem();
        menuALeatorio = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuCarpeta = new javax.swing.JMenu();
        crearCarpeta = new javax.swing.JMenuItem();
        crearFichero = new javax.swing.JMenuItem();

        labelInformativoNombreCarpeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelInformativoNombreCarpeta.setText("Introduzca el nombre del archivo a guardar sus ficheros");

        nombreCarpeta.setText("fichero.txt");

        labelInformativoDireccionCarpeta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelInformativoDireccionCarpeta.setText("Introduzca la direccion de la carpeta");

        nombreDireccionCarpeta.setText("C:\\Users\\marcf\\Documents\\DAM2\\Acceso a Datos\\");

            listo.setText("Listo");
            listo.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    listoMousePressed(evt);
                }
            });

            javax.swing.GroupLayout dialogSelecionaFicheroParaHistorialLayout = new javax.swing.GroupLayout(dialogSelecionaFicheroParaHistorial.getContentPane());
            dialogSelecionaFicheroParaHistorial.getContentPane().setLayout(dialogSelecionaFicheroParaHistorialLayout);
            dialogSelecionaFicheroParaHistorialLayout.setHorizontalGroup(
                dialogSelecionaFicheroParaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogSelecionaFicheroParaHistorialLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(dialogSelecionaFicheroParaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelInformativoNombreCarpeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelInformativoDireccionCarpeta, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                        .addGroup(dialogSelecionaFicheroParaHistorialLayout.createSequentialGroup()
                            .addGroup(dialogSelecionaFicheroParaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombreDireccionCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
                .addGroup(dialogSelecionaFicheroParaHistorialLayout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(listo)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            dialogSelecionaFicheroParaHistorialLayout.setVerticalGroup(
                dialogSelecionaFicheroParaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogSelecionaFicheroParaHistorialLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelInformativoNombreCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(nombreCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(labelInformativoDireccionCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(nombreDireccionCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(89, 89, 89)
                    .addComponent(listo)
                    .addContainerGap(44, Short.MAX_VALUE))
            );

            archivoAleatorio.setText("Archivo aleatorio");
            archivoAleatorio.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    archivoAleatorioMousePressed(evt);
                }
            });

            archivoSecuencial.setText("Archivo secuencial");
            archivoSecuencial.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    archivoSecuencialMousePressed(evt);
                }
            });

            copiarFichero.setText("Copiar fichero");
            copiarFichero.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    copiarFicheroMousePressed(evt);
                }
            });

            crearFicheroOCarpeta.setText("Crear fichero o carpeta");
            crearFicheroOCarpeta.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    crearFicheroOCarpetaMousePressed(evt);
                }
            });

            labelOpcion.setText("Selecione la acción que quiera utilizar");

            javax.swing.GroupLayout dialogLeerOEscribirArchivosLayout = new javax.swing.GroupLayout(dialogLeerOEscribirArchivos.getContentPane());
            dialogLeerOEscribirArchivos.getContentPane().setLayout(dialogLeerOEscribirArchivosLayout);
            dialogLeerOEscribirArchivosLayout.setHorizontalGroup(
                dialogLeerOEscribirArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogLeerOEscribirArchivosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(dialogLeerOEscribirArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(archivoSecuencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crearFicheroOCarpeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dialogLeerOEscribirArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(archivoAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(copiarFichero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
                .addGroup(dialogLeerOEscribirArchivosLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(labelOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE))
            );
            dialogLeerOEscribirArchivosLayout.setVerticalGroup(
                dialogLeerOEscribirArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogLeerOEscribirArchivosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addGroup(dialogLeerOEscribirArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(archivoAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(archivoSecuencial, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(dialogLeerOEscribirArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(copiarFichero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(crearFicheroOCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
            );

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            botonAyuda.setText("Ayuda");
            botonAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    botonAyudaMousePressed(evt);
                }
            });

            textoArriba.setColumns(20);
            textoArriba.setRows(5);
            jScrollPane1.setViewportView(textoArriba);

            guardaTexto.setText("Guardar Texto");
            guardaTexto.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    guardaTextoMousePressed(evt);
                }
            });

            textoBuscaPalabra.setText("Inserte Palabra  a buscar");
            textoBuscaPalabra.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    textoBuscaPalabraMousePressed(evt);
                }
            });
            textoBuscaPalabra.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    textoBuscaPalabraKeyPressed(evt);
                }
            });

            menuSecuencial.setText("Menu Secuencial");

            leerFicheroS.setText("Leer Fichero");
            leerFicheroS.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    leerFicheroSMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    leerFicheroSMouseExited(evt);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    leerFicheroSMousePressed(evt);
                }
            });
            menuSecuencial.add(leerFicheroS);

            escribirFicheroS.setText("Escribir Fichero");

            escribirFInalFicheroS.setText("Escribir al final del fichero");
            escribirFInalFicheroS.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    escribirFInalFicheroSMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    escribirFInalFicheroSMouseExited(evt);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    escribirFInalFicheroSMousePressed(evt);
                }
            });
            escribirFicheroS.add(escribirFInalFicheroS);

            sobreescribirFicheroS.setText("Sobreescribir el fichero");
            sobreescribirFicheroS.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    sobreescribirFicheroSMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    sobreescribirFicheroSMouseExited(evt);
                }
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    sobreescribirFicheroSMousePressed(evt);
                }
            });
            escribirFicheroS.add(sobreescribirFicheroS);

            menuSecuencial.add(escribirFicheroS);

            jMenuBar1.add(menuSecuencial);

            menuALeatorio.setText("Menu Aleatorio");

            jMenuItem4.setText("Leer fichero");
            menuALeatorio.add(jMenuItem4);

            jMenuItem5.setText("Escribir fichero");
            menuALeatorio.add(jMenuItem5);

            jMenuItem6.setText("Indicar tamaño de fichero");
            menuALeatorio.add(jMenuItem6);

            jMenuItem7.setText("Indicar numero de registros");
            menuALeatorio.add(jMenuItem7);

            jMenuBar1.add(menuALeatorio);

            menuCarpeta.setText("Menu Carpeta");

            crearCarpeta.setText("Crear carpeta ");
            crearCarpeta.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    crearCarpetaMousePressed(evt);
                }
            });
            menuCarpeta.add(crearCarpeta);

            crearFichero.setText("Crear fichero");
            crearFichero.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    crearFicheroMousePressed(evt);
                }
            });
            menuCarpeta.add(crearFichero);

            jMenuBar1.add(menuCarpeta);

            setJMenuBar(jMenuBar1);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textoAyuda)
                                .addComponent(jScrollPane1))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 190, Short.MAX_VALUE)
                            .addComponent(guardaTexto)
                            .addGap(189, 189, 189))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(textoBuscaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAyuda))))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAyuda)
                        .addComponent(textoBuscaPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(guardaTexto)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                    .addComponent(textoAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void listoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listoMousePressed

        direccion = nombreDireccionCarpeta.getText() + nombreCarpeta.getText();
        dialogSelecionaFicheroParaHistorial.setVisible(false);
       // textoAyuda.setVisible(false);
        System.out.println(codigoMenu);
       // este switch espara configurar las opciones de abajo conforme el boton que hayamos pulsado
       switch(codigoMenu){
           case 1: textoArriba.setText(leeArchivoSecuencial(direccion));break;
           //case 2: {try{textoArriba.setText(leeArchivoAleatorio(direccion));}catch(IOException ex){}}break;  
           case 4 : try{
                        // aqui se realiza la copia de un archivo a otro y se muestra por pantalla
                        FileWriter puenteEscribir = new FileWriter(nombreDireccionCarpeta.getText(), true);
                        BufferedWriter buffEscribir = new BufferedWriter(puenteEscribir);
                        //se realiza la copia
                        buffEscribir.write(leeArchivoSecuencial(nombreCarpeta.getText()));
                        
                        buffEscribir.close();
                   }catch(java.io.IOException ioex){};
                     // para ver como ha quedado
                     textoArriba.setText(leeArchivoSecuencial(nombreDireccionCarpeta.getText()));break;
                 // fin del caso 4
           
           default: textoArriba.setText("hola guapo");break;
       }


    }//GEN-LAST:event_listoMousePressed

    private void botonAyudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAyudaMousePressed
        
        
        if(ayuda){
            ayuda = false;
            botonAyuda.setText("ayuda");
            textoAyuda.setText("");
            textoAyuda.setVisible(false);
        }else{
            ayuda = true;
            JOptionPane.showMessageDialog(null, "Se te mostrara un breve texto explicativo cada vez que pongas el raton sobre cada una de las opciones", "Ayuda para la lectura y edicion de archivos", 1);
            botonAyuda.setText("cancelar ayuda");
            // esto es porque la ayuda de el apartado de crear carpetas es distinto. y el 3 hace referencia a esto
            if(codigoMenu == 3){
                textoAyuda.setVisible(true);
                textoAyuda.setText("escribe en el cuadro de arriba la dirección y nombre del archivo o carpeta");
            }
        }
    }//GEN-LAST:event_botonAyudaMousePressed

    private void archivoSecuencialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivoSecuencialMousePressed
        // abrimos el dialogo que pide la ruta de el archivo   
        
        // con esto los menus de las demas opciones se ocultan para no estorbar
        codigoMenu = 1;
        menuALeatorio.setVisible(false);
        menuCarpeta.setVisible(false);
        dialogLeerOEscribirArchivos.setVisible(false);
        
        // se cierran y abren las paginas conveinentes
        dialogSelecionaFicheroParaHistorial.setModal(true);
        dialogSelecionaFicheroParaHistorial.setVisible(true);
        dialogLeerOEscribirArchivos.setVisible(false);
        


        
    }//GEN-LAST:event_archivoSecuencialMousePressed

    private void archivoAleatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_archivoAleatorioMousePressed
        codigoMenu = 2;
        menuSecuencial.setVisible(false);
        menuCarpeta.setVisible(false);
        dialogLeerOEscribirArchivos.setVisible(false);
        dialogSelecionaFicheroParaHistorial.setModal(true);
        dialogSelecionaFicheroParaHistorial.setVisible(true);
        
        
    }//GEN-LAST:event_archivoAleatorioMousePressed

    private void crearFicheroOCarpetaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearFicheroOCarpetaMousePressed
        codigoMenu = 3;
        menuSecuencial.setVisible(false);
        menuALeatorio.setVisible(false);
        dialogLeerOEscribirArchivos.setVisible(false);
        guardaTexto.setVisible(false);
        

    }//GEN-LAST:event_crearFicheroOCarpetaMousePressed

    private void guardaTextoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardaTextoMousePressed
        Boolean bool = false;
        escribeArchivoSecuencial(direccion, bool);
    }//GEN-LAST:event_guardaTextoMousePressed

    private void leerFicheroSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leerFicheroSMouseEntered
        if(ayuda){
            textoAyuda.setText("Se muesta el contenido del archivo por pantalla");
            textoAyuda.setVisible(true);
        }
    }//GEN-LAST:event_leerFicheroSMouseEntered

    private void leerFicheroSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leerFicheroSMouseExited
        textoAyuda.setVisible(false);
    }//GEN-LAST:event_leerFicheroSMouseExited

    private void escribirFInalFicheroSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribirFInalFicheroSMouseEntered
        if(ayuda){
            textoAyuda.setText("lo que escribas en el cuadro de escritura se sumará al texto ya escrito del fichero");
            textoAyuda.setVisible(true);
        }
    }//GEN-LAST:event_escribirFInalFicheroSMouseEntered

    private void escribirFInalFicheroSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribirFInalFicheroSMouseExited
        textoAyuda.setVisible(false);
    }//GEN-LAST:event_escribirFInalFicheroSMouseExited

    private void sobreescribirFicheroSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreescribirFicheroSMouseEntered
        if(ayuda){
            textoAyuda.setText("lo que escribas en el cuadro de escritura será el contenido total del texto");
            textoAyuda.setVisible(true);
        }
    }//GEN-LAST:event_sobreescribirFicheroSMouseEntered

    private void sobreescribirFicheroSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreescribirFicheroSMouseExited
        textoAyuda.setVisible(false);
    }//GEN-LAST:event_sobreescribirFicheroSMouseExited

    private void leerFicheroSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leerFicheroSMousePressed
        textoArriba.setText(leeArchivoSecuencial(direccion));
    }//GEN-LAST:event_leerFicheroSMousePressed

    private void escribirFInalFicheroSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escribirFInalFicheroSMousePressed
        Boolean bool = true;
        escribeArchivoSecuencial(direccion, bool);
        System.out.println(direccion);
    }//GEN-LAST:event_escribirFInalFicheroSMousePressed

    private void sobreescribirFicheroSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreescribirFicheroSMousePressed
        Boolean bool = false;
        escribeArchivoSecuencial(direccion, bool);
    }//GEN-LAST:event_sobreescribirFicheroSMousePressed

    private void copiarFicheroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copiarFicheroMousePressed
        // boton de codigo 4 de los iniciales
        codigoMenu = 4;
        //ADAPTAMOS el dialog de pedir archivo Para pedir el la ruta de el archivo que copia y el copiado
        labelInformativoNombreCarpeta.setText("Escriba la ruta de el archivo que va a se copiado");
        nombreCarpeta.setSize(nombreDireccionCarpeta.getWidth(), nombreCarpeta.getHeight());
        nombreCarpeta.setText("");
        labelInformativoDireccionCarpeta.setText("Escriba el archivo al que se le copiaran los datos");
        nombreDireccionCarpeta.setText("");
        
        // cerramos las pestañas y adaptamos los menus del frma principal
        //PUEDE QUE HAYA 
//        ALGO 
//        MAL
        menuSecuencial.setVisible(false);
        menuALeatorio.setVisible(false);
        menuCarpeta.setVisible(false);
        dialogLeerOEscribirArchivos.setVisible(false);
                
        dialogSelecionaFicheroParaHistorial.setModal(true);
        dialogSelecionaFicheroParaHistorial.setVisible(true);
        
        
    }//GEN-LAST:event_copiarFicheroMousePressed

    private void crearCarpetaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCarpetaMousePressed
        File carpetita = new File(textoArriba.getText());
        carpetita.mkdir();
        if(carpetita.exists()){
           JOptionPane.showMessageDialog(null, "carpeta creada correctamente", "Asistente del creador de carpetas", 1);
        }else{
           JOptionPane.showMessageDialog(null, "no se ha podido crear la carpeta", "Asistente del creador de carpetas", 2); 
        }
    }//GEN-LAST:event_crearCarpetaMousePressed

    private void crearFicheroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearFicheroMousePressed
        File ficherito = new File(textoArriba.getText());
        // con este try ctach se crea el archivo
        try {
            ficherito.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(ventanaFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // comprobamos si se ha creado de manera correcta
        
        if(ficherito.exists()){
           JOptionPane.showMessageDialog(null, "Fichero creado correctamente", "Asistente del creador de ficheros", 1);
        }else{
           JOptionPane.showMessageDialog(null, "no se ha podido crear el fichero", "Asistente del creador de ficheros", 2); 
        }
    }//GEN-LAST:event_crearFicheroMousePressed

    private void textoBuscaPalabraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBuscaPalabraKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER){
    
        String palabraAbuscar= textoBuscaPalabra.getText();
        
        // prueba del Highlighter
        Highlighter luz = textoArriba.getHighlighter();
        //PARA CAMBIAR EL COLOR DEL RESALTADOR
        Highlighter.HighlightPainter amarillo = new DefaultHighlighter.DefaultHighlightPainter(Color.YELLOW);
        // para que se resetee cada vez que se busque una palabra
        luz.removeAllHighlights();
        
        
        
        // codigo que encuentra la palabra y les pone el color
        if(textoBuscaPalabra.getText().length() >=1){
            for(int i = 0; i<textoArriba.getText().length(); i++){
                if(textoArriba.getText().substring(i, i + textoBuscaPalabra.getText().length()).equals(palabraAbuscar)){

                    try{
                        luz.addHighlight(i, i + textoBuscaPalabra.getText().length(), amarillo);
                    } catch (BadLocationException ex) {}
                }
            }
            
        }else{
           luz.removeAllHighlights(); 
        }
        
        
    }
    }//GEN-LAST:event_textoBuscaPalabraKeyPressed

    private void textoBuscaPalabraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoBuscaPalabraMousePressed
        textoBuscaPalabra.setText("");
    }//GEN-LAST:event_textoBuscaPalabraMousePressed

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
            java.util.logging.Logger.getLogger(ventanaFichero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaFichero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaFichero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaFichero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaFichero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivoAleatorio;
    private javax.swing.JButton archivoSecuencial;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton copiarFichero;
    private javax.swing.JMenuItem crearCarpeta;
    private javax.swing.JMenuItem crearFichero;
    private javax.swing.JButton crearFicheroOCarpeta;
    private javax.swing.JDialog dialogLeerOEscribirArchivos;
    private javax.swing.JDialog dialogSelecionaFicheroParaHistorial;
    private javax.swing.JMenuItem escribirFInalFicheroS;
    private javax.swing.JMenu escribirFicheroS;
    private javax.swing.JButton guardaTexto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelInformativoDireccionCarpeta;
    private javax.swing.JLabel labelInformativoNombreCarpeta;
    private javax.swing.JLabel labelOpcion;
    private javax.swing.JMenuItem leerFicheroS;
    private javax.swing.JButton listo;
    private javax.swing.JMenu menuALeatorio;
    private javax.swing.JMenu menuCarpeta;
    private javax.swing.JMenu menuSecuencial;
    private javax.swing.JTextField nombreCarpeta;
    private javax.swing.JTextField nombreDireccionCarpeta;
    private javax.swing.JMenuItem sobreescribirFicheroS;
    private javax.swing.JTextArea textoArriba;
    private javax.swing.JTextField textoAyuda;
    private javax.swing.JTextField textoBuscaPalabra;
    // End of variables declaration//GEN-END:variables
}
