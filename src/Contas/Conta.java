package Contas;

public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double novoSalvo) {
        this.saldo = novoSalvo;
    }
    public void saca(double valor) {
        this.saldo -= valor;
    }
    public abstract void atualiza(double taxa);
    public abstract void deposita(double valor);
}
