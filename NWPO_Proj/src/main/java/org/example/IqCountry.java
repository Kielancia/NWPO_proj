package org.example;

/**
 * This class is used to represent record from file iq_ranking.txt
 */
public class IqCountry {
    public int place;
    public String country;
    public int iq;

    public IqCountry(int place, String country, int iq) {
        this.place = place;
        this.country = country;
        this.iq = iq;
    }
}

