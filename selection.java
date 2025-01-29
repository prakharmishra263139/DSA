public class selection {
    //  Selection sort -Sorting Algorithm

    public static void sortArray(int array[]) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String[] args) {
        int array[] = {4, 9, 8, 7, 6, 5, 4};
        sortArray(array);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
