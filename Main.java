import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner r = new Scanner(System.in);
    static  int i,result;
    public static void main(String[] args) {
        System.out.println("Search methods\n-------------");
        System.out.println("1.linear search");
        System.out.println("2.binary search");
        System.out.println("Enter your choice");
        int choice = r.nextInt();
        switch (choice){
            case 1:base obj1 = new base();
                    obj1.linear_search();
            case 2:base obj2 = new base();
                System.out.println("\nEnter your array limit");
                int limit=r.nextInt();
                System.out.println("\nEnter  numbers in sorted order");
                int num[]=new int[limit];
                for(i=0;i<limit;i++)
                {
                    num[i]=r.nextInt();
                }
                System.out.println("\nEntered numbers are:\n");
                for(i=0;i<limit;i++)
                {
                    System.out.println(+num[i]);
                }
                System.out.println("Enter search key");
                int key = r.nextInt();
                result = obj2.binary_search(num,key);
                if (result == -1) {
                    System.out.println("Element not found in the array.");
                } else {
                    System.out.println("Element found at index: " + result);
                }
//            default:System.out.println("error!!");
        }

    }
    
}