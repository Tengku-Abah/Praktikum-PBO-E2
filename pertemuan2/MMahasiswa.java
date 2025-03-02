package PBO.pertemuan2;

public class MMahasiswa {
    public static void main(String[] args) {

        System.out.println("===DETAIL MAHASISWA TANPA PARAMETER===");
        //mahasiswa tanpa parameeter  
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.setnim("007");
        mhs1.setnama("Nugi");
        mhs1.setprodi("ilmu komunikasi");

        //membuat mata kuliah tanpa menggunakan parameter
        Matakuliah MK1 = new Matakuliah();
        MK1.setnamaMatkul("Sosial enginer");
        MK1.setsks(4);
        mhs1.addmatkul(MK1);  
        
        Matakuliah MK2 = new Matakuliah();
        MK2.setnamaMatkul("Publick spiking");
        MK2.setsks(3);
        mhs1.addmatkul(MK2);  

        //objek dosenWali tanpa menggunakan parameter 
        Dosen DW1 = new Dosen();
        DW1.setnama("Oseans");
        mhs1.setdoswal(DW1);

        //objek kendaraan tanpa parameter
        kendaraan kendaraan = new kendaraan();
        kendaraan.setjenis("Mobil");
        mhs1.setkendaraan(kendaraan);
        
        //menampilkan detail mahasiswa 
        mhs1.printDetailMhs();

        //menampilkan jumlah sks yang di ambil 
        System.out.println("Jumlah Sks : " + mhs1.getjumlahsks());

        //menampilkan jumlah matkul yang di ambil 
        System.out.println("Jumlah Matkul : " + mhs1.getjumlahmatkul());
        System.out.println("\n===========================");
        
        //membuat objek mahasiswa dengan parameter 
        System.out.println("\n===DETAIL MAHASISWA DENGAN PARAMETER===");
        Mahasiswa mhs2 = new Mahasiswa("449","Bagas","Ilmu Pemerintahan" );

        //membuaty objek dosen dengan menggunakan parameter 
        Dosen DW2 = new Dosen("768","Ucup", "Menegement");
        mhs2.setdoswal(DW2);
        
        //membuat ovbjek Matakuliah dengan menggunakan parameter
        Matakuliah MK3 = new Matakuliah("Akutansi212", "RPL", 4);
        Matakuliah MK4 = new Matakuliah("Statistika034", "MBD", 3);

        //menambahkan mata kuliah pada mahasiswa 
        mhs2.addmatkul(MK3);
        mhs2.addmatkul(MK4);

        //menampilkan detail mahasiswa 
        mhs2.printDetailMhs();

        //menampilkan jumlah sks yang di ambul mahasiswa 
        System.out.println("Jumlah Sks yang di ambil : " + mhs2.getjumlahsks());

        //menampilkan jumlah mata kulkiah yang di ambil mahasiswa 
        System.out.println("Jumlah Matkul yang di ambil : " + mhs2.getjumlahmatkul());


    }
}
