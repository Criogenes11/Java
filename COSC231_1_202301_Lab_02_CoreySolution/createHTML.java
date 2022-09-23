import java.util.*;
import java.io.*;
public class createHTML{
    public String input = ".\\input\\";
    public String output = ".\\output\\";
	
    public void doSomething(int i){
        if(i < 10)
		{
			String fileIn   = input  + "wolf_creek_hourly_2019_"+String.format("%02d", i)+".csv";
			String fileOut = output + "2019_"+String.format("%02d", i)+".html";
			try{
				FileInputStream fstream =new FileInputStream(fileIn);
				Scanner fhIn = new Scanner(fstream);   
				File file = new File(fileOut);
				FileOutputStream fostream = new FileOutputStream(file);
				BufferedWriter fhOut = new BufferedWriter(new OutputStreamWriter(fostream));
				fhOut.write("<!DOCTYPE HTML>\n");
				fhOut.write("<html dir=\"ltr\" lang=\"en\">\n");
				fhOut.write("\t<!--COSC 231.1\n");
				fhOut.write("\t\tCorey O'Connor\n");
				fhOut.write("\t\tEID: 	E02505911\n");
				fhOut.write("\t\tLab: 02 of 10\n");
				fhOut.write("\t\tDate: 2022-09-16 Fri T 10:56:00 Z-4:00\n");
				fhOut.write("\t\tRequirements: None?\n");
				fhOut.write("\t\tDescription: Page of csv data stored in an html table stylized with css rules.\n");
				fhOut.write("\t-->\n");
				fhOut.write("<head>\n");
				fhOut.write("\n");
				fhOut.write("\t<meta charset=\"utf-8\">\n");
				fhOut.write("\t<title>Wolf Creek Dam : 2019-"+String.format("%02d", i)+"</title>\n");
				fhOut.write("\t<link rel=\"stylesheet\" href=\"css/wolfcreek.css\">");
				fhOut.write("\n");
				fhOut.write("\t<style>\n");
				fhOut.write("\n");
				fhOut.write("\t</style>\n");
				fhOut.write("\t<script>\n");
				fhOut.write("\n");
				fhOut.write("\t</script>\n");
				fhOut.write("\n");
				fhOut.write("</head>\n");
				fhOut.write("<body>\n");
				fhOut.write("<div id=\"top\">\n");
				fhOut.write("<div id=\"navmenu_div\" class=\"navbarouter\">\n");
				fhOut.write("\t<button id=\"nav_button\">Hide Menu</button>\n");
				fhOut.write("\t<div id=\"navbar\" class=\"navbar\">\n");
				fhOut.write("\t\t<div class=\"nav_list\"><p>Maps &amp; Charts:</p></div>\n");
				fhOut.write("\t\t<div class=\"nav_list\">\n");
				fhOut.write("\t\t\t<a href=\"index.html\">Main</a>\n");
				fhOut.write("\t\t</div>\n");
				fhOut.write("\t\t<div class=\"nav_list\"><p>Hourly Readings by Month:</p></div>\n");
				fhOut.write("\t\t<div class=\"nav_list\">\n");
				fhOut.write("\t\t\t<a href=\"2019_01.html\">2019-01</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_02.html\">2019-02</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_03.html\">2019-03</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_04.html\">2019-04</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_05.html\">2019-05</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_06.html\">2019-06</a>\n");
				fhOut.write("\t\t</div>\n");
				fhOut.write("\t\t<div class=\"nav_list\">\n");
				fhOut.write("\t\t\t<a href=\"2019_07.html\">2019-07</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_08.html\">2019-08</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_09.html\">2019-09</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_10.html\">2019-10</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_11.html\">2019-11</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_12.html\">2019-12</a>\n");
				fhOut.write("\t\t</div>\n");
				fhOut.write("\t</div>\n");
				fhOut.write("</div>\n");
				fhOut.write("<h1 class=\"major_format\"> Hourly observations for 2019-"+String.format("%02d", i)+"<br>(Wolf Creek Dam, Russell, KY, USA)</h1>\n");
				fhOut.write("<hr>\n");
				fhOut.write("\t<div class=\"major_format\">\n");
				fhOut.write("\t\t<p>Update Elevation Highlight Threshold:</p>\n");
				fhOut.write("\t\t<input id=\"newdanger\" type=\"number\">\n");
				fhOut.write("\t\t<p>Upstream Elevation readings across all 12 pages of hourly readings are highlighted if at or above this threshold value.</p>\n");
				fhOut.write("\t\t<p>Value should update threshold in some charts on the charts page too.</p>\n");
				fhOut.write("\t\t<p>Permitted values: [650, ]</p>\n");
				fhOut.write("\t\t<button id=\"btn_reset_danger\">Reset</button> (Reset Threshold to 720&apos;)\n");
				fhOut.write("\t</div>\n");
				fhOut.write("<hr>\n");
				fhOut.write("\t<button class=\"major_format\"id=\"showhide_button_"+String.format("%02d", i)+"\">Hide Table</button>\n");
				fhOut.write("\n");
				fhOut.write("\t<div id=\"month_"+String.format("%02d", i)+"\" class=\"month_rows\">\n");
				fhOut.write("\t<h2 class=\"major_format\">Gage Readings for 2019-"+String.format("%02d", i)+":</h2>\n");
				fhOut.write("\t<table class=\"hrly_readings\">\n");
				fhOut.write("\t\t<thead>\n");
				fhOut.write("\t\t\t<tr>\n");
				fhOut.write("\t\t\t\t<th>GAGE TIME<br>UTC (ISO-8601):</th>\n");
				fhOut.write("\t\t\t\t<th>ELEVATION<br>UPSTREAM:</th>\n");
				fhOut.write("\t\t\t\t<th>ELEVATION<br>DOWNSTREAM:</th>\n");
				fhOut.write("\t\t\t\t<th>DISCHARGE<br>HOURLY AVG.:</th>\n");
				fhOut.write("\t\t\t</tr>\n");
				fhOut.write("\t\t</thead>\n");
				fhOut.write("\t\t<tbody>\n");
				while ( fhIn.hasNextLine() )  {   
					String line = fhIn.nextLine().replace("\"", "");
					String[] fields = line.split(",");
					fhOut.write("\t\t\t<tr>");
					for (int j=0; j<4; j++) {
						fhOut.write("\t<td>" + fields[j] + "</td>");
					}						
					fhOut.write("\t</tr>\n");
				}  
			fhOut.write("\t\t</tbody>\n");
			fhOut.write("\t</table>\n");
			fhOut.write("</div> <!-- END <div id=\"month_"+i+"\" class=\"month_rows\"> -->\n");
			fhOut.write("<div class=\"major_format\">\n");
			fhOut.write("\t<button><a href=\"#top\">Go To Top</a></button>\n");
			fhOut.write("</div>\n");
			fhOut.write("<hr>\n");
			fhOut.write("<div class=\"major_format\" id=\"copyright\">\n");
			fhOut.write("<p> &copy; 2022 - Corey O'Connor</p>\n");
			fhOut.write("</div>\n");
			fhOut.write("\n");
			fhOut.write("\n");
			fhOut.write("</body>\n");
			fhOut.write("</html>");
			fhIn.close();
			fhOut.close();
			}catch(FileNotFoundException e)	{
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}

		}else{
			String fileIn   = input  + "wolf_creek_hourly_2019_"+String.valueOf(i)+".csv";
			String fileOut = output + "2019_"+String.valueOf(i)+".html";
			try{
				FileInputStream fstream =new FileInputStream(fileIn);
				Scanner fhIn = new Scanner(fstream);   
				File file = new File(fileOut);
				FileOutputStream fostream = new FileOutputStream(file);
				BufferedWriter fhOut = new BufferedWriter(new OutputStreamWriter(fostream));
				fhOut.write("<!DOCTYPE HTML>\n");
				fhOut.write("<html dir=\"ltr\" lang=\"en\">\n");
				fhOut.write("\t<!--COSC 231.1\n");
				fhOut.write("\t\tCorey O'Connor\n");
				fhOut.write("\t\tEID: 	E02505911\n");
				fhOut.write("\t\tLab: 02 of 10\n");
				fhOut.write("\t\tDate: 2022-09-16 Fri T 10:56:00 Z-4:00\n");
				fhOut.write("\t\tRequirements: None?\n");
				fhOut.write("\t\tDescription: Page of csv data stored in an html table stylized with css rules.\n");
				fhOut.write("\t-->\n");
				fhOut.write("<head>\n");
				fhOut.write("\n");
				fhOut.write("\t<meta charset=\"utf-8\">\n");
				fhOut.write("\t<title>Wolf Creek Dam : 2019-"+String.valueOf(i)+"</title>\n");
				fhOut.write("<link rel=\"stylesheet\" href=\"css/wolfcreek.css\">");
				fhOut.write("\n");
				fhOut.write("\t<style>\n");
				
				fhOut.write("\t</style>\n");
				fhOut.write("\t<script>\n");
				
				fhOut.write("\t</script>\n");
				fhOut.write("\n");
				fhOut.write("</head>\n");
				fhOut.write("<body>\n");
				fhOut.write("<div id=\"top\">\n");
				fhOut.write("<div id=\"navmenu_div\" class=\"navbarouter\">\n");
				fhOut.write("\t<button id=\"nav_button\">Hide Menu</button>\n");
				fhOut.write("\t<div id=\"navbar\" class=\"navbar\">\n");
				fhOut.write("\t\t<div class=\"nav_list\"><p>Maps &amp; Charts:</p></div>\n");
				fhOut.write("\t\t<div class=\"nav_list\">\n");
				fhOut.write("\t\t\t<a href=\"index.html\">Main</a>\n");
				fhOut.write("\t\t</div>\n");
				fhOut.write("\t\t<div class=\"nav_list\"><p>Hourly Readings by Month:</p></div>\n");
				fhOut.write("\t\t<div class=\"nav_list\">\n");
				fhOut.write("\t\t\t<a href=\"2019_01.html\">2019-01</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_02.html\">2019-02</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_03.html\">2019-03</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_04.html\">2019-04</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_05.html\">2019-05</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_06.html\">2019-06</a>\n");
				fhOut.write("\t\t</div>\n");
				fhOut.write("\t\t<div class=\"nav_list\">\n");
				fhOut.write("\t\t\t<a href=\"2019_07.html\">2019-07</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_08.html\">2019-08</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_09.html\">2019-09</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_10.html\">2019-10</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_11.html\">2019-11</a>\n");
				fhOut.write("\t\t\t<a href=\"2019_12.html\">2019-12</a>\n");
				fhOut.write("\t\t</div>\n");
				fhOut.write("\t</div>\n");
				fhOut.write("</div>\n");
				fhOut.write("<h1 class=\"major_format\"> Hourly observations for 2019-"+String.valueOf(i)+"<br>(Wolf Creek Dam, Russell, KY, USA)</h1>\n");
				fhOut.write("<hr>\n");
				fhOut.write("\t<div class=\"major_format\">\n");
				fhOut.write("\t\t<p>Update Elevation Highlight Threshold:</p>\n");
				fhOut.write("\t\t<input id=\"newdanger\" type=\"number\">\n");
				fhOut.write("\t\t<p>Upstream Elevation readings across all 12 pages of hourly readings are highlighted if at or above this threshold value.</p>\n");
				fhOut.write("\t\t<p>Value should update threshold in some charts on the charts page too.</p>\n");
				fhOut.write("\t\t<p>Permitted values: [650, ]</p>\n");
				fhOut.write("\t\t<button id=\"btn_reset_danger\">Reset</button> (Reset Threshold to 720&apos;)\n");
				fhOut.write("\t</div>\n");
				fhOut.write("<hr>\n");
				fhOut.write("\t<button class=\"major_format\"id=\"showhide_button_"+String.valueOf(i)+"\">Hide Table</button>\n");
				fhOut.write("\n");
				fhOut.write("\t<div id=\"month_"+String.valueOf(i)+"\" class=\"month_rows\">\n");
				fhOut.write("\t<h2 class=\"major_format\">Gage Readings for 2019-"+String.valueOf(i)+":</h2>\n");
				fhOut.write("\t<table class=\"hrly_readings\">\n");
				fhOut.write("\t\t<thead>\n");
				fhOut.write("\t\t\t<tr>\n");
				fhOut.write("\t\t\t\t<th>GAGE TIME<br>UTC (ISO-8601):</th>\n");
				fhOut.write("\t\t\t\t<th>ELEVATION<br>UPSTREAM:</th>\n");
				fhOut.write("\t\t\t\t<th>ELEVATION<br>DOWNSTREAM:</th>\n");
				fhOut.write("\t\t\t\t<th>DISCHARGE<br>HOURLY AVG.:</th>\n");
				fhOut.write("\t\t\t</tr>\n");
				fhOut.write("\t\t</thead>\n");
				fhOut.write("\t\t<tbody>\n");
				while ( fhIn.hasNextLine() )  {   
					String line = fhIn.nextLine().replace("\"", "");
					String[] fields = line.split(",");
					fhOut.write("\t\t\t<tr>");
					for (int j=0; j<4; j++) {
						fhOut.write("\t<td>" + fields[j] + "</td>");
					}						
					fhOut.write("\t</tr>\n");
				}  
			fhOut.write("\t\t</tbody>\n");
			fhOut.write("\t</table>\n");
			fhOut.write("	</div> <!-- END <div id=\"month_"+i+"\" class=\"month_rows\"> -->\n");
			fhOut.write("<div class=\"major_format\">\n");
			fhOut.write("\t<button><a href=\"#top\">Go To Top</a></button>\n");
			fhOut.write("</div>\n");
			fhOut.write("<hr>\n");
			fhOut.write("<div class=\"major_format\" id=\"copyright\">\n");
			fhOut.write("<p> &copy; 2022 - Corey O'Connor</p>\n");
			fhOut.write("</div>\n");
			fhOut.write("\n");
			fhOut.write("</body>\n");
			fhOut.write("</html>");
			fhIn.close();
			fhOut.close();
			}catch(FileNotFoundException e)	{
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
    }






public static void main(String[] args){
    createHTML obj = new createHTML();
	for (int i=1; i <= 12;i++){
        obj.doSomething(i);
    }






}
}