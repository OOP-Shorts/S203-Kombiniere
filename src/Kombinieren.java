import java.util.Random;

public class Kombinieren {

    private static void multiply(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] * b[i]);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt();
            b[i] = random.nextInt();
        }
        multiply(a, b);
    }
}
