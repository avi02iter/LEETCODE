class Solution {

    public int[][] flipAndInvertImage(int[][] image) {
        //reverse a row
        int n = image.length;
        int m = image[0].length;
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;

                start++;
                end--;
            }
        }

        //invert
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start <= end) {
                if (image[i][start] == 0) {
                    image[i][start] = 1;
                } else {
                    image[i][start] = 0;
                }

                start++;
            }
        }
        
        return image;
    }
}
