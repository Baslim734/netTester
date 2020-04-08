package netTesterMain;
import java.net.InetAddress;
import java.util.Scanner;

public class main {
public static void main(String[] args){
	FileWritter Newwrite = new FileWritter();
    System.out.println("Darova ebat.Nazovi file s pytem:");
    Scanner in = new Scanner(System.in);
    String fileName = in.nextLine();
	try{
			InetAddress address = InetAddress.getByName("google.com");
            boolean reachable = address.isReachable(10000);
            if (reachable == false)
            		{
                 Newwrite.writeFile("D:\\mylog.txt");
                 Newwrite.writeToFile("ALARM");

            		}
            else
            {
            System.out.println("Dostypno blyat!");
            }
            Newwrite.writeFile(fileName);
            Newwrite.writeToFile("Dostyp");
         // System.out.println("Is host reachable? " + reachable); not yet needed
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
