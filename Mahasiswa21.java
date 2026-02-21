public class Mahasiswa21 {

Mahasiswa21(String nim, String nm, String kelas, double ipk) {
    this.nim = nim;
    nama = nm;
    this.kelas = kelas;
    this.ipk = ipk;
}
    String nim ;
    String nama;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
    System.out.println("NIM: " + nim);
    System.out.println("Nama: " + nama);
    System.out.println("Kelas: " + kelas);
    System.out.println("IPK: " + ipk);
}
    void ubahKelas(String kelasBaru) {
    kelas = kelasBaru;
}
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;
    } else {
        System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
    }
}
    String nilaiKinerja() {
    if (ipk >= 3.5) {
        return "Sangat Baik";
    } else if (ipk >= 3.0) {
        return "Baik";
    } else if (ipk >= 2.0) {
        return "Cukup";
    } else {
        return "Kurang";
    }
}
}
