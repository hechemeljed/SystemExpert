/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package base;

import java.util.ArrayList;

/**
 *
 * @author Mr.J
 */
public class BaseFait {
 
    String temp;
    ArrayList<String> bf ;
    
    public BaseFait(String temp){
    
        this.temp=temp;
        bf = new ArrayList<String>();
        init(this.temp);
    
    }
        public BaseFait(){
    
        this.temp="";
        bf = new ArrayList<String>();
        init(this.temp);
    
    }
     public BaseFait(BaseFait f){
         bf = new ArrayList<String>();
         temp=f.temp;
         bf= f.getBf();
         init(this.temp);
             
     }
    
    public  void init(String input){
   String[] sentences = input.split(";");
        for (String sentence : sentences) {
            bf.add(sentence);
        }
}

    public ArrayList<String> getBf() {
        return bf;
    }

    public void setBf(ArrayList<String> bf) {
        this.bf = bf;
    }

    @Override
    public String toString() {
        return "BaseFait{" + "bf=" + bf + '}';
    }
    
 
}
