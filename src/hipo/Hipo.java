/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipo;

import static java.lang.System.exit;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Natália
 */
public class Hipo {
    
    int AI = 0;     //apontador da instrucao/linha
    int AC = 0;  // acumulador 
    int memoria[] = new int[100]; 
    String entrada;
    
    
    public void setAI(int AI) {
        this.AI = AI;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }
    

    public int getAI() {
        return AI;
    }

    public int getAC() {
        return AC;
    }
    
    
    public String instrucao(String codInstrucao){
        
        String siglaDaInstrucao = "";
        
        switch (codInstrucao) {
        case "11":{ 
            siglaDaInstrucao = "CEA";
            break;}
        case "12":{
            siglaDaInstrucao = "CAE";
            break;}
        case "21":{ 
            siglaDaInstrucao = "SOM";
            break;}
        case "22":{
            siglaDaInstrucao = "SUB";
            break;}
        case "23":{
            siglaDaInstrucao = "MIL";
            break;}
        case "24":{
            siglaDaInstrucao = "DIV";
            break;}
        case "25":{
            siglaDaInstrucao = "MOD";
            break;}
        case "31":{
            siglaDaInstrucao = "LER";
            break;}
        case "41":{
            siglaDaInstrucao = "IMP";
            break;}
        case "50":{
            siglaDaInstrucao = "NOP";
            break;}
        case "51":{ 
            siglaDaInstrucao = "DES";
            break;}
        case "52":{
            siglaDaInstrucao = "DPO";
            break;}
        case "53":{ 
            siglaDaInstrucao = "DPZ";
            break;}
        case "54":{ 
            siglaDaInstrucao = "DNE";
            break;}
        case "55":{ 
            siglaDaInstrucao = "DNZ";
            break;}
        case "56":{ 
            siglaDaInstrucao = "DDZ";
            break;}
        case "57":{
            siglaDaInstrucao = "DZZ";
            break;}
        case "58":{
            siglaDaInstrucao = "DDF";
            break;}
        case "59":{ 
            siglaDaInstrucao = "DFF";
            break;}
        case "61":{ 
            siglaDaInstrucao = "ADE";
            break;}
        case "62":{ 
            siglaDaInstrucao = "ADD";
            break;}
        case "70":{ 
            siglaDaInstrucao = "PAR";
            break;}    
        default:
            System.out.println("Instrução invalida");
            break;
    }
        return siglaDaInstrucao;
    }
    
     
    public String caracteres(String sinal, String caractere){
        String valor = "";    
        
        switch (caractere) {
            case "01":{ 
                valor = "A";
                break;}
            case "02":{
                valor = "B";
                break;}
            case "03":{ 
                valor = "C";
                break;}
            case "04":{
                valor = "D";
                break;}
            case "05":{
                valor = "E";
                break;}
            case "06":{
                valor = "F";
                break;}
            case "07":{
                valor = "G";
                break;}
            case "08":{
                valor = "H";
                break;}
            case "09":{
                valor = "I";
                break;}
            case "10":{
                valor = "J";
                break;}
            case "11":{ 
                valor = "K";
                break;}
            case "12":{
                valor = "L";
                break;}
            case "13":{ 
                valor = "M";
                break;}
            case "14":{ 
                valor = "N";
                break;}
            case "15":{ 
                valor = "O";
                break;}
            case "16":{ 
                valor = "P";
                break;}
            case "17":{
                valor = "Q";
                break;}
            case "18":{
                valor = "R";
                break;}
            case "19":{ 
                valor = "S";
                break;}
            case "20":{ 
                valor = "T";
                break;}
            case "21":{ 
                valor = "U";
                break;}
            case "22":{ 
                valor = "V";
                break;}  
            case "23":{ 
                valor = "W";
                break;}
            case "24":{ 
                valor = "X";
                break;}
            case "25":{ 
                valor = "Y";
                break;}
            case "26":{ 
                valor = "Z";
                break;}  

             case "27":{ 
                valor = "0";
                break;}
            case "28":{
                if(sinal.equals("-")){
                    valor = "-1";
                }else {
                    valor = "1";
                }
                break;}
            case "29":{ 
                if(sinal.equals("-")){
                     valor = "-2";
                 } else{
                    valor = "2";
                }
                break;}
            case "30":{
                if(sinal.equals("-")){
                     valor = "-3";
                 } else{
                    valor = "3";
                }
                break;}
            case "31":{
                if(sinal.equals("-")){
                     valor = "-4";
                 } else{
                    valor = "4";
                }
                break;}
            case "32":{
               if(sinal.equals("-")){
                     valor = "-5";
                 } else{
                    valor = "5";
                }
                break;}
            case "33":{
                if(sinal.equals("-")){
                     valor = "-6";
                 } else{
                    valor = "6";
                }
                break;}
            case "34":{
                if(sinal.equals("-")){
                     valor = "-7";
                 } else{
                    valor = "7";
                }
                break;}
            case "35":{
                if(sinal.equals("-")){
                     valor = "-8";
                 } else{
                    valor = "8";
                }
                break;}
            case "36":{
                if(sinal.equals("-")){
                     valor = "-9";
                 } else{
                    valor = "9";
                }
                break;}
            case "37":{ 
                valor = "a";
                break;}
            case "38":{
                valor = "b";
                break;}
            case "39":{ 
                valor = "c";
                break;}
            case "40":{ 
                valor = "d";
                break;}
            case "41":{ 
                valor = "e";
                break;}
            case "42":{ 
                valor = "f";
                break;}
            case "43":{
                valor = "g";
                break;}
            case "44":{
                valor = "h";
                break;}
            case "45":{ 
                valor = "i";
                break;}
            case "46":{ 
                valor = "j";
                break;}
            case "47":{ 
                valor = "k";
                break;}
            case "48":{ 
                valor = "l";
                break;}  
            case "49":{ 
                valor = "m";
                break;}
            case "50":{ 
                valor = "n";
                break;}
            case "51":{ 
                valor = "o";
                break;}
            case "52":{ 
                valor = "p";
                break;}  
            case "53":{ 
                valor = "q";
                break;}  
            case "54":{ 
                valor = "r";
                break;}
            case "55":{ 
                valor = "s";
                break;}
            case "56":{ 
                valor = "t";
                break;}
            case "57":{ 
                valor = "u";
                break;} 
            case "58":{ 
                valor = "v";
                break;}
            case "59":{ 
                valor = "w";
                break;}
            case "60":{ 
                valor = "x";
                break;} 
            case "61":{ 
                valor = "y";
                break;}
            case "62":{ 
                valor = "z";
                break;} 
            default:
                System.out.println("Valor invalido");
            break;
        }
        
        return valor;
    }
    
