package geekster.com;

public class frequancyofelement {
//java program to find frequency of duplicate 
	//where [1,1,2,2,4,5,5,6,6,6,6,9,10,11] target =6

	static  int frequencyofelement(int arr[],  int target) {
	int count=0;
	for(int i= 0; i<arr.length; i++) 
		if(target==arr[i]) 
			
			count++;
		return count;
	
	
	
	
	}
	public static void main(String[]args) {
	int arr[]= {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
	int target = 6;
	System.out.println(frequencyofelement(arr, target));
	}
	
		
} 
		
	

