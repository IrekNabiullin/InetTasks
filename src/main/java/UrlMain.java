/**
 * инфомация об интернет-ресурсе
 *  * Для  получения  более  полной  информации  о ресурсе  применятся  класс URLConnection.
 *  * Для  получения  экземпляра  следует  вызвать  на  экземпляре класса URL метод openConnection().
 *  * Далее при необходимости можно указать значения некоторых свойств.
 *  * Для установления соединения на полученном эк-земпляре URLConnection вызывается метод connect().
 *  * При вызове этого метода возможна  серьезная  блокировка  основного  потока,  поэтому  перед  попыткой установления
 *  * соединения следует установить таймаут на соединение и/или на чтение методами setConnectTimeout(int timeout)
 *  * и setReadTimeout(int timeout).
 */

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class UrlMain {
    public static void main(String[] args) {
        String urlName = "http://www.google.com";
        int timeout = 10_000_000;
        try {
            URL url = new URL(urlName);
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(timeout);//set timeout for connection
            connection.connect();
            System.out.println(urlName + "::content type:" + connection.getContentType());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
