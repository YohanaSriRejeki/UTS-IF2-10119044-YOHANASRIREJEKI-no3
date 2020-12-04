/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119044.yohanasrirejeki.no3;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan macam-macam genre musik
 */
public class Metal extends HardRock implements HeavyMetal{
    public void genreMetal(String artistName){
        System.out.println(artistName+" adalah musisi Metal");
    }
    
    public void genreHeavyMetal(String artistName){
        System.out.println(artistName+" adalah musisi HeavyMetal");
    }
    
    public void genrePunk(String artistName){
        System.out.println(artistName+" adalah musisi Punk");
    }
    
    public void genreGrunge(String artistName){
        System.out.println(artistName+" adalah musisi Grunge");
    }
}
