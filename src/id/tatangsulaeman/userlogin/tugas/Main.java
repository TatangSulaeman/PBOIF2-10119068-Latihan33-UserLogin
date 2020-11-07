/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.userlogin.tugas;

import java.util.Scanner;
/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan Program User Login
 */
public class Main {
    private static String usName,passWord;
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        User dataUser = new User();
        
        System.out.print("Masukan Username : ");
        usName = input.nextLine();
        System.out.print("Masukan Password : ");
        passWord = input.nextLine();
        dataUser.pengecekanLogin(usName, passWord);
    }
}
