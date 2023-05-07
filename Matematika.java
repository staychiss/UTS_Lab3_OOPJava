public class Matematika {
    private double angka1;
    private double angka2;

    public Matematika(){
        this.angka1 = 0;
        this.angka2 = 0;
    }
    public Matematika (double angka1, double angka2){
        this.angka1 = angka1;
        this.angka2 = angka2;
    }
     public double getAngka1() {
        return angka1;
    }

    public void setAngka1(double angka1) {
        this.angka1 = angka1;
    }

    public double getAngka2() {
        return angka2;
    }

    public void setAngka2(double angka2) {
        this.angka2 = angka2;
    }

    public double Mean(){
        return (angka1 + angka2) /2;
    }
    public double Mean(double angka1,double angka2,double angka3){
        return (angka1 + angka2 + angka3)/3;
    }
        public static void main(String[] args) {
            Matematika object1 = new Matematika(5, 4);
            double mean1 = object1.Mean();
            System.out.println("Hasil mean 2 angka : " + mean1);
    
            Matematika object2 = new Matematika(5, 4);
            double mean2 = object2.Mean(object2.getAngka1(), object2.getAngka2(), 7);
            System.out.println("Hasil mean 3 angka : " + mean2);
        }
    }
