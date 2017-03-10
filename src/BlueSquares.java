
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BlueSquares extends JPanel {

    private BufferedImage blue;

    BlueSquares() {
        try {
            blue = ImageIO.read(new File(System.getProperty("user.dir") + "/blue.png"));
        } catch (IOException e) {
        }
    }

    //Draws Blue Squares
    public void Highlight(Graphics g, int x, int y) {
        g.drawImage(blue, x, y, 100, 100, this);
    }
}
