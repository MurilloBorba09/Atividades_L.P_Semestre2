
package school.sptech.projeto04_04;

public class Utilitaria {
    
    /*
        O metódo é composto por (Assinatura): 
        - seu tipo de RETORNO
            nesse caso abaixo, não retorna nada.
        - seu NOME
        - seus ARGUMENTOS
    */
    
    void ExibirLinha() {
        
        System.out.println(".".repeat(30));
    }
    
    void ExibirNomeDecorado(String NomeDigitado) {
        
        System.out.printf("UwU %s UwU \n", NomeDigitado);
    }
    
    void ExibirNomeDecoradoComLinha(String Texto){
        
        ExibirLinha();
        ExibirNomeDecorado(Texto);
        ExibirLinha();
    }
}
