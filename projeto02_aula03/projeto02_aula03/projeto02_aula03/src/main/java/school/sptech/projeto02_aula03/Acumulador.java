
package school.sptech.projeto02_aula03;

import java.util.Scanner;

public class Acumulador {
    
    public static void main(String[] args) {
        
        Scanner LeitorNumero = new Scanner(System.in);
        
        Integer Numero = 0;
        
        System.out.println("Digite um número:");
        Integer NumeroDigitado = LeitorNumero.nextInt();
        
        while (NumeroDigitado != Numero) {
            System.out.println("Digite outro número:");
            NumeroDigitado = LeitorNumero.nextInt();
            
        }        
        
        System.out.println("Resposta Certa! \n"
            + "A soma dos números que você digitou é: %.2f", Soma);
    }
}


