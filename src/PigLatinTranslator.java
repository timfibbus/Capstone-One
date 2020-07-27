import java.util.*;




public class PigLatinTranslator {

	public static void main(String[] args) {

		// convert to lowercase before translate
		// if startswith vowel add way to the ending
		// if starts with consonants grab all consonants before first vowel and move to
		// end and add ay
		// treat y as consonant
		// translate whole sentence
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your sentence: ");
		String piggy = scan.nextLine();
		
		piggy = piggy.toLowerCase();
		
		String pigletz[] = piggy.split(" ");
		List <String> piglets1 =  new ArrayList<String>();
		piglets1= Arrays.asList(pigletz);
			
			for (int wordCount = 0; wordCount < piglets1.size(); wordCount++) {
			boolean vowelIsOne = (vowelMachine(piglets1.get(wordCount)));
			String consPig = "";
			String vowPig = "";

			if (vowelIsOne == true) {
				vowPig= (vowelConverter(piglets1.get(wordCount)));
				System.out.print(vowPig + " ");
			} else {
					consPig = consMachine(piglets1.get(wordCount));
					System.out.print(consPig + "ay" + " ");
					}
					
			}	
			
		scan.close();
	}
	
	public static String vowelConverter(String latin) {
		String pig = "";
		int i = 1;
		for (i = 1; i < latin.length(); i++) {
			pig = pig + latin.charAt(i);
		}
		pig = pig + latin.charAt(1) + "way";
		return latin + "way";
	}

	public static String consonantFun(String word) {
		String pig = "";
		int i = 1;
		for (i = 1; i < word.length(); i++) {
			pig = pig + word.charAt(i);
		}
		pig = pig + word.charAt(0);
		
		return pig;
	}

	public static boolean vowelMachine(String pignutz) {
		boolean i = false;
		int x = 0;
		char ch = pignutz.charAt(x);
		if (i == false) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'O':
			case 'U':
				i = true;
			}
		} else {
			i = false;
		}
		return i;
	}
	
	public static String consMachine(String pigCons) {
		boolean i = vowelMachine(pigCons);
		int x = 0;
		char ch = pigCons.charAt(x);
		for (x=0; !vowelMachine(pigCons); x++) {
			ch = pigCons.charAt(x);
			pigCons = consonantFun(pigCons);
			i = vowelMachine(pigCons);
		}
		return pigCons;
	}

	public static String period(String pigBut) {
		if (pigBut.contains(".")||pigBut.contains("!")||pigBut.contains("?")|| pigBut.contains(",")); {
			return pigBut;
		} 
	}

}