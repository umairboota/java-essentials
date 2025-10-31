package qa.main;

public class ArrayIsSorted {

    public static boolean checkArrayIsSorted(int[] arr){


        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        
        return true;
    }
    
    
//           array 2 is sorted
    
    public int sortArray() {
    	
        int[] arra = {5, 7, 9, 2, 25, 6};
        
        for(int i = 0; i<=arra.length-1; i++) {
        	if(arra[i] > ) {
        		
        	}
        	
        	return arra;
    	
    }
    

    	
    	
    }

    public static void main(String[] args) {
        int[] arr ={4,6,7,7,8};

        if (!checkArrayIsSorted(arr)){
            System.out.println("array is not sorted");
        }

        else {
            System.out.println("array is sorted");
        }
    }
    
    
    
    
    


}
