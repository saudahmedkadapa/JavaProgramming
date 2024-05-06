import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        int [][]matrix1=new int[3][3];
        int [][]matrix2=new int[3][3];
        int [][]addition=new int[3][3];
        int i,j;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the elements=");
        for (i=0;i<matrix1.length;i++)
        {
            for(j=0;j<matrix1[i].length;j++)
            {
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix1=");
        for (i=0;i<matrix1.length;i++)
        {
            for(j=0;j<matrix1[i].length;j++)
            {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the element of matrix 2=");
        for (i=0;i<matrix2.length;i++)
        {
            for(j=0;j<matrix2[i].length;j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix2=");
        for (i=0;i<matrix1.length;i++)
        {
            for(j=0;j<matrix1[i].length;j++)
            {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matrix Addition =");
        for (i=0;i<matrix1.length;i++)
        {
            for(j=0;j<matrix1[i].length;j++)
            {
                addition[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(addition[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
