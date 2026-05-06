package com.sk.jclient;

import com.sk.jclient.Main;
import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Exception performing whole class analysis ignored.
 */
final class b
extends Canvas {
    int a;
    private Image b;

    b(Main main) {
    }

    public final void paint(Graphics graphics) {
        this.a = this.getWidth() / 2;
        if (this.b == null) {
            try {
                this.b = Image.createImage((String)"/splash.png");
            }
            catch (IOException iOException) {}
        }
        try {
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
            graphics.drawImage(this.b, 0, 0, 20);
            return;
        }
        catch (NullPointerException nullPointerException) {
            int n = this.getHeight();
            graphics.setColor(0xFFFFFF);
            graphics.drawString("One moment", this.a, n - n / 4, 65);
            return;
        }
    }
}
