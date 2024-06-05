import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // numero, agencia, nome do cliente, saldo
        System.out.println("Por favor, digite o número!");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite a agência!");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo!");
        float saldo = scanner.nextFloat();

        String message = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",nomeCliente, agencia, numero, saldo);
        System.out.println(message);
    }
}
