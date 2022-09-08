
package projeto_aula06_poao;

public class App {
    
    public static void main(String[] args) {
        
        // Objeto:
        ContaCorrente conta1 = new ContaCorrente();
        conta1.numero = "00011";       
        conta1.saldo = 0.0;       
        conta1.titular = "Matheus Hulk";
        
        // Objeto:
        ContaCorrente conta2 = new ContaCorrente();
        conta2.numero = "00012";
        conta2.saldo = 10.0;
        conta2.titular = "Giuliana";
        
        //System.out.println("Conta 01: " + conta1.titular);
        //System.out.println("Conta 02: " + conta2.titular);
        
        System.out.println("01 - Saldo Atual: R$" + conta1.saldo);
        
        conta1.depositar(10.0);
        System.out.println("Saldo antigo: R$" + conta1.saldo);
        conta1.sacar(3.0);
        System.out.println("Salto atual: R$" + conta1.saldo);
    }
}
