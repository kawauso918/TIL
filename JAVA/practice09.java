package javaWcp;

public class Practice74 {
	public static void main (String[]args) {
		int[] numbers = {3,4,9};
		System.out.println("1桁の数字を入力");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for (int n :numbers) {
			if (n == input) {
				System.out.println("アタリ");
			}
		}
	}

}
