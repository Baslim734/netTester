package netTesterMain;
import java.net.InetAddress;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class main {
public static void main(String[] args){
	FileWritter Newwrite = new FileWritter();
	try{
			InetAddress address = InetAddress.getByName("google.com");
            boolean reachable = address.isReachable(10000);
            if (reachable == false)
            		{
                 Newwrite.writeFile("D:\\mylog.txt");
                 Newwrite.writeToFile("ALARM");
            //	System.out.println("Darova ebat.Nazovi file:");
            //	String file_name;
            		}
            else
            {
            System.out.println("Dostypno blyat!");
            }
            Newwrite.writeFile("D:\\mylog.txt");
            Newwrite.writeToFile("Dostyp");
         // System.out.println("Is host reachable? " + reachable); not yet needed
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
