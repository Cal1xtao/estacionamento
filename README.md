# estacionamento
package onde_parar;
import java.util.Scanner;
public class onde_parar {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		//Colocando variáveis
		int idoso,gestante,deficiente;
		//Perguntando se é idoso ou não
		System.out.printf("Se voce for idoso(a) digite 0, se nao for digite 9:\n");
		idoso=ler.nextInt(); 
		//Decisão para saber se pode ou não parar utilizando a informação que o(a) cliente deu
		if (idoso==0)
			//Autorizado
			System.out.print("Voce esta autorizado(a) para estacionar na vaga especial");
		//Se não
		else
			//Não autorizado
			System.out.print("Voce nao esta autorizado(a) para estacionar na vaga especial");
		//Perguntando se é gestante ou não
		System.out.printf("Se voce for gestante digite 1, se nao for digite 9:\n");
		gestante=ler.nextInt();
		//Decisão para saber se pode ou não parar utilizando a informação que a cliente deu
		if (gestante==1)
			//Autorizado
			System.out.print("Voce esta autorizada para estacionar na vaga especial");
		//Se não
		else
			//Não Autorizado
			System.out.print("Voce nao esta autorizada para estacionar na vaga especial");
		//Perguntando se é deficiente fisico ou não
		System.out.printf("Se voce for deficiente fisico(a) digite 2, se nao for digite 9:\n");
		deficiente=ler.nextInt();
		//Decisão para saber se pode ou não parar utilizando a informação que o(a) cliente deu
		if (deficiente==2)
			//Autorizado
			System.out.print("Voce esta autorizado(a) para estacionar na vaga especial");
		//Se não
		else
			//Não autorizado
			System.out.print("Voce nao esta autorizado(a) para estacionar na vaga especial");
	}
	}


