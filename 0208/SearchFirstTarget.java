
public class SearchFirstTarget
{
	public static void main(String[] args){
		int k = 45;
		int[] a = {1, 5, 7, 7, 7, 8, 9, 10, 23, 45, 45, 45, 67};
		search(k, a);
	}
    public static void search(int k, int[] a) {
    	/*int[] a = null;
    	int k = 0;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter sorted array: ");
    	if(sc.hasNextLine()){
    		String string = sc.nextLine();
    		String[] ss = string.split(" ");
    		int length = ss.length;
    		a = new int[length];
    		for (int i = 0; i < length; i++){
    			int e = Integer.parseInt(ss[i]);
    			a[i] = e;
    		}
    	}
    	System.out.println("Enter the key you want to search: ");
    	if(sc.hasNextInt()){
    		k = sc.nextInt();
    	}*/
    	
    	int start = 0;
    	int end = a.length - 1;
    	int mid = (start + end)/2;
    	
    	outerloop:
    	while(true){
    		// if the key is larger than mid value
    		if(k > a[mid]){
        		start = mid + 1;
        		// once start value is larger than end value, we know key does not exist in array
        		if (start > end){
        			System.out.println("Not found!");
        			break outerloop;
        		}
        	// if the key is smaller than mid value
        	}else if(k < a[mid]){
        		end = mid - 1;
        		// once start value is larger than end value, we know key does not exist in array
        		if (end < start){
        			System.out.println("Not found!");
        			break outerloop;
        		}
        	// if the key is equal to mid value
        	}else{
        		// we iterate from mid value to start value to look for the first occurance
        		for (int i = mid - 1; i >= start; i++){
        			if(a[i] != k){
        				mid = i + 1;
                		System.out.println("Found at the " + mid + "th position");
        				break outerloop;
        			}
        		}
        		// if all values from mid to start are all equal to key value, we know the first occurance is the start
        		mid = start;
        		System.out.println("Found at the " + mid + "th position");
        		break outerloop;
        	}
    		mid = (start + end)/2;
    	}
    	
    }
}
