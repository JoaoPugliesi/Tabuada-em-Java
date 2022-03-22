import java.util.Scanner;

public class Tabada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número para saber a tabuada: ");
		int num = input.nextInt();
		System.out.println("------------");
//		System.out.println(num + "x 0 = " + num*0);
//		System.out.println(num + "x 1 = " + num*1);
//		System.out.println(num + "x 2 = " + num*2);
//		System.out.println(num + "x 3 = " + num*3);
//		System.out.println(num + "x 4 = " + num*4);
//		System.out.println(num + "x 5 = " + num*5);
//		System.out.println(num + "x 6 = " + num*6);
//		System.out.println(num + "x 7 = " + num*7);
//		System.out.println(num + "x 8 = " + num*8);
//		System.out.println(num + "x 9 = " + num*9);
//		System.out.println(num + "x 10 = " + num*10);
//		System.out.println("|--------|");
		for(int i = 0; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		System.out.println("------------");
	}

}
