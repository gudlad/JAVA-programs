import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        
        Bank.payWithUpi();
    }
    
}


class Bank
{
    static void payWithUpi()
    {
        try {
            UpiApp ua=new UpiApp();
            ua.pay();
        }
        catch(Exception e) {
            System.out.println("Exception info received: " + e.getMessage());
        }

    }
}

class UpiApp{
    void pay()
    {
        System.out.println("Connection established with bank");

        try {
            Scanner s=new Scanner(System.in);
            System.out.println("Please enter amount");
            int amt=s.nextInt();
            System.out.println("Amount paid: " + amt);
            s.close();

        }
        catch(Exception e) {
            System.out.println("exception handled by upi app");
            throw e; // rethrow exception information to Bank calling pay method
        }
        finally{
            System.out.println("Connection closed");
        }
    }
    
}



