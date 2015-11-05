/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chainagearriere;

import base.BaseFait;
import base.BaseRegle;

/**
 *
 * @author Mr.J
 */
public class ChainageArriere {


    public static void main(String[] args) {
       String but = "h";
       BaseFait bf = new BaseFait("b;c;");
       BaseRegle br = new BaseRegle("b&d&e=>f;g&d=>a;c&f=>a;b=>x;d=>e;x&a=>h;c=>d;x&c=>a;x&b=>d;");
       
       System.out.println(bf.toString());
       System.out.println(br.toString());
       
       Chain_Ar bc= new Chain_Ar(but,br,bf);
       
       System.out.println(bc.executer());
       
       System.out.println("---------------------");
    
    }
    
}
