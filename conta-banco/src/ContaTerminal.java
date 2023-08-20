import java.util.Scanner;

public class ContaTerminal {
	static Scanner t = new Scanner(System.in);
	public static String input() {
		return t.nextLine();
	}
	
    public static void main(String[] args) {
    	// Exibir as mensagens para o usuário.
        System.out.println("Seja muito bem vindo(a) ao banco Batissta!");
    	// Obter informações através do Scanner
    	System.out.print("Digite o seu nome: ");
    	String nome = input().strip();
    	System.out.println("Para a criação de sua conta, precisaremos de algumas informações.");
    	System.out.print("Digite o número da conta: ");
    	int num = Integer.parseInt(input());
    	System.out.print("Por favor, digite o número da agência: ");
    	String agencia = input();
    	System.out.print("Por último, digite quanto de saldo você vai adicionar à conta: ");
    	float saldo = Float.parseFloat(input().replace(",", "."));
    	System.out.println("--------------------------------------------------------------------------------");
    	// Exibir a mensagem da conta criada.
    	System.out.printf("Olá %s,"
    			+ " obrigado por criar uma conta em nosso banco!\n"
    			+ "N° da conta: %d\nAgência: %s\nSaldo: R$%.2f. Disponível para saque!"
    			, nome, num, agencia, saldo);
    	
    }
    
}
