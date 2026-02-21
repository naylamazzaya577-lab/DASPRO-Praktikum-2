public class MataKuliahMain21{

    public static void main(String[] args) {

        MataKuliah_21 mk1 = new MataKuliah_21 ();
        mk1.kodeMK = "TI101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        MataKuliah_21 mk2 = new MataKuliah_21(
                "TI102",
                "Pemrograman Java",
                4,
                8
        );
        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();

        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(10);
        mk2.tampilkanInformasi();
    }
}