import java.lang.Thread;

class ThreadDemo extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
            System.out.println("Thread two");
    }

    public static void main(String[] args)
    {
        ThreadDemo demo = new ThreadDemo();
        demo.start();
        for(int i=0;i<10;i++)
            System.out.println("Thread one");
    }
}