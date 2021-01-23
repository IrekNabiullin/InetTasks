/**
 * Вывод IP-адреса компьютера и интернет-ресурса
 * Программа  демонстрирует,  как  получить  IP-адрес  текущего компьютера и IP-адрес из имени домена
 * с помощью сервера имен доменов (DNS), к которому обращается метод getByName() класса InetAddress.
 * Метод getLocalHost() класса InetAddress создает объект currentIp и возвращает IP-адрес компьютера
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
    public static void main(String[] args) {
        InetAddress currentIp;
        InetAddress epamIp;
        try {
            currentIp = InetAddress.getLocalHost();
            // output IP address of local computer
            System.out.println("current IP -> " + currentIp.getHostAddress());
            epamIp = InetAddress.getByName("epam.com");
            System.out.println("EPAM IP address -> " + epamIp.getHostAddress());
        } catch (
                UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
