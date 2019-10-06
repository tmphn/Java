import java.util.Scanner;
public class MP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		if(s.equals("Tam")) {
			System.out.println("Hey, Tam");
		} else if (s.equals("Anon")) {
			System.out.println("Hey, Anon");
		}
		
		in.close();
		//while loop
		/*int i = 0;
		while(i < 10) {
			System.out.println("i is: " + i);
			i++;
		}*/
		
		//do while loop
		/*do {
			System.out.println("i: " + i);
		} while(i < 10);*/
		
		//for loop
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}
			
		System.out.println(s);
	}

}
