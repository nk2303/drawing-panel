import java.awt.*;

public class Doodle {
    public static void main (String[] args) {
        DrawingPanel panel = new DrawingPanel(500,500);
        Graphics graph = panel.getGraphics();
        graph.setColor(Color.RED);
        graph.drawOval(200, 77, 100, 100);
        graph.setColor(Color.BLUE);
        graph.fillRect(190, 180, 120, 200);
        graph.fillRect(190, 180, 120, 200);
        graph.fillRect(200, 360, 40, 60);
        graph.fillRect(260, 360, 40, 60);
        graph.setColor(Color.BLACK);
        graph.drawOval(230, 120, 10, 10);
        graph.drawOval(270, 120, 10, 10);
        graph.fillOval(210, 77, 80, 20);
        graph.drawString("I'm Jesse. I'm stupid", 80, 100);
        graph.fillRect(x, y, width, height);
        graph.drawOval(x, y, width, height);
        
    }
}
