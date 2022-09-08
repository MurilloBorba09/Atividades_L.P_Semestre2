
package school.sptech.projto01.aula03;

import java.util.Scanner;

public class NovoLaco {
    
    public static void main(String[] args) {
        
        Scanner Leitor = new Scanner(System.in);
        
        Integer Numero = 42;
        
        System.out.println("Acerte o número: ");
        Integer NumeroDigitado = Leitor.nextInt();
            
          // Integer OutroNumero = Leitor.nextInt();
            
            while (NumeroDigitado != Numero) {
            System.out.println("Resposta errada");
            System.out.println("Acerte o número:");
            NumeroDigitado = Leitor.nextInt();
            }
            
            System.out.println("Resposta certa!");
    }
}
