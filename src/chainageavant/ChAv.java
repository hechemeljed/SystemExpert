package chainageavant;
import base.BaseFait;
import base.BaseRegle;
import java.util.*;
import java.io.*;
 
public class ChAv{

public static String but;
public static ArrayList<String> faits;
public static ArrayList<String> regles;
public static ArrayList<Integer> compteur;
public static ArrayList<String> entailed;
 
 
public ChAv(String a, BaseRegle t, BaseFait f){

        faits  = new ArrayList<String>();
        regles  = new ArrayList<String>();
        entailed  = new ArrayList<String>();
        compteur  = new ArrayList<Integer>();
        but = a;
        initBR(t);
        initBF(f);
}
 
public String executer(){
        String output = "";
        if (chainage_avant_algo()){
                        output = "Oui: ";
                        for (int i=0;i<entailed.size();i++){
                                        output += entailed.get(i)+", ";
                                }
                        output += but; 
        }
        else{
                        output = "Non";
        }
        return output;         
}
 
public boolean chainage_avant_algo(){

while(!faits.isEmpty()){
                // take the first item and process it
                String p = faits.remove(0);
                // add to entailed
                entailed.add(p);
                // for each of the clauses....
                for (int i=0;i<regles.size();i++){
                        // .... that contain p in its premise
                        if (premiseContains(regles.get(i),p)){
                        Integer j = compteur.get(i);
                        // reduce count : unknown elements in each premise
                        compteur.set(i,--j);
                                // all the elements in the premise are now known
                                if (compteur.get(i)==0){
                                        // the conclusion has been proven so put into agenda
                                        String head = regles.get(i).split("=>")[1];
                                        // have we just proven the 'ask'?
                                        if (head.equals(but))
                                                return true;
                                        faits.add(head);                                      
                                }
                        }      
                }
        }
        return false;
}
 
public static void initBR(BaseRegle br){
    
                  regles.addAll(br.getBr());
                        compteur.addAll(br.getCount());
}

public static void initBF(BaseFait bf){

                        faits.addAll(bf.getBf());
}

public static boolean premiseContains(String clause, String p){
        String premise = clause.split("=>")[0];
        String[] conjuncts = premise.split("&");

        if (conjuncts.length==1)
                return premise.equals(p);
        else
                return Arrays.asList(conjuncts).contains(p);
}
}
