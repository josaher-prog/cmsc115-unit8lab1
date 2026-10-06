public class BuggyProgram {

    // Task 1: Fix getGrade
    public static String getGrade(int score) {
        if (score >= 90) {
            return "Exceeds";
        } else if (score >= 70) {
            return "Meets";
        } else {
            return "Does Not Meet";
        }
    }

    // Task 2: Fix sumEvenNumbers
    public static int sumEvenNumbers(int[] values) {
        if (values == null) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                sum += values[i];
            }
        }
        return sum;
    }

    // Task 3: Fix sumRange
    public static int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
