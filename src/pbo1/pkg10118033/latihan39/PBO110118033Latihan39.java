
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan Nilai Ter
 *                     besar dan Terkecil
 *  
 */

package pbo1.pkg10118033.latihan39;

import java.util.Scanner;

public class PBO110118033Latihan39 {

    public static void main(String[] args) {

        String nama;
        int jumlahSiswa;

        Nilai result = new Nilai();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Banyaknya nilai Mahasiswa :  ");
        jumlahSiswa = scanner.nextInt();
        System.out.println();

        result.inputNilai(jumlahSiswa);
        System.out.println();
        result.tampilNilai(jumlahSiswa);

        result.tampilNilaimaxmin(jumlahSiswa);
        System.out.println("\n" + "Nilai Terbesar : " + result.max);
        System.out.println("Nilai Terkecil : " + result.min);
        System.out.println("\n" + "Nama Petugas : " + nama);
    }
}
