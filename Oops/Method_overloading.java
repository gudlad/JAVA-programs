public class Method_overloading {
    public static void main(String[] args) {
        A a=new A();
        // System.out.println( a.whoami(1 , 2));
        // System.out.println(a.whoami(1,2,3));
        System.out.println(" guru ".trim());
        System.out.println(" guru ".strip());
        System.out.println(" R ".isBlank());
        System.out.println(" ".isBlank());

  

StringBuilder sb=new StringBuilder("guru");
sb.setCharAt(0, 'g');

sb.append('v'); // any arguement type
sb.append("guru");
sb.append(1);
sb.append("guru",0,2);


sb.insert(0,'G'); // any arguement type
sb.insert(0,1);
sb.insert(0,"hello");

// sb.delete(int begin,int end);
sb.delete(0,2);
sb.deleteCharAt(0);

sb.reverse();

sb.setLength(10);

sb.ensureCapacity(100);
sb.trimToSize();

    }
    
}

class A{
        public int whoami(int a,int b) {
            return a+b;
    }

        public float whoami(int a,int b,int c){
            return a+b+c;
    }
}

/* The return types can be same or different */