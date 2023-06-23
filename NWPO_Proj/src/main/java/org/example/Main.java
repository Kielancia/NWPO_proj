package org.example;

import collectingData.ImportData;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<IqCountry> iqCountryList = ImportData.importPeopla();
        int i = 1;
        Iterator var = iqCountryList.iterator();

        Scanner console = new Scanner(System.in);

        System.out.print("Podaj dolny zakres przedzialu iq: ");
        int p1 = console.nextInt();
        System.out.print("Podaj gorny zakres przedzialu iq: ");
        int p2 = console.nextInt();
// Na 5
        System.out.println("Kraje dla zakresu od " + p1 + " do " + p2 + ": ");
        for (IqCountry ic : iqCountryList) {
            if (ic.iq >= p1 && ic.iq <= p2)
                System.out.println(ic.place + "..." + ic.country + "..." + ic.iq);
        }
// Na 4
		/*System.out.println("\nPelna lista krajow: ");
		while(var.hasNext()) {
			IqCountry ic = (IqCountry)var.next();
			int temp = i++;
			System.out.println(ic.place + "..." + ic.country + "..." + ic.iq);
		}*/
    }
}