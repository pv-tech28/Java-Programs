import java.util.*;

public class GreatestElementInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter elements: ");
            arr[i]=sc.nextInt();
        } 

        //Greatest element in an array
        int greatest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        System.out.println("Greatest element in array: "+ greatest);
    }
}
