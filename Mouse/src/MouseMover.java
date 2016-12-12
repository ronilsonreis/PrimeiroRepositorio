
import java.awt.Robot;
import java.util.Random;

import javax.swing.JOptionPane;

public class MouseMover {
    public static final int FIVE_SECONDS = 5000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;
//Metodo Main que contém o loop para movimentção do cursor do Mouse
    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();
        JOptionPane.showMessageDialog(null,"A cada " + FIVE_SECONDS/1000 + " segundos, seu mouse irá se mover aletóriamente", "Mouse Mover", 0);
        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            robot.delay(FIVE_SECONDS);
            //Thread.sleep(FIVE_SECONDS);
        }
    }
}
