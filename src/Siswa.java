public class Siswa {
    public String nama;
    public String tanggalLahir;
    public char jenisKelamin; // P atau L

    public Siswa(){
        this.nama = "";
        this.tanggalLahir = "";
        this.jenisKelamin = 'L';
    }

    public Siswa(String namaSiswa){
        this.nama = namaSiswa;
        this.tanggalLahir = "";
        this.jenisKelamin = 'L';
    }

    public void printData(){
        System.out.println("Nama Siswa: " + this.nama);
        System.out.println("Tanggal Lahir: " + this.tanggalLahir);
        System.out.println("Jenis Kelamin: " + this.jenisKelamin);
    }


}
