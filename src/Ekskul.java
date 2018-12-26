import java.util.*;

public class Ekskul {
    public String nama;
    public String pembimbing;
    public ArrayList<Siswa> daftarSiswa;

    public Ekskul(){
        this.nama = "";
        this.pembimbing = "";
        daftarSiswa = new ArrayList<Siswa>();
    }

    public void printData(){
        System.out.println("Nama ekskul: " + this.nama);
        System.out.println("Pembimbing: " + this.pembimbing);
        System.out.println("Daftar Siswa: ");
        for(int i = 0; i < daftarSiswa.size(); i++){
            Siswa pointer = daftarSiswa.get(i);
            pointer.printData();
            System.out.println("=======");
        }
    }
}


