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

public ArrayList<String> shuffleArray(ArrayList<String> arr){
    Random rand = new Random();
    for(int i = 0; i < arr.size(); i++){
        int randomIndex = rand.nextInt(arr.size());
        String temp = arr.get(i);
        arr.set(i, arr.get(randomIndex));
        arr.set(randomIndex, temp);
    }
    return arr;
}
}