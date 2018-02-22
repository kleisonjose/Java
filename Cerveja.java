import java.util.Scanner;

public class Cerveja {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		String opcao = "S";
		
		while(opcao.equals("S") || opcao.equals("s")){
		
			System.out.println("Quantas cervejas tem no freezer?");
			n = input.nextInt();
		
			while(n > 0){
				System.out.printf("%d cervejas no freezer.\n", n);
				System.out.println("Pego uma garrafa, passo pra frente.");
				n--;
				System.out.printf("Agora são %d cervejas no freezer.\n\n", n);
			}
		
			System.out.println("Deseja reabastecer o freezer? [S/N]");
			input.nextLine();
			opcao = input.nextLine();
		
		}
		
		input.close();
		
	}
	
}
