package week1;

import java.util.Scanner;

public class ReverseStars {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lutfen satır sayısını yazın : ");
		int myRow = scanner.nextInt();
		
		for (int i = myRow; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int p = myRow; p >= i; p--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
