package co.devfoundry;

import co.devfoundry.musicPlayer.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> tracks = Arrays.asList("Track 1" , "Track 2", "Track 3", "Track 4", "Track 5");
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setMusicPlayerCommand(new MusicPlayerLoadTracks(musicPlayer,tracks));
        remote.pressButton();
        remote.setMusicPlayerCommand(new MusicPlayerPlayFirstTrack(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new MusicPlayerPlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new MusicPlayerPlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();

    }

}
