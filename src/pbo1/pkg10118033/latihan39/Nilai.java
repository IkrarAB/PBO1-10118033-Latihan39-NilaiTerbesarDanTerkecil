package pbo1.pkg10118033.latihan39;

import java.util.Scanner;

public class Nilai {

    public int nilai[] = new int[20];
    public int max, min;

    public void inputNilai(int jumlahSiswa) {
        int i;
        Scanner sc = new Scanner(System.in);
        for (i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = sc.nextInt();
        }
    }

    public void tampilNilai(int jumlahSiswa) {
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }

    public void tampilNilaimaxmin(int jumlahSiswa) {
        int i;
        min = nilai[1];
        max = nilai[1];

        for (i = 1; i <= jumlahSiswa; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
    }
}
