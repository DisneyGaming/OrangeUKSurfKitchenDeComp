package com.sk.jclient.ui.components;

import com.sk.jclient.ui.components.a;
import com.sk.jclient.ui.components.c;
import com.sk.jclient.ui.components.k;
import javax.microedition.lcdui.Graphics;

public final class d
extends a {
    public int a;
    private int b = 0xF0F0F0;
    private int C;

    public d(String string, String string2, int n, int n2, boolean bl, int n3, int n4, int n5, int n6, int n7, k k2, c c2) {
        super(string, n, n2, n6, n5, k2, c2);
        this.r = new Integer(n4);
        this.a = n3;
        if (string2 != null) {
            this.j = string2;
            this.C = this.k.a();
        }
        this.l = this.C + 16;
        if (n5 == -1) {
            this.w = 0xFF0000;
        }
        if (n6 != -1) {
            this.t = 0;
        }
        if (n7 != -1) {
            this.b = n7;
        }
    }

    public final void d(int n) {
        this.r = new Integer(n);
        this.a((byte)2, null);
    }

    protected final void a(Graphics graphics, int n) {
        int n2 = (Integer)this.r * this.m / this.a;
        if (this.j != null) {
            this.k.a = this.t;
            this.k.a(graphics, this.j, this.n + this.m / 2, this.o + n + this.l / 2, 65);
        }
        graphics.setColor(this.w);
        graphics.fillRect(this.n + 1, this.o + n, n2 - 1, this.l);
        graphics.setColor(this.b);
        graphics.drawRect(this.n, this.o + n, this.m - 1, this.l - 1);
    }

    final void a(int n) {
    }

    public final void a(String string, String string2) {
        if (string.equals("value")) {
            this.r = new Integer(Integer.parseInt(string2));
        }
        super.a(string, string2);
    }
}
