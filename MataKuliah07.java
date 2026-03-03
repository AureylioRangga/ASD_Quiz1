public class MataKuliah07 {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah07(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        if (sks >= 2) {
            this.sks = sks;
        } else {
            System.out.println("SKS minimal 2, otomatis diubah menjadi 2.");
            this.sks = 2;
        }
    }

    void tampilkanInfo() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS     : " + sks);
    }

    void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
        System.out.println("Nama MK berhasil diubah menjadi: " + namaMK);
    }

    void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
            System.out.println("SKS berhasil diubah menjadi: " + sks);
        } else {
            System.out.println("SKS tidak boleh kurang dari2!");
        }
    }
}