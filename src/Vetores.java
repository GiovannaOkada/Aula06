import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		double alunos[] = new double[10];
		double total=0;
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0;i<alunos.length;i++) {
			System.out.println("Digite a nota do aluno" + (i+1));
			alunos[i] = leitor.nextDouble();
			total = total + alunos[i];
		}
		
		for(int i=0;i<alunos.length;i++) {
			System.out.println("O aluno " + (i+1) + "Consumiu R$" + alunos[i]);
		}
		
		
		leitor.close();
		

	}

}
