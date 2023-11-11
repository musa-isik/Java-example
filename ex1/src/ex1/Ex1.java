/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author m-xz9
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    
    
    //  klavyeden girilen sayıya göre uzunluğu belirlenen bir dizi oluşturun. Oluşturduğunuz diziye 
    //  klavyeden okutulan değerleri girin. Daha sonra dizinin en büyük elemanını bulunuz.
    public static void main(String[] args) {
        //Konsoldan veri alma
        System.out.println("Kaç elemanlı bir dizi oluşturmak istiyorsunuz ?");
        Scanner input =new Scanner(System.in);
        int len = input.nextInt();
        
        int dizi[] = new int[len];
        
        for (int i = 0; i < len; i++) {
            System.out.println(i+1+". elemanı giriniz");
            dizi[i]=input.nextInt();
        }

        // ilk yöntem  elemanları karşılaştırma
        // 5 12 98 4
        int enBuyukEleman=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>enBuyukEleman) {
                enBuyukEleman=dizi[i];
            }
        }
        System.out.println("En büyük eleman : "+enBuyukEleman);
        
        // ikinci yöntem diziyi sıralayıp en son elemanı alma
//        Arrays.sort(dizi);
//        System.out.println("Dizinin en büyük elemanı : "+dizi[dizi.length-1]);
    }
    
}
