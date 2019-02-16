package zadProjektButlka.Butelka;

public class MetalowaButelka extends Butelka {


    public MetalowaButelka(int RfId, double pojemność, double masa, String materiał) {
        super( RfId, pojemność, masa, materiał);
    }

    public MetalowaButelka(int RfId, double pojemność, double zawartość, double masa, String materiał) {
        super(RfId, pojemność, zawartość, masa, materiał);
    }



    @Override
    public String toString() {
        return "MetalowaButelka{" +
                "RfId="+ RfId+
                ", pojemność=" + pojemność +
                ", zawartość=" + zawartość +
                ", masa=" + masa +
                ", materiał='" + materiał + '\'' +
                '}';
    }
}
