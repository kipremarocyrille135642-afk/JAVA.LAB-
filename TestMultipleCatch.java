public class TestMultipleCatch {
    public static void main(String[] args) {
        try {
            int[] vivaanScores = new int[3];
            vivaanScores[0] = 95;
            vivaanScores[1] = 90;
            vivaanScores[2] = 85;

            vivaanScores[5] = 100; // Throws ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error: Vivaan accessed an invalid index!");
        } catch (Exception e) {
            System.out.println("General Exception Handler: " + e);
        }
    }
}