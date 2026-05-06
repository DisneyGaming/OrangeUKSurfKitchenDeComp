package com.sk.jclient.ui.components;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Hashtable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class c {
    private static final Hashtable b = new Hashtable();
    private final Font c;
    private final Image d;
    private final char[] e;
    private final short[] f;
    private final byte[] g;
    private final byte h;
    private final int i;
    public int a;

    private c(Image image, char[] cArray, byte[] byArray, short[] sArray, byte by) {
        this.c = null;
        this.f = sArray;
        this.e = cArray;
        this.g = byArray;
        this.h = by;
        this.d = image;
        this.i = image.getHeight();
    }

    private c(int n, int n2, int n3) {
        this.f = null;
        this.g = null;
        this.d = null;
        this.e = null;
        this.h = 1;
        this.a = 0;
        this.c = Font.getFont((int)n, (int)n3, (int)n2);
        this.i = this.c.getHeight();
    }

    public static final c a(int n, int n2, int n3) {
        String string = n + ":" + n3 + ":" + n2;
        c c2 = (c)b.get(string);
        if (c2 != null) {
            return c2;
        }
        c2 = new c(n, n2, n3);
        b.put(string, c2);
        return c2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final c a(String string, com.sk.jclient.util.c c2) throws IOException {
        c c3;
        if (!string.endsWith(".bmf")) {
            throw new IOException("File format not supported");
        }
        if (b.containsKey(string)) {
            return (c)b.get(string);
        }
        FilterInputStream filterInputStream = null;
        try {
            byte[] byArray = c2.e(string);
            filterInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            ((DataInputStream)filterInputStream).readBoolean();
            char[] cArray = ((DataInputStream)filterInputStream).readUTF().toCharArray();
            byte[] byArray2 = new byte[cArray.length];
            short[] sArray = new short[cArray.length];
            short s = 0;
            for (int i = 0; i < cArray.length; ++i) {
                byte by;
                byArray2[i] = by = ((DataInputStream)filterInputStream).readByte();
                sArray[i] = s;
                s = (short)(s + by);
            }
            byte[] byArray3 = new byte[filterInputStream.available()];
            try {
                ((DataInputStream)filterInputStream).readFully(byArray3);
            }
            catch (EOFException eOFException) {}
            Image image = Image.createImage((byte[])byArray3, (int)0, (int)byArray3.length);
            c c4 = new c(image, cArray, byArray2, sArray, 0);
            b.put(string, c4);
            c3 = c4;
        }
        catch (Throwable throwable) {
            try {
                filterInputStream.close();
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            filterInputStream.close();
        }
        catch (Exception exception) {}
        return c3;
    }

    public static final int a(String string, c c2) {
        if (c2.c != null) {
            return c2.c.stringWidth(string);
        }
        short[] sArray = com.sk.jclient.ui.components.c.a(string.toCharArray(), c2);
        int n = 0;
        for (int i = 0; i < sArray.length; ++i) {
            int n2;
            int n3;
            if (sArray[i] == -1) {
                n3 = n;
                n2 = 6;
            } else {
                n3 = n;
                n2 = c2.g[sArray[i]];
            }
            n = n3 + (n2 + c2.h);
        }
        return n;
    }

    public final void a(Graphics graphics, String string, int n, int n2, int n3) {
        if (this.c != null) {
            int n4 = graphics.getColor();
            Font font = graphics.getFont();
            graphics.setFont(this.c);
            graphics.setColor(this.a);
            graphics.drawString(string, n, n2, n3);
            graphics.setColor(n4);
            graphics.setFont(font);
            return;
        }
        com.sk.jclient.ui.components.c.a(graphics, string, n, n2, n3, this);
    }

    /*
     * Unable to fully structure code
     */
    private static final void a(Graphics var0, String var1_1, int var2_2, int var3_3, int var4_4, c var5_5) {
        block9: {
            block8: {
                var6_6 = var0.getClipX();
                var7_7 = var0.getClipY();
                var8_8 = var0.getClipWidth();
                var9_9 = var0.getClipHeight();
                var12_10 = com.sk.jclient.ui.components.c.a(var1_1, var5_5);
                if ((var4_4 & 20) == 20) ** GOTO lbl-1000
                if ((var4_4 & 17) != 17) break block8;
                v0 = -(var12_10 / 2);
                ** GOTO lbl28
            }
            if ((var4_4 & 24) != 24) break block9;
            v0 = -var12_10;
            ** GOTO lbl28
        }
        if ((var4_4 & 36) == 36) {
            var10_11 = 0;
            v1 = -var5_5.i;
        } else if ((var4_4 & 33) == 33) {
            var10_11 = -(var12_10 / 2);
            v1 = -var5_5.i;
        } else if ((var4_4 & 40) == 40) {
            var10_11 = -var12_10;
            v1 = -var5_5.i;
        } else lbl-1000:
        // 2 sources

        {
            v0 = 0;
lbl28:
            // 3 sources

            var10_11 = v0;
            v1 = 0;
        }
        var11_12 = v1;
        var13_13 = com.sk.jclient.ui.components.c.a(var1_1.toCharArray(), var5_5);
        var14_14 = var2_2 + var10_11;
        var15_15 = var3_3 + var11_12;
        for (var16_16 = 0; var16_16 < var13_13.length; ++var16_16) {
            if (var13_13[var16_16] == -1) {
                var17_17 = var0.getColor();
                var0.setColor(0xFFFFFF);
                var0.drawRect(var14_14, var3_3, 5, var5_5.a());
                var0.setColor(var17_17);
                var14_14 += 6 + var5_5.h;
                continue;
            }
            var0.clipRect(var14_14, var15_15, (int)var5_5.g[var13_13[var16_16]], var5_5.i);
            var17_17 = var14_14 - var5_5.f[var13_13[var16_16]];
            var0.drawImage(var5_5.d, var17_17, var15_15, 20);
            var14_14 += var5_5.g[var13_13[var16_16]] + var5_5.h;
            var0.setClip(var6_6, var7_7, var8_8, var9_9);
        }
    }

    private static final short[] a(char[] cArray, c c2) {
        short[] sArray = new short[cArray.length];
        int n = 0;
        short s = (short)n;
        while (s < cArray.length) {
            short s2 = -1;
            short s3 = 0;
            short s4 = s3;
            while (s4 < c2.e.length) {
                if (cArray[n] == c2.e[s3]) {
                    s2 = s3;
                    break;
                }
                s4 = (short)(s3 + 1);
            }
            sArray[n] = s2;
            s = (short)(n + 1);
        }
        return sArray;
    }

    public final int a() {
        return this.i;
    }
}
