import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Deixei o saldo como 0, pois o cliente esta realizando uma abertura de conta sem qualquer deposito.
        double saldo = 0;

        System.out.println("Olá! Seja bem vindo");
        System.out.println("Por favor, digite o seu nome completo");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da Agência");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta");
        int numero = scanner.nextInt();

        System.out.println("Olá, "+nomeCliente+". Obrigado por criar uma conta em nosso banco! Sua agência é "+agencia+ ", conta "+numero+ " e seu saldo é de "+saldo+ " reais. Para realizar saques, faça já sua transferência ou pix sem taxas!");
    }
}