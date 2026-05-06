package com.sk.jclient.ui.components;

import com.sk.jclient.g;
import com.sk.jclient.ui.b;
import com.sk.jclient.ui.components.a;
import com.sk.jclient.ui.components.k;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class m
extends a {
    private static Hashtable a = new Hashtable(5);
    private int b = 0;
    private Image[] C;
    private b[] D;

    public static m a(String string, k k2, String string2, int n, int n2) {
        m m2 = null;
        if (a.containsKey(string2)) {
            m2 = (m)a.get(string2);
            m2.a(string2);
            m2.y = k2;
        } else {
            m2 = new m(string, n, n2, k2, string2);
            a.put(string2, m2);
        }
        ++m2.b;
        if (m2.D[m2.b % m2.C.length] != null) {
            m2.B = m2.D[m2.b % m2.C.length];
        }
        return m2;
    }

    private m(String string, int n, int n2, k k2, String string2) {
        super(string, n, n2, -1, -1, k2, null);
        this.a(string2);
    }

    private void a(String string) {
        Vector<b> vector = new Vector<b>();
        Vector<Image> vector2 = new Vector<Image>();
        this.i |= 2;
        this.i |= 0x1000;
        boolean bl = true;
        int n = 0;
        while (bl) {
            try {
                Object object;
                byte[] byArray = com.sk.jclient.g.h.e(string + n + ".png");
                if (byArray != null) {
                    object = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
                    if (object != null) {
                        vector2.addElement((Image)object);
                    }
                } else {
                    bl = false;
                }
                object = null;
                byArray = com.sk.jclient.g.h.e(string + n + ".cmd");
                if (byArray != null) {
                    object = new String(byArray);
                }
                vector.addElement(new b("dege", 4, 0, (String)object, null, null));
            }
            catch (IOException iOException) {
                bl = false;
            }
            ++n;
        }
        this.D = new b[vector.size()];
        vector.copyInto((Object[])this.D);
        this.C = new Image[vector2.size()];
        vector2.copyInto(this.C);
        if (this.C.length > 0) {
            this.l = this.C[0].getHeight();
            this.m = this.C[0].getWidth();
        }
    }

    protected final void a(Graphics graphics, int n) {
        int n2 = this.b % this.C.length;
        if (this.C.length > n2 && this.C[n2] != null) {
            graphics.drawImage(this.C[this.b % this.C.length], this.n, this.o + n, 20);
        }
        this.i |= 1;
    }

    final void a(int n) {
        switch (n) {
            case -1: 
            case 50: {
                this.a(false, com.sk.jclient.ui.components.a.c);
                return;
            }
            case -2: 
            case 56: {
                this.a(false, com.sk.jclient.ui.components.a.d);
                return;
            }
            case -5: 
            case 53: {
                if (this.D[this.b % this.C.length] == null) break;
                this.a((byte)118, (Object)this.D[this.b % this.C.length]);
            }
        }
    }
}
