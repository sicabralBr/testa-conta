
public abstract class Conta {
    protected int numeroConta;
    protected int numeroAgencia;
    protected String nomeBanco;
    protected double saldoConta;

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeBanco() {
        return this.nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public double getSaldoConta() {
        return this.saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void depositar(double valorDeposito){
        if(valorDeposito > 0){
            setSaldoConta(this.saldoConta + valorDeposito);
            System.out.println("Depósito de R$ " + String.format("%.2f", valorDeposito) + " realizado com sucesso.");
        }else {
            System.out.println("Valor de depósito inválido. O valor deve ser maior que zero.");
        }
    }

    public void sacar(double valorSaque){
        if(valorSaque <= 0){
            System.out.println("Valor de saque inválido. O valor deve ser maior que zero.");
        }else if(valorSaque > this.saldoConta){
            System.out.println("Saldo insuficiente para realizar o saque.");
        }else {
            setSaldoConta(this.saldoConta - valorSaque);
            System.out.println("Saque de R$ " + String.format("%.2f", valorSaque) + " realizado com sucesso.");
        }
    }

    public Conta(int numeroConta, int numeroAgencia, String nomeBanco, double saldoConta) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeBanco = nomeBanco;
        this.saldoConta = saldoConta;
    }

    public String toString() {
        return "Conta{numeroConta=" + this.numeroConta + ", numeroAgencia=" + this.numeroAgencia + ", nomeBanco='" + this.nomeBanco + "', saldoConta=" + this.saldoConta + "}";
    }
}
