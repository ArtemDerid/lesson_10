package ua.lviv.lgs.fourth;

public class Main {
	public static void main(String[] args) {

		String text = "In descriptive writing, the author does not just tell the reader what was seen, felt, tested, smelled, or heard. Rather, the author describes something from their own experience and, through careful choice of words and phrasing, makes it seem real. Descriptive writing is vivid, colorful, and detailed. Do you have a good example to share? Add your example here.";

		char[] array = text.toCharArray();
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == '.' || array[i] == '!' || array[i] == '?') {
				counter++;
			}
		}

		System.out.println("This text has " + counter + " sentences");
	}

}
