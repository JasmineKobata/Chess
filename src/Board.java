
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JPanel;
import javax.imageio.ImageIO;

/* 
 HAI LOVE YOU!! :>
 But me more <3
 */
public class Board extends JPanel {

    private BufferedImage wood, mop;
    public static char square[][];
    private GoldPieces gold = new GoldPieces();
    private SilverPieces silver = new SilverPieces();
    private int validClick = 0;
    public static boolean select = false;
    public static boolean pawnFirstMove[];
    public static Point choosePiece = new Point();
    private MovePieces move = new MovePieces();
    private Graphics gr;

    public Board() {
        LineListener listener = new LineListener();
        addMouseListener(listener);

        setPreferredSize(new Dimension(1000, 1000));
        square = new char[8][8];
        pawnFirstMove = new boolean[8];
        Arrays.fill(pawnFirstMove, true);
        try {
            wood = ImageIO.read(new File(System.getProperty("user.dir") + "/Mahogany.jpg"));
            mop = ImageIO.read(new File(System.getProperty("user.dir") + "/mopth.jpg"));
        } catch (IOException e) {
        }
    }

    public void paintComponent(Graphics g) {
        gr = g;
        super.paintComponent(g);
        drawBoard(g);
        newBoard(g);
        drawPieces(g);
        move.GoldHighlight(g);
    }

    //Draws the Wooden Board
    public void drawBoard(Graphics g) {
        int x = 100, y = 100;
        g.drawImage(wood, 100, 0, 900, 100, this);
        g.drawImage(wood, 100, 0, -100, 900, this);
        g.drawImage(wood, 900, 1000, 100, -900, this);
        g.drawImage(wood, 900, 1000, -900, -100, this);
        g.drawImage(wood, 100, 900, 800, -800, this);

        for (int u = 0; u < 8; u++) {
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    if (u % 2 == 0) {
                        g.drawImage(mop, x, y, 100, 100, this);
                    } else {
                        g.drawImage(mop, x + 100, y, 100, 100, this);
                    }
                }
                x += 100;
            }
            x = 100;
            y += 100;
        }
    }

    //Sets Pieces in Original Position
    public void newBoard(Graphics g) {
        for (int i = 0; i < 8; i++) {
            square[i][6] = 'P';
            square[i][1] = 'p';
        }

        char[] pieces = {'R', 'H', 'B', 'K', 'Q', 'B', 'H', 'R'};
        for (int i = 0; i < pieces.length; i++) {
            square[i][7] = Character.toUpperCase(pieces[i]);
        }
        for (int i = 0; i < pieces.length; i++) {
            square[i][0] = Character.toLowerCase(pieces[i]);
        }
    }

    //Sets Pieces into array & draws them
    public void drawPieces(Graphics g) {
        for (int i = 0; i < 8; i++) {
            for (int u = 0; u < 8; u++) {
                int x = (i + 1) * 100;
                int y = (u + 1) * 100;
                switch (square[i][u]) {
                    case 'K':
                        gold.KingImg(g, x, y);
                        break;
                    case 'Q':
                        gold.QueenImg(g, x, y);
                        break;
                    case 'B':
                        gold.BishopImg(g, x, y);
                        break;
                    case 'H':
                        gold.KnightImg(g, x, y);
                        break;
                    case 'R':
                        gold.RookImg(g, x, y);
                        break;
                    case 'P':
                        gold.PawnImg(g, x, y);
                        break;
                    case 'k':
                        silver.KingImg(g, x, y);
                        break;
                    case 'q':
                        silver.QueenImg(g, x, y);
                        break;
                    case 'b':
                        silver.BishopImg(g, x, y);
                        break;
                    case 'h':
                        silver.KnightImg(g, x, y);
                        break;
                    case 'r':
                        silver.RookImg(g, x, y);
                        break;
                    case 'p':
                        silver.PawnImg(g, x, y);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private class LineListener implements MouseListener {

        public void mousePressed(MouseEvent event) {
        }

        public void mouseReleased(MouseEvent event) {
        }

        public void mouseClicked(MouseEvent event) {
            choosePiece = event.getPoint();
            repaint();
        }

        public void mouseEntered(MouseEvent event) {
        }

        public void mouseExited(MouseEvent event) {
        }
    }
}
