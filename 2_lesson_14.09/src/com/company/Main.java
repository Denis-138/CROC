package com.company;

import java.util.Scanner;

import com.company.Device.Devices;
import com.company.Device.Disk;
import com.company.Device.USB;
import com.company.Device.Vinil;
import com.company.Players.PlayerCD;
import com.company.Players.PlayerUSB;
import com.company.Players.PlayerVinil;

public class Main {

    public static void main(String[] args) {

//Создаем список песен
        Songs S1 = new Songs("Варвара", "Би-2");
        Songs S2 = new Songs("Лирика", "Сектор газа");
        Songs S3 = new Songs("Кукла Колдуна", "Король и Шут");


        //Создаем носители с определенными песнями
        Disk CD = new Disk(S1);
        USB Usb = new USB(S2);
        Vinil vinil = new Vinil(S3);

        Devices device = null;

        PlayerCD PlayerCD = new PlayerCD(CD);
        PlayerUSB PlayerUSB = new PlayerUSB(Usb);

        Scanner in = new Scanner(System.in);
        System.out.println("Выберете носитель информации" +
                "\n 1 - Диск" +
                "\n 2 - Флешка" +
                "\n 3 - Пластинка");

        int j = in.nextInt();

        switch (j){
            case 1:
                device = CD;
                break;

            case 2:
                device = Usb;
                break;
            case 3:
                device = vinil;
                break;
        }

        System.out.println("Выберете устройство для воспроизведения:" +
                "\n 1 - CD проигрыватель" +
                "\n 2 - USB проигрыватель" +
                "\n 3 - Виниловая вертушка");

        int i = in.nextInt();

        switch (i){
            case 1:
                PlayerCD Player1 = new PlayerCD(device);
                Player1.play();
                break;

            case 2:
                PlayerUSB Player2 = new PlayerUSB(device);
                Player2.play();
                break;

            case 3:
                PlayerVinil Player3 = new PlayerVinil(device);
                Player3.play();
                break;
        }

        in.close();
    }
}
