class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> li = new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        int minr = 0;
        int maxr = matrix.length - 1;
        int minc = 0;
        int maxc = matrix[0].length - 1;
        int total = r * c;
        int count = 0;
        while (minc<=maxc&&minr<=maxr) {
            //right wall
            for (int i = minr, j = minc; j <= maxc; j++) {
                li.add(matrix[i][j]);

                count++;
            }
            minr++;

            //bottom wall
            for (int j = maxc, i = minr; i <= maxr; i++) {
                li.add(matrix[i][j]);

                count++;
            }
            maxc--;

            //left wall
            if(minr<=maxr){
            for (int i = maxr, j = maxc; j >= minc; j--) {
                li.add(matrix[i][j]);

                count++;
            }
            }
            maxr--;

            //up wall
            if(minc<=maxc){
            for (int j = minc, i = maxr; i >= minr; i--) {
                li.add(matrix[i][j]);

                count++;
            }
            }
            minc++;
        }

        return li;
    }
}
