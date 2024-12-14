import java.util.Random;
public class nirharoush {
	public static void main(String[] args) {
		for(int i = 1;i <= 8; i++){
			Random rand = new Random();
			int rand_int1 = rand.nextInt(10);
			System.out.println(rand_int1);
		}
	}
}