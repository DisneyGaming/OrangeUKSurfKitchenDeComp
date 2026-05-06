package com.sk.jclient.services;

import com.sk.jclient.Main;
import com.sk.jclient.g;
import com.sk.jclient.services.d;
import javax.microedition.io.ConnectionNotFoundException;

public final class a
implements d {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(com.sk.jclient.a a2, g g2) {
        String string = (String)a2.c[0];
        try {
            g.a(true, "Loading ...");
            boolean bl = Main.l.platformRequest(string);
            g.a(false, null);
            if (bl || Main.l.e.equals("true")) {
                g2.b();
                Main.l.destroyApp(true);
                return;
            }
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            return;
        }
        finally {
            g.a(false, null);
        }
    }

    public final void a() {
    }
}
