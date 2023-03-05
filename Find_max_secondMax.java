class Find_max_secondMax{
static int[] array={1,2,3,4,5,6,7,8,9,10};

public static void main(String[] args) {
    findLargest_secondLargest(Find_max_secondMax.array);
}

public static void findLargest_secondLargest(int[] array) {
int largest=array[0];
int secondLargest=0;
for (int i=1; i<array.length; i++) {
    if(largest<array[i])
    {
        secondLargest=largest;
        largest=array[i];
    }
}
System.out.println("largest: " + largest);
System.out.println("secondLargest: " + secondLargest);
}

}