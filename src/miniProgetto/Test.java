
import java.util.ArrayList;
import java.util.List;
//test  sul for each....
public class Test {
	public static void main(String[] args){
		
		//usr marcocamino
		
		//email marco1.camino@gmail.com
		
		//pwd m4rc0C16!
		System.out.println("salve mondo ");
		

		List<String> someList = new ArrayList<String>();
		someList.add("arlecchina");
		someList.add("ruby");
		someList.add("cavour");
		
		for (String item : someList) {
		    System.out.println(item);
		}
		
		for(int i = 0; i < someList.size();i++){
			System.out.println(someList.get(i));
		}
		
		String[] str = new String[5];
		str[1] = "a";
		str[2] = "b";
		str[3] = "c";
		str[4] = "d";
		str[0] = "e";
		
		for(String item : str){
			System.out.println(item);
		}
		int k = 4;
		for(int i = 0; i<someList.size();   i++){
			System.out.println("Contenuto lista: " + someList.get(i));
		}
	}
}
