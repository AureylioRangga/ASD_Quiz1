public class MataKuliahMain07 {
    public static void main(String[] args) {
        
        MataKuliah07 mk1 = new MataKuliah07("MK001", "Algoritma", 3);

        mk1.tampilkanInfo();
        System.out.println();

        mk1.ubahNamaMK("Struktur Data");
        mk1.ubahSKS(4);
        mk1.ubahSKS(1);

        System.out.println();
        mk1.tampilkanInfo();
    }
}