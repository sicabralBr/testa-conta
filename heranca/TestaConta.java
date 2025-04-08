public class TestaConta {
    public TestaConta() {
    }

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(720, 8, "Caixa", 1000.0, 500.0);
        System.out.println(cc1);
        cc1.depositar(200.00);
        System.out.println("O saldo da conta corrente é R$ " + String.format("%.2f", cc1.getSaldoConta()));

        ContaPoupanca p1 = new ContaPoupanca(930, 5, "Itaú", 400.00, 7, 0.05);
        p1.sacar(600.00);
        System.out.println("O saldo da conta poupança é R$ " + String.format("%.2f", p1.getSaldoConta()));

        ContaSalario cs1 = new ContaSalario(121, 10, "XP", 1500.00);
        cs1.depositar(0);
        System.out.println("O saldo da conta salário é R$ " + String.format("%.2f", cs1.getSaldoConta()));
    }
}
