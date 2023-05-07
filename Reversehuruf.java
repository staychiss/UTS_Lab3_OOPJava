import java.util.Scanner;

public class Reversehuruf {
  public static void main(String args[]) {
    String kata, hasil = "";
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan kata : ");
    kata = scanner.nextLine();

    int jumlah = kata.length();
    int jumlahkata = jumlah - 1;

    for (int i = 0; i < jumlah; i++) {
      hasil = hasil + kata.charAt(jumlahkata);
      jumlahkata--;
    }
    System.out.println("Hasil pembalikan huruf pada kata: " + hasil);
  }
}