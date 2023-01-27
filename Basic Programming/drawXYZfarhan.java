//Muhammad Farhan Darmawan
public class drawXYZfarhan {
    public static void main(String[] args) {
        drawXYZ(4);
    }

    public static void drawXYZ(int angka) {
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                if (j % 3 == 0) {
                    System.out.print("X ");
                } else if (j % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print("Y ");
                }
            }
            System.out.println();
        }
    }
}