package Funcionarios;

abstract public class Funcionario {
    private String nome;
    protected double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonus();

}




