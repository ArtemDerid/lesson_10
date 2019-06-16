package ua.lviv.lgs.third;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String sentence = "A text (in the sense of literary theory) is any object that can be read, including.";
		countWords(sentence);

	}

	public static void countWords(String sentence) {
		char[] array = sentence.toCharArray();
		int i = 0;
		boolean flag = true;
		int counter = 0;
		while (i < array.length) {
			if (array[i] != ' ') {
				if (flag) {
					flag = false;
					counter++;
				}
			} else {
				flag = true;
			}
			i++;
		}
		System.out.println("Речення складається з " + counter + " слів");
	}

}
