public class Rettangolo implements Forma{
        public double calcoloArea;
        private double base;
        private double altezza;
        Rettangolo(double base, double altezza){
            this.base=base;
            this.altezza=altezza;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base= base;
        }
        public double getAltezza() {
            return altezza;
        }

        public void setAltezza(double altezza) {
            this.altezza = altezza;
        }
        public double calcoloArea(){
            return calcoloArea= base* altezza;
        }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "calcoloArea=" + calcoloArea +
                ", base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
