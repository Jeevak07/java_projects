package String.based.problems;

import java.util.Scanner;

public class CountVowCon {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Word:");
		String word=in.nextLine();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<word.length();i++) {
			char c= word.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowels++;
			}
			else consonants++;
		}
		System.out.println("Vowels in "+ word + " is " + vowels);
		System.out.println("Consonants in "+ word + " is " + consonants);
		in.close();
	}

}
