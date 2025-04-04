import java.util.Locale;
import java.util.Scanner;



public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println(nome + " " + sobrenome + " tem " + idade + " anos e " + altura + " de altura.");
       
        
    }
}	 