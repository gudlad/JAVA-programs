public class Linear_search {
static int[] items={1,2,3,4,5,6,7,8,9};


public static void main(String[] args) {
    System.out.println(lSearch(Linear_search.items,5));
}


public static int lSearch(int[] items, int number)
{
    for(int i=0; i<items.length; i++)
    {
        if(number==items[i])
            return i;
    }
    return -1;
}

}