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
            
            switch(estado){
                //ESTADO 0
                case 0:
                    if(caracter=='{'){
                        char caracteraux;
                        caracteraux = cadena.charAt(z+1);
                        if(caracteraux == '#'){
                            estado = 100;
                        }else {
                            estado = 1;
                        }
                    }
                    else if(caracter == '}'){
                        estado = 100;
                    }
                    else if(caracter=='/' || caracter == '<' || caracter == '!'){
                        estado = 11;
                    }
                    else if(caracter=='a' || caracter=='b' || caracter=='c'|| caracter=='d'|| caracter=='e'|| caracter=='f'|| caracter=='g'|| caracter=='h'|| caracter=='i'|| caracter=='j'|| caracter=='k'|| caracter=='l'|| caracter=='m' || caracter=='n'|| caracter=='o'|| caracter=='p'|| caracter=='q'|| caracter=='r'|| caracter=='s'|| caracter=='t'|| caracter=='u'|| caracter=='v'|| caracter=='w'|| caracter=='x'|| caracter=='y' || caracter=='z'|| caracter=='A'|| caracter=='B'|| caracter=='C'|| caracter=='D'|| caracter=='E'|| caracter=='F'|| caracter=='G'|| caracter=='H'|| caracter=='I'|| caracter=='J'|| caracter=='K'|| caracter=='L'|| caracter=='M'|| caracter=='N'|| caracter=='O'|| caracter=='P'|| caracter=='Q'|| caracter=='R'|| caracter=='S'|| caracter=='T'|| caracter=='U'|| caracter=='V'|| caracter=='W'|| caracter=='X'|| caracter=='Y'|| caracter=='Z'){
                        estado=1;
                        LexAux = String.valueOf(caracter);
                    }
                    else if (caracter == '1' || caracter == '2' || caracter == '3' || caracter == '4' || caracter == '5' || caracter == '6' || caracter == '7' || caracter == '8' || caracter == '9' || caracter == '0'){
                        estado=2;
                        LexAux = String.valueOf(caracter);
                    }
                       break;
                //ESTADO DE EVALUACION DE ALGUNOS CARACTERES A-Z a-z       
                case 1:
                    if(caracter==' '){
                        char caracteraux;
                        caracteraux = cadena.charAt(z+1);
                        if(caracteraux == '-'){
                            estado = 5;
                        }else {
                            estado = 1;
                        }
                    }
                    else if(caracter=='a' || caracter=='b' || caracter=='c'|| caracter=='d'|| caracter=='e'|| caracter=='f'|| caracter=='g'|| caracter=='h'|| caracter=='i'|| caracter=='j'|| caracter=='k'|| caracter=='l'|| caracter=='m' || caracter=='n'|| caracter=='o'|| caracter=='p'|| caracter=='q'|| caracter=='r'|| caracter=='s'|| caracter=='t'|| caracter=='u'|| caracter=='v'|| caracter=='w'|| caracter=='x'|| caracter=='y' || caracter=='z'|| caracter=='A'|| caracter=='B'|| caracter=='C'|| caracter=='D'|| caracter=='E'|| caracter=='F'|| caracter=='G'|| caracter=='H'|| caracter=='I'|| caracter=='J'|| caracter=='K'|| caracter=='L'|| caracter=='M'|| caracter=='N'|| caracter=='O'|| caracter=='P'|| caracter=='Q'|| caracter=='R'|| caracter=='S'|| caracter=='T'|| caracter=='U'|| caracter=='V'|| caracter=='W'|| caracter=='X'|| caracter=='Y'|| caracter=='Z'){
                        estado=1;
                        LexAux = String.valueOf(caracter);
                    }
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                //ESTADO DE ACEPTACION PARA LOS IGNORADOS
                case 100:
                        if(caracter == '#'){
                        }
                       break;
            }
        }
    }
}
