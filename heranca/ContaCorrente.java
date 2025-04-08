public class ContaCorrente extends Conta {
    final double chequeEspecial;

    public ContaCorrente(int numeroConta, int numeroAgencia, String nomeBanco, double saldoConta, double chequeEspecial) {
        super(numeroConta, numeroAgencia, nomeBanco, saldoConta);
        this.chequeEspecial = chequeEspecial;
    }

    public String toString() {
        return "ContaCorrente{chequeEspecial=" + String.format("%.2f", this.chequeEspecial) + "}";
    }
}
