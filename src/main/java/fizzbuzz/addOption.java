package fizzbuzz;

public class addOption {

	public static void main(String[] args) {
		
		for(int i=30;i>0;i--) {
			if(i%3==0) {
				if(i%5==0) {
					System.out.println("FizzBuzz");
				}else {
					System.out.println("Fizz");
				}
			}else if(i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}
	
}
