import java.awt.*;

public class CafeWall {
    public static void main (String[] args) {
        DrawingPanel panel = new DrawingPanel(650,400);
        panel.setBackground(Color.GRAY);
        Graphics graph = panel.getGraphics();
        drawRow(graph, 0, 0, 4, 20);
        drawRow(graph, 50, 70, 5, 30);
        drawGrid(graph, 10, 150, 4, 25, 0, 8, 2);
        drawGrid(graph, 250, 200, 3, 25, 10, 6, 2);
        drawGrid(graph, 425, 180, 5, 20, 10, 10, 2);
        drawGrid(graph, 400, 20, 2, 35, 35, 4, 2);
    }

    public static void drawRow(Graphics graph, int x, int y, int amount, int size) {
        for ( int i = 1; i <= amount; i++){
            graph.setColor(Color.BLACK);
            graph.fillRect(x, y, size, size);
            graph.setColor(Color.BLUE);
            graph.drawLine(x, y, x + size, y + size);
            graph.drawLine(x, y + size, x + size, y);
            x += size;
            graph.setColor(Color.WHITE);
            graph.fillRect(x, y, size, size);
            x += size;
        }
    }

    public static void drawGrid(Graphics graph, int x, int y, int amount, int size, int offset, int times, int mortar ){
        for (int i = 1; i <= times; i++){
            if (i % 2 == 0){
                drawRow(graph, x + offset, y, amount, size);
                y += 2;
            } else {
                drawRow(graph, x, y, amount, size);
                y += 2;
            }
            y += size;
        }
    }

}