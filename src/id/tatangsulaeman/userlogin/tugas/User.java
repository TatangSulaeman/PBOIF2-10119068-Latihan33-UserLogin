/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.userlogin.tugas;

/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan Program User Login
 */
public class User {
    private static final String username = "RizkiAdam";
    private static final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun (String parUserName, String parPassword){
        if((parUserName.equals(username))&&(parPassword.equals(password))){
            return statusAkun = true;
        } else {
            return statusAkun = false ;
        }
    }
    
    private void hasilLogin (boolean status, String parUserName){
        status = statusAkun;
        if(status){
            System.out.println("*****HALLO RIZKIADAM*****");
            System.out.println("Selamat Datang di Aplikasi Ini");
        } else {
            System.out.println("Ooops, Username atau Pasword anda salah");
        }
    }
    
    public void pengecekanLogin(String parUserName,String parPassword){
        cekAkun(parUserName,parPassword);
        System.out.println();
        hasilLogin(statusAkun,parUserName);
    }
    
}
