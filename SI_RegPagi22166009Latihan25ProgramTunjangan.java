/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166009.latihan25.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author HP
 * Nama     : Affa Muntazah
 * Kelas    : PBO 025
 * NIM      : 22166009
 * Deskripsi Program : Waktu Saat Ini
 */
public class SI_RegPagi22166009Latihan25ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String name = input.nextLine();

        System.out.println("Ejaan untuk \"" + name + "\" adalah :");
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Huruf ke-" + (i+1) + ": " + name.charAt(i));
        }
    }
}