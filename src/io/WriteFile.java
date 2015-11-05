package io;
import java . io .*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteFile {
   
    FileOutputStream fos ;
    PrintStream myOutput ;
    Boolean res;

   public WriteFile(String input, String file){
        try {
            fos = new FileOutputStream (file);
            myOutput = new PrintStream ( fos );
            myOutput . println (input);
            res= true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
            res= false;
        }

    
}
   
    public Boolean isRes() {
        return res;
    }
   
   	public static void main ( String args []) throws IOException {
	
            WriteFile wf = new WriteFile("a=>p;c=>d;r;a;","output.txt");
            System.out.println(wf.isRes());
            

}
}
