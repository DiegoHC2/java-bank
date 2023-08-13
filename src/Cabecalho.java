public class Cabecalho {
    String titular;
    String tipoConta;
    public Cabecalho(Conta usuario){
        this.titular = usuario.pegaTitular();
        this.tipoConta = usuario.pegaTipoConta();
    }
    void montarCabecalho(){
        System.out.println("******************************************" +
                "\n\nTitular: " + this.titular +
                "\nTipo de Conta:" + this.tipoConta +
                "\n\n******************************************");
    }
}
