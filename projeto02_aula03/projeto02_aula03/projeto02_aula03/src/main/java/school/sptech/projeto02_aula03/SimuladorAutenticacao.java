
package school.sptech.projeto02_aula03;

import java.util.Scanner;

public class SimuladorAutenticacao {
    
    public static void main(String[] args) {
        
        Scanner LeitorDados = new Scanner(System.in);
        
        String NomeUsuario = "admin";
        String SenhaUsuario = "#SPTech2022";
        
        System.out.println("Insira seu nome de usuário:");
        String NomeDigitado = LeitorDados.next();
        
        System.out.println("Insira sua senha:");
        String SenhaDIgitada = LeitorDados.next();
        
        while(!NomeUsuario.equals(NomeDigitado) && 
                !SenhaUsuario.equals(SenhaDIgitada)) {
            
            System.out.println("Usuário e/ou senha incorretos. "
                    + "Digite seu usuário novamente:");
            NomeDigitado = LeitorDados.next();
            System.out.println("Digite sua senha novamente:");
            SenhaDIgitada = LeitorDados.next();
        }
        System.out.println("Login realizado com sucesso!");
    }
}
