package com.company.Players;

import com.company.Device.Disk;
import com.company.Device.Devices;
import com.company.Songs;
import com.company.Main;

public class PlayerCD implements Players{

    private String title = "CD-плеер";
    private Devices Dev;

    public PlayerCD(Devices s){
        if (s instanceof Disk){
            this.Dev = s;
        }
        else{
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
