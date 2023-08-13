public class Conta {
    private double saldo = 0;
    private String titular;
    private int tipoConta;
    private String nomeTipoConta;
    public Conta (String titular, int tipoConta){
        this.titular = titular;
        this.tipoConta = tipoConta;
        switch (tipoConta){
            case (1):
                this.nomeTipoConta = "Tipo de conta: Conta-Corrente";
                break;
            case (2):
                this.nomeTipoConta = "Conta Poupanca";
                break;
        }
    }
    String pegaTitular(){
        return this.titular;
    }
    String pegaTipoConta(){
        return this.nomeTipoConta;
    }
    String retornarConta(){
        return this.nomeTipoConta;
    }
    double pegaSaldo(){
        return this.saldo;
    }
    void depositar(double valor){
        this.saldo += valor;
    }

    void sacar (double valor){
        this.saldo -= valor;
    }
}
