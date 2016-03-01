public class SearchCyclicallySortedArray
{
	public static void main(String[] args){
		int[] a = {6, 7, 0, 1, 2, 4, 5};
		if(a != null && a.length != 0){
			int b = search(a);
			System.out.println("Found at the " + b + " th position!");
		}else{
			System.out.println("Not valid input!");
		}
		
	}
    public static int search(int[] a) {
    	// if the array only contains one element, just return that element.
    	if(a.length == 1){
    		return 0;
    	}
    	int start = 0;
    	int end = a.length - 1;
    	// if the first element is less than the last element, we know it's not rotated,
    	// just return the first element.
    	if(a[start] < a[end]){
    		return 0;
    	}
    	// if the first element is larger than the last element, we know it is rotated,
    	// we begin binary search from the middle.
    	int mid = (start + end)/2;
    	while(true){
    		// if the middle value is larger than the start value,
    		// we have not reached the skip point yet.
    		// So we should look at the right part.
    		if(a[mid] > a[start]){
    			// This is how we discover the skip point, either 
    			// the next element is less than the current element,
    			// or the previous element is larger than the current element.
    			if(a[mid+1] < a[mid]){
    				return mid + 1;
    			}else if(a[mid - 1] > a[mid]){
    				return mid;
    			}else{
    				start = mid + 1;
    			}
    		// if the middle value is less than the start value,
        	// we have passed (or at) the skip point.
        	// So we should look at the left part.
    		}else{
    			// again, try to discover the skip point.
    			if(a[mid+1] < a[mid]){
    				return mid + 1;
    			}else if(a[mid - 1] > a[mid]){
    				return mid;
    			}else{
    				end = mid - 1;
    			}
    		}
    		mid = (start + end)/2;
    	}
    }
}
