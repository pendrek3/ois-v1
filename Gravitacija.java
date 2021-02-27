import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {

        System.out.println("OIS je zakon!");

    }

    public static void izpisiVrednost(double v,double a)
    {
        System.out.printf("Nadmorska višina je: %f\nGravitacijski pospešek je: %f", v, a);
    }

    public static double izracun(int h){
        Scanner sc=new Scanner(System.in);
        double v = sc.nextDouble();
        double c = 667400;
        double m = 597200000;
        double r = 6371000;

        double a=(cm)/((r+v)*(r+v));
        return a;
    }
}