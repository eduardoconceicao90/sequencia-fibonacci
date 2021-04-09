import java.util.Scanner;

public class Program {

			static long fibonacci(int n) {

				if (n < 2) {
					return n;
				} else {
					return fibonacci(n - 1) + fibonacci(n - 2);
				}

			}
	
			public static void main(String[] args) {
				Scanner leitor = new Scanner(System.in);
				int a = 1, b = 0, aux = 0, i;
				
				System.out.println("****Sequ�ncia Fibonacci*****");
				
				System.out.print("Informe um n�mero: ");
				i = leitor.nextInt();
				
				while(i > aux) {
					aux = a + b;
					a = b;
					b = aux;
				}
				
				if (i == aux || aux == 0) {
					System.out.println("O n�mero "+ i + " est� na sequ�ncia, o pr�ximo n�mero � " + (a+i) +".");
				}else {
					System.out.println("N�mero informado n�o est� na sequ�ncia Fibonacci.");
				}

				leitor.close();
			}
		}


