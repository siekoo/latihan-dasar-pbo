public class Siswa {
    public String nama;
    public char jenisKelamin; // P atau L
    private String tanggalLahir;
    private String telepon;
    private int umur;

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
        System.out.println("Telepon: " + this.telepon);
        System.out.println("Umur: " + this.umur + " tahun");
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir.toUpperCase();
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
