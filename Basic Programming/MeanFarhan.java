//Muhammad Farhan Darmawan
public class MeanFarhan {
    private static float Mean (float[] nomer){
        int sum = 0;
        float mean;
        for (float v : nomer) {
            sum += v;
        }
        mean = (float) sum / nomer.length;
        return mean;
    }

    public static void main(String[] args) {
        float [] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}