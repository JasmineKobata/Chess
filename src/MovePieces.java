
import java.awt.Graphics;

public class MovePieces {

    private Pawn pawn = new Pawn();

    //Highlights Selected 
    public void GoldHighlight(Graphics g) {
        for (int i = 0; i < 8; i++) {
            for (int u = 0; u < 8; u++) {
                Board.select = true;
                switch (Board.square[i][u]) {
                    case 'K':
                        break;
                    case 'Q':
                        break;
                    case 'B':
                        break;
                    case 'H':
                        break;
                    case 'R':
                        break;
                    case 'P':
                        pawn.GoldPawn(g, i, u);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void SilverHighlight(Graphics g, int x, int y) {
        switch (Board.square[x][y]) {
            case 'k':
                break;
            case 'q':
                break;
            case 'b':
                break;
            case 'h':
                break;
            case 'r':
                break;
            case 'p':
                break;
            default:
                break;
        }
    }
}
