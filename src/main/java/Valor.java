
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Valor {
    
    public static void main (String []args) { 
int num, valorabsoluto ; 
System.out.println ( "Ingrese Un Numero" ) ; 
Scanner sc = new Scanner (System.in) ; 

num = sc.nextInt() ; 
if (num >= 0) { 
System.out.println ( " El Valor Absoluto es "+ num); 
} 

valorabsoluto = (num * -1) ; 
if (num < 0) { 

System.out.println ( " El Valor Absoluto es "+ valorabsoluto); 
} 


} 
    
}
