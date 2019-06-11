package co.devfoundry.musicPlayer;

public class MusicPlayerPlayFirstTrack implements MusicPlayerCommand {

    MusicPlayer musicPlayer;

    public void play() {
        musicPlayer.playFirstTrack();
    }

    public MusicPlayerPlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
}
