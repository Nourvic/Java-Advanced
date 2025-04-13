public class Statistik {

    public static double mean(int[] numbers) {
        double sum = 0.0;
        if (numbers != null && numbers.length > 0) {

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return sum / numbers.length;
        } else {
            return 0;
        }
    }
}
