package com.company.Device;

import com.company.Songs;

public class Disk implements Devices{
    public String title = "Диск";
    public Songs song;

    public Disk(Songs s){
        this.song = s;
    }
    public void InfoDev(){
        System.out.print(title + " - ");
        this.song.InfoSong();
    }
}
