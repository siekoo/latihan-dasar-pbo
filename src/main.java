public class main {
    public static void main(String[] args) {
        Siswa adi = new Siswa();
        adi.nama = "Adi Saputra";
        adi.tanggalLahir = "1 Januari 2004";
        adi.telepon = "081234567890";
        adi.umur = 15;
        adi.nis = "56789";
        adi.kelas = 5;
        adi.ranking = 1;
        adi.printData();

        System.out.println("------");
        Guru bakri = new Guru();
        bakri.nama = "Umar bakri";
        bakri.tanggalLahir = "1 januari 1975";
        bakri.jenisKelamin = 'L';
        bakri.umur = 44;
        bakri.telepon = "tidak ada";

        bakri.gaji = 2000000;
        bakri.nip = "123456";
        bakri.golongan = "3B";
        bakri.jabatan = "wali kelas";
        bakri.printData();

        System.out.println("------");
        Ekskul basket = new Ekskul();
        basket.nama = "Basket";
        basket.pembimbing = "Mourinho";

        basket.anggota.add(adi);
        basket.anggota.add(bakri);
        basket.printData();

    }
}
