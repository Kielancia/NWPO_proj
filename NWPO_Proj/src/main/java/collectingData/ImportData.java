package collectingData;

import org.example.IqCountry;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportData {
    public static List<IqCountry> importPeopla() {
        List<IqCountry> iqCountryList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src/main/java/collectingData/iq_ranking.txt");
            Scanner sc = new Scanner(fis);
            String l, country;
            String[] a;
            int iq, place;
            l = sc.nextLine().strip();
            while (sc.hasNext()) {
                l = sc.nextLine().strip();
                a = l.split(",");
                place = Integer.parseInt(a[0].strip());
                country = a[1].strip();
                iq = Integer.parseInt(a[2].strip());
                IqCountry ic = new IqCountry(place, country, iq);
                iqCountryList.add(ic);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return iqCountryList;
    }
}
