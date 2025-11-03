public class Calculadora {
        //Comentário
    public static void main(String[] args) throws Exception {
        Operadores op = new Operadores();

        System.out.println("Operadores aritmeticos!");

        System.out.println("Adição: " + op.adicao(10, 5));
        System.out.println("Subtração: " + op.subtração(10, 5));
        System.out.println("Multiplicação: " + op.multiplicacao(10, 5));
        System.out.println("Divisão: " + op.divisao(10, 5) + "\n");

    //------------------------------------------------------------------------------------------------

        System.out.println("Operadores atribuição!");

        System.out.println("Atribuição de adição: " + op.atribuicaoAdicao(10, 5));
        System.out.println("Atribuição de subtração: " + op.atribuicaoSubtracao(10, 5));
        System.out.println("Atribuição de multiplicação: " + op.atribuicaoMultiplicacao(10, 5));
        System.out.println("Atribuição de divisão: " + op.atribuicaoDivisao(10, 5) + "\n");

//------------------------------------------------------------------------------------------------

        System.out.println("Operadores Lógicos");

        // retornará TRUE
        System.out.println("O valor v2 é maior que v1 e menor que v3?: " + op.and(10, 20, 30));

        //retornará False
        System.out.println("O valor v2 é igual a v1 ou igual a v3?: " + op.or(10, 20, 30));

        //retornará True, mesmo v1 sendo menor que v2
        System.out.println("O valor v1 é MAIOR que v2?: " + op.not(10, 20) + "\n");

//------------------------------------------------------------------------------------------------

        System.out.println("Operadores de Comparação");

        //retornará True
        System.out.println("O valor v1 é igual a v2? " + op.igualA(10,10));

        //retornará False
        System.out.println("O valor v1 é deferente de v2? " + op.diferenteDe(10,10));

        //retornará False
        System.out.println("O valor v1 é maior que v2? " + op.maiorQue(9,10));

        //retornará True
        System.out.println("O valor v1 é menor que v2? " + op.menorQue(9,10));


    }
}
