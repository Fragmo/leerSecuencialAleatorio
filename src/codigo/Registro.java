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

/**
 *
 * @author marcf
 */
public class Registro {
    //variables de la clase
    char[] nombre = new char[25];
    int edad = 0;
    char[] pais = new char[30];
    char[] sexo = new char[9] ;
    int tamañoRegistro= 136;
    int numeroRegistros =0;
    //constructor de la clase
    Registro(char[] nombre, int edad, char[] pais, char[] sexo){
        this.nombre = nombre;
        this.edad =edad;
        this.pais = pais;
        this.sexo = sexo;
    }
    public void leerRegistros(Registro miRegistro, String direccion) throws FileNotFoundException, IOException{
        File puenteAleatorio = new File(direccion);
        RandomAccessFile buffAleatorio = new RandomAccessFile(puenteAleatorio, "rw");
        //comenzamos a leer el archivo
        buffAleatorio.seek(0);
        numeroRegistros = (int) puenteAleatorio.length() / tamañoRegistro;
        Registro [] contenerdorRegistros = new Registro[numeroRegistros];
        
        for(int i = 0; i<= numeroRegistros; i++){
            
        }
        
    }
}
