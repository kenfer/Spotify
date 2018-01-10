package com.example.kenneth.spotify;

import java.util.ArrayList;

/**
 * Created by khent on 12/19/2017.
 */

public class SongDetails {

    public static ArrayList<Songs> getList(){

        ArrayList<Songs> songlist = new ArrayList<>();

        songlist.add(new Songs("Titibo-Tibo","Moira Dela Torre.Himig Handog 2017"));
        songlist.add(new Songs("Havana","Camila Cabello, Young Thug.Havana"));
        songlist.add(new Songs("Young Dumb & Broke","Khalid.American Teen"));
        songlist.add(new Songs("What Lovers Do(feat.SZA)","Maroon 5, SZA.Red Pill Blues(Deluxe)"));
        songlist.add(new Songs("Perfect","Ed Sheeran +(Deluxe)"));
        songlist.add(new Songs("Super Far","LANY.LANY"));
        songlist.add(new Songs("Too Good At Goodbyes","Sam Smith"));
        songlist.add(new Songs("I Don't Wanna Live Forever","ZAYN_Taylor Swift"));
        songlist.add(new Songs("Chantaje ft.Maluma","Shakira"));
        songlist.add(new Songs("Passenger Seat","Stephen Speaks"));
        songlist.add(new Songs("Vanilla Twilight","Owl City"));
        songlist.add(new Songs("Fireflies","Owl City"));
        songlist.add(new Songs("History","One Direction"));
        songlist.add(new Songs("Keep it Mello ft. Omar LinX","Marshmello"));
        songlist.add(new Songs("Alone[Monstercat Official]","Marshmello"));
        songlist.add(new Songs("Despacito ft. Daddy Yankee","Luis Fonsi"));
        songlist.add(new Songs("What Do You Mean","Justine Bieber"));
        songlist.add(new Songs("Love Yourself","Justine Bieber"));
        songlist.add(new Songs("Dive","Ed Sheeran"));
        songlist.add(new Songs("That_s What I Like","Bruno Mars"));


        return songlist;
    }
}
