package com.sk.jclient.services;

import com.sk.jclient.a;
import com.sk.jclient.services.c;
import javax.microedition.media.MediaException;

/*
 * Exception performing whole class analysis ignored.
 */
final class g
extends Thread {
    private final a a;
    private final c b;

    g(c c2, a a2) {
        this.b = c2;
        this.a = a2;
    }

    public final void run() {
        String string = (String)this.a.c[0];
        String string2 = null;
        int n = 1;
        try {
            c.a(this.b, Integer.parseInt((String)this.a.c[1]));
        }
        catch (NumberFormatException numberFormatException) {}
        try {
            c.b(this.b, Integer.parseInt((String)this.a.c[2]));
        }
        catch (NumberFormatException numberFormatException) {}
        try {
            c.c(this.b, Integer.parseInt((String)this.a.c[3]));
        }
        catch (NumberFormatException numberFormatException) {}
        try {
            c.d(this.b, Integer.parseInt((String)this.a.c[4]));
        }
        catch (NumberFormatException numberFormatException) {}
        try {
            n = Integer.parseInt((String)this.a.c[5]);
        }
        catch (NumberFormatException numberFormatException) {}
        try {
            string2 = (String)this.a.c[6];
            com.sk.jclient.g.a(true, "Loading video");
            c.a(true);
            c.a(c.d(this.b), c.a(string, string2, this.b.a));
            com.sk.jclient.g.a(false, null);
            c.a(this.b, c.e(this.b), n);
            return;
        }
        catch (MediaException mediaException) {
            c.a(this.b);
            c.c(this.b).c(this.a.e);
            return;
        }
    }
}
