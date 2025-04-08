import java.time.LocalDate;

public class ContaPoupanca extends Conta {
    final int diaAvniversario;
    private double taxaJuros;

    public ContaPoupanca(int numeroConta, int numeroAgencia, String nomeBanco, double saldoConta, int diaAvniversario, double taxaJuros) {
        super(numeroConta, numeroAgencia, nomeBanco, saldoConta);
        this.diaAvniversario = diaAvniversario;
        this.taxaJuros = taxaJuros;
    }

    private void aplicarTaxaDeJuros() {
        double juros = saldoConta * taxaJuros;
        saldoConta += juros;
        System.out.println("Aplicando taxa de juros de 0,5%. Novo saldo: R$ " + String.format("%.2f",saldoConta));
    }

    public double getSaldoConta() {
        LocalDate hoje = LocalDate.now();
        int diaHoje = hoje.getDayOfMonth();
        if(diaHoje == diaAvniversario){
            aplicarTaxaDeJuros();
            return this.saldoConta;
        }else {
            return this.saldoConta;
        }
    }


}
