
package javaexample100datatotextfile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class JavaExample100DataToTextFile {

    
    public static void main(String[] args) {
        
        String fil = "dataFile1.txt";
        try
        {
            FileWriter fw = new FileWriter(fil);
            
            PrintWriter pw = new PrintWriter(fw, true);
            
            boolean flag = false;
            int a = 3;
            long b = 4L;
            double c = 12.6;
            float d = 3556.865F;
            Integer e = new Integer(344645);
            char[] f = {'a', 'b', 'c', 'd'};
            String g = "my first round!!!!!";
            String[] h = {"AAA", "BBB", "CCC", "DDD"};
            
            pw.println(flag);
            pw.println(a);
            pw.println(b);
            pw.println(c);
            pw.println(d);
            pw.println(e);
            pw.println(f);
            pw.println(g);
            pw.println(h);
            pw.write(h.toString());
            
            pw.close();
            fw.close();
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        System.out.println();
        SecondWay.main();
        
        System.out.println();
        ThirdWay.main();
    }
    
}
