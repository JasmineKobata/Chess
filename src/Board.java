
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import javax.imageio.ImageIO;

/* 
 HAI LOVE YOU!! :>
 But me more <3
 */
public class Board extends JPanel {

    private BufferedImage wood, mop;
    private char square[][];
    private GoldPieces gold = new GoldPieces();
    private SilverPieces silver = new SilverPieces();
    private int validClick = 0;

    public Board() {
        setPreferredSize(new Dimension(1000, 1000));
        square = new char[8][8];
        try {
            wood = ImageIO.read(new File(System.getProperty("user.dir") + "/Mahogany.jpg"));
            mop = ImageIO.read(new File(System.getProperty("user.dir") + "/mopth.jpg"));
        } catch (IOException e) {
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
        newBoard(g);
        drawPieces(g);
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
        square[0][7] = square[7][7] = 'R';
        square[1][7] = square[6][7] = 'H';
        square[2][7] = square[5][7] = 'B';
        square[3][7] = 'K';
        square[4][7] = 'Q';
        square[0][0] = square[7][0] = 'r';
        square[1][0] = square[6][0] = 'h';
        square[2][0] = square[5][0] = 'b';
        square[3][0] = 'k';
        square[4][0] = 'q';
    }

    //Sets Pieces into array & draws them
    public void drawPieces(Graphics g) {
        for (int i = 0; i < 8; i++) {
            for (int u = 0; u < 8; u++) {
                int x = (i + 1) * 100;
                int y = (u + 1) * 100;
                switch (square[i][u]) {
                    case 'K':
                        gold.King(g, x, y);
                        break;
                    case 'Q':
                        gold.Queen(g, x, y);
                        break;
                    case 'B':
                        gold.Bishop(g, x, y);
                        break;
                    case 'H':
                        gold.Knight(g, x, y);
                        break;
                    case 'R':
                        gold.Rook(g, x, y);
                        break;
                    case 'P':
                        gold.Pawn(g, x, y);
                        break;
                    case 'k':
                        silver.King(g, x, y);
                        break;
                    case 'q':
                        silver.Queen(g, x, y);
                        break;
                    case 'b':
                        silver.Bishop(g, x, y);
                        break;
                    case 'h':
                        silver.Knight(g, x, y);
                        break;
                    case 'r':
                        silver.Rook(g, x, y);
                        break;
                    case 'p':
                        silver.Pawn(g, x, y);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private class LineListener implements MouseListener{

        public void mousePressed(MouseEvent event) {
        }

        public void mouseReleased(MouseEvent event) {
        }

        public void mouseClicked(MouseEvent event) {
        }

        public void mouseEntered(MouseEvent event) {
        }

        public void mouseExited(MouseEvent event) {
        }
    }
}
