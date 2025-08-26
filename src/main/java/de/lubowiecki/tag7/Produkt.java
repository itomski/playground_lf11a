package de.lubowiecki.tag7;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

// Serializable: Klasse wird als speicherbar gekennzeichnet
public class Produkt implements Serializable, Comparable<Produkt> {

    private LocalDateTime erzeugtAm;
    private String name;
    private String beschreibung;
    private int menge;
    private double preis;

    public Produkt() {
        erzeugtAm = LocalDateTime.now();
    }

    public LocalDateTime getErzeugtAm() {
        return erzeugtAm;
    }

    public void setErzeugtAm(LocalDateTime erzeugtAm) {
        this.erzeugtAm = erzeugtAm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return menge == produkt.menge && Double.compare(preis, produkt.preis) == 0 && Objects.equals(erzeugtAm, produkt.erzeugtAm) && Objects.equals(name, produkt.name) && Objects.equals(beschreibung, produkt.beschreibung);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erzeugtAm, name, beschreibung, menge, preis);
    }

    @Override
    public int compareTo(Produkt other) {
        //return erzeugtAm.compareTo(other.erzeugtAm);
        return name.compareTo(other.name);
    }
}
