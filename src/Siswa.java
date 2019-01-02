public class Siswa extends Manusia {

    protected String nis;
    protected int kelas; //1, 2, 3, 4, 5, 6
    protected int ranking;

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
        super.printData();
        System.out.println("NIS : " + this.nis);
        System.out.println("Kelas : " + this.kelas);
        System.out.println("Ranking : " + this.ranking);
    }
}
