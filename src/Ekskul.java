import java.util.*;

public class Ekskul {
    public String nama;
    public String pembimbing;
    public ArrayList<Manusia> anggota;

    public Ekskul(){
        this.nama = "";
        this.pembimbing = "";
        anggota = new ArrayList<Manusia>();
    }

    public void printData(){
        System.out.println("Nama ekskul: " + this.nama);
        System.out.println("Pembimbing: " + this.pembimbing);
        System.out.println("Daftar Siswa: ");
        for(int i = 0; i < anggota.size(); i++){
            Manusia pointer = anggota.get(i);
            pointer.printData();
            System.out.println("=======");
        }
    }
}


