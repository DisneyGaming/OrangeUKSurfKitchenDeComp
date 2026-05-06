package com.sk.jclient.ui;

import com.sk.jclient.g;
import com.sk.jclient.ui.b;
import com.sk.jclient.ui.c;
import com.sk.jclient.ui.components.d;
import com.sk.jclient.ui.components.e;
import com.sk.jclient.ui.components.f;
import com.sk.jclient.ui.components.h;
import com.sk.jclient.ui.components.j;
import com.sk.jclient.ui.components.k;
import com.sk.jclient.ui.components.m;
import com.sk.jclient.ui.components.n;
import java.util.Stack;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class a
implements c {
    private static byte g;
    private static byte h;
    private static byte i;
    private static byte j;
    private static byte k;
    private static byte l;
    private static byte m;
    private static byte n;
    private static byte o;
    private static byte p;
    private static byte q;
    private static byte r;
    private static byte s;
    public static com.sk.jclient.ui.components.c a;
    public c b;
    public k c;
    public d d;
    private String t;
    public String e = null;
    public b[] f;

    private a(byte[] byArray, c c2) {
        this.b = c2;
        if (this.c == null) {
            this.c = new k();
            return;
        }
        this.a();
    }

    private void a() {
        this.c.a();
        this.d = null;
        this.f = null;
    }

    public final void a(Graphics graphics) {
        this.c.a(graphics);
    }

    public final void a(com.sk.jclient.ui.components.a a2, byte by, Object object) {
        switch (by) {
            case 118: {
                if (this.b == null) break;
                this.b.a(a2, by, object);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static final a a(byte[] var0, c var1_1) throws IllegalArgumentException {
        com.sk.jclient.ui.a.g = 0;
        com.sk.jclient.ui.a.h = 0;
        com.sk.jclient.ui.a.i = 0;
        com.sk.jclient.ui.a.j = 0;
        com.sk.jclient.ui.a.k = 0;
        com.sk.jclient.ui.a.l = 0;
        com.sk.jclient.ui.a.m = 0;
        com.sk.jclient.ui.a.n = 0;
        com.sk.jclient.ui.a.o = 0;
        com.sk.jclient.ui.a.p = 0;
        com.sk.jclient.ui.a.q = 0;
        com.sk.jclient.ui.a.r = 0;
        com.sk.jclient.ui.a.s = 0;
        var2_2 = new a(var0, var1_1);
        new a(var0, var1_1).c.j = var2_2;
        var3_3 = new Vector<b>();
        var4_4 = com.sk.jclient.ui.components.c.a(64, 8, 0);
        try {
            var5_5 = new com.sk.jclient.util.b(var0);
            var6_7 = var5_5.a();
            if (var6_7 == 0) {
                var6_7 = 1;
            }
            var7_9 = new Stack<E>();
            var8_11 = false;
            var9_13 = 0;
            var10_15 = null;
            var11_16 = null;
            var12_17 = null;
            block27: while (true) {
                block67: {
                    var10_15 = null;
                    var11_16 = null;
                    var12_17 = null;
                    var5_5.c();
                    var13_18 = var5_5.d();
                    if (var5_5.b != 0) break block67;
                    switch (var13_18) {
                        case 1: {
                            var14_19 = '\u0000';
                            var15_25 = null;
                            var16_27 = null;
                            for (var17_33 = 0; var17_33 < var5_5.b(); ++var17_33) {
                                var18_40 = var5_5.a(var17_33);
                                var19_45 = var5_5.b(var17_33);
                                if ("bgimage".equals(var18_40)) {
                                    var2_2.c.a((String)var19_45);
                                    var2_2.t = var19_45;
                                    continue;
                                }
                                if ("bgcolor".equals(var18_40)) {
                                    var2_2.c.b = var9_13 = com.sk.jclient.ui.a.a((String)var19_45);
                                    continue;
                                }
                                if ("bgcolor".equals(var18_40)) {
                                    com.sk.jclient.ui.a.a((String)var19_45);
                                    continue;
                                }
                                if ("font".equals(var18_40)) {
                                    var16_27 = var19_45;
                                    continue;
                                }
                                if ("fontstyle".equals(var18_40)) {
                                    var15_25 = var19_45.toCharArray();
                                    continue;
                                }
                                if ("fontsize".equals(var18_40)) {
                                    var14_19 = var19_45.charAt(0);
                                    continue;
                                }
                                if (!"onload".equals(var18_40)) continue;
                                var2_2.e = var19_45;
                            }
                            if (var2_2.e != null) {
                                var3_3.addElement(new b("", 4, 0, var2_2.e, null, null));
                            }
                            com.sk.jclient.ui.a.a = com.sk.jclient.ui.a.a(var16_27, var14_19, (char[])var15_25);
                            continue block27;
                        }
                        case 19: {
                            com.sk.jclient.ui.a.a(var5_5, var7_9);
                            continue block27;
                        }
                        case 11: 
                        case 13: {
                            if (var13_18 == 13) {
                                com.sk.jclient.ui.a.b(var5_5, var2_2, var7_9, false);
                                continue block27;
                            }
                            com.sk.jclient.ui.a.b(var5_5, var2_2, var7_9, true);
                            continue block27;
                        }
                        case 12: 
                        case 14: {
                            if (var13_18 == 12) {
                                com.sk.jclient.ui.a.a(var5_5, var2_2, var7_9, true);
                                continue block27;
                            }
                            com.sk.jclient.ui.a.a(var5_5, var2_2, var7_9, false);
                            continue block27;
                        }
                        case 15: {
                            com.sk.jclient.ui.a.a(var5_5, var2_2, var7_9);
                            continue block27;
                        }
                        case 5: {
                            var14_20 = null;
                            var15_25 = "Command";
                            for (var17_34 = 0; var17_34 < var5_5.b(); ++var17_34) {
                                if ("name".equals(var5_5.a(var17_34))) {
                                    var15_25 = var5_5.b(var17_34);
                                    continue;
                                }
                                if ("keycode".equals(var5_5.a(var17_34))) {
                                    var14_20 = var5_5.b(var17_34);
                                    continue;
                                }
                                if (!"action".equals(var5_5.a(var17_34)) && !"onclick".equals(var5_5.a(var17_34)) || !(var10_15 = var5_5.b(var17_34)).equals("")) continue;
                                var10_15 = null;
                            }
                            if (var10_15 == null) continue block27;
                            var16_28 = var14_20.equals("exit") != false ? 7 : (var14_20.equals("cancel") != false ? 3 : (var14_20.equals("help") != false ? 5 : (var14_20.equals("ok") != false ? 4 : (var14_20.equals("screen") != false ? 1 : (var14_20.equals("back") != false ? 2 : (var14_20.equals("stop") != false ? 6 : 8))))));
                            try {
                                var17_35 = new b((String)var15_25, 8, 0, var10_15, null, null);
                                var2_2.c.i.put(new Integer(Integer.parseInt(var14_20)), var17_35);
                                break;
                            }
                            catch (NumberFormatException v0) {
                                var18_41 = new b((String)var15_25, var16_28, 0, var10_15, null, null);
                                var2_2.c.addCommand(var18_41);
                                continue block27;
                            }
                        }
                        case 2: 
                        case 3: 
                        case 16: 
                        case 20: {
                            var14_21 = 0;
                            if (var13_18 != 16) ** GOTO lbl118
                            v1 = 2;
                            ** GOTO lbl123
lbl118:
                            // 1 sources

                            if (var13_18 != 2) ** GOTO lbl121
                            v1 = 3;
                            ** GOTO lbl123
lbl121:
                            // 1 sources

                            if (var13_18 != 3) ** GOTO lbl124
                            v1 = 4;
lbl123:
                            // 3 sources

                            var14_21 = v1;
lbl124:
                            // 2 sources

                            com.sk.jclient.ui.a.a(var5_5, var2_2, var7_9, var14_21);
                            continue block27;
                        }
                        case 4: {
                            com.sk.jclient.ui.a.c(var5_5, var2_2, var7_9);
                            continue block27;
                        }
                        case 9: {
                            com.sk.jclient.ui.a.b(var5_5, var2_2, var7_9);
                            continue block27;
                        }
                        case 6: {
                            var14_22 = null;
                            var15_25 = null;
                            var16_29 = "";
                            for (var17_36 = 0; var17_36 < var5_5.b(); ++var17_36) {
                                var18_42 = var5_5.a(var17_36);
                                var19_45 = var5_5.b(var17_36);
                                if ("src".equals(var18_42)) {
                                    var14_22 = var19_45;
                                    continue;
                                }
                                if ("looping".equals(var18_42)) {
                                    var15_25 = var19_45;
                                    continue;
                                }
                                if ("oncomplete".equals(var18_42)) {
                                    var11_16 = var19_45;
                                    continue;
                                }
                                if ("onerror".equals(var18_42)) {
                                    var12_17 = var19_45;
                                    continue;
                                }
                                if (!"contentType".equals(var18_42)) continue;
                                var16_29 = var19_45;
                            }
                            var17_37 = "skmultimedia.play('" + var14_22 + "','" + (String)var15_25 + "','" + (String)var16_29 + "')";
                            var3_3.addElement(new b("", 4, 0, var17_37, (String)var11_16, (String)var12_17));
                            continue block27;
                        }
                        case 7: {
                            var14_23 = null;
                            var15_25 = null;
                            var16_30 = null;
                            var17_38 = null;
                            var18_43 = null;
                            var19_45 = null;
                            var20_47 = "";
                            for (var21_49 = 0; var21_49 < var5_5.b(); ++var21_49) {
                                var22_50 = var5_5.a(var21_49);
                                var23_51 = var5_5.b(var21_49);
                                if ("src".equals(var22_50)) {
                                    var14_23 = var23_51;
                                    continue;
                                }
                                if ("looping".equals(var22_50)) {
                                    var15_25 = var23_51;
                                    continue;
                                }
                                if ("oncomplete".equals(var22_50)) {
                                    var11_16 = var23_51;
                                    continue;
                                }
                                if ("x".equals(var22_50)) {
                                    var16_30 = var23_51;
                                    continue;
                                }
                                if ("y".equals(var22_50)) {
                                    var17_38 = var23_51;
                                    continue;
                                }
                                if ("w".equals(var22_50)) {
                                    var18_43 = var23_51;
                                    continue;
                                }
                                if ("h".equals(var22_50)) {
                                    var19_45 = var23_51;
                                    continue;
                                }
                                if (!"contentType".equals(var22_50)) continue;
                                var20_47 = var23_51;
                            }
                            var21_48 = "skmultimedia.playVideo('" + var14_23 + "','" + var16_30 + "','" + var17_38 + "','" + var18_43 + "','" + (String)var19_45 + "','" + (String)var15_25 + "','" + var20_47 + "')";
                            var3_3.addElement(new b("", 4, 0, var21_48, (String)var11_16, null));
                            continue block27;
                        }
                        case 8: {
                            com.sk.jclient.ui.a.a(var5_5, var2_2, var3_3);
                            continue block27;
                        }
                        case 10: {
                            var14_24 = null;
                            for (var15_26 = 0; var15_26 < var5_5.b(); ++var15_26) {
                                var16_31 = var5_5.a(var15_26);
                                if ("action".equals(var16_31)) {
                                    var10_15 = var5_5.b(var15_26);
                                    continue;
                                }
                                if (!"length".equals(var16_31)) continue;
                                var14_24 = var5_5.b(var15_26);
                            }
                            var15_25 = "contentServer.timer('" + var14_24 + "')";
                            var3_3.addElement(new b("", 4, 0, (String)var15_25, var10_15, null));
                            continue block27;
                        }
                        case 23: {
                            var15_25 = null;
                            var16_32 = 0;
                            var17_39 = 0;
                            var18_44 = 0xFF0000;
                            for (var19_46 = 0; var19_46 < var5_5.b(); ++var19_46) {
                                var20_47 = var5_5.a(var19_46);
                                var21_48 = var5_5.b(var19_46);
                                if ("src".equals(var20_47)) {
                                    var15_25 = var5_5.b(var19_46);
                                    continue;
                                }
                                if ("x".equals(var20_47)) {
                                    try {
                                        var16_32 = Integer.parseInt(var21_48);
                                    }
                                    catch (NumberFormatException v2) {}
                                    continue;
                                }
                                if ("y".equals(var20_47)) {
                                    try {
                                        var17_39 = Integer.parseInt(var21_48);
                                    }
                                    catch (NumberFormatException v3) {}
                                    continue;
                                }
                                if (!"bordercolor".equals(var20_47)) continue;
                                var18_44 = com.sk.jclient.ui.a.a(var21_48);
                            }
                            var19_45 = com.sk.jclient.ui.components.m.a("banner", null, (String)var15_25, var16_32, var17_39);
                            com.sk.jclient.ui.components.m.a("banner", null, (String)var15_25, var16_32, var17_39).u = var18_44;
                            com.sk.jclient.ui.a.a((com.sk.jclient.ui.components.a)var19_45, var2_2, var7_9);
                        }
                    }
                    continue;
                }
                if (var5_5.b == -1) break;
                if (var5_5.b != 1) continue;
                switch (var13_18) {
                    case 11: 
                    case 13: 
                    case 15: 
                    case 19: {
                        com.sk.jclient.ui.a.a((com.sk.jclient.ui.components.a)var7_9.pop(), var2_2, var7_9);
                    }
                }
                if (var6_7 == var5_5.a()) break;
            }
            System.gc();
            var2_2.f = new b[var3_3.size()];
            var3_3.copyInto((Object[])var2_2.f);
        }
        catch (Exception var5_6) {
            var6_8 = var2_2.c.getHeight() >> 1;
            var7_10 = var4_4.a() + 2;
            var2_2.c.a("eror", "XML error", 10, var6_8, 0xFF0000, 986895, var4_4);
            var6_8 += var7_10;
            var8_12 = com.sk.jclient.ui.a.a(var5_6.getClass() + " : " + var5_6.getMessage(), var2_2.c.getWidth(), var4_4);
            if (var8_12 != null) {
                for (var9_14 = 0; var9_14 < var8_12.length; ++var9_14) {
                    var2_2.c.a("em", var8_12[var9_14], 10, var6_8, 0, 986895, var4_4);
                    var6_8 += var7_10;
                }
            }
            var2_2.c.a("em", var5_6.getMessage(), 10, var6_8, 0, 986895, var4_4);
        }
        System.gc();
        return var2_2;
    }

    private static final void a(com.sk.jclient.ui.components.a a2, a a3, Stack stack) {
        com.sk.jclient.ui.components.a a4;
        if (!stack.empty()) {
            if (stack.peek() instanceof n) {
                a4 = (n)stack.peek();
                ((n)a4).a(a2);
            } else if (stack.peek() instanceof f) {
                a4 = (f)stack.peek();
                if (a2 instanceof f) {
                    throw new IllegalArgumentException();
                }
                ((f)a4).a(a2);
            } else if (stack.peek() instanceof h) {
                a4 = (h)stack.peek();
                if (a2 instanceof h) {
                    throw new IllegalArgumentException();
                }
                ((h)a4).a(a2);
            }
        } else {
            a3.c.a(a2);
        }
        if (a2 instanceof n) {
            a4 = (n)a2;
            if ((a4.i & 0x4000) == 0 && a4.w == -1) {
                ((n)a4).b(a3.t, null);
                a4.i |= 0x8000;
            }
        }
    }

    public static final int a(String string) {
        int n2 = -1;
        if (string != null || string.length() == 0) {
            if (string.startsWith("##")) {
                string = string.substring(2);
            }
            try {
                n2 = Integer.parseInt(string, 16);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        return n2;
    }

    public static final boolean b(String string) {
        return string.toLowerCase().equals("true") || string.toLowerCase().equals("yes") || string.toLowerCase().equals("y");
    }

    public static final String[] a(String string, int n2, com.sk.jclient.ui.components.c c2) {
        if (n2 > -1) {
            if (c2 == null || string == null || n2 < 20) {
                return null;
            }
            if (com.sk.jclient.ui.components.c.a(string, c2) < n2) {
                return null;
            }
            Vector vector = com.sk.jclient.util.b.a(string, ' ');
            Vector<String> vector2 = new Vector<String>(10, 3);
            StringBuffer stringBuffer = new StringBuffer();
            try {
                int n3 = 0;
                while (true) {
                    String string2;
                    String string3 = (String)vector.elementAt(n3);
                    int n4 = stringBuffer.length();
                    int n5 = string3.indexOf("\\n");
                    boolean bl = false;
                    if (n5 != -1) {
                        string2 = null;
                        if (n5 != 0) {
                            string2 = string3.substring(0, n5);
                        }
                        if (n5 + 2 < string3.length()) {
                            string2 = string2 + string3.substring(n5 + 2);
                        }
                        if ((string3 = string2) == null) {
                            string3 = "";
                        }
                        bl = true;
                    }
                    if (n4 != 0 && !string3.equals("")) {
                        stringBuffer.append(" ");
                    }
                    stringBuffer.append(string3);
                    string2 = stringBuffer.toString();
                    if (com.sk.jclient.ui.components.c.a(string2, c2) > n2) {
                        if (n4 == 0) {
                            vector2.addElement(string2);
                            stringBuffer.delete(0, stringBuffer.length());
                            stringBuffer.setLength(0);
                        } else {
                            stringBuffer.delete(n4, stringBuffer.length());
                            vector2.addElement(stringBuffer.toString());
                            stringBuffer.delete(0, stringBuffer.length());
                            stringBuffer.setLength(0);
                            stringBuffer.append(string3);
                            bl = false;
                        }
                    }
                    if (bl) {
                        String string4;
                        Vector<String> vector3;
                        if (stringBuffer.length() != 0) {
                            vector3 = vector2;
                            string4 = stringBuffer.toString();
                        } else {
                            vector3 = vector2;
                            string4 = "";
                        }
                        vector3.addElement(string4);
                        stringBuffer.delete(0, n4);
                        stringBuffer.setLength(0);
                    }
                    ++n3;
                }
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                vector2.addElement(stringBuffer.toString());
                vector2.trimToSize();
                Object[] objectArray = new String[vector2.size()];
                vector2.copyInto(objectArray);
                return objectArray;
            }
        }
        return new String[]{string};
    }

    private static final void a(com.sk.jclient.util.b b2, a a2, Stack stack, boolean bl) {
        Object object;
        byte by;
        StringBuffer stringBuffer;
        String string = null;
        if (bl) {
            stringBuffer = new StringBuffer().append("listitem");
            byte by2 = l;
            by = by2;
            l = (byte)(by2 + 1);
        } else {
            stringBuffer = new StringBuffer().append("griditem");
            byte by3 = n;
            by = by3;
            n = (byte)(by3 + 1);
        }
        string = stringBuffer.append(by).toString();
        String string2 = null;
        int n2 = -1;
        int n3 = -1;
        int n4 = 0;
        int n5 = 0xFFFFFF;
        char c2 = '\u0000';
        char[] cArray = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        String string8 = null;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        for (int j = 0; j < b2.b(); ++j) {
            object = b2.a(j);
            if ("label".equals(object)) {
                string2 = b2.b(j);
                continue;
            }
            if ("name".equals(object)) {
                string = b2.b(j);
                continue;
            }
            if ("action".equals(object) || "onclick".equals(object)) {
                string8 = b2.b(j);
                continue;
            }
            if ("labelcolor".equals(object)) {
                n5 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("bgcolor".equals(object)) {
                n4 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("selectedlabelcolor".equals(object)) {
                n6 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("selectedbgcolor".equals(object)) {
                n7 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("icon".equals(object)) {
                string4 = b2.b(j);
                continue;
            }
            if ("selectedicon".equals(object)) {
                string5 = b2.b(j);
                continue;
            }
            if ("bgimage".equals(object)) {
                string6 = b2.b(j);
                continue;
            }
            if ("selectedbgimage".equals(object)) {
                string7 = b2.b(j);
                continue;
            }
            if ("font".equals(object)) {
                string3 = b2.b(j);
                continue;
            }
            if ("fontstyle".equals(object)) {
                cArray = b2.b(j).toCharArray();
                continue;
            }
            if ("fontsize".equals(object)) {
                c2 = b2.b(j).charAt(0);
                continue;
            }
            if ("drawborder".equals(object)) {
                if (!com.sk.jclient.ui.a.b(b2.b(j))) continue;
                n8 |= 0x20;
                continue;
            }
            if ("w".equals(object)) {
                try {
                    n2 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if (!"h".equals(object)) continue;
            try {
                n3 = Integer.parseInt(b2.b(j));
                continue;
            }
            catch (NumberFormatException numberFormatException) {}
        }
        b b3 = new b(string2, 4, 0, string8, null, null);
        object = com.sk.jclient.ui.a.a(string3, c2, cArray);
        e e2 = new e(string, string2, a2.c, 0, 0, n2, n3, b3, string6, string4, string7, string5, (com.sk.jclient.ui.components.c)object);
        new e(string, string2, a2.c, 0, 0, n2, n3, b3, string6, string4, string7, string5, (com.sk.jclient.ui.components.c)object).w = n4;
        e2.t = n5;
        e2.u = n6;
        e2.v = n7;
        e2.i |= n8;
        com.sk.jclient.ui.a.a(e2, a2, stack);
    }

    private static final void a(com.sk.jclient.util.b b2, a a2, Stack stack, byte by) {
        Object object;
        Object object2;
        int n2;
        Boolean bl;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        com.sk.jclient.ui.components.c c2;
        Object object12;
        char[] cArray;
        char c3;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        block54: {
            int n12;
            block55: {
                byte by2;
                StringBuffer stringBuffer;
                n11 = 0;
                n10 = 0;
                n9 = -1;
                n8 = -1;
                n7 = -1;
                n6 = -1;
                n5 = -1;
                n4 = 0;
                n3 = 0;
                c3 = 's';
                cArray = new char[]{'p'};
                object12 = null;
                c2 = null;
                object11 = null;
                object10 = null;
                object9 = null;
                object8 = null;
                object7 = null;
                object6 = null;
                object5 = null;
                object4 = null;
                object3 = null;
                bl = null;
                n2 = 0;
                switch (by) {
                    case 2: {
                        stringBuffer = new StringBuffer().append("checkbox");
                        byte by3 = p;
                        by2 = by3;
                        p = (byte)(by3 + 1);
                        break;
                    }
                    case 3: {
                        byte by4 = g;
                        g = (byte)(by4 + 1);
                        object11 = "image" + by4;
                        break block54;
                    }
                    case 4: {
                        byte by5 = h;
                        h = (byte)(by5 + 1);
                        object11 = "label" + by5;
                        n12 = 0 | 0x40000;
                        break block55;
                    }
                    default: {
                        stringBuffer = new StringBuffer().append("button");
                        byte by6 = r;
                        by2 = by6;
                        r = (byte)(by6 + 1);
                    }
                }
                object11 = stringBuffer.append(by2).toString();
                n12 = 2;
            }
            n2 = n12;
        }
        for (int j = 0; j < b2.b(); ++j) {
            object2 = b2.a(j);
            object = b2.b(j);
            if ("y".equals(object2)) {
                try {
                    n10 = Integer.parseInt((String)object);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("x".equals(object2)) {
                try {
                    n11 = Integer.parseInt((String)object);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("w".equals(object2)) {
                try {
                    n9 = Integer.parseInt((String)object);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("h".equals(object2)) {
                try {
                    n8 = Integer.parseInt((String)object);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("labelcolor".equals(object2) || "textcolor".equals(object2)) {
                try {
                    n4 = com.sk.jclient.ui.a.a((String)object);
                }
                catch (NumberFormatException numberFormatException) {
                    n4 = 0;
                }
                continue;
            }
            if ("bgcolor".equals(object2)) {
                try {
                    n5 = com.sk.jclient.ui.a.a((String)object);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("selectedbgcolor".equals(object2)) {
                try {
                    n7 = com.sk.jclient.ui.a.a((String)object);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("selectedlabelcolor".equals(object2)) {
                try {
                    n6 = com.sk.jclient.ui.a.a((String)object);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("text".equals(object2) || "label".equals(object2)) {
                object7 = object;
                continue;
            }
            if ("bgimage".equals(object2) || "src".equals(object2)) {
                object6 = object;
                continue;
            }
            if ("selectedbgimage".equals(object2)) {
                object5 = object;
                continue;
            }
            if ("icon".equals(object2)) {
                object4 = object;
                continue;
            }
            if ("selectedicon".equals(object2)) {
                object3 = object;
                continue;
            }
            if ("font".equals(object2)) {
                object12 = object;
                continue;
            }
            if ("fontstyle".equals(object2)) {
                cArray = ((String)object).toCharArray();
                continue;
            }
            if ("fontsize".equals(object2)) {
                char[] cArray2 = ((String)object).toCharArray();
                c3 = cArray2[0];
                continue;
            }
            if ("name".equals(object2)) {
                object11 = object;
                continue;
            }
            if ("action".equals(object2) || "onclick".equals(object2)) {
                object10 = object;
                continue;
            }
            if ("oncomplete".equals(object2)) {
                object9 = object;
                continue;
            }
            if ("onerror".equals(object2)) {
                object8 = object;
                continue;
            }
            if ("focusable".equals(object2)) {
                if (com.sk.jclient.ui.a.b((String)object)) {
                    n2 |= 2;
                    continue;
                }
                n2 &= 0xFFFFFFFD;
                continue;
            }
            if ("wrap".equals(object2)) {
                if (com.sk.jclient.ui.a.b((String)object)) {
                    n2 |= 0x40000;
                    continue;
                }
                n2 &= 0xFFFBFFFF;
                continue;
            }
            if ("drawborder".equals(object2)) {
                if (!com.sk.jclient.ui.a.b((String)object)) continue;
                n2 |= 0x20;
                continue;
            }
            if ("drawcarat".equals(object2)) {
                if (!com.sk.jclient.ui.a.b((String)object)) continue;
                n2 |= 0x1000;
                continue;
            }
            if ("autoscroll".equals(object2)) {
                if (!com.sk.jclient.ui.a.b((String)object)) continue;
                n2 |= 0x44;
                continue;
            }
            if ("selectedfont".equals(object2)) {
                c2 = com.sk.jclient.ui.a.a((String)object, c3, cArray);
                continue;
            }
            if ("align".equals(object2)) {
                if ("center".equals(object)) {
                    n3 = 2;
                    continue;
                }
                if (!"right".equals(object)) continue;
                n3 = 1;
                continue;
            }
            if (!"check".equals(object2)) continue;
            bl = com.sk.jclient.ui.a.b(b2.b(j)) ? com.sk.jclient.ui.components.a.g : com.sk.jclient.ui.components.a.h;
        }
        if (object7 == null) {
            object7 = "";
        }
        com.sk.jclient.ui.components.c c4 = null;
        c4 = object12 == null && a != null ? a : com.sk.jclient.ui.a.a(object12, c3, cArray);
        (object12 == null && a != null ? a : com.sk.jclient.ui.a.a(object12, c3, cArray)).a = n4;
        if (object7 == null) {
            object7 = "";
        }
        object2 = new b((String)object7, 4, 0, (String)object10, (String)object9, (String)object8);
        object = new e((String)object11, (String)object7, a2.c, n11, n10, n9, n8, (b)((Object)((Object)object2)), (String)object6, (String)object4, (String)object5, (String)object3, c4);
        new e((String)object11, (String)object7, a2.c, n11, n10, n9, n8, (b)((Object)((Object)object2)), (String)object6, (String)object4, (String)object5, (String)object3, c4).b = c2;
        ((e)object).a = by;
        ((com.sk.jclient.ui.components.a)object).w = n5;
        ((com.sk.jclient.ui.components.a)object).t = n4;
        ((com.sk.jclient.ui.components.a)object).u = n6;
        ((com.sk.jclient.ui.components.a)object).v = n7;
        ((com.sk.jclient.ui.components.a)object).i |= n2;
        ((e)object).E = bl;
        ((e)object).C = n3;
        com.sk.jclient.ui.a.a((com.sk.jclient.ui.components.a)object, a2, stack);
    }

    private static final void a(com.sk.jclient.util.b b2, Stack stack) {
        int n2 = -1;
        int n3 = 0;
        int n4 = 329200;
        int n5 = 240;
        int n6 = 0;
        int n7 = 0;
        int n8 = -1;
        int n9 = -1;
        int n10 = -1;
        int n11 = 2;
        String string = null;
        q = (byte)(q + 1);
        String string2 = "container" + q;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        String string7 = null;
        String string8 = null;
        boolean bl = false;
        int n12 = 262144;
        for (int j = 0; j < b2.b(); ++j) {
            int n13;
            block50: {
                int n14;
                int n15;
                block47: {
                    String string9;
                    String string10;
                    block48: {
                        block49: {
                            block46: {
                                string10 = b2.a(j);
                                string9 = b2.b(j);
                                if ("textcolor".equals(string10)) {
                                    try {
                                        n3 = Integer.parseInt(string9);
                                    }
                                    catch (NumberFormatException numberFormatException) {}
                                    continue;
                                }
                                if ("bgcolor".equals(string10)) {
                                    n2 = com.sk.jclient.ui.a.a(string9);
                                    continue;
                                }
                                if ("bordercolor".equals(string10)) {
                                    n10 = com.sk.jclient.ui.a.a(string9);
                                    continue;
                                }
                                if ("locationbar".equals(string10)) {
                                    n4 = com.sk.jclient.ui.a.a(string9);
                                    continue;
                                }
                                if ("scrollbarcolor".equals(string10)) {
                                    n5 = com.sk.jclient.ui.a.a(string9);
                                    continue;
                                }
                                if ("label".equals(string10)) {
                                    string8 = string9;
                                    continue;
                                }
                                if ("name".equals(string10)) {
                                    string2 = string9;
                                    continue;
                                }
                                if ("action".equals(string10) || "onclick".equals(string10)) {
                                    string5 = b2.b(j);
                                    continue;
                                }
                                if ("bgimage".equals(string10)) {
                                    string3 = b2.b(j);
                                    continue;
                                }
                                if ("selectedbgimage".equals(string10)) {
                                    string4 = b2.b(j);
                                    continue;
                                }
                                if ("oncomplete".equals(string10)) {
                                    string6 = b2.b(j);
                                    continue;
                                }
                                if ("onerror".equals(string10)) {
                                    string7 = b2.b(j);
                                    continue;
                                }
                                if ("lockscroll".equals(string10)) {
                                    bl = com.sk.jclient.ui.a.b(b2.b(j));
                                    continue;
                                }
                                if ("loopscroll".equals(string10)) {
                                    if (!com.sk.jclient.ui.a.b(b2.b(j))) continue;
                                    n12 |= 0x800000;
                                    continue;
                                }
                                if ("x".equals(string10)) {
                                    try {
                                        n6 = Integer.parseInt(string9);
                                    }
                                    catch (NumberFormatException numberFormatException) {}
                                    continue;
                                }
                                if ("y".equals(string10)) {
                                    try {
                                        n7 = Integer.parseInt(string9);
                                    }
                                    catch (NumberFormatException numberFormatException) {}
                                    continue;
                                }
                                if ("w".equals(string10)) {
                                    try {
                                        n8 = Integer.parseInt(string9);
                                    }
                                    catch (NumberFormatException numberFormatException) {}
                                    continue;
                                }
                                if ("h".equals(string10)) {
                                    try {
                                        n9 = Integer.parseInt(string9);
                                    }
                                    catch (NumberFormatException numberFormatException) {}
                                    continue;
                                }
                                if ("itemspace".equals(string10)) {
                                    try {
                                        n11 = Integer.parseInt(string9);
                                    }
                                    catch (NumberFormatException numberFormatException) {}
                                    continue;
                                }
                                if (!"displaymethod".equals(string10)) break block46;
                                if (!com.sk.jclient.ui.a.b(string9)) continue;
                                n15 = n12;
                                n14 = 8192;
                                break block47;
                            }
                            if ("scrolldistance".equals(string10)) {
                                string = string9;
                                continue;
                            }
                            if (!"wrap".equals(string10)) break block48;
                            if (!com.sk.jclient.ui.a.b(string9)) break block49;
                            n15 = n12;
                            n14 = 262144;
                            break block47;
                        }
                        n13 = n12 & 0xFFFBFFFF;
                        break block50;
                    }
                    if ("leftrightonly".equals(string10)) {
                        if (!com.sk.jclient.ui.a.b(string9)) continue;
                        n15 = n12;
                        n14 = 8192;
                    } else if ("focusable".equals(string10)) {
                        if (!com.sk.jclient.ui.a.b(string9)) continue;
                        n15 = n12;
                        n14 = 2;
                    } else if ("drawscrollbar".equals(string10)) {
                        if (!com.sk.jclient.ui.a.b(string9)) continue;
                        n15 = n12;
                        n14 = 65536;
                    } else if ("drawcarat".equals(string10)) {
                        if (!com.sk.jclient.ui.a.b(string9)) continue;
                        n15 = n12;
                        n14 = 4096;
                    } else {
                        if (!"drawborder".equals(string10) || !com.sk.jclient.ui.a.b(string9)) continue;
                        n15 = n12;
                        n14 = 32;
                    }
                }
                n13 = n15 | n14;
            }
            n12 = n13;
        }
        n n16 = new n(string2, n6, n7, n8, n9);
        new n(string2, n6, n7, n8, n9).a = n11;
        n16.s = n10;
        n16.b = n5;
        n16.C = n4;
        n16.j = string8;
        if (string != null) {
            n16.a("scrolldistance", string);
        }
        n16.a(bl);
        if (string3 != null) {
            n16.b(string3, string4);
        }
        n16.i |= n12;
        if (string5 != null) {
            n16.B = new b("", 4, 0, string5, string6, string7);
        }
        if (n3 != -1) {
            n16.t = n3;
        }
        if (n2 != -1) {
            n16.w = n2;
        }
        stack.push(n16);
    }

    private static final void b(com.sk.jclient.util.b b2, a a2, Stack stack, boolean bl) {
        Object object;
        byte by;
        StringBuffer stringBuffer;
        String string = null;
        if (bl) {
            stringBuffer = new StringBuffer().append("list");
            byte by2 = k;
            by = by2;
            k = (byte)(by2 + 1);
        } else {
            stringBuffer = new StringBuffer().append("grid");
            byte by3 = m;
            by = by3;
            m = (byte)(by3 + 1);
        }
        string = stringBuffer.append(by).toString();
        int n2 = 0;
        int n3 = 0;
        int n4 = -1;
        int n5 = -1;
        int n6 = 0;
        int n7 = -1;
        byte by4 = 0;
        int n8 = 5947119;
        boolean bl2 = false;
        String string2 = null;
        char c2 = '\u0000';
        char[] cArray = null;
        int n9 = 4;
        int n10 = 0;
        for (int j = 0; j < b2.b(); ++j) {
            object = b2.a(j);
            String string3 = b2.b(j);
            if ("x".equals(object)) {
                try {
                    n2 = Integer.parseInt(string3);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("y".equals(object)) {
                try {
                    n3 = Integer.parseInt(string3);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("name".equals(object)) {
                string = string3;
                continue;
            }
            if ("h".equals(object)) {
                try {
                    n5 = Integer.parseInt(string3);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("w".equals(object)) {
                try {
                    n4 = Integer.parseInt(string3);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("itemspace".equals(object)) {
                try {
                    by4 = Byte.parseByte(string3);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("length".equals(object)) {
                try {
                    n9 = Byte.parseByte(string3);
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("scrollbarcolor".equals(object)) {
                try {
                    n8 = com.sk.jclient.ui.a.a(string3);
                    n10 |= 0x10000;
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("font".equals(object)) {
                string2 = string3;
                continue;
            }
            if ("fontstyle".equals(object)) {
                cArray = string3.toCharArray();
                continue;
            }
            if ("leftrightonly".equals(object)) {
                if (!com.sk.jclient.ui.a.b(string3)) continue;
                n10 |= 0x2000;
                continue;
            }
            if ("fontsize".equals(object)) {
                c2 = string3.charAt(0);
                continue;
            }
            if ("autoscroll".equals(object)) {
                String string4 = string3;
                if (!string4.equals("true")) continue;
                n10 |= 0x40;
                bl2 = true;
                continue;
            }
            if ("wrap".equals(object)) {
                if (!com.sk.jclient.ui.a.b(string3)) continue;
                n10 |= 0x40000;
                continue;
            }
            if ("type".equals(object)) {
                if (!"h".equals(string3)) continue;
                n10 |= 0x2000;
                continue;
            }
            if ("drawborder".equals(object)) {
                if (!com.sk.jclient.ui.a.b(string3)) continue;
                n10 |= 0x20;
                continue;
            }
            if ("drawcarat".equals(object)) {
                if (!com.sk.jclient.ui.a.b(string3)) continue;
                n10 |= 0x1000;
                continue;
            }
            if ("selectedlabelcolor".equals(object)) {
                n7 = com.sk.jclient.ui.a.a(string3);
                continue;
            }
            if (!"labelcolor".equals(object)) continue;
            n6 = com.sk.jclient.ui.a.a(string3);
        }
        com.sk.jclient.ui.components.c c3 = com.sk.jclient.ui.a.a(string2, c2, cArray);
        object = new f(string, bl2, n4, n2, n3, n5, by4, n8, n6, n7, a2.c, c3);
        new f(string, bl2, n4, n2, n3, n5, by4, n8, n6, n7, a2.c, c3).b = n9;
        ((com.sk.jclient.ui.components.a)object).i |= n10;
        stack.push(object);
    }

    private static final void a(com.sk.jclient.util.b b2, a a2, Stack stack) {
        Object object;
        int n2 = 3;
        int n3 = 0xFFFFFF;
        int n4 = 0;
        int n5 = -1;
        int n6 = 0;
        int n7 = 0;
        int n8 = -1;
        int n9 = -1;
        byte by = o;
        o = (byte)(by + 1);
        String string = "ticker" + by;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        int n10 = 0;
        for (int j = 0; j < b2.b(); ++j) {
            int n11;
            int n12;
            object = b2.a(j);
            if ("speed".equals(object)) {
                try {
                    n2 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("y".equals(object)) {
                try {
                    n7 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("x".equals(object)) {
                try {
                    n6 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("w".equals(object)) {
                try {
                    n8 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("h".equals(object)) {
                try {
                    n9 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("bgcolor".equals(object)) {
                try {
                    n3 = com.sk.jclient.ui.a.a(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("textcolor".equals(object)) {
                try {
                    n4 = com.sk.jclient.ui.a.a(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("selectedbgcolor".equals(object)) {
                try {
                    n5 = com.sk.jclient.ui.a.a(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("name".equals(object)) {
                string = b2.b(j);
                continue;
            }
            if ("text".equals(object)) {
                string3 = b2.b(j);
                continue;
            }
            if ("src".equals(object)) {
                string2 = b2.b(j);
                continue;
            }
            if ("direction".equals(object)) {
                string4 = b2.b(j);
                continue;
            }
            if ("focusable".equals(object)) {
                if (!com.sk.jclient.ui.a.b(b2.b(j))) continue;
                n12 = n10;
                n11 = 2;
            } else if ("drawborder".equals(object)) {
                if (!com.sk.jclient.ui.a.b(b2.b(j))) continue;
                n12 = n10;
                n11 = 32;
            } else {
                if (!"drawcarat".equals(object) || !com.sk.jclient.ui.a.b(b2.b(j))) continue;
                n12 = n10;
                n11 = 4096;
            }
            n10 = n12 | n11;
        }
        h h2 = new h(string, n6, n7, n8, n9, n2, string4, a2.c);
        new h(string, n6, n7, n8, n9, n2, string4, a2.c).i = n10;
        h2.t = n4;
        h2.w = n3;
        if (n5 != -1) {
            h2.v = n5;
        }
        stack.push(h2);
        if (string3 == null && string2 == null) {
            return;
        }
        object = null;
        com.sk.jclient.ui.components.c c2 = com.sk.jclient.ui.a.a("s", 's', "p".toCharArray());
        if (string3 != null) {
            object = new e(string, string3, a2.c, 0, 0, -1, -1, null, null, null, null, null, c2);
        } else if (string2 != null) {
            try {
                string3 = new String(com.sk.jclient.g.h.e(string2));
            }
            catch (Exception exception) {}
            object = new e(string, string3, a2.c, 0, 0, -1, -1, null, null, null, null, null, c2);
        }
        ((e)object).a = (byte)4;
        ((com.sk.jclient.ui.components.a)object).i &= 0xFFFBFFFF;
        ((com.sk.jclient.ui.components.a)object).w = n3;
        ((com.sk.jclient.ui.components.a)object).t = n4;
        com.sk.jclient.ui.a.a((com.sk.jclient.ui.components.a)object, a2, stack);
    }

    private static final void a(com.sk.jclient.util.b b2, a a2, Vector vector) {
        Object object;
        int n2 = 0;
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        int n6 = -1;
        int n7 = -1;
        byte by = s;
        s = (byte)(by + 1);
        String string = "gauge" + by;
        char c2 = '\u0000';
        char[] cArray = null;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        for (int j = 0; j < b2.b(); ++j) {
            object = b2.a(j);
            if ("value".equals(object)) {
                try {
                    n5 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("action".equals(object)) {
                string3 = b2.b(j);
                continue;
            }
            if ("oncomplete".equals(object)) {
                string4 = b2.b(j);
                continue;
            }
            if ("onerror".equals(object)) {
                string5 = b2.b(j);
                continue;
            }
            if ("bgcolor".equals(object)) {
                n4 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("bordercolor".equals(object)) {
                n6 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("barcolor".equals(object)) {
                n7 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("label".equals(object)) {
                string6 = b2.b(j);
                continue;
            }
            if ("name".equals(object)) {
                string = b2.b(j);
                continue;
            }
            if ("x".equals(object)) {
                try {
                    n2 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("y".equals(object)) {
                try {
                    n3 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("font".equals(object)) {
                string2 = b2.b(j);
                continue;
            }
            if ("fontstyle".equals(object)) {
                cArray = b2.b(j).toCharArray();
                continue;
            }
            if (!"fontsize".equals(object)) continue;
            c2 = b2.b(j).charAt(0);
        }
        b b3 = new b("progressBar", 1, 0, string3, string4, string5);
        vector.addElement(b3);
        object = com.sk.jclient.ui.a.a(string2, c2, cArray);
        a2.d = new d(string, string6, n2, n3, false, 100, n5, n7, n4, n6, a2.c, (com.sk.jclient.ui.components.c)object);
        if (n6 != -1) {
            a2.d.i |= 0x20;
        }
        a2.c.a(a2.d);
    }

    private static final void b(com.sk.jclient.util.b b2, a a2, Stack stack) {
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        int n5 = 50;
        int n6 = 0;
        int n7 = 0;
        byte by = j;
        j = (byte)(by + 1);
        String string = "scrollbar" + by;
        int n8 = 0;
        int n9 = 0;
        for (int j = 0; j < b2.b(); ++j) {
            String string2 = b2.a(j);
            if ("x".equals(string2)) {
                try {
                    n8 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("y".equals(string2)) {
                try {
                    n9 = Integer.parseInt(b2.b(j));
                }
                catch (NumberFormatException numberFormatException) {}
                continue;
            }
            if ("scrollbarcolor".equals(string2)) {
                n4 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("selectedlabelcolor".equals(string2)) {
                n3 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("labelcolor".equals(string2)) {
                n2 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("locationbar".equals(string2)) {
                n6 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if ("name".equals(string2)) {
                string = b2.b(j);
                continue;
            }
            if ("bordercolor".equals(string2)) {
                n7 = com.sk.jclient.ui.a.a(b2.b(j));
                continue;
            }
            if (!"h".equals(string2)) continue;
            try {
                n5 = Integer.parseInt(b2.b(j));
                continue;
            }
            catch (NumberFormatException numberFormatException) {}
        }
        com.sk.jclient.ui.components.b b3 = new com.sk.jclient.ui.components.b(string, n8, n9, n5, n2, n3, n4, n6, n7, a2.c, null);
        com.sk.jclient.ui.a.a(b3, a2, stack);
    }

    private static final void c(com.sk.jclient.util.b b2, a a2, Stack stack) {
        Object object;
        int n2;
        String string;
        char[] cArray;
        char c2;
        String string2;
        String string3;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        block35: {
            int n11;
            block34: {
                String string4;
                block33: {
                    n10 = 0;
                    n9 = 0xFFFFFF;
                    n8 = 0;
                    n7 = 0;
                    n6 = 0;
                    n5 = 0;
                    n4 = 0;
                    n3 = -1;
                    string4 = null;
                    byte by = i;
                    i = (byte)(by + 1);
                    string3 = "input" + by;
                    string2 = null;
                    c2 = '\u0000';
                    cArray = null;
                    string = null;
                    n2 = 0;
                    for (int i2 = 0; i2 < b2.b(); ++i2) {
                        int n12;
                        int n13;
                        object = b2.a(i2);
                        if ("x".equals(object)) {
                            try {
                                n5 = Integer.parseInt(b2.b(i2));
                            }
                            catch (NumberFormatException numberFormatException) {}
                            continue;
                        }
                        if ("y".equals(object)) {
                            try {
                                n4 = Integer.parseInt(b2.b(i2));
                            }
                            catch (NumberFormatException numberFormatException) {}
                            continue;
                        }
                        if ("maxchars".equals(object)) {
                            try {
                                n7 = Integer.parseInt(b2.b(i2));
                            }
                            catch (NumberFormatException numberFormatException) {}
                            continue;
                        }
                        if ("bgcolor".equals(object)) {
                            try {
                                n9 = com.sk.jclient.ui.a.a(b2.b(i2));
                            }
                            catch (NumberFormatException numberFormatException) {}
                            continue;
                        }
                        if ("bordercolor".equals(object)) {
                            try {
                                n8 = com.sk.jclient.ui.a.a(b2.b(i2));
                                n2 |= 0x1000;
                            }
                            catch (NumberFormatException numberFormatException) {}
                            continue;
                        }
                        if ("textcolor".equals(object)) {
                            try {
                                n10 = com.sk.jclient.ui.a.a(b2.b(i2));
                            }
                            catch (NumberFormatException numberFormatException) {}
                            continue;
                        }
                        if ("type".equals(object)) {
                            string4 = b2.b(i2);
                            continue;
                        }
                        if ("name".equals(object)) {
                            string3 = b2.b(i2);
                            continue;
                        }
                        if ("w".equals(object)) {
                            try {
                                n3 = Integer.parseInt(b2.b(i2));
                            }
                            catch (NumberFormatException numberFormatException) {}
                            continue;
                        }
                        if ("value".equals(object)) {
                            string2 = b2.b(i2);
                            continue;
                        }
                        if ("font".equals(object)) {
                            string = b2.b(i2);
                            continue;
                        }
                        if ("fontstyle".equals(object)) {
                            cArray = b2.b(i2).toCharArray();
                            continue;
                        }
                        if ("fontsize".equals(object)) {
                            c2 = b2.b(i2).charAt(0);
                            continue;
                        }
                        if ("drawborder".equals(object)) {
                            if (!com.sk.jclient.ui.a.b(b2.b(i2))) continue;
                            n13 = n2;
                            n12 = 32;
                        } else {
                            if (!"drawcarat".equals(object) || !com.sk.jclient.ui.a.b(b2.b(i2))) continue;
                            n13 = n2;
                            n12 = 4096;
                        }
                        n2 = n13 | n12;
                    }
                    n6 = 0;
                    if (!"password".equals(string4)) break block33;
                    n11 = 1;
                    break block34;
                }
                if (!"number".equals(string4)) break block35;
                n11 = 2;
            }
            n6 = n11;
        }
        com.sk.jclient.ui.components.c c3 = com.sk.jclient.ui.a.a(string, c2, cArray);
        object = new j(string3, string2, n6, n7, n5, n4, n3, n10, n9, n8, a2.c, c3);
        ((com.sk.jclient.ui.components.a)object).i |= n2;
        com.sk.jclient.ui.a.a((com.sk.jclient.ui.components.a)object, a2, stack);
    }

    /*
     * Unable to fully structure code
     */
    private static final synchronized com.sk.jclient.ui.components.c a(String var0, char var1_1, char[] var2_2) {
        if (var0 != null && var0.length() > 1) {
            try {
                return com.sk.jclient.ui.components.c.a(var0, com.sk.jclient.g.h);
            }
            catch (Exception v0) {
                if (com.sk.jclient.ui.a.a != null) {
                    return com.sk.jclient.ui.a.a;
                }
                com.sk.jclient.ui.a.a = com.sk.jclient.ui.components.c.a(64, 8, 0);
                return com.sk.jclient.ui.a.a;
            }
        }
        if (var0 == null && com.sk.jclient.ui.a.a != null) {
            return com.sk.jclient.ui.a.a;
        }
        var3_3 = 64;
        var4_4 = 8;
        var5_5 = 0;
        try {
            var6_6 = var0.charAt(0);
            switch (var6_6) {
                case 'm': {
                    v1 = 32;
                    break;
                }
                case 's': {
                    v1 = 0;
                    break;
                }
                default: {
                    v1 = 64;
                }
            }
            var3_3 = v1;
            switch (var1_1) {
                case 'l': {
                    v2 = 16;
                    break;
                }
                case 'm': {
                    v2 = 0;
                    break;
                }
                default: {
                    v2 = 8;
                }
            }
            var4_4 = v2;
            var5_5 = 0;
            for (var7_7 = 0; var7_7 < var2_2.length; ++var7_7) {
                switch (var2_2[var7_7]) {
                    case 'b': {
                        v3 = 1;
                        ** GOTO lbl50
                    }
                    case 'i': {
                        v4 = var5_5;
                        v5 = 2;
                        ** GOTO lbl49
                    }
                    case 'u': {
                        v4 = var5_5;
                        v5 = 4;
lbl49:
                        // 2 sources

                        v3 = v4 | v5;
lbl50:
                        // 2 sources

                        var5_5 = v3;
                    }
                }
            }
        }
        catch (Exception v6) {}
        return com.sk.jclient.ui.components.c.a(var3_3, var4_4, var5_5);
    }
}
