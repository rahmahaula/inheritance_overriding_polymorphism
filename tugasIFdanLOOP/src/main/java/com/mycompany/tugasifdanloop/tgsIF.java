/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasifdanloop;

import java.util.*;
        
public class tgsIF {
    
    //IF
    
    public static void main(String[] args) {
        
        Scanner inputUser;
        float nilai;
        
        inputUser = new Scanner(System.in);
        
        System.out.println("Masukkan nilai = ");
        nilai = inputUser.nextFloat();
        
        if (nilai >= 90){
        System.out.println("Nilai Anda A");
    }   else if (nilai >= 80){
        System.out.println("Nilai Anda B");
    }   else if (nilai >= 70){
        System.out.println("Nilai Anda C");
    }   else if (nilai < 70){
        System.out.println("Nilai Anda E");
    }
    }
}
