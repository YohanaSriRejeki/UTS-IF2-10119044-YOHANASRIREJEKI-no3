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
public class Rnb extends MusicGenre implements Blues,Jazz{
    @Override
    public void genreJazz (String artistName){
        System.out.println(artistName+" adalah musisi Jazz");
    }
    @Override
    public void genreBlues (String artistName){
        System.out.println(artistName+" adalah musisi Blues");
    }
}
