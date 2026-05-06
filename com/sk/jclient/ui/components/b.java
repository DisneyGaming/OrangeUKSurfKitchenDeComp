package com.sk.jclient.ui.components;

import com.sk.jclient.ui.components.a;
import com.sk.jclient.ui.components.c;
import com.sk.jclient.ui.components.k;
import javax.microedition.lcdui.Graphics;

public final class b
extends a {
    int a = 255;
    int b = 0xFF0000;

    public b(String string, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, k k2, c c2) {
        super(string, n, n2, n4, 0, k2, c2);
        int n9;
        b b2;
        if (n3 != 0) {
            b2 = this;
            n9 = n3;
        } else {
            b2 = this;
            n9 = 50;
        }
        b2.l = n9;
        this.m = 5;
        if (n6 != -1) {
            this.a = n6;
        }
        if (n7 != -1) {
            this.b = n7;
        }
        if (n8 != -1) {
            this.w = n8;
        }
        this.i |= 2;
    }

    protected final void a(Graphics graphics, int n) {
        if (this.y.f < this.y.g) {
            int n2;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            graphics.setColor(this.w);
            int n8 = this.n + 2;
            graphics.fillRect(n8 - 2, this.o + n + 4 + 2, 5, this.l - 4 - 8);
            graphics.setColor(this.t);
            graphics.drawRect(n8 - 2 - 1, this.o + n + 4 + 2, 6, this.l - 5 - 8);
            graphics.setColor(this.a);
            if ((this.y.d & 1) == 1) {
                for (n2 = 0; n2 < 5; ++n2) {
                    graphics.drawLine(this.n + n2, this.o + n + 4, this.n + 2, this.o + n);
                }
            }
            if ((this.y.d & 2) == 2) {
                for (n2 = 0; n2 < 5; ++n2) {
                    graphics.drawLine(this.n + n2, this.o + n + this.l - 4, this.n + 2, this.o + this.l + n);
                }
            }
            try {
                n3 = this.l - 9 - 8;
                n4 = this.o + 4 + 4;
                n5 = this.y.g + 20 - this.y.f;
                n6 = this.y.f * n3 / (this.y.g + 20);
                n7 = this.y.h * (n3 - n6) / n5;
            }
            catch (ArithmeticException arithmeticException) {
                n7 = this.y.h * (n3 - n6) / 1;
            }
            graphics.setColor(this.b);
            n2 = 0;
            graphics.fillRect(n8 - Math.max(1, 1), n4 + n7 + n, 3, n6);
            if ((this.i & 8) != 0) {
                graphics.setColor(65280);
                graphics.drawRect(this.n - 2, this.o - 2 + n, Math.max(5, 5) + 3, this.l + 3);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    final void a(int var1_1) {
        try {
            switch (var1_1) {
                case -1: {
                    this.d();
                    break;
                }
                case -2: {
                    this.e();
                }
            }
        }
        catch (IllegalStateException v0) {
            switch (var1_1) {
                case -1: {
                    v1 = this;
                    v2 = false;
                    v3 = com.sk.jclient.ui.components.a.c;
                    ** GOTO lbl20
                }
                case -2: {
                    v1 = this;
                    v2 = false;
                    v3 = com.sk.jclient.ui.components.a.d;
lbl20:
                    // 2 sources

                    v1.a(v2, v3);
                }
            }
        }
        this.i |= 1;
    }

    private final void d() throws IllegalStateException {
        if ((this.y.d & 1) != 0) {
            this.y.d = (byte)(this.y.d & 0xFFFFFFF7);
            this.y.d = (byte)(this.y.d | 4);
            return;
        }
        throw new IllegalStateException();
    }

    private final void e() throws IllegalStateException {
        if ((this.y.d & 2) != 0) {
            this.y.d = (byte)(this.y.d & 0xFFFFFFFB);
            this.y.d = (byte)(this.y.d | 8);
            return;
        }
        throw new IllegalStateException();
    }
}
