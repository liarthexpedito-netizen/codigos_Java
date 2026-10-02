package exercicio_um;

public class Logica_poligonos {

    public double altura;
    public double largura;

    public Logica_poligonos() {}

    public Logica_poligonos(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double Area() {
        return largura * altura;
    }

    public double Perimetro() {
        return 2 * (largura + altura);
    }

    public double Diagonal() {
        return Math.sqrt((largura * largura) + (altura * altura));
    }


}
