public class Ekskul {
    public String nama;
    public String pembimbing;
    public Siswa[] daftarSiswa;

    public Ekskul(){
        this.nama = "";
        this.pembimbing = "";
        daftarSiswa = new Siswa[5];
    }

    public void printData(){
        System.out.println("Nama ekskul: " + this.nama);
        System.out.println("Pembimbing: " + this.pembimbing);
        System.out.println("Daftar Siswa: ");
        for(int i = 0; i < daftarSiswa.length; i++){
            if(daftarSiswa[i] != null){
                Siswa pointer = daftarSiswa[i];
                System.out.println(
                    " - "
                    + pointer.nama
                    + " | "
                    + pointer.tanggalLahir
                );
            }

        }
    }
}


