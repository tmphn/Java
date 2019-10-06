import java.util.Scanner;
public class MP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Give a size: "); 
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		
		int[] grades = new int[size];
		//int scores[];
		System.out.println("Enter " + size + " numbers. Press enter after each");
		for(int i = 0; i < size; i++) {
			grades[i] = in.nextInt();
		
		}
		in.close();
		
		for(int i = 0; i < size; i++) {
			System.out.println(grades[i]);
		}
		
		/*String s = in.nextLine();
		
		if(s.equals("Tam")) {
			System.out.println("Hey, Tam");
		} else if (s.equals("Anon")) {
			System.out.println("Hey, Anon");
		}*/
		
		
		//while loop
		/*int i = 0;
		while(i < 10) {
			System.out.println("i is: " + i);
			i++;
		}*/
		
		//do while loop
		/*int i = 0;
		  do {
			System.out.println("i: " + i);
		} while(i < 10);*/
		
		//for loop
		/*for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}*/
			
		//System.out.println(s);
	}

}
