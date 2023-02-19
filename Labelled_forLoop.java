public class Labelled_forLoop {
    public static void main(String[] args) {
        // we can give name to the for loop
        // because of the label we given to outer for loop 
        // we are able to break out of the outer for loop through inner for loop
        outer:for(int i = 1; i <=3;i++)
        {
            System.out.println("outer"+i);

            inner :for(int j = 2; j<=3;j++)
            {
                System.out.println("inner"+j);
                break outer;
            }
        }
    }
    
}
