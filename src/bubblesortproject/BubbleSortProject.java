package bubblesortproject;

public class BubbleSortProject {

    public static void main(String[] args) {

        final int SIZE = 1000;
        int[] grades = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            grades[i] = SIZE - i;
        }

        System.out.println("Student grades before sorting:");
        printFirstValues(grades);

        long comparisons = 0;
        long swaps = 0;

        long startTime = System.nanoTime();

        for (int i = 0; i < grades.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < grades.length - 1 - i; j++) {
                comparisons++;

                if (grades[j] > grades[j + 1]) {
                    int temp = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("\nStudent grades after sorting:");
        printFirstValues(grades);

        System.out.println("\nNumber of students: " + SIZE);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        System.out.println("Execution time: " + elapsedTime + " nanoseconds");
        System.out.println("Execution time: " + (elapsedTime / 1_000_000.0) + " milliseconds");
    }

    private static void printFirstValues(int[] data) {
        int limit = Math.min(10, data.length);

        for (int i = 0; i < limit; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
