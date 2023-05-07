public class Fisika {
    private double kecepatan;
    private double waktu;

    // Constructor
    public Fisika(double kecepatan, double waktu) {
        this.kecepatan = kecepatan;
        this.waktu = waktu;
    }

    // Getter and Setter Methods
    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getWaktu() {
        return waktu;
    }

    public void setWaktu(double waktu) {
        this.waktu = waktu;
    }

    // Method Overloading
    public double menghitungjarak() {
        return kecepatan * waktu;
    }

    public double menghitungjarak(double kecepatanawal, double waktu) {
        return kecepatanawal * waktu + 0.5 * 9.8 * waktu * waktu;
    }

    public static void main(String[] args) {
        Fisika object1 = new Fisika(10, 5);
        double jarak1 = object1.menghitungjarak();
        System.out.println("Jarak dengan kecepatan konstan: " + jarak1 + " meter");

        Fisika object2 = new Fisika(20, 5);
        double jarak2 = object2.menghitungjarak(object2.getKecepatan(), object2.getWaktu());
        System.out.println("Jarak dengan kecepatan awal dan percepatan gravitasi : " + jarak2 + " meter");
    }
}
