abstract class Jarmu {
    private int aktualisSebesseg;
    private String rendszam;

    public abstract boolean gyorshajtottE(int sebessegkorlat);

    public int getAktualisSebesseg() {
        return aktualisSebesseg;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setAktualisSebesseg(int aktualisSebesseg) {
        this.aktualisSebesseg = aktualisSebesseg;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public Jarmu(int aktualisSebesseg, String rendszam) {
        this.aktualisSebesseg = aktualisSebesseg;
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return rendszam + " - " + aktualisSebesseg + " km/h";
    }
}
