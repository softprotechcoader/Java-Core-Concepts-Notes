public class sumOf_2D_Array {
    public static void main(String[] args) {
        int[][]  arr1 = {{1,3,5,7},{2,4,6,8}};
        int[][]  arr2 = {{9,8,7,6},{1,2,3,4}};
        int[][]  res = {{0,0,0,0},{0,0,0,0}};

        for(int i=0; i < arr1.length; i++){

            for(int j =0; j<arr1[i].length; j++){

            res[i][j] = arr1[i][j] + arr2[i][j];
            System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
