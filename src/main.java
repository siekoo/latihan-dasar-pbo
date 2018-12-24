public class main {
    public static void main(String[] args) {
        Siswa adi = new Siswa();
        //adi.printData();
        adi.nama = "Adi Saputra";
        adi.tanggalLahir = "1 Januari 2004";
        //adi.printData();

        Siswa budi = new Siswa("Budi");

        Ekskul basket = new Ekskul();
        basket.nama = "Basket";
        basket.pembimbing = "Mourinho";
        basket.daftarSiswa[0] = adi;
        basket.daftarSiswa[1] = budi;
        basket.printData();
    }
}
