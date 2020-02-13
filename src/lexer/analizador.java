/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

/**
 *
 * @author Estuardo
 */
public class analizador {
    
    public int estado;
    public char caracter;
    public String LexAux;
    
    public analizador(){
    
    }
    
    public void scanner(String cadena){
        estado = 0;
        cadena = cadena + "#";
        
        for(int z=0;z<=cadena.length()-1;z++){
            caracter = cadena.charAt(z);
            
        }
    }
}
