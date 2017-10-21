/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import javax.swing.JTextArea;
import java.lang.Math.*;
/**
 *
 * @author marcf
 */
public class Registro  {
    //variables de la clase
    char[] nombre = new char[25];
    int edad = 0;
    char[] pais = new char[30];
    char[] sexo = new char[9] ;
    int tamañoRegistro= 0;
    int numeroRegistros =0;
    //JTextArea textito =  metodoParaTextoArriba();
    //constructor de la clase
    
    Registro (){}; // este se usará para leer, ya que el rchivo nos da los registros
    Registro(char[] nombre, int edad, char[] pais, char[] sexo){  // es se usara para escribir, ya que neceitamos los datos para ello
        this.nombre = nombre;
        this.edad =edad;
        this.pais = pais;
        this.sexo = sexo;
    }
//    public void mandaRegistroALaPantalla(String direccion) throws IOException{
//        Registro contenedor [] = leerRegistros(direccion);
//        for (int i = 0; i<contenedor.length; i++){
//            String n = new String(contenedor[1].nombre);
//            String p = new String(contenedor[3].pais);
//            String s = new String(contenedor[4].sexo);
//            textito.setText(textito.getText() + " " + n + " " + contenedor[2].edad + " " + p + " " + s + " "  );
//            
//            
//            
//        }
//    }
    public  void leerRegistros(String direccion, ventanaFichero v) throws FileNotFoundException, IOException{
        System.out.println("hola");
    
        JTextArea textito =  v.metodoParaTextoArriba();
        // declaramos el acceso al archivo
        File puenteAleatorio = new File(direccion); 
        RandomAccessFile buffAleatorio = new RandomAccessFile(puenteAleatorio, "rw");
        //variables para saber el nº de registros
        int tamañoArchivo = (int) buffAleatorio.length();
        int tamañoRegistro =  66 ; //132esto es en bytes
        int numeroRegistros =  tamañoArchivo  / tamañoRegistro;
        
        Registro [] contenerdorRegistros = new Registro[numeroRegistros];
        System.out.println("numero registros "+ numeroRegistros + "tamaño archivo " + tamañoArchivo );
        //comenzamos a leer el archivo
        // almaceno todos los registros
        buffAleatorio.seek(0);


        for(int i = 0; i<= numeroRegistros ; i++){
            System.out.println("111");
            char [] nombreConversion = new char[25];
            for(int j = 0; j<nombreConversion.length; j++){
                nombreConversion[j] = buffAleatorio.readChar();
            }
            textito.setText(textito.getText() + Arrays.toString(nombreConversion));
            System.out.println("222");
            int edadConversion = buffAleatorio.readInt();
            textito.setText(textito.getText() + edadConversion);

            System.out.println("333");
            char paisConversion[] = new char [30];
            for(int k = 0; k<paisConversion.length; k++){
                System.out.println(k);
                paisConversion[k] = buffAleatorio.readChar();
            }
            textito.setText(textito.getText() + Arrays.toString(paisConversion));
            System.out.println("444");
            char sexoConversion [] = new char [9];
            for(int l = 0; l<sexoConversion.length; l++){
                sexoConversion[l] = buffAleatorio.readChar();
            }
            textito.setText(textito.getText() + Arrays.toString(sexoConversion) );
            
            Registro registroRepetitivo = new Registro(nombreConversion, edadConversion, paisConversion, sexoConversion);
              
            contenerdorRegistros[i] = registroRepetitivo;
        }
          
        for(int i =0; i<contenerdorRegistros.length; i++){
            System.err.print("por fin dentro del ultimo for ");
             textito.setText( textito.getText() + Arrays.toString(contenerdorRegistros[i].nombre) + " " + contenerdorRegistros[i].edad + " " + Arrays.toString(contenerdorRegistros[i].pais) + Arrays.toString(contenerdorRegistros[i].sexo) );
        }        
     buffAleatorio.close();
    }
}
