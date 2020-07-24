import java.awt.*;

public class Doodle {
    public static void main (String[] args) {
        DrawingPanel panel = new DrawingPanel(500,500);
        Graphics face = panel.getGraphics();
        Graphics body = panel.getGraphics();
        Graphics hair = panel.getGraphics();
        face.setColor(Color.RED);
        body.setColor(Color.BLUE);
        hair.setColor(Color.BLACK);
        face.drawOval(200, 77, 100, 100);
        hair.drawOval(230, 120, 10, 10);
        hair.drawOval(270, 120, 10, 10);
        hair.fillOval(200, 70, 100, 20);
        body.fillRect(190, 180, 120, 200);
        body.fillRect(190, 180, 120, 200);
        body.fillRect(200, 360, 40, 60);
        body.fillRect(260, 360, 40, 60);

    }
    


}
