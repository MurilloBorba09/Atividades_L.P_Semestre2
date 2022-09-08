
package school.sptech.projeto02_aula03;

public class NumerosPares {
 
    public static void main(String[] args) {
        
        System.out.println("Números pares de 0 a 40:");
        
        Integer Contador = 0;
        
        while(Contador <= 40 ) {
            
            if (Contador % 2 == 0) {
                System.out.println(Contador);
            }
            Contador++;
        }
    }
}
