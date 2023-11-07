import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
        System.out.println("=====================================");
        char randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);
        System.out.println("=====================================");
        String password = generator.generatePassword();
        System.out.println(password);
        System.out.println("=====================================");
        ArrayList<String> newPasswordSet = generator.getNewPasswordSet(5);
        System.out.println(newPasswordSet);
        System.out.println("=====================================");
        ArrayList<String> shuffledArray = generator.shuffleArray(newPasswordSet);
        System.out.println(shuffledArray);
    
		
	}
}
