package netTesterMain;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.net.InetAddress;


public class tryNet {
    FileWritter Newwrite = new FileWritter();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    // sound useSound = new sound();
    public void justtry() {
        try {
            InetAddress address = InetAddress.getByName("google.com"); // Для проверки недоступности подставь любую билеберду
            boolean reachable = address.isReachable(10000); // Записываем факт доступности
            if (reachable == false) {
                Newwrite.writeFile("D:\\mylog.txt", true); //если недоступно, записываем в файл
                Newwrite.writeToFile("ALARM" + formatter.format(date)); // то что пишем в файл
                //Мне кажется, где-то здесь ты и можешь вызывать метод, который отвечает за проигрывание звука
            } else {
                System.out.println("Dostypno blyat!");//просто пишем что есть доступ в консоль
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
