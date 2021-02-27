import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double nadmorskaVisina = sc.nextDouble();

        double pospesek = izracun(nadmorskaVisina);

        izpisiVrednost(nadmorskaVisina, pospesek);
        System.out.println("OIS je zakon!");


    }

    public static void izpisiVrednost(double v, double pospesek)
    {
        System.out.printf("Nadmorska višina je: %f\nGravitacijski pospešek je: %f", pospesek, v);
    }

    public static double izracun(double h){
        double v = sc.nextDouble();
        double c = 667400;
        double m = 597200000;
        double r = 6371000;

        double a=(c*m)/((r+v)*(r+v));
        return a;
    }
}