public class Question2 {
	    public static void main(String args[]){
         int[] arr = {1,2,3,4,5};
         int[] reversed = new int[arr.length];

         for (int i = 0; i < arr.length; i++){
            reversed[i] = arr[arr.length-1-i];
         }

         System.out.println("Reversed array" );
         for(int i = 0; i< reversed.length;i++){
            System.out.print(reversed[i] + " ");
         }

        

    }
}
