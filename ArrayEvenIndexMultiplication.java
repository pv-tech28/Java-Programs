import java.util.*;

public class ArrayEvenIndexMultiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter elements: ");
            arr[i]=sc.nextInt();
        } 

         //Multiplication of numbers at even index
        int mul=1;
        System.out.print("Multiplication of numbers at even index: ");
        for(int i=0;i<n;i++){
            if(i%2==0){
                mul*=arr[i];
            }
        }
        System.out.println(mul);
    }  
}
