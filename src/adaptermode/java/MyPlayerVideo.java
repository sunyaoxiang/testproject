package adaptermode.java;

public class MyPlayerVideo implements PlayerVideo{
    @Override
    public void playVideo(String filename) {
        System.out.println("Video : " + filename);
    }
}
