package listi2;

import java.util.ArrayList;
import java.util.List;

public class glavna {

	public static void main(String[] args) {
		List<String > iminja;
		iminja = new ArrayList<String>();
		iminja.add("milosh");
		iminja.add("tate");
		iminja.add("mirche");
		iminja.add("jonche");
		iminja.stream()
			.filter(x -> x.length()<= 5)
			.forEach(x -> System.out.println(x));
			
	}

}
