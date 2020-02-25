public class Marks {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        initArray(array);
        printArray(array);
    }

    public static void printArray(final int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void initArray(int[][] array) {
        int[] row = array[0];
        row[0] = 1;
        row[1] = 1;
        row[2] = 1;
        row[3] = 1;
        row[4] = 1;
        row = array[1];
        row[0] = 0;
        row[1] = 1;
        row[2] = 1;
        row[3] = 1;
        row[4] = 0;
        row = array[2];
        row[0] = 0;
        row[1] = 0;
        row[2] = 1;
        row[3] = 0;
        row[4] = 0;
        row = array[3];
        row[0] = 0;
        row[1] = 1;
        row[2] = 1;
        row[3] = 1;
        row[4] = 0;
        row = array[4];
        row[0] = 1;
        row[1] = 1;
        row[2] = 1;
        row[3] = 1;
        row[4] = 1;
    }
}
