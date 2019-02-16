package zadProjektButlka.Butelka;




public abstract class Butelka implements Comparable {
    protected int RfId;
    protected double pojemność;
    protected double zawartość;
    protected double masa;
    String materiał;

    public Butelka()
    {}


    public Butelka(int RfId , double pojemność, double masa, String materiał) {
        this.RfId = RfId;
        this.pojemność = pojemność;
        this.masa = masa;
        this.materiał = materiał;
    }


    public Butelka(int RfId, double pojemność, double zawartość, double masa, String materiał) {
        this.RfId = RfId;
        this.pojemność = pojemność;
        this.zawartość = zawartość;
        this.masa = masa;
        this.materiał = materiał;
    }

    public boolean wlej(double ile){
        if (ile <=(pojemność-zawartość)){
            this.zawartość += ile;
            return true;
        }else {
            System.out.println("Za dużo cieczy w butelce");
            return false;
        }
    }

    public boolean wylej(double ile){
        if (ile<=zawartość){
            this.zawartość -= ile;
            return true;
        }else {
            System.out.println("Za mało cieczy w butelce");
            return false;
        }
    };

    public void przelej (double ilosć, Butelka gdziePrzelać){
            if (ilosć<=zawartość && ilosć<=(gdziePrzelać.pojemność-gdziePrzelać.zawartość)){
                wylej(ilosć);
                gdziePrzelać.wlej(ilosć);
                System.out.println("Przelano");
            }else
                System.out.println("Nie możliwa operacja, sprawdź stan butelek");
    }

    @Override
    public int compareTo(Object o){
                Butelka przeslana = (Butelka) o;
                if (this.zawartość < przeslana.zawartość) {
                    return -1;
                } else if (this.zawartość > przeslana.zawartość) {
                    return 1;
                } else
                    return 0;
    }




    /// Setery - Getery


    public int getRfId() {
        return RfId;
    }

    public void setRfId(int rfId) {
        RfId = rfId;
    }

    public double getPojemność() {
        return pojemność;
    }

    public void setPojemność(double pojemność) {
        this.pojemność = pojemność;
    }

    public double getZawartość() {
        return zawartość;
    }

    public void setZawartość(double zawartość) {
        this.zawartość = zawartość;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public String getMateriał() {
        return materiał;
    }

    public void setMateriał(String materiał) {
        this.materiał = materiał;
    }

    @Override
    public String toString() {
        return "Butelka{" +
                "RfId="+ RfId+
                ", pojemność=" + pojemność +
                ", zawartość=" + zawartość +
                ", masa=" + masa +
                ", materiał='" + materiał + '\'' +
                '}';
    }
}
