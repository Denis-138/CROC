package com.company.Players;

import com.company.Device.Devices;
import com.company.Device.Vinil;
import com.company.Players.Players;

public class PlayerVinil implements Players {

    private String title = "Виниловая вертушка";
    public Devices Dev;

    public PlayerVinil(Devices s){
        if (s instanceof Vinil){
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