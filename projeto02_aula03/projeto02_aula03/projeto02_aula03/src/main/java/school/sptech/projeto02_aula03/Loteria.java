
package school.sptech.projeto02_aula03;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    
    public static void main(String[] args) {
        
        Scanner LeitorNumero = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 10:");
        Integer NumeroDigitado = LeitorNumero.nextInt();
        
         Integer Numero0a10 = 
         ThreadLocalRandom.current().nextInt(0, 10);
         
         System.out.println(Numero0a10);
         
         while(NumeroDigitado != Numero0a10) {
             
             System.out.println("");
         }
         
         if(NumeroDigitado == Numero0a10) {
             System.out.println("Certa Resposta!");
         }
    }
}
