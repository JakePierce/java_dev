import java.awt.*;

class HelloComponent extends JComponent {

    public static void paintComponent( Graphics g ) {
        g.drawString( "Hello, Java!", 125, 95 );
    }
}