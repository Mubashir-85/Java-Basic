public class SeventhTopic {
    public static void main(String[] args) {

        // Jagged Array
        int[][] arr = {
            {1, 2},
            {3, 4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(arr.length + "-"+ "Prints number of rows"); // Prints number of rows
        System.out.println(arr[0].length + "-"+ "Prints number of columns in first row"); // Prints number of columns in first row
        System.out.println(arr[1].length + "-"+ "Prints number of columns in second row"); // Prints number of columns in second row
        System.out.println(arr[2].length + "-"+ "Prints number of columns in third row"); // Prints number of columns in third row





        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    
}
}
