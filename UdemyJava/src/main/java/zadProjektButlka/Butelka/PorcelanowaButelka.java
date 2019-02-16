package zadProjektButlka.Butelka;



public class PorcelanowaButelka extends Butelka{

    String marka;
    Jakość jakość;


    public PorcelanowaButelka(int RfId, double pojemność, double masa, String materiał,String marka, Jakość jakość) {
        super(RfId, pojemność, masa, materiał);
        this.marka = marka;
        this.jakość = jakość;
    }

    public PorcelanowaButelka(int RfId, double pojemność, double zawartość, double masa, String materiał,String marka, Jakość jakość) {
        super(RfId, pojemność, zawartość, masa, materiał);
        this.marka = marka;
        this.jakość = jakość;

    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Jakość getJakość() {
        return jakość;
    }

    public void setJakość(Jakość jakość) {
        this.jakość = jakość;
    }

    @Override
    public String toString() {
        return "PorcelanowaButelka{" +
                "RfId="+ RfId+
//                "marka='" + marka + '\'' +
//                ", jakość=" + jakość +
                ", pojemność=" + pojemność +
                ", zawartość=" + zawartość +
                ", masa=" + masa +
                ", materiał='" + materiał + '\'' +
                ", marka='" + marka + '\'' +
                ", jakość=" + jakość +
                '}';
    }


}



