import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 15;
        System.out.println("n : " + n);
        System.out.println("Question One");
        qOne(n);
        System.out.println();
        System.out.println();

        n = 5;
        System.out.println("n : " + n);
        System.out.println("Question Two A");
        qTwoA(n);
        System.out.println("Question Two B");
        qTwoB(n);
        System.out.println("Question Two C");
        qTwoC(n);
        System.out.println("Question Two D");
        qTwoD(n);
        System.out.println();

        System.out.println("Question Three");
        int[] arr = {12, 9, 13, 6, 10, 4, 7, 2};
        int[] output = qThree(arr);
        System.out.println("n = " + Arrays.toString(arr));
        System.out.println("output = " + Arrays.toString(output));
    }

    public static void qOne(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) System.out.print("OK");
            if (i % 4 == 0) System.out.print("YES");
            if (i % 3 != 0 && i % 4 != 0) System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void qTwoA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void qTwoB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void qTwoC(int n) {
        int start = 1;
        boolean asc = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (start == 1) asc = true;
                if (start == n) asc = false;
                if (asc) System.out.print(start++);
                if (!asc) System.out.print(start--);
            }
            System.out.println();
        }
    }

    public static void qTwoD(int n) {
        int[][] output = new int[n][n];
        int num = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) for (int j = n; j >= 1; j--) output[j - 1][i - 1] = num++;
            if (i % 2 != 0) for (int j = 1; j <= n; j++) output[j - 1][i - 1] = num++;
        }

        for (int[] row : output) {
            for (int i : row) {
                String out = String.format("%-2d", i);
                System.out.print(out + " ");
            }
            System.out.println();
        }
    }

    public static int[] qThree(int[] n) {
        return Arrays.stream(n)
                .filter(num -> num % 3 != 0)
                .sorted()
                .toArray();
    }
}