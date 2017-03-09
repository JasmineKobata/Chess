
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class SilverPieces extends JPanel {

    private BufferedImage king, queen, bishop, knight, rook, pawn;

    public SilverPieces() {
        try {
            king = ImageIO.read(new File("C:/Users/Jasmine/Documents/NetBeansProjects/Chess/SKing.png"));
            queen = ImageIO.read(new File("C:/Users/Jasmine/Documents/NetBeansProjects/Chess/SQueen.png"));
            bishop = ImageIO.read(new File("C:/Users/Jasmine/Documents/NetBeansProjects/Chess/SBishop.png"));
            knight = ImageIO.read(new File("C:/Users/Jasmine/Documents/NetBeansProjects/Chess/SKnight.png"));
            rook = ImageIO.read(new File("C:/Users/Jasmine/Documents/NetBeansProjects/Chess/SRook.png"));
            pawn = ImageIO.read(new File("C:/Users/Jasmine/Documents/NetBeansProjects/Chess/SPawn.png"));
        } catch (IOException e) {
        }
    }

    public void King(Graphics g, int x, int y) {
        g.drawImage(king, x * 100, y * 100, this);
    }

    public void Queen(Graphics g, int x, int y) {
        g.drawImage(queen, x * 100, y * 100, this);
    }

    public void Bishop(Graphics g, int x, int y) {
        g.drawImage(bishop, x * 100, y * 100, this);
    }

    public void Knight(Graphics g, int x, int y) {
        g.drawImage(knight, x * 100, y * 100, this);
    }

    public void Rook(Graphics g, int x, int y) {
        g.drawImage(rook, x * 100, y * 100, this);
    }

    public void Pawn(Graphics g, int x, int y) {
        g.drawImage(pawn, x * 100, y * 100, this);
    }
}
