package appendix1.appendixB.helloApplet;

import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class HelloApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        FontMetrics f = g.getFontMetrics();
        int x = 0;
        int y = f.getAscent();
        g.drawString("HelloApplet", x, y);
    }
}
