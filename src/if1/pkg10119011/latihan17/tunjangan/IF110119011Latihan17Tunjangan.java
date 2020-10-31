/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String status;
        double gajipokok;
        double tunjangan;
        double totalgaji;
        String status1 = "Menikah";
        String status2 = "Belum";
        
        
        System.out.println("=====Program Tunjangan=====");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp ");
        Scanner scanner = new Scanner (System.in);
        gajipokok = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)  : ");
        Scanner scanner2 = new Scanner (System.in);
        status = scanner2.nextLine();
        
        System.out.println();
        
        System.out.println("=======Hasil Perhitungan Gaji Anda=======");
        if (status.equals(status1)) {
            tunjangan = gajipokok * 0.35;
        }
            else {
            tunjangan = 0;
        }
        totalgaji = gajipokok + tunjangan;
        System.out.println("Gaji pokok  : Rp " + gajipokok);
        System.out.println("Tunjangan   : Rp " + tunjangan);
        System.out.println("Total gaji  : Rp " + totalgaji);
        System.out.println("(Developed by : Reihan Wiyanda)");
    }
    
}