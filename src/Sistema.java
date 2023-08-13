import java.util.Scanner;

public class Sistema {
    private boolean controlador = true;
    private Scanner leitor;
    private int opcao;
    private double value;
    private Conta usuario;
    public Sistema(Scanner leitor, Conta usuario){
        this.leitor = leitor;
        this.usuario = usuario;
    }
    void rodar(){
        while(this.controlador){
        this.opcoes();
        opcao = leitor.nextInt();
        this.controlador(opcao);
        }
        System.out.println("Volte sempre !");
    }
    private void opcoes(){
        System.out.println(
                "Selecione a opcao" +
                        "\n1 - Depositar" +
                        "\n2 - Sacar" +
                        "\n3 - Saldo" +
                        "\n4 - Sair"
        );
    }
    private void controlador(int opcao){
        if(opcao == 1){
            System.out.println("Informe o valor a ser depositado ");
            value = leitor.nextDouble();
            this.usuario.depositar(value);
        } else if (opcao == 2) {
            System.out.println("Informe o valor a sacar ");
            value = leitor.nextDouble();
            if(value > this.usuario.pegaSaldo()){
                System.out.println("Saldo insuficiente !");
            } else {
                this.usuario.sacar(value);
            }

        } else if (opcao == 3) {
            System.out.println(this.usuario.pegaSaldo());

        } else if (opcao == 4){
            this.controlador =false;
        } else {
            System.out.println("Opcao invalida !");
        }
    }
}
