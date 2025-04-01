import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        System.out.println("Por favor digite o numero da conta :");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor digite o numero da agência :");
        agencia = scanner.nextLine();
        System.out.println("Por favor digite o seu nome completo :");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor digite o seu saldo :");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque !!");
    }
}

