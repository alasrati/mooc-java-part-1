import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random;
    private static final String CHARS = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        this.random = new Random();
        this.length = length;

    }

    public String createPassword() {
        int i = length;
        int l = CHARS.length();
        String password = "";
        while (i > 0) {
            char c = CHARS.charAt(this.random.nextInt(l));
            password += c;
            i--;
        }
        return password;
    }
}
