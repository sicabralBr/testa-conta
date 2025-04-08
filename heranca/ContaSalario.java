public class ContaSalario extends Conta {

    final int limiteSaque = 3;

    public ContaSalario(int numeroConta, int numeroAgencia, String nomeBanco, double saldoConta) {
        super(numeroConta, numeroAgencia, nomeBanco, saldoConta);
    }
}
