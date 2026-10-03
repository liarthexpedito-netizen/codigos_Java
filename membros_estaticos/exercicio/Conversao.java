package membros_estaticos.exercicio;

public class Conversao {

    public static double IOF = 0.06;

    public static double real_para_dolar(double reais, double contacao_atual) {
        return (reais * contacao_atual) + (reais * contacao_atual) * IOF;
    }
    
}