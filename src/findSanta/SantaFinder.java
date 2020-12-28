package findSanta;

import java.util.Scanner;

public class SantaFinder {
	
	public static void main(String[] args) {
		
		boolean foundMatch = false;
		String printEmail;
		
		SantaSuspects santaSuspects = new SantaSuspects(20);
		santaSuspects.addSuspect("bob.ezanga@santa.com");
		santaSuspects.addSuspect("sall.zimmers@santa.com");
		santaSuspects.addSuspect("peter.pinkelton@santa.com");
		santaSuspects.addSuspect("bobby.tables@santa.com");
		santaSuspects.addSuspect("rudolph.rednose@santa.com");
		santaSuspects.addSuspect("bob.ross@santa.com");
		santaSuspects.addSuspect("ubiga.altman@santa.com");
		santaSuspects.addSuspect("aaron.rogers@santa.com");
		santaSuspects.addSuspect("yolo.once@santa.com");
		santaSuspects.addSuspect("yoko.yamalla@santa.com");
		santaSuspects.addSuspect("big.show@santa.com");
		santaSuspects.addSuspect("doug.immadome@santa.com");
	
		//santaSuspects.printSuspects();
		System.out.println("Welcome to Santa.com suspected email list.");
		System.out.println("Provide a first.lastname or email to search for: ");
		Scanner scanner = new Scanner(System.in);
		String searchFor = scanner.nextLine();
		String searchFor1 = new String(searchFor.replaceFirst(" ", "."));  // Remove first space between first/last name
		String searchFor2 = new String(searchFor1.replaceAll(" ", ""));   // Remove all remaining space
		
		//System.out.println(searchFor2);
		
		if (searchFor2.contains("@santa.com")) {
			//System.out.println("does contain @santa.com");
			foundMatch = santaSuspects.foundMatch(searchFor2);
			printEmail = searchFor2;
		} else {
			String searchForAddEmail = new String(searchFor2 + "@santa.com");
			foundMatch = santaSuspects.foundMatch(searchForAddEmail);
			printEmail = searchForAddEmail;
		}
		
		if(foundMatch) {
			System.out.println(printEmail + " email address does exist");
		} else {
			System.out.println(printEmail + " email address does not exist");
		}
		
	}

}
