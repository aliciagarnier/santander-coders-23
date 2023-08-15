package Questão2;

public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calculadoraInteiro = new Calculadora();

        calculadoraInteiro.setValor1(4);
        calculadoraInteiro.setValor2(4);

        System.out.println(calculadoraInteiro.dividir());
        System.out.println(calculadoraInteiro.somar());
        System.out.println(calculadoraInteiro.subtrair());
        System.out.println(calculadoraInteiro.multiplicar());


    }
}
