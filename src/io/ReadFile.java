package io;
import java . io .*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFile {
    
    private String thisLine ;
    private String link;
    FileInputStream fis;
    DataInputStream myInput;


public ReadFile(String l) throws IOException{

    link=l;
        try {
            fis = new FileInputStream (l);
            myInput = new DataInputStream ( fis );
            thisLine = myInput . readLine ();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}

    public String getThisLine() {
        return thisLine;
    }

    public void setThisLine(String thisLine) {
        this.thisLine = thisLine;
    }

	
	public static void main ( String args []) throws IOException {
	
            ReadFile f = new ReadFile("test.txt");
            System.out.println(f.getThisLine());

}
}