class Kalkulator implements Operasi {
    private double Bil1, Bil2;
    Kalkulator() {
    }
    Kalkulator(double Bil1, double Bil2) {
        this.Bil1 = Bil1;
        this.Bil2 = Bil2;
    }
    public double getBil1() {
        return Bil1;
    }
    public double getBil2() {
        return Bil2;
    }
    public void Penjumlahan(){
        System.out.println(Bil1+Bil2);
    }
    public void Pengurangan(){
        System.out.println(Bil1-Bil2);
    }
    public double Perkalian(){
        return Bil1*Bil2;

    }
    public double Pembagian(){
        return Bil1/Bil2;
    }

}
