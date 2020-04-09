package netTesterMain;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

 public class FileWritter {
	private String path;
	private boolean append_to_file = false;
	
 public void writeFile(String file_path) {
	path = file_path;
 }

 public void writeFile(String file_path, boolean append_value) {
	path = file_path;//путь и название файла (типа D:\mylog.txt)
	append_to_file = append_value;// Если мы хотим перезаписать всё что есть в файле, ставим false
 }
 
 public void writeToFile(String textLine) throws IOException{
	
	FileWriter write = new FileWriter(path, append_to_file);
	PrintWriter print_line = new PrintWriter(write);
	print_line.printf("%s" + "%n",textLine);
	print_line.close();
 }
}
