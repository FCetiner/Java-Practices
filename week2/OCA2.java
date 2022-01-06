package week2;

public class OCA2 {

	public static void main(String[] args) {


		String str= "M ";
		str= str.concat("E ");
		String add="S ";
		str=str.concat(add);
		str.replace("S", "T"); //there is no assignment here son there is no change
		str=str.concat(add);
		
		System.out.println(str);
		
		// M E S S 
	}

}
