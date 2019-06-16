package ua.lviv.lgs.first;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws WrongInputException {
		checking();
	}

	public static void checking() throws WrongInputException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter some 5-letters word");
		
		String input = scanner.next();
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		String word = sb.toString();
		 
		if(input.length() == 5) {
			if(input.equalsIgnoreCase(word)) {
				System.out.println("Ви ввели паліндром!!!");
			}else {
				System.out.println("Введене слово не є палідромом");
			}
		}else {
			String message = "Ви ввели некоректні дані. Введіть слово з п'яти букв";
			throw new WrongInputException(message);
		}
	}

}
