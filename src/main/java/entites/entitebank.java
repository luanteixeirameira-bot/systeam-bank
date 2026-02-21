package entites;

public class entitebank {
    private String nome;
    private String numeroConta;
    private double saldo;
    private double deposito;
    private double saque;
    public entitebank(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
 
    }
    public void deposito(double deposito) {
        this.saldo += deposito;
    }
    public void saque(double saque) {
        this.saldo -= saque;
    }
}