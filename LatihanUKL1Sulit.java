import java.util.Scanner;

public class LatihanUKL1Sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Siswa: ");
        int jumlahSiswa = input.nextInt();

        double totalNilai = 0; 
        
        //Memasukkan Nilai Setiap Siswa
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        // Menghitung Rata-Rata
        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\nTotal Nilai Seluruh Siswa : " + totalNilai);
        System.out.println("Rata-rata Nilai: " + rataRata);

        input.close();
}
}