import java.util.Scanner;

public class ReverseKalimat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat: ");
        String kalimatawal = scanner.nextLine();

        String[] words = kalimatawal.split(" ");

        String[] kalimatterbalik = new String[words.length];
        for (int i = words.length - 1; i >= 0; i--) {
            kalimatterbalik[words.length - 1 - i] = words[i];
        }

        System.out.println("Original string: " + kalimatawal);
        System.out.println("Reversed string: " + String.join(" ", kalimatterbalik));
    }
}