
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

    public class filter1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
         number.add(1);
		 number.add(2);
         number.add(3);
		 number.add(4);
		 number.add(5);


		ArrayList<Integer> evennumber=(ArrayList<Integer>) number.stream().filter(n->n %2==0).map(n->n*n).collect(Collectors.toList());
		System.out.println("Original numbers:" + number);
		System.out.println("filtered even Number:"+ evennumber);
	}
	
}

