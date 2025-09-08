import java.util.*;
public class ArrayElements{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter elements: ");
            arr[i]=sc.nextInt();
        } 
        //Accessing elements of an array
        System.out.println("Elements of array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        //Sum of all elements of an array
        int sum=0;
        System.out.print("Sum of all elements of an array: ");
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        //Average of all elements of an array
        double avg=0;
        System.out.print("Average of all elements of an array: ");
        avg=sum/n;
        System.out.println(avg);
    }  
}
