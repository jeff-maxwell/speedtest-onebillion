package languages.java;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while(count < 1_000_000_000) {
            count++;
        }

        System.out.println(count);
    }
}