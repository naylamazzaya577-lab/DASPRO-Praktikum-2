
    import java.util.Calendar;

public class DosenMn21 {

    public static void main(String[] args) {

        Calendar kalender = Calendar.getInstance();
        int tahunSekarang = kalender.get(Calendar.YEAR);

        Dosen21 dsn1 = new Dosen21();
        dsn1.idDosen = "DSN001";
        dsn1.nama = "Dr. Andi Wijaya";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Algoritma dan Struktur Data";

        Dosen21 dsn2 = new Dosen21(
                "DSN002",
                "Ir. Budi Santoso",
                false,
                2010,
                "Basis Data"
        );

        dsn1.tampilkanInformasi();
        dsn2.tampilkanInformasi();
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Pemrograman Java");
        System.out.println("Masa Kerja : " +
                dsn1.hitungMasaKerja(tahunSekarang) + " tahun\n");

        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Sistem Informasi");
        System.out.println("Masa Kerja : " +
                dsn2.hitungMasaKerja(tahunSekarang) + " tahun\n");

        dsn1.tampilkanInformasi();
        dsn2.tampilkanInformasi();
    }
}

