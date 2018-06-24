
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters

        if (this.guessedLetters.contains(letter)){
            return;
        }
        this.guessedLetters += letter;
        if (!word.contains(letter)) {
            this.numberOfFaults++;
        }
    }

    public String hiddenWord() {
        String hiddenWord = "";
        for (char letter : this.word.toCharArray()){
            if (guessedLetters.contains(""+letter)){
                hiddenWord += letter;
            } else {
                hiddenWord += "_";
            }
        }
        return hiddenWord;
    }
}
