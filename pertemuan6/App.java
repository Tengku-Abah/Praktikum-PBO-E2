package PBO.pertemuan6;
/*  Nama File   : App.java
 *  Deskripsi   : Kelas App merupakan kelas utama yang berisi method main untuk menjalankan program.
 *  Pembuat     : Tengku Muhamad Afif Alghomidy
 *  NIM         : 24060123140165
 *  Tanggal     : 29 Maret 2025
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
   
        // membuat universitas
        University univTech = new University("Universitas Teknologi Surabaya", 30000);
        System.out.println("/******************* " + univTech.getNamaUniversitas() + " *******************/");
        System.out.println("Tarif Kebersihan Standar: Rp " + String.format("%,.2f", univTech.getTarifBiayaKebersihanStandar()) + " per m²");
        
        // membuat fakultas
        Faculty facultyEngineering = new Faculty("Fakultas Teknik", 20000);
        Faculty facultyInformatics = new Faculty("Fakultas Informatika", 22000);
        
        // membuat departemen
        Department deptTeknikSipil = new Department("Departemen Teknik Sipil", "Dr. Ir. Sipil", 35000);
        Department deptInformatika = new Department("Departemen Informatika", "Prof. Dr. Komputer", 32000);
        Department deptElektro = new Department("Departemen Teknik Elektro", "Ir. Elektro", 33000);
        
        // membuat ruang kuliah
        ClassRoom roomT1 = new ClassRoom("T001", 12, 9, 3, 50, 40, 2, facultyEngineering);
        ClassRoom roomT2 = new ClassRoom("T002", 14, 10, 3, 60, 50, 3, facultyEngineering);
        
        // lab komputer
        ComputerLab labInformatika1 = new ComputerLab("LI001", 16, 12, 3, 30, "Laboratorium Jaringan", 1700000, facultyInformatics, 35);
        ComputerLab labInformatika2 = new ComputerLab("LI002", 14, 10, 3, 28, "Laboratorium Pemrograman", 1600000, facultyInformatics, 25);
        
        // bukan lab komputer (lab elektro, sipil)
        List<String> mataKuliahElektro = Arrays.asList("Rangkaian Listrik", "Elektronika Analog", "Sistem Kontrol");
        NonComputerLab labElektro = new NonComputerLab("LE001", 14, 10, 3, 20, 
                                  "Laboratorium Elektro", 1300000, facultyEngineering, "Elektro", mataKuliahElektro);
        
        List<String> mataKuliahSipil = Arrays.asList("Mekanika Teknik", "Struktur Bangunan", "Teknik Jalan Raya");
        NonComputerLab labSipil = new NonComputerLab("LS001", 15, 11, 3, 22, 
                                 "Laboratorium Teknik Sipil", 1400000, facultyEngineering, "Sipil", mataKuliahSipil);
        
        // ruang departemen
        DepartmentRoom roomDeptInformatika = new DepartmentRoom("DI001", 10, 8, 3, 18, 6, 22, 10, deptInformatika);
        DepartmentRoom roomDeptElektro = new DepartmentRoom("DE001", 10, 8, 3, 17, 5, 20, 9, deptElektro);
        
        // ruang dosen
        LecturerRoom lecturerRoom1 = new LecturerRoom("LR001", 5, 4, 3, 2, "Dr. Ahmad", 4, 3, deptTeknikSipil);
        LecturerRoom lecturerRoom2 = new LecturerRoom("LR002", 5, 4, 3, 2, "Dr. Maya", 5, 4, deptInformatika);
        LecturerRoom lecturerRoom3 = new LecturerRoom("LR003", 5, 4, 3, 2, "Prof. Nia", 4, 3, deptElektro);
        
        // tambahkan ruangan ke fakultas
        univTech.tambahRuang(roomT1);
        univTech.tambahRuang(roomT2);
        univTech.tambahRuang(labInformatika1);
        univTech.tambahRuang(labInformatika2);
        univTech.tambahRuang(labElektro);
        univTech.tambahRuang(labSipil);
        univTech.tambahRuang(roomDeptInformatika);
        univTech.tambahRuang(roomDeptElektro);
        univTech.tambahRuang(lecturerRoom1);
        univTech.tambahRuang(lecturerRoom2);
        univTech.tambahRuang(lecturerRoom3);
        
        // tampilkan informasi ruangan
        System.out.println("\n/******************* INFORMASI RUANGAN *******************/");
        for (Room room : univTech.getDaftarRuang()) {
            System.out.println("\n-----------------------");
            room.tampilkanInfoRuangan();
        }
        
        // tampilkan biaya kebersihan
        System.out.println("\n/******************* TOTAL BIAYA KEBERSIHAN *******************/");
        System.out.println("Total Biaya Kebersihan: Rp " + String.format("%,.2f", univTech.hitungTotalBiayaKebersihan()));
        
        // tampilkan jumlah ruangan per jenis
        System.out.println("\n/******************* JUMLAH RUANGAN PER JENIS *******************/");
        Map<String, Integer> totalRuangPerJenis = univTech.getTotalRuangPerJenis();
        for (Map.Entry<String, Integer> entry : totalRuangPerJenis.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // tampilkan biaya kebersihan per jenis ruangan
        System.out.println("\n/******************* BREAKDOWN BIAYA KEBERSIHAN PER JENIS RUANGAN *******************/");
        Map<String, Double> biayaPerJenis = new HashMap<>();
        
        for (Room room : univTech.getDaftarRuang()) {
            String jenisRuang = room.getClass().getSimpleName();
            double biaya = room.hitungBiayaKebersihan();
            biayaPerJenis.put(jenisRuang, biayaPerJenis.getOrDefault(jenisRuang, 0.0) + biaya);
        }
        
        for (Map.Entry<String, Double> entry : biayaPerJenis.entrySet()) {
            System.out.println(entry.getKey() + ": Rp " + String.format("%,.2f", entry.getValue()));
        }

        System.out.println("\n/******************* END PROGRAM UNIVERSITAS *******************/");
    }
}
