public class Operadores {

    // ARITMÉTICOS

    public float adicao(float v1, float v2){
        return v1 + v2;
    }
    public float subtração(float v1,float v2){
        return v1 - v2;
    }
    public float multiplicacao(float v1,float v2){
        return v1 * v2;
    }
    public float divisao(float v1,float v2){
        return v1 / v2;
    }

    // ATRIBUIÇÃO

    public float atribuicaoAdicao(float v1, float v2){
        return v1+=v2;
    }
    public float atribuicaoSubtracao(float v1, float v2){
        return v1-=v2;
    }
    public float atribuicaoMultiplicacao(float v1, float v2){
        return v1*=v2;
    }
    public float atribuicaoDivisao(float v1, float v2){
        return v1/=v2;
    }

    // LOGICOS

    public boolean and(float v1, float v2, float v3){
        return v2 > v1 && v2 < v3;
    }
    public boolean or(float v1, float v2, float v3){
        return v2 == v1 || v2 == v3;
    }
    public boolean not(float v1, float v2){
        return !(v1 > v2);
    }

    // COMPARAÇÃO

    public boolean igualA(float v1, float v2) {
        return v1 == v2;
    }
    public boolean diferenteDe(float v1, float v2) {
        return v1 != v2;
    }
    public boolean maiorQue(float v1, float v2) {
        return v1 > v2;
    }
    public boolean menorQue(float v1, float v2) {
        return v1 < v2;
    }

    
    
}
