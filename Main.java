//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner inn = out.new Inner();
        inn.pc();
        inn.display();
        baby b = new baby();
        String res = b.mobile();
        System.out.println("Mobile name "+res);
        b.info();

    }
}