package co.devfoundry.musicPlayer;

public class MusicPlayerRemote {

    private MusicPlayerCommand command;

    public void pressButton(){
        command.play();
    }

    public void setMusicPlayerCommand(MusicPlayerCommand command) {
        this.command = command;
    }

}
