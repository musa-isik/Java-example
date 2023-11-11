/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author m-xz9
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    // iki adet dizi oluşturulacak. bu dizilerin boyutları kullanıcıdan alınacak.
    // dizilerin elemanları rastgele şekilde oluşturulacak.
    // daha sonra bu iki dizi tek bir dizide birleştirilecek.
    public static void main(String[] args) {
        System.out.println("ilk dizinin boyutunu giriniz");
        Scanner input = new Scanner(System.in);
        int first_len = input.nextInt();
        
        System.out.println("ikinci dizinin boyutunu giriniz");
        int second_len = input.nextInt();
        
        int[] first_arr = new int[first_len];
        int[] second_arr = new int[second_len];
        
        Random rnd=new Random();
        //ilk dizi oluşturuldu
        for (int i = 0; i < first_len; i++) {
            first_arr[i] = rnd.nextInt(101);
            System.out.println("ilk dizinin "+i+". elemanı : "+first_arr[i]);
        }
        
        //ikinci dizi oluşturuldu.
        for (int i = 0; i < second_len; i++) {
            second_arr[i] =rnd.nextInt(101);
            System.out.println("ikinci dizinin "+i+". elemanı : "+second_arr[i]);

        }
        
        int[] tirth_arr = new int[first_len+second_len];
        //iki dizinin birleşmesi
        for (int i = 0,j=0; i < first_len+second_len; i++) {
            if (i<first_len) {
                tirth_arr[i]=first_arr[i];
            }else{
                tirth_arr[i]=second_arr[j];
                j++;
            }
        }
        
        for (int i = 0; i < tirth_arr.length; i++) {
            System.out.println(i+". eleman :"+tirth_arr[i]);
        }
        
    }
    
}
