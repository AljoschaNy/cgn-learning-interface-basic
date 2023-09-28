package org.example;

public class Main {
    public static void main(String[] args) {
        MediaController mediaController = new MediaController();
        Playable videoPlayer1 = new VideoPlayer();
        Playable musicPlayer1 = new MusicPlayer();


        mediaController.playMedia(videoPlayer1);
        //mediaController.playMedia(new VideoPlayer());
        mediaController.playMedia(musicPlayer1);
    }
}