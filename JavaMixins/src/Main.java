import java.util.Random;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int length = 5;
		ArraySequenceWithMixin array = new ArraySequenceWithMixin(length);
		
		System.out.println("print() - leer");
		array.print();
		
//		array.add(1);
//		array.add(5);
//		array.add(1);
//		array.add(8);
//		array.add(3);
		
		
		Random random = new Random();
		int min = 0;
		int max = 100; 
			
		for(int i = 0; i < length; i++){
			array.add(random.nextInt(max - min + 1) + min);
		}
		System.out.println("array.print() - gefuellt");
		array.print();
		
		System.out.println("array.sort()");
		array.sort();
		
		System.out.println("array.print() - sortiert");
		array.print();
		
	}

}
