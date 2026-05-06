package com.sk.jclient.services;

import com.sk.jclient.a;
import com.sk.jclient.g;
import com.sk.jclient.services.c;
import javax.microedition.media.MediaException;

/*
 * Exception performing whole class analysis ignored.
 */
final class b
extends Thread {
    private final a a;
    private final c b;

    b(c c2, a a2) {
        this.b = c2;
        this.a = a2;
    }

    public final void run() {
        String string = (String)this.a.c[0];
        String string2 = null;
        try {
            string2 = (String)this.a.c[2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
        int n = 1;
        try {
            n = Integer.parseInt((String)this.a.c[1]);
        }
        catch (Exception exception) {}
        try {
            g.a(true, "Loading audio");
            c.a(c.d(this.b), c.a(string, string2, this.b.a));
            g.a(false, null);
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
