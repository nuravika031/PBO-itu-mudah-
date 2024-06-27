package number12;

public class SpaceCraft {

    private int xPos;
    private int yPos;

    public void up() {
        yPos = yPos - 1;
    }

    public void down() {
        yPos = yPos + 1;
    }

    public void left() {
        xPos = xPos - 1;
    }

    public void right() {
        xPos = xPos + 1;
    }
}
