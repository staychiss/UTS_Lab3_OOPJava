//contoh Class
public class Segitiga {
    private int sisi1;
    private int sisi2;

    // Constructor tanpa parameter
    public Segitiga() {
        this.sisi1 = 0;
        this.sisi2 = 0;
    }

    // Constructor dengan parameter sisi1 dan sisi2
    public Segitiga(int sisi1, int sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    // Setter dan Getter untuk sisi1 dan sisi2
    public void setSisi1(int sisi1) {
        this.sisi1 = sisi1;
    }
    public int getSisi1() {
        return sisi1;
    }

    public void setSisi2(int sisi2) {
        this.sisi2 = sisi2;
    }
    public int getSisi2() {
        return sisi2;
    }

    // Method overloading untuk menghitung luas
    public int luassegitiga() {
        return sisi1 * sisi2/2;
    }


    public static void main(String[] args) {
        // Membuat objek menggunakan constructor tanpa parameter
        Segitiga segitiga1 = new Segitiga();
        segitiga1.setSisi1(4);
        segitiga1.setSisi2(4);
        System.out.println("luas 1: " + segitiga1.luassegitiga());

        // Membuat objek menggunakan constructor dengan parameter
        Segitiga segitiga2 = new Segitiga(5, 4);
        System.out.println("luas 2: " + segitiga2.luassegitiga());

        
    }
}
