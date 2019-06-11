package co.devfoundry.musicPlayer;

public class MusicPlayerPlayNextTrack implements MusicPlayerCommand {

    MusicPlayer musicPlayer;

    public void play() {
        musicPlayer.playNextTrack();
    }

    public MusicPlayerPlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
}
