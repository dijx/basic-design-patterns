package co.devfoundry.musicPlayer;

import java.util.List;

public class MusicPlayerLoadTracks implements MusicPlayerCommand {

    MusicPlayer musicPlayer;

    public void play() {
        System.out.println("ładowanie utworów, proszę czekać");
    }

    public MusicPlayerLoadTracks(MusicPlayer musicPlayer, List<String> tracks) {
        this.musicPlayer = musicPlayer;
        this.musicPlayer.setTracks(tracks);
    }
}
