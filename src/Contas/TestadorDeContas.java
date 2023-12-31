package Contas;

class TestadorDeContas {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.deposita(1000);
        cp.deposita(1000);

        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        System.out.println("======================");
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}
