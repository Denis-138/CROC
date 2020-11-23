package com.company.Device;

import com.company.Songs;

public class USB implements Devices {
    public String title = "USB";
    public Songs song;

    public USB(Songs s){
        this.song = s;
    }
    public void InfoDev(){
        System.out.print(title + " - ");
        this.song.InfoSong();
    }
}
