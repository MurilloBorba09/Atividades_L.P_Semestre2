
package school.sptech.projeto05_aula04;

import java.util.Scanner;

public class ResultadoMedia {
    
    public static void main(String[] args) {
        
        CalcularMedia media = new CalcularMedia();
        
        Scanner Numero = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota:");
        Double Nota1 = Numero.nextDouble();
        System.out.println("Digite sua segunda nota:");
        Double Nota2 = Numero.nextDouble();
        
        Double ResultadoMedia = media.calculo(Nota1, Nota2);
        System.out.println(ResultadoMedia);
    }
}
