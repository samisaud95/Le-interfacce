public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo= new Rettangolo(5.0,7.0);
        Triangolo triangolo =new Triangolo(3.0,4.0);

        System.out.println("Area del rettangolo: " + rettangolo.calcoloArea());
        System.out.println("Area del rettangolo: " + triangolo.calcoloArea());
    }
}