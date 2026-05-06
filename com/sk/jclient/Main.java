package com.sk.jclient;

import com.sk.jclient.a;
import com.sk.jclient.b;
import com.sk.jclient.f;
import com.sk.jclient.g;
import com.sk.jclient.services.d;
import com.sk.jclient.util.c;
import java.util.Timer;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class Main
extends MIDlet {
    public static Timer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public static Main l;
    g m;
    final c n;
    private static Canvas o;

    public Main() {
        String string;
        Main main;
        o = new b(this);
        this.d = this.getAppProperty("imei");
        this.b = this.getAppProperty("SKServer");
        this.c = this.getAppProperty("SKServlet");
        this.getAppProperty("XmlFileName");
        this.getAppProperty("UpdateTime");
        this.f = this.getAppProperty("HttpPullFile");
        this.e = this.getAppProperty("ExitBeforeWap");
        this.getAppProperty("tok");
        this.g = this.getAppProperty("StartXml");
        this.h = this.getAppProperty("UserAgent");
        this.i = this.getAppProperty("SurfSyncSegment");
        this.getAppProperty("SmsPort");
        String string2 = null;
        string2 = this.getAppProperty("FileSystemRoot");
        this.k = this.getAppProperty("AppDirectory");
        if (this.k == null) {
            main = this;
            string = string2;
        } else {
            main = this;
            string = string2 + this.k;
        }
        main.j = string;
        this.getAppProperty("LogInterval");
        this.n = new c();
        l = this;
    }

    public final void startApp() {
        l = this;
        new f(this).start();
    }

    public final void destroyApp(boolean bl) {
        Display.getDisplay((MIDlet)this).setCurrent(null);
        if (a != null && !bl) {
            a.cancel();
            a = null;
        }
        this.notifyDestroyed();
    }

    public final void pauseApp() {
        this.notifyPaused();
    }

    private d a(String string, String string2) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (string.equals("skmessaging")) {
            com.sk.jclient.g.h.a((byte)117);
            Class<?> clazz = Class.forName("com.sk.jclient.services.e");
            return (d)clazz.newInstance();
        }
        if (string.equals("skapploader")) {
            if (string2.equals("loadData")) {
                Class<?> clazz = Class.forName("com.sk.jclient.services.h");
                return (d)clazz.newInstance();
            }
            if (string2.equals("loadwappage")) {
                com.sk.jclient.g.h.a((byte)116);
                Class<?> clazz = Class.forName("com.sk.jclient.services.a");
                return (d)clazz.newInstance();
            }
            if (string2.equals("registerPush")) {
                // empty if block
            }
        } else if (string.equals("skmultimedia")) {
            Vector vector = com.sk.jclient.g.a("skmultimedia");
            if (vector != null && vector.size() == 1) {
                return (d)vector.elementAt(0);
            }
            Class<?> clazz = Class.forName("com.sk.jclient.services.c");
            return (d)clazz.newInstance();
        }
        throw new ClassNotFoundException();
    }

    public final synchronized d a(a a2, g g2) {
        try {
            d d2 = this.a(a2.a, a2.b);
            d2.a(a2, g2);
            return d2;
        }
        catch (Throwable throwable) {
            g2.c(a2.e);
            return null;
        }
    }

    static boolean a() {
        return false;
    }

    static Canvas b() {
        return o;
    }
}
