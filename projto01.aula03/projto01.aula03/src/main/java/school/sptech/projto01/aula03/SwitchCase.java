
package school.sptech.projto01.aula03;

import java.util.Scanner;

public class SwitchCase {
    
    public static void main(String[] args) {
        
        Scanner LeitorNumero = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        Integer NumeroDigitado = LeitorNumero.nextInt();
        
        String Frase;
        
        switch (NumeroDigitado) {
            case 1:
                Frase = "Domingou!!!";
                break;
            case 2:
                Frase = "Segundou!!!";
                break;
            case 3:
                Frase = "Terçou!!!";
                break;
            case 4:
                Frase = "Quartou!!!";
                break;
            case 5:
                Frase = "Quintou!!!";
                break;
            case 6:
                Frase = "SEXTOU!!!";
                break;
            case 7:
                Frase = "SABADOU!!!";
                break;
            default:
                Frase = "Número inválido.";
                break;
        }
        
        System.out.println(Frase);
    }
}
