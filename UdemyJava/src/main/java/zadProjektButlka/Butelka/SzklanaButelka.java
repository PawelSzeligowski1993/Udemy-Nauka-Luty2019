package zadProjektButlka.Butelka;

public class SzklanaButelka extends Butelka{
    String marka;
    boolean czyZwrotna;


    public SzklanaButelka(int RfId, double pojemność, double masa, String materiał, String marka, boolean czyZwrotna) {
        super(RfId, pojemność, masa, materiał);
        this.marka = marka;
        this.czyZwrotna = czyZwrotna;
    }

    public SzklanaButelka(int RfId, double pojemność, double zawartość, double masa, String materiał, String marka, boolean czyZwrotna) {
        super(RfId, pojemność, zawartość, masa, materiał);
        this.marka = marka;
        this.czyZwrotna = czyZwrotna;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public boolean isCzyZwrotna() {
        return czyZwrotna;
    }

    public void setCzyZwrotna(boolean czyZwrotna) {
        this.czyZwrotna = czyZwrotna;
    }

    @Override
    public String toString() {
        return "SzklanaButelka{" +
                "RfId="+ RfId+
//                "marka='" + marka + '\'' +
//                ", czyZwrotna=" + czyZwrotna +
                ", pojemność=" + pojemność +
                ", zawartość=" + zawartość +
                ", masa=" + masa +
                ", materiał='" + materiał + '\'' +
                ", marka='" + marka + '\'' +
                ", czyZwrotna=" + czyZwrotna +
                '}';
    }
}
