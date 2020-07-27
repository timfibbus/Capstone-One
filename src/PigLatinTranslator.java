import java.util.*;




public class PigLatinTranslator {

	public static void main(String[] args) {

		// convert to lowercase before translate
		// if startswith vowel add way to the ending
		// if starts with consonants grab all consonants before first vowel and move to
		// end and add ay
		// treat y as consonant
		Scanner scan = new Scanner(System.in);
		boolean keepOn=true;
		while (keepOn){
		
		
		System.out.println("Type yo words: ");
		String piggy = scan.nextLine();

		piggy = piggy.toLowerCase();
		
		String pigletz[] = piggy.split(" ");
		
		List <String> piglets1 =  new ArrayList<String>();
		piglets1= Arrays.asList(pigletz);
		
		String consPig = "";
		String vowPig = "";
		int wordCount = 0;
			
			
			for (wordCount = 0; wordCount < piglets1.size(); wordCount++) {
			boolean vowelIsOne = (vowelMachine(piglets1.get(wordCount)));
			if (vowelIsOne == true) {
				vowPig= (vowelConverter(piglets1.get(wordCount)));
				System.out.println(vowPig + " ");
			} else {
					consPig = consMachine(piglets1.get(wordCount));
					}
					System.out.println(consPig + "ay" + " ");
				}	
			
			System.out.println("Would you like to go again?");
			keepOn = scan.next().contains("y");
			
		}
	}
	

	
	
	public static String vowelConverter(String latin) {
		String pig = "";
		int i = 1;
		for (i = 1; i < latin.length(); i++) {
			pig = pig + latin.charAt(i);
		}
		pig = pig + latin.charAt(0) + "way";
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