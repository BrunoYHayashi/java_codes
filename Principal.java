import java.util.Scanner;

public class Principal {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		/*Cria o objeto input para ler dados funcionais */

		int num;

		System.out.print("Digite um número: ");
		/*Printa algo*/

		num = input.nextInt();
		/*nextInt() le o primeiro número*/

		System.out.println("Numero digitado: " + num);

		input.close();
		/*close() fecha o objeto input*/
	}
}
