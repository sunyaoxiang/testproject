package study.adaptermode.java;

public class MyPlayerAudio implements PlayerAudio{
    @Override
    public void playAudio(String filename) {
        System.out.println("Audio : " + filename);
    }
}
