public class Guru extends Manusia{
    protected int gaji;
    protected String nip;
    protected String golongan; //3A, 3B, dst
    protected String jabatan; //wali kelas, tenaga pengajar, kepala sekolah

    public void printData(){
        super.printData();
        System.out.println("Gaji: " + this.gaji);
        System.out.println("NIP: " + this.nip);
        System.out.println("Golongan: " + this.golongan);
        System.out.println("Jabatan: " + this.jabatan);
    }
}
