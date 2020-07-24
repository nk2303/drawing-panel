import java.awt.*;

public class Doodle {
    public static void main (String[] args) {
        DrawingPanel panel = new DrawingPanel(500,500);
        Graphics doodle = panel.getGraphics();
        doodle.setColor(Color.BLUE);
        doodle.fillRect(17, 45, 139, 241);
        doodle.drawOval(234, 77, 100, 100);
        doodle.fill3DRect(150, 300, 100, 100, true);

    }
    


}
