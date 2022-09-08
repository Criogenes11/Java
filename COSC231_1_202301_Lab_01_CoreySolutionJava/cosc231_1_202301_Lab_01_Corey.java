import java.io.*;
import java.util.*;

public class cosc146_1_202301_Lab_01_Corey
{
   
    String path_in  = "./input/";
    String path_out = "./output/";

    public void processFile(int delim)
    {
        try {
			
			// Set directory path names and file basenames
			
			// Build filenames.
			String filename_in_csv   = path_in  + "wolf_creek_hourly_2019_"+delim+".csv";
			String filename_out_html = path_out + "2019_"+delim+".html";
			
			// Echo to user running program what file is processing...
			System.out.println("=================================================");
			System.out.println("Handling csv: " + filename_in_csv);
			System.out.println("Writing html: " + filename_out_html);
			
			// open the file to be opened for reading  
			FileInputStream fistream =new FileInputStream(filename_in_csv);
			Scanner fh_csv = new Scanner(fistream);    //file to be scanned  
			// open html file for writing contents.
			File fout = new File(filename_out_html);
			FileOutputStream fostream = new FileOutputStream(fout);
			BufferedWriter fh_html = new BufferedWriter(new OutputStreamWriter(fostream));
			
			// write HTML header code
			// Note: be mindful of the 4 spots that are filename-dependent.
			fh_html.write("<!DOCTYPE HTML>\n");
			fh_html.write("<html dir=\"ltr\" lang=\"en\">\n");
			fh_html.write("<head>\n");
			fh_html.write("\n");
			fh_html.write("\t<meta charset=\"utf-8\">\n");
			fh_html.write("\t<title>Wolf Creek Dam : 2019-01</title>\n");
			fh_html.write("\n");
			fh_html.write("\t<style>\n");
			fh_html.write("\t\ttable,th,td {\n");
			fh_html.write("\t\t\tborder:1px solid black;\n");
			fh_html.write("\t\t\tborder-collapse:collapse;\n");
			fh_html.write("\t\t\tpadding:10px;\n");
			fh_html.write("\t\t\ttext-align:right;\n");
			fh_html.write("\t\t}\n");
			fh_html.write("\t</style>\n");
			fh_html.write("\n");
			fh_html.write("</head>\n");
			fh_html.write("<body>\n");
			fh_html.write("\n");
			fh_html.write("\t<div id=\"month_01\" class=\"month_rows\">\n");
			fh_html.write("\t<h2 class=\"major_format\">Gage Readings for 2019-01:</h2>\n");
			fh_html.write("\t<table class=\"hrly_readings\">\n");
			fh_html.write("\t\t<thead>\n");
			fh_html.write("\t\t\t<tr>\n");
			fh_html.write("\t\t\t\t<th>GAGE TIME<br>UTC (ISO-8601):</th>\n");
			fh_html.write("\t\t\t\t<th>ELEVATION<br>UPSTREAM:</th>\n");
			fh_html.write("\t\t\t\t<th>ELEVATION<br>DOWNSTREAM:</th>\n");
			fh_html.write("\t\t\t\t<th>DISCHARGE<br>HOURLY AVG.:</th>\n");
			fh_html.write("\t\t\t</tr>\n");
			fh_html.write("\t\t</thead>\n");
			fh_html.write("\t\t<tbody>\n");

			
			// read CSV lines and write HTML table row cell data


			while ( fh_csv.hasNextLine() )  {  
				// remove double-quotes 
				String line = fh_csv.nextLine().replace("\"", "");
				// split into 4 fields
				String[] fields = line.split(",");
				// start row <tr>
				fh_html.write("\t\t\t<tr>");
				for (int j=0; j<4; j++) {
					fh_html.write("\t<td>" + fields[j] + "</td>");
				}						
				// end row </tr>
				fh_html.write("\t</tr>\n");
			}  

			// write remaining HTML code.
			fh_html.write("\t\t</tbody>\n");
			fh_html.write("\t</table>\n");
			fh_html.write("	</div> <!-- END <div id=\"month_01\" class=\"month_rows\"> -->\n");
			fh_html.write("\n");
			fh_html.write("</body>\n");
			fh_html.write("</html>");
			
			// close file handles.
			fh_csv.close();     //closes the fh_csv  
			fh_html.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}  
    




    public static void main(String[] args)
    {
        cosc146_1_202301_Lab_01_Corey obj = new cosc146_1_202301_Lab_01_Corey();
        for (int i=1; i <10; i++)
        {
            obj.processFile(i);
        }
        
        
     
        
       
       

    }






}