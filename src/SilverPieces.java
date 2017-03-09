
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
            king = ImageIO.read(new File(System.getProperty("user.dir") + "/SKing.png"));
            queen = ImageIO.read(new File(System.getProperty("user.dir") + "/SQueen.png"));
            bishop = ImageIO.read(new File(System.getProperty("user.dir") + "/SBishop.png"));
            knight = ImageIO.read(new File(System.getProperty("user.dir") + "/SKnight.png"));
            rook = ImageIO.read(new File(System.getProperty("user.dir") + "/SRook.png"));
            pawn = ImageIO.read(new File(System.getProperty("user.dir") + "/SPawn.png"));
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
