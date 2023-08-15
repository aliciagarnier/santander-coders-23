package Questão5;

public class Aceleracao {

    public static void calcularAceleracao (Objeto objetoAtual) {

        double aceleracao = objetoAtual.getForca() / objetoAtual.getMassa();

        System.out.println("O objeto que possui massa de " + objetoAtual.getMassa() + "kg e força de " + objetoAtual.getForca() + " N, tem aceleração de " + aceleracao + " m/s²");


    }









}
