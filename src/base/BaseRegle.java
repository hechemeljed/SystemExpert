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
public class BaseRegle {
    String temp;
    ArrayList<String> br ;
    public ArrayList<Integer> count;
    
      public BaseRegle(String temp){
    
        this.temp=temp;
        br = new ArrayList<String>();
        count  = new ArrayList<Integer>();
        init(this.temp);
    
    }
     public BaseRegle(BaseRegle f){
         br = new ArrayList<String>();
         count  = new ArrayList<Integer>();
         temp=f.temp;
         br= f.getBr();
         count= f.getCount();
         init(this.temp);
             
     }
     
         public  void init(String input){
   String[] sentences = input.split(";");
        for (String sentence : sentences) {
            br.add(sentence);
            count.add(sentence.split("&").length);
        }
}
             @Override
    public String toString() {
        return "BaseRegle{" + "br=" + br + '}';
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public ArrayList<String> getBr() {
        return br;
    }

    public void setBr(ArrayList<String> br) {
        this.br = br;
    }
        public  ArrayList<Integer> getCount() {
        return count;
    }

    public void setCount(ArrayList<Integer> count) {
        this.count = count;
    }
}
