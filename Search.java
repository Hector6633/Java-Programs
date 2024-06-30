import java.util.Scanner;

public interface Search {
    public void linear_search();
    public int  binary_search(int [] num,int key);
}
class base implements Search{
    Scanner r = new Scanner(System.in);
    static int flag,i;
    public void  linear_search()
    {
        System.out.println("\nEnter your array limit");
        int limit=r.nextInt();
        System.out.println("\nEnter any numbers");
        int num[]=new int[limit];
        for(int i=0;i<limit;i++)
        {
            num[i]=r.nextInt();
        }
        System.out.println("\nEntered numbers are:\n");
        for(int i=0;i<limit;i++)
        {
            System.out.println("\t"+num[i]);
        }
        System.out.println("\nEnter your searchkey");
        int searchkey=r.nextInt();
        for(i=0;i<limit;i++)
        {
            if(searchkey==num[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("\nYour search key is found at " + i+1);

        }
        else
        {
            System.out.println("\nSorry your search key is not found");
        }

    }
    public int  binary_search(int [] num,int key)
    {
        int left = 0;
        int right = num.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            // Check if key is present at mid
            if (num[middle] == key) {
                return middle;
            }

            // If key greater, ignore left half
            if (num[middle] < key) {
                left = middle + 1;
            }
            // If key is smaller, ignore right half
            else {
                right = middle - 1;
            }
        }

        // Key not present in array
        return -1;

    }
}
