import java.util.Scanner;

public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

    
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" +i+ "  ][" +j+ "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
        int zero=0;
        int nonzero=0;
        for(int i=0;i<rows;i++){
            
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    zero++;
                }else{
                    nonzero++;
                }
            }
        }

        if(nonzero<zero){
            System.out.println("Sparse Matrix:");
            int S[][]=new int[nonzero][3];
            int k=0;
            for(int i=0;i<rows;i++){
               for(int j=0;j<cols;j++){
                   if (matrix[i][j]!=0){
                    S[k][0]=i;
                    S[k][1]=j;
                    S[k][2]=matrix[i][j];
                    k++;
                   }
                }
            }
            for(int i=0;i<nonzero;i++){
                for(int j=0;j<3;j++){
                    System.out.print(S[i][j]+" ");
                }
                System.out.println();

            }
            
        }else{
            System.out.println("Not Sparse Matrix");
        }       
    }    
}

