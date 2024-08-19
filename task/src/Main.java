public class Main {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 4, 7, 8, 5, 9, 6, 6};

        Duplicates(array);
    }

    public static void Duplicates(int[] array) {

        boolean[] checked = new boolean[array.length];
        System.out.println("Duplicated numbers and their counts:");

        for (int i = 0; i < array.length; i++) {
            if (checked[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    checked[j] = true;
                }
            }
            if (count > 1) {
                System.out.println("Number " + array[i] + " is duplicated " + count + " times");

            }
        }

    }
}