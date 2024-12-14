import java.util.Random;
public class nirharoush {
	public static void main(String[] args) {
		Random rand = new Random();
		for(int i = 1;i <= 8; i++){
			int rand_int1 = rand.nextInt(10);
			System.out.println(rand_int1);
		}
	}
}