package basisProgamemeren1;

import java.util.Scanner;

public class MasterMind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] checkPinnen = { "zwart", "wit","leeg" };
		String[] rijVakken = new String[4];
		String[] rijcheckVaken = new String[4];
		String[] pinKleuren = { "rood", "groen", "geel", "paars", "blauw", "oranje" };
		String[] codeMakerCode = { "rood", "groen", "geel", "paars" };
		Scanner sc = new Scanner(System.in);
		int winaar = 0;
		for (int loop = 1; loop <= 10; loop++) {

			
			for(int i = 0; i < 4 ; i++) {
				System.out.print("voer Pin " + (i + 1));
				rijVakken[i] = sc.next();
			}
			
			if (rijVakken[0].equals(codeMakerCode[0])) {
				rijcheckVaken[0] = checkPinnen[0];
			} else if (rijVakken[0].equals(codeMakerCode[1]) || rijVakken[0].equals(codeMakerCode[2])
					|| rijVakken[0].equals(codeMakerCode[3])) {
				rijcheckVaken[0] = checkPinnen[1];
			} else {
				rijcheckVaken[0] =  checkPinnen[2];
			}

			if (rijVakken[1].equals(codeMakerCode[1])) {
				rijcheckVaken[1] = checkPinnen[0];
			} else if (rijVakken[1].equals(codeMakerCode[0]) || rijVakken[1].equals(codeMakerCode[2])
					|| rijVakken[1].equals(codeMakerCode[3])) {
				rijcheckVaken[1] =  checkPinnen[1];
			} else {
				rijcheckVaken[1] = checkPinnen[2];
			}

			if (rijVakken[2].equals(codeMakerCode[2])) {
				rijcheckVaken[2] = checkPinnen[0];
			} else if (rijVakken[2].equals(codeMakerCode[0]) || rijVakken[2].equals(codeMakerCode[1])
					|| rijVakken[2].equals(codeMakerCode[3])) {
				rijcheckVaken[2] =  checkPinnen[1];
			} else {
				rijcheckVaken[2] = checkPinnen[2];
			}

			if (rijVakken[3].equals(codeMakerCode[3])) {
				rijcheckVaken[3] = checkPinnen[0];
			} else if (rijVakken[3].equals(codeMakerCode[0]) || rijVakken[3].equals(codeMakerCode[1])
					|| rijVakken[3].equals(codeMakerCode[2])) {
				rijcheckVaken[3] = checkPinnen[1];
			} else {
				rijcheckVaken[3] = checkPinnen[2];
			}

			System.out.println("antwoord:");
			System.out.println(rijcheckVaken[0] + " " + rijcheckVaken[1] + " " + rijcheckVaken[2] + " " + rijcheckVaken[3]);

			if (rijcheckVaken[0].equals(checkPinnen[0]) && rijcheckVaken[1].equals(checkPinnen[0]) && rijcheckVaken[2].equals(checkPinnen[0])
					&& rijcheckVaken[3].equals(checkPinnen[0])) {
				winaar = 5;

				System.out.println("Je hebt gewonnen!");
				loop = 11;
			}
			
		
			} 	if (winaar != 5) {

				System.out.println("je hebt verloren");
		}

	}

}
