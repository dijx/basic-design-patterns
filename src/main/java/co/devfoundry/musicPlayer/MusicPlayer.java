package co.devfoundry.musicPlayer;

import java.util.List;

public class MusicPlayer {

    private List<String> tracks;
    private int currentTrack = 0;


     void playFirstTrack() {
        currentTrack = 0;
        System.out.println("Odtwarzam: " + tracks.get(currentTrack));

    }

     void playNextTrack(){
        this.currentTrack++;
        if (currentTrack >= tracks.size()) {
            currentTrack = 0;
        }
        System.out.println("Odtwarzam następny: "+tracks.get(currentTrack));
    }
    
     void playRandomTrack(){
         System.out.println("Odtwarzam losowy kawałek");
     }


     void setTracks(List<String> tracks) {
        this.tracks = tracks;

        System.out.println("Załadowano ścieżki: ");
        for (String track : tracks) {
            System.out.println(track);
        }
    }


}
