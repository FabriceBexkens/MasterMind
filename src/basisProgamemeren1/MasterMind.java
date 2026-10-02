package basisProgamemeren1;

import java.util.Scanner;

public class MasterMind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String PinZwart = "zwart";
		String PinWit = "wit";

		String PinRood = "rood";
		String PinGroen = "groen";
		String PinGeel = "geel";
		String PinPaars = "paars";
		String PinBlauw = "blauw";
		String PinOranje = "oranje";

		String PinLeeg = "leeg";

		String CodemakerVak1 = "geel";
		String CodemakerVak2 = "rood";
		String CodemakerVak3 = "groen";
		String CodemakerVak4 = "blauw";

		String Rij1Checkvak1;
		String Rij1Checkvak2;
		String Rij1Checkvak3;
		String Rij1Checkvak4;

		Scanner sc = new Scanner(System.in);
		int winaar = 0;
		for (int loop = 1; loop <= 10; loop++) {

			System.out.println("voer pin 1 in");
			String Rij1vak1 = sc.next();
			System.out.println("voer pin 2 in");
			String Rij1vak2 = sc.next();
			System.out.println("voer pin 3 in");
			String Rij1vak3 = sc.next();
			System.out.println("voer pin 4 in");
			String Rij1vak4 = sc.next();

			if (Rij1vak1.equals(CodemakerVak1)) {
				Rij1Checkvak1 = PinZwart;
			} else if (Rij1vak1.equals(CodemakerVak2) || Rij1vak1.equals(CodemakerVak3)
					|| Rij1vak1.equals(CodemakerVak4)) {
				Rij1Checkvak1 = PinWit;
			} else {
				Rij1Checkvak1 = PinLeeg;
			}

			if (Rij1vak2.equals(CodemakerVak2)) {
				Rij1Checkvak2 = PinZwart;
			} else if (Rij1vak2.equals(CodemakerVak1) || Rij1vak2.equals(CodemakerVak3)
					|| Rij1vak2.equals(CodemakerVak4)) {
				Rij1Checkvak2 = PinWit;
			} else {
				Rij1Checkvak2 = PinLeeg;
			}

			if (Rij1vak3.equals(CodemakerVak3)) {
				Rij1Checkvak3 = PinZwart;
			} else if (Rij1vak3.equals(CodemakerVak1) || Rij1vak3.equals(CodemakerVak2)
					|| Rij1vak3.equals(CodemakerVak4)) {
				Rij1Checkvak3 = PinWit;
			} else {
				Rij1Checkvak3 = PinLeeg;
			}

			if (Rij1vak4.equals(CodemakerVak4)) {
				Rij1Checkvak4 = PinZwart;
			} else if (Rij1vak4.equals(CodemakerVak1) || Rij1vak4.equals(CodemakerVak2)
					|| Rij1vak4.equals(CodemakerVak3)) {
				Rij1Checkvak4 = PinWit;
			} else {
				Rij1Checkvak4 = PinLeeg;
			}

			System.out.println("antwoord:");
			System.out.println(Rij1Checkvak1 + " " + Rij1Checkvak2 + " " + Rij1Checkvak3 + " " + Rij1Checkvak4);

			if (Rij1Checkvak1.equals(PinZwart) && Rij1Checkvak2.equals(PinZwart) && Rij1Checkvak3.equals(PinZwart)
					&& Rij1Checkvak4.equals(PinZwart)) {
				winaar = 5;

				System.out.println("Je hebt gewonnen!");
				loop = 11;
			}
			if (winaar == 5) {

			} else
			{
				System.out.println("je hebt verloren");
			}
		}

	}

}
