import java.util.Arrays;
public class employeeCountMatrix
{
   public static String[][] employees =  {
        {"name", "count"},
        // ==============
        {"ram",""},
        {"krishna",""},
        {"Rupa",""},
        {"ram",""},
        {"David",""},
        {"krishna",""},
        {"ram",""},
    };

    public static void print()
    {
        for(String[] employee:employees)
            System.out.println(Arrays.deepToString(employee));
    }
    public static void main(String[] args) {

        print();
        
        for(int i=1; i<= employees.length; i++)
        {
            String name= employees[i][0];
            int count=0;
            for(int k=1; k<= employees.length && k!=i; k++)
            {
                if(name.equals(employees[k][0]))
                {
                    count++;
                }
            }
        }
    }
}