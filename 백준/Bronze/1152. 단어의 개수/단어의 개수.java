

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		if (arr.length == 0) {
			System.out.println(0);
		} else if (arr[0].equals("")) {
			System.out.println(arr.length - 1);
		} else {
			System.out.println(arr.length);
		}
	}
}
