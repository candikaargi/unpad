import java.awt.geom.Point2D;
import java.util.Scanner;

public class TestPoint2D {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("masukkan koordinat titik 1 (P1) ");
        System.out.print("nilai x? ");
        double x1 = input.nextDouble();
        System.out.print("nilai y? ");
        double y1 = input.nextDouble();

        System.out.print("masukan koordinat titik 2 (P2) ");
        System.out.print("nilai x? ");
        double x2 = input.nextDouble();
        System.out.print("nilai y? ");
        double y2= input.nextDouble();

        Point2D p1 = new Point2D.Double(x1,y1);
        Point2D p2 = new Point2D.Double(x2,y2);

        System.out.println("P1 adalah "+p1.toString());
        System.out.println("P2 adalah "+p2.toString());

        System.out.println("jarak antara P1 dan P2 adalah "+p1.distance(p2));
        input.close();
        
    }
}
