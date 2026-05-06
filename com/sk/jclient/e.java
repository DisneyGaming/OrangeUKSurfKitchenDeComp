package com.sk.jclient;

import com.sk.jclient.a;
import com.sk.jclient.c;
import com.sk.jclient.g;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;

/*
 * Exception performing whole class analysis ignored.
 */
final class e
implements CommandListener {
    private final String a;
    private final a b;
    private final g c;

    e(g g2, String string, a a2) {
        this.c = g2;
        this.a = string;
        this.b = a2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void commandAction(Command command, Displayable displayable) {
        if (command == Alert.DISMISS_COMMAND) {
            Object object;
            g g2;
            Object object2 = this;
            synchronized (object2) {
                this.notifyAll();
            }
            if (this.a != null) {
                object2 = com.sk.jclient.c.a(this.a, g.b);
                g2 = this.c;
                object = object2;
            } else {
                g2 = this.c;
                object = this.b;
            }
            g2.a((a)object);
            if (displayable == null) {
                this.c.b();
            }
        }
    }
}
