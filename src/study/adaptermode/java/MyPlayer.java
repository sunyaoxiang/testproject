package study.adaptermode.java;

public class MyPlayer implements Player{
    MyPlayerAudio myPlayerAudio = new MyPlayerAudio();
    MyPlayerVideo myPlayerVideo = new MyPlayerVideo();

    MyPlayer () {

    }

    @Override
    public void play(String type, String filename) {
        if (type.equalsIgnoreCase("avi")) {
            myPlayerVideo.playVideo(filename);
        } else if (type.equalsIgnoreCase("mp3")) {
            myPlayerAudio.playAudio(filename);
        } else {
            System.out.println("File's type is Invalid format!");
        }

    }
}
