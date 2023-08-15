package Questão5;

public class TesteAceleracao {

    public static void main(String[] args) {

        Objeto carro = new Objeto();

        carro.setMassa(200);
        carro.setForca(2000);

        Aceleracao.calcularAceleracao(carro);

    }


}
