import java.util.Scanner;

public class Endofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Java Program to insert element at first of Array");
        System.out.print("Enter the size of array: ");

        int size = sc.nextInt();
        int arr[] = new int[size+1];

        for(int i=0; i<size; i++) {
            System.out.print("Please give value for index "+ i +" : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to first at end: ");
        arr[size] = sc.nextInt();
        System.out.println("Array After Inserting "+ arr[size] +" at first");

        for(int i=size ; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }
}
