
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GoldPieces extends JPanel {

    private BufferedImage king, queen, bishop, knight, rook, pawn;

    public GoldPieces() {
        try {
            king = ImageIO.read(new File(System.getProperty("user.dir") + "/GKing.png"));
            queen = ImageIO.read(new File(System.getProperty("user.dir") + "/GQueen.png"));
            bishop = ImageIO.read(new File(System.getProperty("user.dir") + "/GBishop.png"));
            knight = ImageIO.read(new File(System.getProperty("user.dir") + "/GKnight.png"));
            rook = ImageIO.read(new File(System.getProperty("user.dir") + "/GRook.png"));
            pawn = ImageIO.read(new File(System.getProperty("user.dir") + "/GPawn.png"));
        } catch (IOException e) {
        }
    }

    public void King(Graphics g, int x, int y) {
        g.drawImage(king, x, y, this);
    }

    public void Queen(Graphics g, int x, int y) {
        g.drawImage(queen, x, y, this);
    }

    public void Bishop(Graphics g, int x, int y) {
        g.drawImage(bishop, x, y, this);
    }

    public void Knight(Graphics g, int x, int y) {
        g.drawImage(knight, x, y, this);
    }

    public void Rook(Graphics g, int x, int y) {
        g.drawImage(rook, x, y, this);
    }

    public void Pawn(Graphics g, int x, int y) {
        g.drawImage(pawn, x, y, this);
    }
}
