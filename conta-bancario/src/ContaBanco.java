import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Digite o numero da agencia ");
        String numeroAgencia = scanner.nextLine();
        System.out.print("Digite o nome do cliente: "); 
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
            + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + String.format("%.2f", saldo) 
            + " já está disponível para saque.");

    }
}
