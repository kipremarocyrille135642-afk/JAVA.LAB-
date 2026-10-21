import java.lang.*;

class a extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread A : i = "+i);
        }
        System.out.println("Exit from Thread A");
    }
}

class b extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("From Thread B : j = "+j);
        }
        System.out.println("Exit from Thread B");
    }
}

class ex163
{
    public static void main(String args[])
    {
        a a1 = new a();
        a1.start();

        b b1 = new b();
        b1.start();
    }
}