import java.util.Scanner;

public class tabuada_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		int n, res;
		System.out.println("Você quer calcular a tabuada para qual numero?");
		n = leitor.nextInt();
		
		for (int contador=1;contador<=10;contador++) {
			res = n * contador;
			System.out.println(n + " x " + contador + " = " + res);
	}
  }
}