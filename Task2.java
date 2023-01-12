public class Task2 {
    public static void main(String[] args) {
        int[] numbers = { 2, 5, 13, 7, 6, 4 };
        int index = 0;
        double sum = 0;
        int size = numbers.length;
        while (index < numbers.length) {
            sum += numbers[index];
            index++;
        }
        double avg = sum / size;
        System.out.print(avg);
    }
}