package week7.Interfaces;

public class Piano implements Playable {
    private String name;

    @Override
    public void play() {
        System.out.println("The piano is playing");

    }
}
