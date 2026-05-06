package com.sk.jclient;

import com.sk.jclient.ui.a;
import com.sk.jclient.ui.b;
import java.util.Vector;

public final class c {
    public static final com.sk.jclient.a a(b b2, a a2) {
        com.sk.jclient.a a3 = c.a(b2.a, a2);
        if (b2.b != null) {
            a3.d = c.a(b2.b, a2);
        }
        if (b2.c != null) {
            a3.e = c.a(b2.c, a2);
        }
        return a3;
    }

    public static final com.sk.jclient.a a(String string, a a2) {
        if (string != null) {
            if (string.startsWith("skdll")) {
                string = string.substring("skdll".length() + 1);
            }
            int n = string.indexOf(46);
            int n2 = string.indexOf(40);
            String string2 = string.substring(0, n);
            String string3 = null;
            String string4 = null;
            String[] stringArray = null;
            if (n2 < 0) {
                string3 = string.substring(n + 1);
            } else {
                string3 = string.substring(n + 1, n2);
                string4 = string.substring(n2 + 1, string.lastIndexOf(41));
                stringArray = c.b(string4, a2);
            }
            com.sk.jclient.a a3 = new com.sk.jclient.a(string2, string3, stringArray);
            return a3;
        }
        return null;
    }

    private static final String[] b(String string, a a2) {
        if (string.equals("")) {
            return null;
        }
        Object[] objectArray = null;
        try {
            int n = 0;
            Vector<String> vector = new Vector<String>();
            while (true) {
                boolean bl;
                block12: {
                    String string2;
                    Vector<String> vector2;
                    block11: {
                        String string3;
                        block10: {
                            bl = false;
                            string3 = null;
                            n = string.indexOf(",");
                            if (n != -1) {
                                string3 = string.substring(0, n);
                            } else if (string != null) {
                                string3 = string;
                                bl = true;
                            }
                            string3 = string3.trim();
                            if (!string3.startsWith("'")) break block10;
                            int n2 = string3.indexOf(39) + 1;
                            int n3 = string3.lastIndexOf(39);
                            vector2 = vector;
                            string2 = string3.substring(n2, n3);
                            break block11;
                        }
                        if (!string3.startsWith("$")) break block12;
                        if (a2 == null || a2.c == null) continue;
                        String string4 = string3.substring(1);
                        String string5 = a2.c.b(string4);
                        vector2 = vector;
                        string2 = string5;
                    }
                    vector2.addElement(string2);
                }
                string = string.substring(n + 1);
                if (bl) break;
            }
            objectArray = new String[vector.size()];
            vector.copyInto(objectArray);
        }
        catch (Exception exception) {}
        return objectArray;
    }
}
