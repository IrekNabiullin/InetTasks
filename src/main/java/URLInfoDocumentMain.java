/**
 * Для доступа к ресурсам можно создать объект класса URL, указывающий на ресурсы в интернете.
 * В следующем примере объект URL используется для доступа к HTML-файлу по указанному адресу и вывода его в окно консоли.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLInfoDocumentMain {
    public static void main(String[] args) {
        String urlName = "https://logging.apache.org/log4j/2.x/download.html";
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new URL(urlName).openStream()))) {
            URL url = new URL(urlName);
            System.out.println("protocol: " + url.getProtocol());
            System.out.println("host: " + url.getHost());
            System.out.println("port: " + url.getDefaultPort());
            System.out.println("file: " + url.getFile());
            reader.lines().forEach(System.out::println); // reading content
        } catch (MalformedURLException e) {
            e.printStackTrace();// incorrectly set protocol, domain name or file path
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}