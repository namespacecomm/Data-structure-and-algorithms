import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        double[] p1 = {0,0};
        double[] p2 = {8,1};
        double[] p3 = {3.5,10};
        System.out.println(toCr(p1));
        System.out.println(toCr(p2));
        System.out.println(toCr(p3));

        double[] point = {4,2};
        System.out.println(toCr(point));

        Random rand = new Random();
        double[] current = new double[2];
        double[] toPrint = new double[2];

        for (int i = 0; i < 10000; i++) {
            int a = rand.nextInt(3);

            switch (a) {
                case 0 -> {
                    current[0] = p1[0];
                    current[1] = p1[1];
                }
                case 1 -> {
                    current[0] = p2[0];
                    current[1] = p2[1];
                }
                case 2 -> {
                    current[0] = p3[0];
                    current[1] = p3[1];
                }
            }

            toPrint[0] = (current[0] + point[0])/2;
            toPrint[1] = (current[1] + point[1])/2;
            System.out.println(toCr(toPrint));

            point[0] = toPrint[0];
            point[1] = toPrint[1];

        }


    }

    static String toCr(double[] arr) {
        return "(" + arr[0] + "," + arr[1] + ")";
    }
}