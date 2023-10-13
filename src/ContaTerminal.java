import java.util.Scanner;

public class ContaTerminal {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = read.nextLine();
        resetScanner();

        System.out.println("Por favor, digite o número da Conta:");
        int conta = read.nextInt();
        resetScanner();

        System.out.println("Por favor, digite o seu nome:");
        String nome = read.nextLine();
        resetScanner();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = read.nextDouble();

        System.out.println("Obrigado por criar uma conta em nosso banco!");
        System.out.printf("%nOlá %s, seu saldo já está disponível para saque.%n", nome);
        System.out.printf("Agência: %s%nConta: %d%nSaldo: %.2f%n", agencia, conta, saldo);
    }

    public static void resetScanner() {
        read = new Scanner(System.in);
    }
}
