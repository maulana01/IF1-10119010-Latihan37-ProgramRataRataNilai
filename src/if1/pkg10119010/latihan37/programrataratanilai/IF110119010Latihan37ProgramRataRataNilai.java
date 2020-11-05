/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan37.programrataratanilai;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk menampilkan rata-rata
 *                     nilai mahasiswa dengan konsep OOP
 */
public class IF110119010Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RataRataNilaiMahasiswa nilaiMhs = new RataRataNilaiMahasiswa();
        double ratarata = nilaiMhs.hitungRataRata();
        System.out.println("\nMaka, Rata-rata Nilainya adalah: "+ratarata);
        System.out.println("Developed by : Maulana Imam Malik");
    }
    
}
