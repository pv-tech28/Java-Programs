import java.util.Scanner;

public class FrequencyOfElementInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter elements: ");
            arr[i]=sc.nextInt();
        } 

        //Frequency of an element
        int freq=0;
        System.out.print("Enter the element whose frequency you want to find: ");
        int e=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(e==arr[i]){
                freq++;
            }
        }
        System.out.println("Frequency of " +e+  " is: "+ freq);
    }
}


