import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {

        System.out.println("OIS je zakon!");
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