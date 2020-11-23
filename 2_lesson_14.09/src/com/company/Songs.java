package com.company;
import com.company.Main;

public class Songs {
    public String title;
    public String author;
    public Songs(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void InfoSong(){
        System.out.print(author + " - ");
        System.out.print(title);
    }
}


