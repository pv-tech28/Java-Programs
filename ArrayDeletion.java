import java.util.*;

public class ArrayDeletion{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            System.out.print("Enter elements: ");
            arr[i]=sc.nextInt();
        }
        int new_arr[]= new int[arr.length-1];

        System.out.println("Enter 1 for delete an element at the beginning of an array"); 
        System.out.println("Enter 2 for delete an element at the given position");
        System.out.println("Enter 3 for delete an element at the end of an array");
        System.out.print("Enter your choice for deletion: ");
        int c= sc.nextInt();

        if(c==1){
            //delete an element at the beginning of an array
            for(int i=0;i<arr.length-1;i++){
                new_arr[i]=arr[i+1];
            }
            System.out.println("New array after deleting an element at the beginning is:");
            for(int i=0;i<new_arr.length;i++){
                System.out.print( new_arr[i]+" ");
            }
            System.out.println();
            
        }
        else if(c==2){
            //delete an element at the given position
            System.out.print("Enter the position where you want to delete: ");
            int p= sc.nextInt();
            for(int i=0;i<p-1;i++){
                new_arr[i]=arr[i];
            }
            for(int i=p-1;i<arr.length-1;i++){
                new_arr[i]=arr[i+1];
            }
            System.out.println("New array after deleting an element at the given position is:");
            for(int i=0;i<new_arr.length;i++){
                System.out.print( new_arr[i]+" ");
            }
            System.out.println(); 
        }
        else if(c==3){
            //delete an element at the end of an array
            for(int i=0;i<arr.length-1;i++){
                new_arr[i]=arr[i];
            }
            System.out.println("New array after deleting an element at the end is:");
            for(int i=0;i<new_arr.length;i++){
                System.out.print( new_arr[i]+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}