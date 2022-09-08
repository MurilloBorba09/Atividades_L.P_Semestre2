
package school.sptech.projeto04_04;

import java.util.Scanner;

public class app {
    
    public static void main(String[] args) {
        
        //Função = Método
        
        Utilitaria Util = new Utilitaria();
        
        /*
        Util.ExibirLinha();
        System.out.println("Murillo");
        Util.ExibirLinha();
        System.out.println("Borba");
        Util.ExibirLinha();
        
        System.out.println("*** Diego ***");
        */
        
        Scanner In = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String NomeUsuario = In.nextLine();
        
        Util.ExibirNomeDecoradoComLinha(NomeUsuario);
        
        /*
        System.out.println("Digite outro nome:");
        String NomeUsuario2 = In.nextLine();
        
        Util.ExibirNomeDecorado(NomeUsuario2);
        Util.ExibirNomeDecorado("Teste");
        */
        
        Calculadora Calc = new Calculadora();
        
        System.out.println("Digite um número:");
        Integer NumeroDigitado1 = In.nextInt();
        
        System.out.println("Digite outro número:");
        Integer NumeroDigitado2 = In.nextInt();
        
        Integer ResultadoCalc = 
            Calc.Somar(NumeroDigitado1, NumeroDigitado2);
        
        System.out.println("Olá " + NomeUsuario + 
                ", seu resultado é: " + ResultadoCalc);
    }
}
