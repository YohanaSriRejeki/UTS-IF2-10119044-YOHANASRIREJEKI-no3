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

public class UTSIF210119044YOHANASRIREJEKINo3 {

    public static void main(String[] args) {
        Rnb rnb = new Rnb();
        rnb.genreBlues("Jimmy Hendrik");
        rnb.genreJazz("Chad Baker");

        Folk folk = new Folk();
        folk.genreFolk("Bob Dylan");
        
        Rockability ra = new Rockability();
        ra.genreRockability("Elvis Presley");
        
        HardRock hr = new HardRock();
        hr.genreProgressiveRock("DreamTheater");
        hr.genrePsycehedellic("The Doors");
        hr.genrePopRock("Kiss");
       
        
        Metal metal = new Metal();
        metal.genrePunk("MXPX");
        metal.genreHeavyMetal("Metallica");
        
        Grindcore gc= new Grindcore();
        gc.genreGrindcore("Mesin Tempur");
        
        DeathMetal dm = new DeathMetal();
        dm.genreDeathMetal("JASAD");
        
        DeathCoreKepiting dck = new DeathCoreKepiting();
        dck.genreDeathCoreKepiting("Revenge The Fate");
        
        BlackMetal bm = new BlackMetal();
        bm.genreBlackMetal("Behemoth");
        
        NewSkul ns = new NewSkul();
        ns.genreNewSkul("HATEBREED");
        
    }
}
