import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        String nomeCliente;
        String agencia;
        int numero;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o número da agência:");
        agencia = sc.nextLine();

        System.out.println("Digite o número da conta:");
        numero = sc.nextInt();
        
        System.out.println("Digite o saldo:");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + "e seu saldo R$" + saldo + " já está disponível para saque");

    }

}
