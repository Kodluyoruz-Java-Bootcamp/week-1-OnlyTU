package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyList {
	static Object s1;
	static Scanner scanner = new Scanner(System.in);

	static ArrayList<String> myList = new ArrayList<String>(5);

	public static void main(String[] args) throws Exception {

		myList.add("C1");
		myList.add("C2");
		myList.add("C3");
		myList.add("C4");
		myList.add("C5");

		int userInput = 0;

		do {
			System.out.println("add methodu için 1, print metodu için 2'ye basınız.");
			userInput = scanner.nextInt();

			if (userInput == 1) {
				add();
			} else if (userInput == 2) {
				print();
			} else {
				System.out.println("Lutfen valid bir değer giriniz.");
			}
		} while (userInput < 3);
	}

	public static void add() throws Exception {
		int currentSize = myList.size();

		System.out.println("Lutfen 'C' ile başlayan bir string giriniz.");
		Scanner input = new Scanner(System.in);
		s1 = input.nextLine();
		
			
			if (((String) s1).startsWith("c") || ((String) s1).startsWith("C")) {

				if (currentSize >= 5) {
					myList.ensureCapacity(currentSize + 7);
					myList.add(s1.toString());
					System.out.println(s1 + " Listeye eklenmiştir.");
				} else {
					System.out.println("Kapasite arttirilamadi");
				}

			} else {
				System.out.println("Girdiginiz veri 'C' ile başlamiyor.");
			}
		
	}

	public static void print() throws Exception {

		System.out.println(myList + " " +" Listedeki String Sayisi : "+ myList.size());

	}

}