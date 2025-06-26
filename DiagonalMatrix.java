public class DiagonalMatrix {

    public static int[][] Diagonal(int matrix[][])
    {
        int row=matrix.length;
        int col=matrix[0].length;
        int temp[][]=new int[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<col;j++)
            {
                temp[j][i]=matrix[i][j];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {4,5,6}};
         int[][] result = Diagonal(matrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
