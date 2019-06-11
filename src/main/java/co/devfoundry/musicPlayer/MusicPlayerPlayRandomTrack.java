package co.devfoundry.musicPlayer;

public class MusicPlayerPlayRandomTrack implements MusicPlayerCommand {

    MusicPlayer musicPlayer;

    public void play() {
        musicPlayer.playRandomTrack();
    }

    public MusicPlayerPlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
}
