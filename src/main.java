public class main {
    public static void main(String[] args) {
        Siswa adi = new Siswa();
        adi.nama = "Adi Saputra";
        adi.setTanggalLahir("1 Januari 2004");
        adi.setTelepon("081234567890");
        adi.setUmur(15);

        Ekskul basket = new Ekskul();
        basket.nama = "Basket";
        basket.pembimbing = "Mourinho";

        basket.daftarSiswa.add(adi);
        basket.printData();

    }
}
