/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package base;

/**
 *
 * @author Mr.J
 */
public class Main {
    public static void main(String[] args) {
    
    BaseFait test = new BaseFait("a;d");
    System.out.println(test.toString());
    
    BaseRegle test2 = new BaseRegle("a=>d;b=>f");
    System.out.println(test2.toString());
    }
}
