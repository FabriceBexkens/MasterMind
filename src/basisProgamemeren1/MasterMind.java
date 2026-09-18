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
		
		String Rij1Vak1;
		String Rij1Vak2;
		String Rij1Vak3;
		String Rij1Vak4;
		String Rij2Vak1;
		String Rij2Vak2;
		String Rij2Vak3;
		String Rij2Vak4;
		String Rij3Vak1;
		String Rij3Vak2;
		String Rij3Vak3;
		String Rij3Vak4;
		String Rij4Vak1;
		String Rij4Vak2;
		String Rij4Vak3;
		String Rij4Vak4;
		String Rij5Vak1;
		String Rij5Vak2;
		String Rij5Vak3;
		String Rij5Vak4;
		String Rij6Vak1;
		String Rij6Vak2;
		String Rij6Vak3;
		String Rij6Vak4;
		String Rij7Vak1;
		String Rij7Vak2;
		String Rij7Vak3;
		String Rij7Vak4;
		String Rij8Vak1;
		String Rij8Vak2;
		String Rij8Vak3;
		String Rij8Vak4;
		String Rij9Vak1;
		String Rij9Vak2;
		String Rij9Vak3;
		String Rij9Vak4;
		String Rij10Vak1;
		String Rij10Vak2;
		String Rij10Vak3;
		String Rij10Vak4;

		String Rij1Checkvak1;
		String Rij1Checkvak2;
		String Rij1Checkvak3;
		String Rij1Checkvak4;
		String Rij2Checkvak1;
		String Rij2Checkvak2;
		String Rij2Checkvak3;
		String Rij2Checkvak4;
		String Rij3Checkvak1;
		String Rij3Checkvak2;
		String Rij3Checkvak3;
		String Rij3Checkvak4;
		String Rij4Checkvak1;
		String Rij4Checkvak2;
		String Rij4Checkvak3;
		String Rij4Checkvak4;
		String Rij5Checkvak1;
		String Rij5Checkvak2;
		String Rij5Checkvak3;
		String Rij5Checkvak4;
		String Rij6Checkvak1;
		String Rij6Checkvak2;
		String Rij6Checkvak3;
		String Rij6Checkvak4;
		String Rij7Checkvak1;
		String Rij7Checkvak2;
		String Rij7Checkvak3;
		String Rij7Checkvak4;
		String Rij8Checkvak1;
		String Rij8Checkvak2;
		String Rij8Checkvak3;
		String Rij8Checkvak4;
		String Rij9Checkvak1;
		String Rij9Checkvak2;
		String Rij9Checkvak3;
		String Rij9Checkvak4;
		String Rij10Checkvak1;
		String Rij10Checkvak2;
		String Rij10Checkvak3;
		String Rij10Checkvak4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("voer pin 1 in");
		String Rij1vak1 = sc.next();
		System.out.println("voer pin 2 in");
		String Rij1vak2 = sc.next();
		System.out.println("voer pin 3 in");
		String Rij1vak3 = sc.next();
		System.out.println("voor pin 4 in");
		String Rij1vak4 = sc.next();
		
		
		// Controle vak 1
		if (Rij1vak1.equals(CodemakerVak1)) {
		    Rij1Checkvak1 = "zwart";
		} else if (Rij1vak1.equals(CodemakerVak2) ||
		           Rij1vak1.equals(CodemakerVak3) ||
		           Rij1vak1.equals(CodemakerVak4)) {
		    Rij1Checkvak1 = "wit";
		} else {
		    Rij1Checkvak1 = "leeg";
		}

		// Controle vak 2
		if (Rij1vak2.equals(CodemakerVak2)) {
		    Rij1Checkvak2 = "zwart";
		} else if (Rij1vak2.equals(CodemakerVak1) ||
		           Rij1vak2.equals(CodemakerVak3) ||
		           Rij1vak2.equals(CodemakerVak4)) {
		    Rij1Checkvak2 = "wit";
		} else {
		    Rij1Checkvak2 = "leeg";
		}

		// Controle vak 3
		if (Rij1vak3.equals(CodemakerVak3)) {
		    Rij1Checkvak3 = "zwart";
		} else if (Rij1vak3.equals(CodemakerVak1) ||
		           Rij1vak3.equals(CodemakerVak2) ||
		           Rij1vak3.equals(CodemakerVak4)) {
		    Rij1Checkvak3 = "wit";
		} else {
		    Rij1Checkvak3 = "leeg";
		}

		if (Rij1vak4.equals(CodemakerVak4)) {
		    Rij1Checkvak4 = "zwart";
		} else if (Rij1vak4.equals(CodemakerVak1) ||
		           Rij1vak4.equals(CodemakerVak2) ||
		           Rij1vak4.equals(CodemakerVak3)) {
		    Rij1Checkvak4 = "wit";
		} else {
		    Rij1Checkvak4 = "leeg";
		}

		// PRINTEN!
		System.out.println("antwoord:");
		System.out.println(Rij1Checkvak1 + " " + Rij1Checkvak2 + " " + Rij1Checkvak3 + " " + Rij1Checkvak4);


	}
}
