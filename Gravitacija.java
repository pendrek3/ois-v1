import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double nadmorskaVisina = sc.nextDouble();

        izpisiVrednost(nadmorskaVisina);
        System.out.println("OIS je zakon!");


    }

    public static void izpisiVrednost(double v)
    {
        System.out.printf("Nadmorska višina je: %f\nGravitacijski pospešek je: %f", izracun(v), v);
    }

    public static double izracun(int h){
        double v = sc.nextDouble();
        double c = 667400;
        double m = 597200000;
        double r = 6371000;

        double a=(cm)/((r+v)*(r+v));
        return a;
    }
}