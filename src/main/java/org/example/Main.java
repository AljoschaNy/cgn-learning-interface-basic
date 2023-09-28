package org.example;

public class Main {
    public static void main(String[] args) {
        MediaController mediaController = new MediaController();
        VideoPlayer videoPlayer1 = new VideoPlayer();
        MusicPlayer musicPlayer1 = new MusicPlayer();


        mediaController.playMedia(videoPlayer1);
        //mediaController.playMedia(new VideoPlayer());
        mediaController.playMedia(musicPlayer1);
    }
}