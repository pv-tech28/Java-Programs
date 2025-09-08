import java.util.*;
public class ArrayInsertion{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            System.out.print("Enter elements: ");
            arr[i]=sc.nextInt();
        } 
        int new_arr[]=new int[arr.length + 1];

        System.out.println("Enter 1 for Insert an element at the beginning of an array");
        System.out.println("Enter 2 for Insert an element at the given position");
        System.out.println("Enter 3 for Insert an element at the end of an array"); 
        System.out.print("Enter your choice for insertion: ");
        int c= sc.nextInt();

        if(c==1){
            //insert an element at the beginning of an array
            for(int i=arr.length-1;i>=0;i--){
               new_arr[i+1]=arr[i];
            }
            System.out.print("Enter the element that you want to insert at beginning: ");
            int n=sc.nextInt();
            new_arr[0]=n;
            System.out.println("New array after inserting an element at the beginning is:");
            for(int i=0;i<new_arr.length;i++){
               System.out.print( new_arr[i]+" ");
            }
            System.out.println();
        }

        else if(c==2){
            //insert an element at the given position
            System.out.print("Enter the position in which you want to insert: ");
            int p= sc.nextInt();
            System.out.print("Enter the element that you want to insert at that position:");
            int a=sc.nextInt();
            for(int i=arr.length-1;i>=p-1;i--){
                new_arr[i+1]=arr[i];
            }
            for(int i=0;i<p-1;i++){
                new_arr[i]=arr[i];
            }
            new_arr[p-1]=a;
            System.out.println("New array after inserting an element at the given position is:");
            for(int i=0;i<new_arr.length;i++){
                System.out.print( new_arr[i]+" ");
            }
            System.out.println();    
        }

        else if(c==3){
            //insert an element at the end of an array
            for(int i=0;i<arr.length;i++){
                new_arr[i]=arr[i];
            }
            System.out.print("Enter the element that you want to insert at the end: ");
            int e=sc.nextInt();
            new_arr[new_arr.length-1]=e;
            System.out.println("New array after inserting an element at the end of an array is:");
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