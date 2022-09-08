
package projeto_aula06_poao;

public class ContaCorrente {
    
    // Atributos de um Objeto:
    String titular;
    String numero;
    Double saldo = 0.0;
    
    //Comportamentos = Métodos = Funções:
    void depositar(Double valor) {
        
        saldo += valor;
    }
    
    void sacar(Double valorRetirado) {
        
        saldo -= valorRetirado;
    }
    
    String getSituacao() {
        
        if(saldo > 5_000.0) {
            return "Ta dibas.";
        } else if (saldo > 500.0) {
            return "Economize!";
        } else {
            return "Tá osso fio!";
        }
    }
    
    /*
    Double sacar(Double valorRetirado) {
        
        saldo -= valorRetirado;
        return saldo;
    }
    */

}
