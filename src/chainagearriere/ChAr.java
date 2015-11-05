package chainagearriere;
import base.BaseFait;
import base.BaseRegle;
import java.util.*;
 
public class ChAr{

public static String bc;
public static String but;
public static ArrayList<String> faits;
public static ArrayList<String> regles;
public static ArrayList<String> entailed;
public static ArrayList<String> list_symbols;
BaseFait bbf;
BaseRegle brr;
 
public ChAr(String bt, BaseFait bf, BaseRegle br){
	list_symbols  = new ArrayList<String>();
	regles  = new ArrayList<String>();
	entailed  = new ArrayList<String>();
	faits  = new ArrayList<String>();
	but = bt;
        bbf= new BaseFait(bf);
        brr= new BaseRegle(br);
        initBF(bf);
        initBR(br);
        list_symbols.add(but);     
}

public static void initBR(BaseRegle br){
                        regles.addAll(br.getBr());      
}

public static void initBF(BaseFait bf){
                        faits.addAll(bf.getBf());
}
 
public String executer(){
	String res = "";
	if (chainage_arriere_algo()){
		res = "Oui: ";
		for (int i=entailed.size()-1;i>=0;i--){
				if (i==0)
					res += entailed.get(i);
				else
					res += entailed.get(i)+", ";
			}
	} 
	else{
			res = "Non";
	}
	return res;		
}
 
public boolean chainage_arriere_algo(){
     
	while(!list_symbols.isEmpty()){
		String q = list_symbols.remove(list_symbols.size()-1);
		entailed.add(q);
 
		if (!faits.contains(q)){
			
			ArrayList<String> p = new ArrayList<String>();
			for(int i=0;i<regles.size();i++){
					if (conclusionContains(regles.get(i),q)){
 
							ArrayList<String> temp = getPremises(regles.get(i));
							for(int j=0;j<temp.size();j++){
								p.add(temp.get(j));
							}
						}						
			}
			
			if (p.size()==0){
				return false;
			}
			else{
					for(int i=0;i<p.size();i++){
							if (!entailed.contains(p.get(i)))
									list_symbols.add(p.get(i));
							}
 
 
			}
		}
 
	}
	return true;
}
public static ArrayList<String> getPremises(String clause){
	String premise = clause.split("=>")[0];
	ArrayList<String> temp = new ArrayList<String>();
	String[] conjuncts = premise.split("&");
    for (int i=0;i<conjuncts.length;i++) {
        if (!list_symbols.contains(conjuncts[i])) {
            temp.add(conjuncts[i]);
        }
    }
	return temp;
}
public static boolean conclusionContains(String clause, String c){
String conclusion = clause.split("=>")[1];
	if (conclusion.equals(c))
		return true;
	else
		return false;
 
}
}