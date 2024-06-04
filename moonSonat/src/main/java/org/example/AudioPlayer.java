package org.example;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AudioPlayer extends JFrame {
    private ExecutorService executorService;
    private boolean playing = false;

    private final String[] audioSequence = {
            "G#2.mp3 C#1.mp3",
            "C#3.mp3",
            "E2.mp3",
            "G#2.mp3",
            "C#3.mp3",
            "E2.mp3",
            "G#2.mp3",
            "C#3.mp3",
            "E2.mp3",
            "G#2.mp3",
            "C#3.mp3",
            "E2.mp3",
            //break
            "G#2.mp3 B1.mp3",
            "C#3.mp3",
            "E2.mp3",
            "G#2.mp3",
            "C#3.mp3",
            "E2.mp3",
            "G#2.mp3",
            "C#3.mp3",
            "E2.mp3",
            "G#2.mp3",
            "C#3.mp3",
            "E2.mp3",
            //break
            "A2.mp3 A1.mp3",
            "C#3.mp3",
            "E2.mp3",
            "A2.mp3",
            "C#3.mp3",
            "E2.mp3",
            "A2.mp3 F#1.mp3",
            "D3.mp3",
            "F#3.mp3",
            "A2.mp3",
            "D3.mp3",
            "F#3.mp3",
            //break
            "G#2.mp3 G#1.mp3",
            "C3.mp3",
            "F#3.mp3",
            "G#2.mp3",
            "C3.mp3",
            "E2.mp3",
            "G#2.mp3 G#1.mp3",
            "C3.mp3",
            "D#3.mp3",
            "G#2.mp3",
            "C3.mp3",
            "D#3.mp3",
    };

    public AudioPlayer() {
        setTitle("Audio Player");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton playButton = new JButton("Play");
        JButton stopButton = new JButton("Stop");

        playButton.addActionListener(e -> play());
        stopButton.addActionListener(e -> stop());

        JPanel panel = new JPanel();
        panel.add(playButton);
        panel.add(stopButton);

        add(panel);
    }

    private void play() {
        if (playing) return;

        playing = true;
        executorService = Executors.newFixedThreadPool(audioSequence.length);

        new Thread(() -> {
            while (playing) {
                for (String audioFiles : audioSequence) {
                    executorService.submit(() -> {
                        String[] files = audioFiles.split("\\s+");
                        List<Clip> clips = new ArrayList<>();

                        for (String audioFile : files) {
                            Clip clip = createClip("Sounds/" + audioFile);
                            if (clip != null) {
                                clips.add(clip);
                            }
                        }

                        playClips(clips);
                    });
                    try {
                        TimeUnit.MILLISECONDS.sleep(350);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private Clip createClip(String filePath) {
        try {
            String currentWorkingDir = new File(".").getCanonicalPath();
            System.out.println("Current Working Directory: " + currentWorkingDir);

            File file = new File(filePath);
            String resolvedPath = file.getCanonicalPath();
            System.out.println("Resolved File Path: " + resolvedPath);

            if (!file.exists()) {
                JOptionPane.showMessageDialog(this, "File not found: " + filePath, "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            return clip;
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error creating clip: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }


    private void playClips(List<Clip> clips) {
        for (Clip clip : clips) {
            if (clip != null) {
                clip.start();
            }
        }
    }

    private void stop() {
        if (executorService != null && !executorService.isShutdown()) {
            executorService.shutdownNow();
        }
        playing = false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AudioPlayer audioPlayer = new AudioPlayer();
            audioPlayer.setVisible(true);
        });
    }
}
