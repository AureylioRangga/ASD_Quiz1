public class Mahasiswa07 {
    String nim;
    String nama;
    int tahunMasuk;
    MataKuliah07[] mataKuliahDiambil;
    int jumlahMK = 0;

    public Mahasiswa07(String nim, String nama, int tahunMasuk, int kapasitasMK) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mataKuliahDiambil = new MataKuliah07[kapasitasMK];
    }

    void tambahMataKuliah(MataKuliah07 mk) {
        if (jumlahMK < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumlahMK] = mk;
            jumlahMK++;
        } else {
            System.out.println("Kapasitas mata kuliah penuh!");
        }
    }

    int hitungTotalSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMK; i++) {
            total += mataKuliahDiambil[i].sks;
        }
        return total;
    }

    void tampilkanInfo() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Daftar Mata Kuliah:");

        for (int i = 0; i < jumlahMK; i++) {
            mataKuliahDiambil[i].tampilkanInfo();
            System.out.println("------------------");
        }

        System.out.println("Total SKS: " + hitungTotalSKS());
    }
}

