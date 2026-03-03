public class MahasiswaMain07 {
    public static void main(String[] args) {
        
    MataKuliah07 mk1 = new MataKuliah07("MK001", "Algoritma", 3);
    MataKuliah07 mk2 = new MataKuliah07("MK002", "Basis Data", 2);
    MataKuliah07 mk3 = new MataKuliah07("MK003", "Pemrograman Java", 4);

    Mahasiswa07 mhs1 = new Mahasiswa07("244107060163", "Rangga", 2024, 5);

    mhs1.tambahMataKuliah(mk1);
    mhs1.tambahMataKuliah(mk2);
    mhs1.tambahMataKuliah(mk3);

    System.out.println();
    mhs1.tampilkanInfo();
    }
}
