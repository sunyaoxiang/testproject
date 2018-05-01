package adaptermode.java;

public class PlayMain {
    public static void main(String[] args) {
        MyPlayer myPlayer = new MyPlayer();

        myPlayer.play("avi", "he.avi");
        myPlayer.play("mp3", "htte.mp3");
        myPlayer.play("sfr", "htte.sfr");
    }
}
