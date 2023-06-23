package org.example;

import collectingData.ImportData;
import org.apache.log4j.Logger;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * This class contains main functionality of the program. It requires list of IqCountry
     * returned from class ImportData inside package collectingData. User have to enter
     * iq range for which data will be displayed in console.
     * @param args
     */
    public static void main(String[] args) {
        Logger loggerObj = Logger.getLogger(Main.class);
        loggerObj.debug("Import start.");
        List<IqCountry> iqCountryList = ImportData.importPeopla();
        loggerObj.debug("Import done.");
        int i = 1;
        Iterator var = iqCountryList.iterator();
        Scanner console = new Scanner(System.in);
        loggerObj.debug("Collecting data from user start.");
        System.out.print("Podaj dolny zakres przedzialu iq: ");
        int p1 = console.nextInt();
        System.out.print("Podaj gorny zakres przedzialu iq: ");
        int p2 = console.nextInt();
        loggerObj.debug("Collecting data from user done.");
// Na 5
        loggerObj.debug("Printing relevant data start.");
        System.out.println("Kraje dla zakresu od " + p1 + " do " + p2 + ": ");
        for (IqCountry ic : iqCountryList) {
            if (ic.iq >= p1 && ic.iq <= p2)
                System.out.println(ic.place + "..." + ic.country + "..." + ic.iq);
        }
        loggerObj.debug("Printing relevant data done.");
// Na 4
		/*System.out.println("\nPelna lista krajow: ");
		while(var.hasNext()) {
			IqCountry ic = (IqCountry)var.next();
			int temp = i++;
			System.out.println(ic.place + "..." + ic.country + "..." + ic.iq);
		}*/
    }
}