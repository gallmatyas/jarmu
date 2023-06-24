public class Robogo extends Jarmu implements KisGepjarmu {
    private int maximalisSebesseg;

    public Robogo(int aktualisSebesseg, String rendszam) {
        super(aktualisSebesseg, rendszam);
    }

    @Override
    public boolean haladhatott(int sebesseg) {
        if (maximalisSebesseg <= sebesseg) {
            return true;
        } else {
            return false;
        }
    }

    public int getMaximalisSebesseg() {
        return maximalisSebesseg;
    }

    public void setMaximalisSebesseg(int maximalisSebesseg) {
        this.maximalisSebesseg = maximalisSebesseg;
    }

    public Robogo(int aktualisSebesseg, String rendszam, int maximalisSebesseg) {
        super(aktualisSebesseg, rendszam);
        this.maximalisSebesseg = maximalisSebesseg;
    }

    @Override
    public boolean gyorshajtottE(int sebessegkorlat) {
        return getAktualisSebesseg() > sebessegkorlat;
    }

    public String toString() {
        return "Robogó: " + super.toString() + " - " + getAktualisSebesseg() + " km/h";
    }
}

