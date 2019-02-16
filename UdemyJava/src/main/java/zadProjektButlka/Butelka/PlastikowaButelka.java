package zadProjektButlka.Butelka;

public class PlastikowaButelka extends Butelka {
    String marka;


    public PlastikowaButelka(int RfId, double pojemność, double masa, String materiał, String marka) {
        super(RfId, pojemność, masa, materiał);
        this.marka = marka;
    }

    public PlastikowaButelka(int RfId, double pojemność, double zawartość, double masa, String materiał, String marka) {
        super(RfId, pojemność, zawartość, masa, materiał);
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "PlastikowaButelka{" +
                "RfId="+ RfId+
//                "marka='" + marka + '\'' +
                ", pojemność=" + pojemność +
                ", zawartość=" + zawartość +
                ", masa=" + masa +
                ", materiał='" + materiał + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }
}
