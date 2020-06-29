/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_java;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class uts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Menentukan Tombol Pada Kipas Angin");
       int tombol;
       
       // Bagian Pengulangan
        for (int i = 1; i <=3; i++){
            System.out.println("perulangan ke-" +i);
        
        
       // Bagian Input/Output
       System.out.printf("Input Tombol Angka Pada Kipas Angin Agar Mengetahui Keadaanya  : ");
        Scanner inputUser = new Scanner(System.in);
       tombol=Integer.parseInt(inputUser.nextLine());
       
       
       // Bagian Percabangan
       if(tombol == 0){
           System.out.printf("Tombol "+tombol);
           System.out.println(" = Kipas akan mati/off");
       }
            else if(tombol == 1){
                System.out.printf("Tombol "+tombol);
                System.out.println(" = Kipas akan bergerak LAMBAT");
            }
            else if(tombol == 2){
                System.out.printf("Tombol "+tombol);
                System.out.println(" = Kipas akan bergerak SEDANG");
            }
            else if(tombol == 3){
                System.out.printf("Tombol "+tombol);
                System.out.println(" = Kipas akan bergerak CEPAT");
            }
       else{
           System.out.printf("Tombol "+tombol);
           System.out.println(" = Maaf! tombol pada kipas hanya 0-3");     
       }
            System.out.println("");
     }
   }
    
}
