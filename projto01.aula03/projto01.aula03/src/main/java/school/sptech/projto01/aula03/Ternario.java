
package school.sptech.projto01.aula03;

public class Ternario {
    
    public static void main(String[] args) {
        
        String Frase;
        
        Boolean IsMatriculado = true;
          
        /*
        if (IsMatriculado) {
            Frase = "Está matriculado!";
        } else {
            Frase = "Não está matriculado!";
        }
        */
        
        /*
        Operador Ternário é uma espécie de if/else em uma linha só:
        */
        
        Frase = IsMatriculado ? "Está Matriculado!" : "Não está matriculado!";
        
        System.out.println(Frase);
        
        Integer Numero = 42;
        
        String FraseNumero;
        
        /*
        if(Numero > 10) {
            FraseNumero = "É maior!";
        } else {
            FraseNumero = "É menor!";
        }
        */
        
        FraseNumero = Numero > 10 ? "É maior!" : "É menor!";
        
        System.out.println(FraseNumero);
    }
}
