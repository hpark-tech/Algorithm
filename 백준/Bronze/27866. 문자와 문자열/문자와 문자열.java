

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int order = sc.nextInt();
		System.out.println(word.substring(order - 1, order));
	}
}