
package chainageavant;

import base.BaseFait;
import base.BaseRegle;



/**
 *
 * @author Mr.J
 */
public class ChainageAvant {

    public static void main(String[] args) {
       String but = "h";
       BaseFait bf = new BaseFait("b;c;");
       BaseRegle br = new BaseRegle("b&d&e=>f;g&d=>a;c&f=>a;b=>x;d=>e;x&a=>h;c=>d;x&c=>a;x&b=>d;");
       System.out.println(bf.toString());
       System.out.println(br.toString());
       
       ChAv fc= new ChAv(but,br,bf);
       
       System.out.println(fc.executer());
       //**********************************
       System.out.println("-------------------------------\n");

    }
    
}
