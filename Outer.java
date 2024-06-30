import java.util.Scanner;

public class Outer {
    Scanner r = new Scanner(System.in);
    protected String mobile(){
        System.out.println("Enter mobile name");
        String mob = r.next();
        return mob;
    }
    class Inner{
        static int ram,ssd;
        static String cpu;
        public  void pc(){
            System.out.println("Enter ram");
            ram = r.nextInt();
            System.out.println("Enter cpu");
            cpu = r.next();
            System.out.println("Enter ssd");
            ssd = r.nextInt();


        }
        public void display()
        {
            System.out.println(ram);
            System.out.println(cpu);
            System.out.println(ssd);
        }
    }
}
class baby extends Outer{
    void info()
    {
        System.out.println("Enter os version");
        String os = r.next();
        System.out.println("Enter IMEA number");
        String imea1 = r.next();
        System.out.println("Enter IMEA number");
        String imea2 = r.next();

        System.out.println(os);
        System.out.println(imea1);
        System.out.println(imea2);
    }
}
