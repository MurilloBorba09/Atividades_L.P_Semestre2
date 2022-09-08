
package school.sptech.projto01.aula03;

import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {
    
    public static void main(String[] args) {
        
        /*
        Existem alguns meios para gerar números aleatórios em JAVA;
        
        Alguns deles:
        - Math.random() ;
        - Random x = nex Random():
            * x.nextInt(10);
            * x.nextDouble() * N padrão: (0.0 / 1.0);
            * x.nextBoolean();
        */
        
        Integer NumeroInteiro = 
            ThreadLocalRandom.current().nextInt(0, 550);
        
        System.out.println(NumeroInteiro);
    }
}
