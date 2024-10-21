
//Java Program to insert an element at a given location in an array.


import java.util.Scanner;

public class Insertat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Size = ");
        int size = s.nextInt();
       int arr[] = new int[size+1];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Insert at = ");
        int loc = s.nextInt();

        for (int i = size-1 ; i >= loc-1; i--){
            arr[i+1] = arr[i];
        }
        System.out.print("Enter the element to insert at location "+loc+" : ");
        arr[loc-1] = s.nextInt();

        for (int i = 0; i < size+1; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
