/**
we still need header comments
*/
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;


public class Main  {
    public static void main(String args []){
        Set<Point> pointSet1 = new HashSet<Point>();
        pointSet1.add(new Point(0.0,0.0));
        pointSet1.add(new Point(1.0,1.0));

        for(Point p : pointSet1) {
            System.out.println(p);
        }
    }
}
