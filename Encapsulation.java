public class Encapsulation {
    public static void main(String[] args) {
        new validCustomer().main();
        new Scammer().main();
        
    }
}

class Bank
{
    private int amt=10000;
    private String pwd="12WE23";

    public void setAmt(String pwd,int amt) {
        if(new Bank().pwd.equals(pwd))
        {
            this.amt+=amt;
        }
        else
        {
            System.out.println("invalid pwd");
            System.exit(0);
        }

    }

    public int getAmt(String pwd) {
        if(!new Bank().pwd.equals(pwd))
        {
            System.out.println("invalid pwd");
            System.exit(0);
        }
        return amt;
    }

}

class validCustomer
{
    private String pwd="12WE23";
    public void main(){
        Bank b=new Bank();
        validCustomer c=new validCustomer();
        b.setAmt(c.pwd,1500);
        int amt=b.getAmt(c.pwd);
        System.out.println(amt);
    }

}
class Scammer
{
    String pwd="12345";
    public void main(){
        Bank b=new Bank();
        int amt=b.getAmt(pwd);
        System.out.println(amt);
    }

}
