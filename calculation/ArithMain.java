import java.util.Scanner;
import Addition.Add;
import Subtraction.Sub;
import Multiplication.Mul;
import Division.Div;

public class ArithMain
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 1st Number : ");
        int n1 = scn.nextInt();

        System.out.println("Enter 2nd Number : ");
        int n2 = scn.nextInt();

        Add a = new Add();
        a.calAdd(n1, n2);
        a.dispAdd();

        Sub s = new Sub();
        s.calSub(n1, n2);
        s.dispSub();

        Mul m = new Mul();
        m.calMul(n1, n2);
        m.dispMul();

        Div d = new Div();
        d.calDiv(n1, n2);
        d.dispDiv();
    }
}