    public int executa(String sinal, String instrucao, String endereco){
        
        int jump=100;
        int indice;
        String siglaDaInstrucao;
            indice = Integer.parseInt(endereco);
            switch (instrucao) {
                case "11":{ 
                    siglaDaInstrucao = "CEA";
                    AC = memoria[indice]; 
                    break;}
                case "12":{
                    siglaDaInstrucao = "CAE";
                    memoria[indice]= AC;
                    break;}
                case "21":{ 
                    siglaDaInstrucao = "SOM";
                    AC = AC+ memoria[indice];
                    break;}
                case "22":{
                    siglaDaInstrucao = "SUB";
                    AC = AC-memoria[indice]; 
                    break;}
                case "23":{
                    siglaDaInstrucao = "MUL";
                    AC = AC*memoria[indice]; 
                    break;}
                case "24":{
                    siglaDaInstrucao = "DIV";
                    AC = AC/memoria[indice]; 
                    break;}
                case "25":{
                    siglaDaInstrucao = "MOD";
                    AC = AC%memoria[indice]; 
                    break;}
                case "31":{
                    siglaDaInstrucao = "LER";
                    Scanner leitura = new Scanner(System.in);   
                    System.out.println("Entre com um valor:");
                    int n = leitura.nextInt();
                    memoria[indice] = n;
                    break;}
                case "41":{
                    siglaDaInstrucao = "IMP";
                    break;}
                case "50":{
                    siglaDaInstrucao = "NOP";                         
                    break;}
                case "51":{ 
                    siglaDaInstrucao = "DES";
                    AI = indice;
                    jump = AI;
                    break;}
                case "52":{
                    siglaDaInstrucao = "DPO";
                    if(AC>0){
                        AI = indice;
                        jump = AI;
                    }
                    break;}
                case "53":{ 
                    siglaDaInstrucao = "DPZ";
                    if(AC>= 0){
                        AI = indice;
                        jump = AI;
                    }
                    break;}
                case "54":{ 
                    siglaDaInstrucao = "DNE";
                    if(AC<0){
                        AI = indice;
                        jump = AI;
                    }
                    break;}
                case "55":{ 
                    siglaDaInstrucao = "DNZ";
                    if(AC<=0){
                        AI = indice;
                        jump = AI;
                    }
                    break;}
                case "56":{ 
                    siglaDaInstrucao = "DDZ";
                    if(AC!=0){
                        AI = indice;
                        jump = AI;
                    }
                    break;}
                case "57":{
                    siglaDaInstrucao = "DZZ";
                    if(AC==0){
                        AI = indice;
                        jump = AI;
                    }
                    break;}
                case "58":{
                    siglaDaInstrucao = "DDF";
                    if(AC!= 100){
                        AI = indice;
                        jump = AI;
                    }
                    break;}
                case "59":{ 
                    siglaDaInstrucao = "DFF";
                    if(AC> 100){
                        AI = indice;
                        jump = AI;
                    }
                    break;}
                case "61":{ 
                    siglaDaInstrucao = "ADE";
                    AC = AC << 1;
                    break;}
                case "62":{ 
                    siglaDaInstrucao = "ADD";
                    AC = AC >>> 1;
                    break;}
                case "70":{ 
                    siglaDaInstrucao = "PAR";
                    exit(1);
                    break;}    
            }
    return jump;
    }   

}
