import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class filter {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
         names.add("shirt");
		 names.add("pant");
         names.add("hoes");
		 names.add("topa");


		ArrayList<String>filterdNames=(ArrayList<String>) names.stream().filter(name->name.startsWith("s")).collect(Collectors.toList());
		System.out.println("Original Name:" + names);
		System.out.println("Names starting with 's':"+ filterdNames);
	}
	
}
