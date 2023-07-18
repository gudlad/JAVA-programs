public class LargestNumber
{
	public static void main(String[] args) {
		int[] nums= {54,546,548,60};
		String largeNo="";
		String[] numbers=new String[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			numbers[i]=String.valueOf(nums[i]);
		}
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers,new Comparator<String>() {
			@Override
			public int compare(String a,String b) 
			// NOTE:
			// if the compare method returns -1 then elements will be sorted in ascending order
			// if the compare method returns 1 the elements will be sorted in descending order
			{
				String option1=a+b; // 54546
				String option2=b+a; // 54654
				return option2.compareTo(option1);
			}
		});
		for(String i:numbers)
			largeNo+=i;
		System.out.println(largeNo);
	}
}