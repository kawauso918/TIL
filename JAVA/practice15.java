package javaWcp;

public class Ptactice16 {
	public static void main (String[] args) {
		int sum = 0;
		int count =0;
		for (int i =1; i<=10; i++) {
			if (i % 2 ==0) {
				count += 1;
				sum += i;
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
