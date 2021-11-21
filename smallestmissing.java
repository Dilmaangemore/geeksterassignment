package geekster.com;



public class smallestmissing {
	 // Program to find Smallest
    // Missing in Sorted Arra
  int findSmallestMissinginSortedArray(int[] arr)
{
	 if(arr[0] != 0)
	return 0;
	 if(arr[arr.length-1] == arr.length - 1)
	        return arr.length;
	       
	      int first = arr[0];
	 
	      return findFirstMissing(arr,0, arr.length-1,first);
}
  
	      int findFirstMissing(int[] arr , int start , int end, int first) {
	    	  if (start < end) {
	    		  int mid = (start+end)/2;
	    		  if (arr[mid] != mid+first)
	    	          return findFirstMissing(arr, start,mid , first);
	    	                                     
	    	        else
	    	          return findFirstMissing(arr, mid+1,
	    	                                     end , first);
	    	  }
	    	  return start+first;
	      }
	      
	      public static void main(String[] args) {
	    	  smallestmissing kall = new smallestmissing() ;
	    	  int arr[] = {0, 1, 2, 4, 5, 8, 12};
	          int n = arr.length;
	          System.out.println( kall.findSmallestMissinginSortedArray(arr));
	      }
}

