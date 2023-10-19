// Nama : Nova Eliza Maharani
// Kelas / No : TI 1F / 20
// NIM : 2341720252 

import java.util.Scanner;
public class UTSpajak20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usaha, jenisHarta, hartaKekayaan, keluarga;
        double penghasilan, nilaiJual;
        double pajakUsaha = 0.0;
        double totalHartaKekayaan = 0.0;
        double pajak = 0.0;
        double pajakKekayaan = 0.0;
        int anakKuliah, anakSMA;

        System.out.print("Apakah anda memiliki usaha? (ya/tidak) ");
        usaha = sc.nextLine();
        if (usaha.equals("ya")) {
            System.out.print("Berapa penghasilan usaha anda dalam 1 tahun? ");
            penghasilan = sc.nextDouble();
            pajakUsaha = penghasilan * 0.15;
        }

        System.out.print("Apakah anda memiliki harta kekayaan? (ya/tidak) ");
        hartaKekayaan = sc.nextLine();
        sc.nextLine();

        while (true) {

            System.out.print("Masukkan jenis harta kekayaan dan ketik selesai jika telah menginput: ");
            jenisHarta = sc.nextLine();
            
            if (jenisHarta.equals("selesai")) {
                break;
            }
            System.out.print("Masukkan nilai jual saat ini: ");
            nilaiJual = sc.nextDouble();
            sc.nextLine();
            
            totalHartaKekayaan += nilaiJual;
        }
        
        System.out.print("Apakah anda sudah berkeluarga? (ya/tidak) ");
        keluarga = sc.nextLine();
        if (keluarga.equals("ya")) {
            System.out.print("Masukkan jumlah anak yang kuliah: ");
            anakKuliah = sc.nextInt();
            System.out.print("Masukkan jumlah anak yang SMA: ");
            anakSMA = sc.nextInt();
           
            if (anakKuliah == 1 && anakSMA == 1 && totalHartaKekayaan >= 50000000) {
                pajakKekayaan *= 0.90;
            } else {
                pajakKekayaan *= 0.95;
            }
        }
        pajak = pajakUsaha + pajakKekayaan;
        System.out.printf("Anda harus membayar pajak sebesar: Rp%.2f%n", pajak);
    }
}