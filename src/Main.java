import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean controlador = true;
        int opcao = 0;
        double value = 0;

        Conta usuario = new Conta("Diego Henrique Costa Sampaio",1);

        Cabecalho cabecalho = new Cabecalho(usuario);
        cabecalho.montarCabecalho();


        Sistema sistema = new Sistema(new Scanner(System.in), usuario);
        sistema.rodar();
    }
}