import java.util.Scanner;

public class Matrix {
    Scanner r=new Scanner(System.in);
    int sum[][] = new int[100][100];
    void array()
    {

        System.out.println("Enter your array limit1");
        int limit1=r.nextInt();
        System.out.println("Enter any numbers to array 1");
        int num1[][]=new int[100][100];
        for(int i=0;i<limit1;i++)
        {
            for(int j=0;j<limit1;j++)
            {
                num1[i][j]=r.nextInt();
            }
        }
        System.out.println("Enter your array limit2");
        int limit2=r.nextInt();
        System.out.println("Enter any numbers to array 2");
        int num2[][]=new int[100][100];
        for(int i=0;i<limit2;i++)
        {
            for(int j=0;j<limit2;j++)
            {
                num2[i][j]=r.nextInt();
            }
        }
        for (int i=0;i<limit1+limit2;i++)
        {
            for (int j=0;j<limit1+limit2;j++)
            {
                sum[i][j]=num1[i][j]+num2[i][j];
            }
        }
        System.out.println("MATRIX ADDITION=:\t");
        for(int i=0;i<limit1;i++)
        {
            for(int j=0;j<limit2;j++)
            {
                System.out.println(+sum[i][j]);
            }
            System.out.println("\t");
        }

    }

}
