package ua.lviv.lgs.fifth;

public class Main {

	public static void main(String[] args) {
		String input = "The sentence sentence with some some some some repeatable repeatable words words words";
		String[] words = input.split(" ");
		int count = 1;
		int max = 0;
		String mostRepeatableWord = null;

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count = count + 1;
					if (count > max) {
						max = count;
						mostRepeatableWord = words[i];
					}
					words[j] = "0";
				}
			}
			if (words[i] != "0")

				count = 1;

		}

		System.out.println("В реченні найчастіше використовується слово " + mostRepeatableWord + ". Воно зустрічається "
				+ max + " рази");
	}

}
