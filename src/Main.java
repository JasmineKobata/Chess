
import java.io.IOException;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame("Chess");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new Board());
        f.pack();
        f.setVisible(true);
    }
}
