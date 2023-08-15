package Questão2;

public class Calculadora {

    private double valor1;

    private double valor2;



    public double somar () {

        return valor1 + valor2;

    }


    public double subtrair () {

        return valor1 - valor2;
    }


    public double multiplicar () {

        return valor1 * valor2;

    }

    public double dividir () {

        if (valor2 != 0) {
            return valor1 / valor2;
        }

        System.out.println("Divisão por zero!");
        return Double.NaN;

    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
}
