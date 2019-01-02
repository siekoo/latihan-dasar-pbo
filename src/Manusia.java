public class Manusia {
    public String nama;
    public char jenisKelamin; // P atau L
    protected String tanggalLahir;
    protected String telepon;
    protected int umur;

    public void printData(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Tanggal Lahir: " + this.tanggalLahir);
        System.out.println("Jenis Kelamin: " + this.jenisKelamin);
        System.out.println("Telepon: " + this.telepon);
        System.out.println("Umur: " + this.umur + " tahun");
    }
}
