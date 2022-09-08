
package school.sptech.projeto02_aula03;

public class NumerosImpares {
    
    public static void main(String[] args) {
        
        System.out.println("Números impares de 0 a 90:");
                
        for (Integer Contador = 0; Contador <= 90; Contador++) {
            
            if (Contador % 2 == 1) {
                System.out.println(Contador);
            }
        }
    }
}
