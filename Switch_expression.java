class Switch_expression
{
    public static void main(String[] args) {
        int a=(int)(Math.random()*10)+1;
        System.out.println(a);
        // switch(a)
        // {
        //     case 1:
        //         System.out.println("a is 1");
        //         break;
        //     case 2:
        //         System.out.println("a is 2");
        //         break;
        //     case 3:
        //         System.out.println("a is 3");
        //         break;
        //     case 4:
        //         System.out.println("a is 4");
        //         break;
        // }

        // switch expression in java 
        char grade= switch(a)
        {
            case 1->{ yield 'A';}
            case 2,3 ->{ yield 'B';}
            case 4 ->{ yield 'C';}
            default ->{ yield 'F'; }
                
        };
        System.out.println(grade);
    }
}