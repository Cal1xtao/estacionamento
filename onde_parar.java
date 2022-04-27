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
		if (idoso==0)
			System.out.print("Voce esta autorizado(a) para estacionar na vaga especial");
		else
			System.out.print("Voce nao esta autorizado(a) para estacionar na vaga especial");
		//Perguntando se é gestante ou não
		System.out.printf("Se voce for gestante digite 1, se nao for digite 9:\n");
		gestante=ler.nextInt();
		if (gestante==1)
			System.out.print("Voce esta autorizada para estacionar na vaga especial");
		else
			System.out.print("Voce nao esta autorizada para estacionar na vaga especial");
		//Perguntando se é deficiente fisico ou não
		System.out.printf("Se voce for deficiente fisico(a) digite 2, se nao for digite 9:\n");
		deficiente=ler.nextInt();
		if (deficiente==2)
			System.out.print("Voce esta autorizado(a) para estacionar na vaga especial");
		else
			System.out.print("Voce nao esta autorizado(a) para estacionar na vaga especial");
	}
	}


