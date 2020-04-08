package netTesterMain;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

 public class FileWritter {
	private String path;
	private boolean append_to_file = false;
	
 public void writeFile(String filePath) {
 	path = filePath;
 }

 public void writeFile(String filePath, boolean append_value) {
	path = filePath;
	append_to_file = append_value;
 }
 
 public void writeToFile(String textLine) throws IOException{
	
	FileWriter write = new FileWriter(path, append_to_file);
	PrintWriter print_line = new PrintWriter(write);
	print_line.printf("%s" + "%n",textLine);
	print_line.close();
 }
}
