public class MataKuliah_21 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah_21() {
        kodeMK = "";
        nama = "";
        sks = 0;
        jumlahJam = 0;
    }
    public MataKuliah_21(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tampilkanInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("-----------------------------");
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sks);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam berhasil ditambah. Jumlah jam sekarang: " + jumlahJam);
    }
    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam berhasil dikurangi. Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jam tidak mencukupi.");
        }
    }
}