package languages.java;

public class MainOutput {
    public static void main(String[] args) {
        int count = 0;
        while(count < 1_000_000_000) {
            System.out.println(count);
            count++;
        }
    }
}
