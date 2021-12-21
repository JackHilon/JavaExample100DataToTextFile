
package javaexample100datatotextfile;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class ThirdWay {
    
    
    public static void main() {
        
        String fil = "dataFile3.txt";
        try
        {
            FileOutputStream fos = new FileOutputStream(fil);
            
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            
            BufferedWriter bw = new BufferedWriter(osw);
            
            PrintWriter pw = new PrintWriter(bw, true);
            
            // or directly
            // PrintWriter pw1= new PrintWriter(fil);
            
            
            // end-line
            String endLine = System.getProperty("line.separator");
            
            boolean flag = false;
            int a = 376; // writes first byte as char only
            long b = 674L;
            double c = 12.6;
            float d = 3556.865F;
            Integer e = new Integer(376);
            char[] f = {'a', 'b', 'c', 'd'};
            String g = "my first round!!!!!";
            String[] h = {"AAA", "BBB", "CCC", "DDD"};
            
            /*
            osw.write(MyHelper.ToString(flag));
            osw.write(endLine);
            osw.write(a); // writes first byte as char only
            osw.write(endLine);
            osw.write(MyHelper.ToString(b)); // long value
            osw.write(endLine);
            osw.write(MyHelper.ToString(c)); // double value
            osw.write(endLine);
            osw.write(MyHelper.ToString(d)); // float value
            osw.write(endLine);
            osw.write(e); // writes first byte as char only
            osw.write(endLine);
            osw.write(f);
            osw.write(endLine);
            osw.write(g);
            osw.write(endLine);
            osw.write(MyHelper.ToString(h)); // string array
            osw.write(endLine);
            osw.write(h.toString()); // string array
            */
            
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
            bw.close();
            osw.close();
            fos.close();
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
