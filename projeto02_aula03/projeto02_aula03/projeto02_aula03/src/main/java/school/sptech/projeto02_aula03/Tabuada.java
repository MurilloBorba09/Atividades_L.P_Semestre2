
package school.sptech.projeto02_aula03;

import java.util.Scanner;

public class Tabuada {
    
     public static void main(String[] args) {
        
        Scanner LeitorNumero = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        Integer NumeroDigitado = LeitorNumero.nextInt();
        
        for (Integer Contador = 0; Contador <= 10; Contador++) {
            
            Integer Resultado = NumeroDigitado * Contador;
            
            String Frase = 
                String.format
                    ("%d x %d = %d", NumeroDigitado, Contador, Resultado);
            
            System.out.println(Frase);
        }
    }
}
