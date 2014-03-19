/**
 * 
 */
package pt.paginasamarelas.interfaceprocessor;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.api.ads.adwords.jaxws.extensions.*;
/**
 * @author playground
 *
 */

public class ReportProcessor {
	
	public String getReport(){
		
		//AwReporting aw = new AwReporting();
		
		//String[] args = new String[6];
		String[] args = {"-startDate","20140101","-endDate","20140131","-file","aw-report-sample.properties"};
		AwReporting.main(args);
		
		return "request made!!!";
		
	}
	public static void main (String args[]) {
		ReportProcessor rp = new ReportProcessor();
		rp.getReport();
	}
	
	public void printConsoleMessagesToFile() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	    BufferedWriter out = new BufferedWriter(new FileWriter("c://output.txt"));
	    try {
	        String inputLine = null;
	        do {
	            inputLine=in.readLine();
	            out.write(inputLine);
	            out.newLine();
	        } while (!inputLine.equalsIgnoreCase("eof"));
	        System.out.print("Write Successful");
	    } catch(IOException e1) {
	        System.out.println("Error during reading/writing");
	    } finally {
	        out.close();
	        in.close();
	    }
	}
	
	

}
