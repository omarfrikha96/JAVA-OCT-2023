import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

public ArrayList<Integer> getTenRolls(){
    ArrayList<Integer> randomRolls = new ArrayList<Integer>();
    Random rand = new Random();
    for(int i = 0; i < 10; i++){
        randomRolls.add(rand.nextInt(20));
    }
    return randomRolls;
} 

public char getRandomLetter(){
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); // Array containing all 26 letters of the alphabet
    Random rand = new Random();
    int randomIndex = rand.nextInt(26); // Generate a random index between 0 and 25
    char randomLetter = alphabet[randomIndex]; // Retrieve the random letter from the array
    return randomLetter;
}

public String generatePassword(){
    String password = "";
    for(int i = 0; i < 8; i++){
        char randomLetter = getRandomLetter();
        password += randomLetter;
    }
    return password;
}

public ArrayList<String> getNewPasswordSet(int length){
    ArrayList<String> passwordSet = new ArrayList<String>();
    for(int i = 0; i < length; i++){
        String password = generatePassword();
        passwordSet.add(password);
    }
    return passwordSet;
}

public ArrayList<String> shuffleArray(ArrayList<String> arr) {
    Random rand = new Random(); // Create a random number generator
    for (int i = 0; i < arr.size(); i++) {
        int randomIndex = rand.nextInt(arr.size()); // Generate a random index between 0 and the size of the ArrayList
        String temp = arr.get(i); // Store the element at the current position (i) in a temporary variable
        arr.set(i, arr.get(randomIndex)); // Replace the element at the current position with the element at the random index
        arr.set(randomIndex, temp); // Put the element from the temporary variable into the position of the random index
    }
    return arr; // Return the shuffled ArrayList
}

}