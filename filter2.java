import java.until.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

    public class filter2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
         number.add(1);
		 number.add(2);
         number.add(3);
		 number.add(4);
		 number.add(5);
		 int sumofodds = number.stream().filter(n->n % 2!=0).reduce(0,(a,b)->a+b);
		System.out.println(sumofodds);
		//System.out.println("filtered odd Number:"+ oddnumber);
	}
	
}



