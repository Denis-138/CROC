package com.company.Device;

import com.company.Songs;

public class Vinil implements Devices{
    public String title = "Пластинка";
    public Songs song;

    public Vinil(Songs s){
        this.song = s;
    }
    public void InfoDev(){
        System.out.print(title + " - ");
        this.song.InfoSong();
    }
}
