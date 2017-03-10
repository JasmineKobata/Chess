
import java.awt.Graphics;

public class Pawn {

    private BlueSquares blue = new BlueSquares();

    public void GoldPawn(Graphics g, int x, int y) {
        x = (x + 1) * 100;
        y = (y + 1) * 100;
        if (Board.choosePiece.x > x && Board.choosePiece.x < x + 100
                && Board.choosePiece.y > y && Board.choosePiece.y < y + 100 && Board.select == true) {
            blue.Highlight(g, x, y);
            if (Board.firstMove[x] == true) {
                blue.Highlight(g, i, u - 200);
            }
        }
    }
}
