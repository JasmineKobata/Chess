
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

    public void KingImg(Graphics g, int x, int y) {
        g.drawImage(king, x, y, this);
    }

    public void QueenImg(Graphics g, int x, int y) {
        g.drawImage(queen, x, y, this);
    }

    public void BishopImg(Graphics g, int x, int y) {
        g.drawImage(bishop, x, y, this);
    }

    public void KnightImg(Graphics g, int x, int y) {
        g.drawImage(knight, x, y, this);
    }

    public void RookImg(Graphics g, int x, int y) {
        g.drawImage(rook, x, y, this);
    }

    public void PawnImg(Graphics g, int x, int y) {
        g.drawImage(pawn, x, y, this);
    }
}
