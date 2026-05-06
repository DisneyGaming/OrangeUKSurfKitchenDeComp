package com.sk.jclient;

import com.sk.jclient.Main;
import com.sk.jclient.g;
import java.util.Timer;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

/*
 * Exception performing whole class analysis ignored.
 */
final class f
extends Thread {
    private final Main a;

    f(Main main) {
        this.a = main;
    }

    public final void run() {
        if (Main.a == null) {
            Main.a = new Timer();
        }
        if (this.a.m == null) {
            try {
                Thread.currentThread().setPriority(10);
                Display.getDisplay((MIDlet)Main.l).setCurrent((Displayable)Main.b());
                Main.l.m = new g(Main.l);
                this.a.m.a();
                return;
            }
            catch (Exception exception) {
                this.a.destroyApp(true);
                return;
            }
        }
        g.a = (byte)(g.a & 0xFFFFFFFD);
        this.a.m.c();
    }
}
