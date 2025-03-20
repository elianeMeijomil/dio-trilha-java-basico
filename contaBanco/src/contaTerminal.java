package contaBanco.src;

import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    private static String agencyNumber;
    private static int accountNumber;
    private static String clientName;
    private static double balance;

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
    
        System.out.println("Por favor, digite as informações abaixo");

        System.out.println("Nome do Cliente:");
        clientName = sc.nextLine();

		System.out.println("Número da agência com hífen:");
        agencyNumber = sc.nextLine();
		
        System.out.println("Número da conta:");
 		accountNumber = sc.nextInt();
        
        System.out.println("Valor do Saldo:");
        balance = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "+
                        "sua agência é %s, conta %s e seu saldo %s já está disponível para saque\n\n",
        clientName,agencyNumber,accountNumber,balance);
        
    }
}
