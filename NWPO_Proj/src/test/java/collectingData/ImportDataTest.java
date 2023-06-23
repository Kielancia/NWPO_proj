package collectingData;

import org.example.IqCountry;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImportDataTest {

    @Test
    void importPeopla() {
        List<IqCountry> iqCountryList = ImportData.importPeopla();
        assertEquals(102, iqCountryList.size());
        assertEquals("Singapore", iqCountryList.get(0).country);
        assertEquals(108, iqCountryList.get(0).iq);
        assertEquals("Equatorial Guinea", iqCountryList.get(101).country);
        assertEquals(56, iqCountryList.get(101).iq);
        assertEquals("Afghanistan", iqCountryList.get(69).country);
        assertEquals(80, iqCountryList.get(69).iq);
    }
}