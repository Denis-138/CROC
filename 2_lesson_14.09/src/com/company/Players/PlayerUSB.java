package com.company.Players;

import com.company.Device.Devices;
import com.company.Device.USB;


public class PlayerUSB implements Players{

    private String title = "USB-плеер";
    public Devices Dev;

    public PlayerUSB(Devices s){
        if (s instanceof USB){
            this.Dev = s;
        }
        else {
            System.out.println("Данный носитель не поддерживается плеером");
        }
    }

    public void play(){
        if (Dev != null){
            System.out.print(title + " - ");
            this.Dev.InfoDev();
        }
        else {
            System.out.println("Ожидание");
        }
    }
}
