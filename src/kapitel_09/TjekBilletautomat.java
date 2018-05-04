package kapitel_09;

import kapitel_04.Billetautomat;

public class TjekBilletautomat
{
	public static void main(String[] arg)
	{
		// Opsætning af objekter og tjek af startbetingelser
		Billetautomat automat = new Billetautomat(10);

		int antalFejl = 0;
		int værdi;

		værdi = automat.getBilletpris();
		if (værdi != 10) {
			System.out.println("FEJL, getBilletpris() giver ikke 10");
		}

		automat.indsætPenge(10);
		værdi = automat.getBalance();
		if (værdi != 10) {
			System.out.println("FEJL, getBalance() giver ikke 10, men "+værdi);
			antalFejl = antalFejl + 1;
		}

		automat.udskrivBillet();
		værdi = automat.getBalance();
		if (værdi != 0) {
			System.out.println("FEJL, getBalance() giver ikke 0, men "+værdi);
			antalFejl = antalFejl + 1;
		}

		værdi = automat.getSamletSalgsbeløb("1234");
		if (værdi != 10) {
			System.out.println("FEJL getSamletSalgsbeløb() giver ikke 10 men "+værdi);
			antalFejl = antalFejl + 1;
		}

		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Der blev fundet "+antalFejl+" fejl i automaten, ØV!");
		}
	}
}