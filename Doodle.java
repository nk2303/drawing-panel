import java.awt.*;

public class Doodle {
    public static void main (String[] args) {
        DrawingPanel panel = new DrawingPanel(500,500);
        Graphics doodle = panel.getGraphics();
        doodle.setColor(Color.RED);
        doodle.fillRect(17, 45, 139, 241);
        doodle.drawOval(234, 77, 100, 100);
    }
    


}
