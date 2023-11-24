public class Triangolo {
    private     double base;
    private     double altezza;
    public double calcoloArea;
    Triangolo(double base,double altezza){
        this.base=base;
        this.altezza=altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }


    public double calcoloArea() {
        return   calcoloArea= base* altezza /2;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", calcoloArea=" + calcoloArea +
                '}';
    }
}
