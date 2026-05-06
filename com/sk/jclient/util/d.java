package com.sk.jclient.util;

import com.sk.jclient.util.c;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class d {
    final String a;
    final int b;

    d(String string, String string2, int n, byte[] byArray) {
        this.a = string;
        this.b = c.a(byArray);
    }

    static final synchronized Vector a() {
        Vector vector = new Vector();
        String[] stringArray = new String[]{"CA/", "CH/"};
        for (int i = 0; i < stringArray.length; ++i) {
            Vector vector2 = c.i(stringArray[i]);
            Enumeration enumeration = vector2.elements();
            while (enumeration.hasMoreElements()) {
                vector.addElement(enumeration.nextElement());
            }
        }
        return vector;
    }

    static {
        new Hashtable();
    }
}
