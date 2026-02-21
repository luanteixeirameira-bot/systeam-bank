import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {
        String nome;
        String numeroConta;
        double saldo;
        
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite o nome do titular da conta:");
        nome = sc.nextLine();
        System.out.println("Digite o número da conta:");
        numeroConta = sc.nextLine();
        System.out.println("Digite o saldo da conta:");
        saldo = sc.nextDouble();

        entites.entitebank conta = new entites.entitebank(nome, numeroConta, saldo);
        System.out.println("Dados da conta:");
        System.out.println("Titular: " + conta.getNome());
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        
        System.out.println("Para depositar digite 1, para sacar digite 2 e para finalizar digite 3:");
        int opcao = sc.nextInt();
        while (opcao != 3) {
            if (opcao == 1) {
                System.out.println("Digite o valor do depósito:");
                double valorDeposito = sc.nextDouble();
                conta.deposito(valorDeposito);
                System.out.println("Saldo atualizado: " + conta.getSaldo());
            } else if (opcao == 2) {
                System.out.println("Digite o valor do saque:");
                double valorSaque = sc.nextDouble();
                conta.saque(valorSaque);
                System.out.println("Saldo atualizado: " + conta.getSaldo());
            } else {
            System.out.println("Opção inválida. Digite 1 para depositar, 2 para sacar ou 3 para finalizar.");
            }
            System.out.println("Para depositar digite 1, para sacar digite 2 e para finalizar digite 3:");
            opcao = sc.nextInt();
        }

        sc.close();
    }
}