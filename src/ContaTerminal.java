import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número de sua agência: ");
        String Agencia = sc.nextLine();
        System.out.println();

        System.out.print("Agora digite o número de sua conta: ");
        String numeroContaStr = sc.nextLine();
        int Numero = Integer.parseInt(numeroContaStr);
        System.out.println();

        System.out.print("Informe seu nome completo: ");
        String NomeCliente = sc.nextLine();
        System.out.println();

        System.out.print("Informe o valor do depósito inicial: ");
        String saldoStr = sc.nextLine();
        double Saldo = Double.parseDouble(saldoStr);

        sc.close();

        DadosCliente cliente = new DadosCliente(Numero, Agencia, NomeCliente, Saldo);

        System.out.println(cliente.toString());
    }
}