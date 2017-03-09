
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import javax.imageio.ImageIO;

public class Board extends JPanel {

    private BufferedImage wood, mop;
    private char square[][];
    private GoldPieces gold = new GoldPieces();

    public Board() {
        setPreferredSize(new Dimension(1000, 1000));
        square = new char[8][8];
        try {
            wood = ImageIO.read(new File("C:/Users/Jasmine/Documents/NetBeansProjects/Chess/Mahogany.jpg"));
            mop = ImageIO.read(new File("C:/Users/Jasmine/Documents/NetBeansProjects/Chess/mopth.jpg"));
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
        square[0][6] = square[1][6] = square[2][6] = square[3][6] = square[4][6] = 'P';
        square[5][6] = square[6][6] = square[7][6] = 'P';
        square[0][7] = square[7][7] = 'R';
        square[1][7] = square[6][7] = 'H';
        square[2][7] = square[5][7] = 'B';
        square[3][7] = 'K';
        square[4][7] = 'Q';
        square[0][1] = square[1][1] = square[2][1] = square[3][1] = square[4][1] = 'p';
        square[5][1] = square[6][1] = square[7][1] = 'p';
        square[0][7] = square[7][7] = 'R';
        square[1][7] = square[6][7] = 'H';
        square[2][7] = square[5][7] = 'B';
        square[3][7] = 'K';
        square[4][7] = 'Q';
    }

    //Sets Pieces into array & draws them
    public void drawPieces(Graphics g) {
        for (int i = 0; i < 8; i++) {
            for (int u = 0; u < 8; u++) {
                switch (square[i][u]) {
                    case 'K':
                        gold.King(g, i + 1, u + 1);
                        break;
                    case 'Q':
                        gold.Queen(g, i + 1, u + 1);
                        break;
                    case 'b':
                        gold.Bishop(g, i + 1, u + 1);
                        break;
                    case 'h':
                        gold.Knight(g, i + 1, u + 1);
                        break;
                    case 'r':
                        gold.Rook(g, i + 1, u + 1);
                        break;
                    case 'p':
                        gold.Pawn(g, i + 1, u + 1);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
