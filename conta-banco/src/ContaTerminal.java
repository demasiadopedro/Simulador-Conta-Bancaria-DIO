import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco!");

        System.out.println("Por favor, digite o número da conta!");
        int numero = Integer.parseInt(scan.nextLine());

        System.out.println("Por favor, digite a agência!");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCLiente = scan.nextLine();

        System.out.println("Por favor, digite o saldo!");
        double saldo = Double.parseDouble(scan.nextLine());
        


        System.out.println("Olá "+nomeCLiente+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta " +numero+" e seu saldo "+ saldo+" já está disponível para saque");

    }
}
