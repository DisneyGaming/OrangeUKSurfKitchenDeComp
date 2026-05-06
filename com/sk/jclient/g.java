package com.sk.jclient;

import com.sk.jclient.Main;
import com.sk.jclient.e;
import com.sk.jclient.h;
import com.sk.jclient.services.c;
import com.sk.jclient.services.d;
import com.sk.jclient.ui.a;
import com.sk.jclient.ui.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Stack;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public final class g
implements com.sk.jclient.ui.c {
    public static byte a;
    private Stack i;
    public static a b;
    public static final Vector c;
    public Main d;
    com.sk.jclient.a e;
    public com.sk.jclient.util.e f;
    static final com.sk.jclient.c g;
    private String j;
    public static com.sk.jclient.util.c h;

    public g(Main main) {
        h = main.n;
        this.d = main;
        this.i = new Stack();
        this.e = new com.sk.jclient.a("navigator", "next", new String[]{main.g});
    }

    final void a() {
        this.f = new com.sk.jclient.util.e(this);
        h.a((byte)119);
        try {
            try {
                Thread.sleep(1000L);
            }
            catch (Exception exception) {}
            if (!Main.a()) {
                this.e();
                return;
            }
            this.a(this.e);
            return;
        }
        catch (Exception exception) {
            this.a("Unrecoverable error", exception.getMessage(), null, AlertType.ERROR, null, new com.sk.jclient.a("navigator", "exit", null));
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(com.sk.jclient.a a2) {
        try {
            if (a2 != null) {
                if (a2.a.equals("navigator")) {
                    this.f(a2);
                    return;
                } else if (a2.a.equals("contentServer")) {
                    this.e(a2);
                    return;
                } else if (a2.a.equals("transient")) {
                    if (!a2.b.equals("java.download")) return;
                    String string = (String)a2.c[0];
                    String string2 = (String)a2.c[1];
                    com.sk.jclient.a a3 = new com.sk.jclient.a("skapploader", "loadData", new Object[]{string, "get", null, null, null});
                    new com.sk.jclient.a("skapploader", "loadData", new Object[]{string, "get", null, null, null}).d = new com.sk.jclient.a("contentServer", "storeData", new String[]{string2});
                    a3.d.d = a2.d;
                    if (a2.e != null) {
                        a3.e = a2.e;
                    } else {
                        a3.e = new com.sk.jclient.a("navigator", "alert", new String[]{"Error while downloading...", "Network error", null});
                        a3.e.d = new com.sk.jclient.a("navigator", "back", null);
                    }
                    this.a(a3);
                    return;
                } else {
                    if (b != null) {
                        a2.f = com.sk.jclient.g.b.c;
                    }
                    com.sk.jclient.g.b(this.d.a(a2, this));
                }
                return;
            }
            com.sk.jclient.g.a(false, null);
            return;
        }
        catch (Exception exception) {
            this.a("Unrecoverable error", exception.getMessage(), null, AlertType.ERROR, null, new com.sk.jclient.a("navigator", "exit", null));
        }
    }

    static Vector a(String string) {
        Enumeration enumeration = c.elements();
        Vector<d> vector = new Vector<d>();
        while (enumeration.hasMoreElements()) {
            d d2 = (d)enumeration.nextElement();
            if (!string.equals(d2)) continue;
            vector.addElement(d2);
        }
        return vector;
    }

    public final synchronized void b() {
        if (h != null) {
            com.sk.jclient.util.c.a(true);
        }
        Enumeration enumeration = c.elements();
        while (enumeration.hasMoreElements()) {
            d d2 = (d)enumeration.nextElement();
            d2.a();
            c.removeElement(d2);
        }
        if (this.d != null) {
            this.d.destroyApp(true);
        }
    }

    private final void d(com.sk.jclient.a a2) {
        long l = 60000L;
        try {
            l = Long.parseLong((String)a2.c[0]);
        }
        catch (NumberFormatException numberFormatException) {}
        Main.a.schedule((TimerTask)new com.sk.jclient.d(this, a2), l);
    }

    private final void e(com.sk.jclient.a a2) {
        block12: {
            com.sk.jclient.a a3;
            g g2;
            block11: {
                block10: {
                    if (a2.b.equals("timer")) {
                        this.d(a2);
                        return;
                    }
                    if (a2.b.equals("httpPullDownload")) {
                        String string = (String)a2.c[0];
                        com.sk.jclient.a a4 = com.sk.jclient.util.e.a(new String[]{string});
                        this.a(a4);
                        return;
                    }
                    if (a2.b.equals("doUpdate")) {
                        try {
                            Thread.sleep(200L);
                        }
                        catch (InterruptedException interruptedException) {}
                        this.f.a(a2);
                        return;
                    }
                    if (!a2.b.equals("storeData")) break block10;
                    String string = (String)a2.c[0];
                    InputStream inputStream = (InputStream)a2.c[1];
                    int n = (Integer)a2.c[2];
                    h.a(string, inputStream, n);
                    g2 = this;
                    a3 = a2.d;
                    break block11;
                }
                if (a2.b.equals("refresh")) {
                    String string = (String)a2.c[0];
                    com.sk.jclient.util.c.a(string, a2.g);
                    return;
                }
                if (!a2.b.equals("refreshPage")) break block12;
                com.sk.jclient.a a5 = new com.sk.jclient.a("navigator", "next", new Object[]{this.j});
                g2 = this;
                a3 = a5;
            }
            g2.a(a3);
        }
    }

    private final void f(com.sk.jclient.a a2) {
        Object object;
        if (!c.isEmpty()) {
            for (int j = 0; j < c.size(); ++j) {
                object = (d)c.elementAt(j);
                if (!(object instanceof c)) continue;
                object.a();
            }
        }
        if (a2.b.equals("next")) {
            byte[] byArray;
            com.sk.jclient.util.c.b(false);
            if (a2.c.length != 3 || a2.c[2] != "b") {
                String[] stringArray = new String[2];
                String[] stringArray2 = stringArray;
                stringArray[0] = this.j;
                if (b != null) {
                    try {
                        stringArray2[1] = com.sk.jclient.g.b.c.b().q;
                    }
                    catch (NullPointerException nullPointerException) {}
                    this.i.push(stringArray2);
                    if (this.i.size() > 20) {
                        this.i.removeElement(this.i.firstElement());
                    }
                }
            }
            this.j = (String)a2.c[0];
            if (com.sk.jclient.util.c.a(this.j).equals("")) {
                this.j = com.sk.jclient.util.c.c(this.j);
            }
            try {
                byArray = h.d(this.j);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                byArray = this.f.a(a2, this.j);
                if (byArray == null) {
                    return;
                }
            }
            catch (IOException iOException) {
                this.a("Unrecoverable error", iOException.getMessage(), null, AlertType.ERROR, null, new com.sk.jclient.a("navigator", "exit", null));
                return;
            }
            byArray = com.sk.jclient.g.a(byArray);
            if (byArray != null) {
                com.sk.jclient.g.a(true, null);
                object = com.sk.jclient.ui.a.a(byArray, this);
                if (a2 != null && a2.c.length > 1) {
                    ((a)object).c.c((String)a2.c[1]);
                }
            } else {
                this.a(new com.sk.jclient.a("navigator", "next", new String[]{this.d.g}));
                return;
            }
            com.sk.jclient.g.a(false, null);
            b = object;
            com.sk.jclient.g.a(false, null);
        } else {
            com.sk.jclient.ui.components.a a3;
            if (a2.b.equals("alert")) {
                String string = null;
                object = null;
                String string2 = null;
                try {
                    object = (String)a2.c[0];
                    string = (String)a2.c[1];
                    string2 = (String)a2.c[2];
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
                this.a(string, (String)object, null, AlertType.INFO, string2, a2.d);
                return;
            }
            if ("back".equals(a2.b)) {
                if (this.i.isEmpty()) {
                    return;
                }
                String[] stringArray = (String[])this.i.pop();
                this.a(new com.sk.jclient.a("navigator", "next", new String[]{stringArray[0], stringArray[1], "b"}));
                return;
            }
            if ("exit".equals(a2.b)) {
                this.b();
                return;
            }
            if ("executeFocused".equals(a2.b) && (a3 = com.sk.jclient.g.b.c.b()) != null && a3.B != null) {
                object = com.sk.jclient.c.a(a3.B, b);
                this.a((com.sk.jclient.a)object);
                return;
            }
        }
        this.c();
        this.d();
        this.a(com.sk.jclient.g.b.f);
    }

    private final void d() {
        Vector vector = com.sk.jclient.g.a("skmultimedia");
        if (vector.size() > 0) {
            d d2 = (d)vector.lastElement();
            d2.a();
        }
        this.f.d = true;
    }

    private void a(b[] bArray) {
        try {
            if (bArray != null) {
                for (int j = 0; j < bArray.length; ++j) {
                    com.sk.jclient.a a2 = com.sk.jclient.c.a(bArray[j], b);
                    if (a2 == null) continue;
                    try {
                        a2.h = com.sk.jclient.g.b.d;
                    }
                    catch (NullPointerException nullPointerException) {}
                    new h(this, a2).start();
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    final void c() {
        if (b != null) {
            Display display = Display.getDisplay((MIDlet)this.d);
            display.setCurrent((Displayable)com.sk.jclient.g.b.c);
        }
    }

    public static synchronized void a(boolean bl, String string) {
        if (bl) {
            a = (byte)(a | 2);
            return;
        }
        a = (byte)(a & 0xFFFFFFFD);
        if (b != null) {
            com.sk.jclient.g.b.c.c = (byte)(com.sk.jclient.g.b.c.c | 0x1A);
        }
    }

    private static byte[] a(byte[] byArray) {
        StringBuffer stringBuffer = new StringBuffer();
        String string = new String(byArray);
        int n = 0;
        int n2 = -1;
        int n3 = 0;
        byte[] byArray2 = null;
        while (true) {
            n3 = string.indexOf("#+", n2 + 1);
            n2 = string.indexOf("#", n3 + 1);
            if (n3 == -1 || n2 == -1 || n2 - n3 == 1) break;
            String string2 = string.substring(n3 + 2, n2);
            try {
                byArray2 = h.e(string2);
            }
            catch (NullPointerException nullPointerException) {
                byArray2 = null;
                continue;
            }
            catch (IOException iOException) {}
            stringBuffer.append(string.substring(n, n3));
            if (byArray2 != null) {
                stringBuffer.append(new String(byArray2));
            }
            n = n2 + 1;
        }
        if (n == 0) {
            return byArray;
        }
        stringBuffer.append(string.substring(n, string.length()));
        return stringBuffer.toString().getBytes();
    }

    public final void a(com.sk.jclient.ui.components.a a2, byte by, Object object) {
        switch (by) {
            case 118: {
                com.sk.jclient.a a3 = com.sk.jclient.c.a((b)((Object)object), b);
                this.a(a3);
            }
        }
    }

    public final void b(com.sk.jclient.a a2) {
        this.a(a2);
    }

    public final void c(com.sk.jclient.a a2) {
        this.a(a2);
    }

    private static synchronized void b(d d2) {
        if (d2 == null) {
            return;
        }
        c.addElement(d2);
        c.trimToSize();
    }

    public static synchronized void a(d d2) {
        c.removeElement(d2);
    }

    private synchronized void a(String string, String string2, Image image, AlertType alertType, String string3, com.sk.jclient.a a2) {
        Alert alert = new Alert(string, string2, image, alertType);
        alert.setTimeout(-2);
        alert.addCommand(Alert.DISMISS_COMMAND);
        alert.setCommandListener((CommandListener)new e(this, string3, a2));
        Display display = Display.getDisplay((MIDlet)this.d);
        display.setCurrent((Displayable)alert);
    }

    private void e() {
        Object object;
        Object object2;
        byte[] byArray;
        try {
            byArray = h.e("update");
            if (byArray != null && byArray[0] == 121) {
                com.sk.jclient.a a2 = new com.sk.jclient.a("navigator", "next", new String[]{"rs:///CA/content.xml"});
                this.a(a2);
                return;
            }
        }
        catch (Exception exception) {}
        byArray = null;
        try {
            byArray = h.e("CA/expirydates.upd");
        }
        catch (Exception exception) {}
        try {
            if (byArray != null) {
                String string = new String(byArray);
                object2 = string.substring(0, string.indexOf("catalog:"));
                object = string.substring(string.indexOf("catalog:"));
                Calendar calendar = Calendar.getInstance();
                if (object2 != null && object != null) {
                    String string2 = ((String)object2).substring("content:".length());
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(1, Integer.valueOf(string2.substring(4, 8)));
                    calendar2.set(2, Integer.valueOf(string2.substring(2, 4)) - 1);
                    calendar2.set(5, Integer.valueOf(string2.substring(0, 2)));
                    calendar2.set(10, Integer.valueOf(string2.substring(8, 10)));
                    calendar2.set(12, Integer.valueOf(string2.substring(10, 12)));
                    if (calendar.after(calendar2)) {
                        com.sk.jclient.a a3 = new com.sk.jclient.a("navigator", "next", new String[]{"rs:///CA/content.xml"});
                        this.a(a3);
                        return;
                    }
                    string2 = ((String)object).substring("catalog:".length());
                    calendar2 = Calendar.getInstance();
                    calendar2.set(1, Integer.valueOf(string2.substring(4, 8)));
                    calendar2.set(2, Integer.valueOf(string2.substring(2, 4)) - 1);
                    calendar2.set(5, Integer.valueOf(string2.substring(0, 2)));
                    calendar2.set(10, Integer.valueOf(string2.substring(8, 10)));
                    calendar2.set(12, Integer.valueOf(string2.substring(10, 12)));
                    if (calendar.after(calendar2)) {
                        com.sk.jclient.a a4 = new com.sk.jclient.a("navigator", "next", new String[]{"rs:///CA/catalog.xml"});
                        this.a(a4);
                        return;
                    }
                }
            }
        }
        catch (Exception exception) {}
        object2 = null;
        try {
            try {
                object2 = h.e("launched");
            }
            catch (Exception exception) {
                h.a("launched", new byte[]{121});
            }
            if (object2 == null || object2[0] != 121 || byArray != null) {
                if (object2 == null) {
                    h.a("launched", new byte[]{121});
                }
                object = new com.sk.jclient.a("navigator", "next", new String[]{this.d.g});
                this.a((com.sk.jclient.a)object);
                return;
            }
            object = new com.sk.jclient.a("navigator", "next", new String[]{this.d.f});
            this.a((com.sk.jclient.a)object);
        }
        catch (Exception exception) {}
    }

    public final void a(Graphics graphics) {
        com.sk.jclient.g.b.c.a(graphics);
    }

    static {
        b = null;
        c = new Vector();
        g = new com.sk.jclient.c();
    }
}
