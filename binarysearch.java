package geekster.com;
import java.util.Arrays;
import java.util.Scanner;
public class binarysearch {
	  public static int binarysearch(int[] nums, int target) {
	      int left =0, right=nums.length-1;
	        while(left<=right){
	            int mid= left +(right-left)/2;
	            
	            if(nums[mid]==target){
	                return mid;
	            
	            
	            } else if (nums[mid]<target){
	               left=mid+1;
	                
	            }else{
	                right=mid-1;
	            }
	        }
	        return-1;
	    }
	   public static void main(String[] args){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("array size");
	        int n = sc.nextInt();
	        int nums[] = new int[n];
		    System.out.println(" enter array Element");
	        for(int i = 0; i < n; i++ ){
	            nums[i]=sc.nextInt();
	        }
	        Arrays.sort(nums);
	        System.out.println("Enter Target");
	        int target = sc.nextInt();
	       
	 	   System.out.println(binarysearch(nums, target));
	   }

	   
	}

