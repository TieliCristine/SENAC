package entidade;

public class Conta {

    private String agencia;
    private String numConta;
    private double saldo;
    private double valorSaque;

    //CONSTRUTORES

    public Conta() {
        super();
    }
    public Conta(String agencia, String numConta, double saldo) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //MÉTODOS

    public double sacar(double valorSaque) {

        return valorSaque;
    }
    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void efetuarRendimento(double percentual){

    }

    //GETTERS AND SETTERS

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(){
        this.saldo = saldo;
    }
}
