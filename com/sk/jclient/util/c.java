package com.sk.jclient.util;

import com.sk.jclient.Main;
import com.sk.jclient.g;
import com.sk.jclient.util.a;
import com.sk.jclient.util.d;
import com.sk.jclient.util.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class c {
    static final Hashtable a = new Hashtable();
    private static f b;
    private static final StringBuffer c;
    private Hashtable d = new Hashtable();
    private static Image e;
    private RecordStore f = null;
    private static String g;

    public static final String a(String string) {
        int n = string.indexOf("://");
        if (n > -1) {
            return string.substring(0, n);
        }
        if (string.startsWith("/")) {
            return "/";
        }
        return "";
    }

    public static final String b(String string) {
        int n = string.indexOf(":///");
        if (n > -1) {
            return string.substring(n + 4);
        }
        if (string.startsWith("/")) {
            return string.substring(1);
        }
        if (string.startsWith("http")) {
            return string.substring(7);
        }
        if (string.startsWith("https")) {
            return string.substring(8);
        }
        return string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static final long a() throws IOException {
        long l;
        FileConnection fileConnection = null;
        try {
            fileConnection = (FileConnection)Connector.open((String)Main.l.j);
            l = fileConnection.availableSize();
        }
        catch (Throwable throwable) {
            try {
                fileConnection.close();
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            fileConnection.close();
        }
        catch (Exception exception) {}
        return l;
    }

    private static void k(String string) {
        int n = string.lastIndexOf(47);
        if (n != -1) {
            g = string.substring(0, n + 1);
        }
    }

    public static final String c(String string) {
        if (string.startsWith("/") || string.startsWith("http") || string.startsWith("https") || string.startsWith("file") || string.startsWith("rs")) {
            return string;
        }
        if (string.startsWith("..")) {
            int n = 0;
            String string2 = g.substring(0, g.length() - 1);
            if (!string2.equals("") && !string2.endsWith("//")) {
                n = string2.lastIndexOf(47);
                return g.substring(0, n) + string.substring(2);
            }
            throw new NullPointerException("The directory ../ does not exist");
        }
        return g + string;
    }

    public final byte[] d(String string) throws IOException, IllegalArgumentException {
        String string2 = com.sk.jclient.util.c.a(string);
        if (string2.equals("http")) {
            throw new IllegalArgumentException("Remote SKML not supported in this release");
        }
        if (!string2.equals("")) {
            com.sk.jclient.util.c.k(string);
            return this.e(string);
        }
        String string3 = com.sk.jclient.util.c.c(string);
        com.sk.jclient.util.c.k(string3);
        return this.e(string3);
    }

    public final byte[] e(String string) throws IOException, IllegalArgumentException {
        String string2 = com.sk.jclient.util.c.a(string);
        byte[] byArray = null;
        if ("file".equals(string2)) {
            byArray = com.sk.jclient.util.c.f(com.sk.jclient.util.c.b(string));
        } else {
            if ("http".equals(string2) || "https".equals(string2)) {
                throw new IllegalArgumentException();
            }
            if ("rs".equals(string2) || "/".equals(string2)) {
                String string3 = com.sk.jclient.util.c.b(string);
                try {
                    byArray = com.sk.jclient.util.c.g(string3);
                }
                catch (RecordStoreException recordStoreException) {
                    byArray = com.sk.jclient.util.c.f(string3);
                }
            } else {
                byArray = this.e(com.sk.jclient.util.c.c(string));
            }
        }
        return byArray;
    }

    public c() {
        try {
            e = Image.createImage((String)"/o.png");
        }
        catch (IOException iOException) {}
        b = new f(this);
        b.start();
        this.c();
    }

    public static void a(boolean bl) {
        b.a();
        b = null;
        if (bl) {
            a.clear();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static final byte[] f(String string) throws IOException {
        Object object;
        if (string.startsWith("ca/")) {
            object = new StringBuffer(string);
            ((StringBuffer)object).setCharAt(0, Character.toUpperCase(((StringBuffer)object).charAt(0)));
            ((StringBuffer)object).setCharAt(1, Character.toUpperCase(((StringBuffer)object).charAt(1)));
            string = ((StringBuffer)object).toString();
        }
        object = null;
        byte[] byArray = null;
        byte[] byArray2 = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int n;
            if (!string.startsWith("/")) {
                string = "/" + string;
            }
            object = string.getClass().getResourceAsStream(string);
            while ((n = ((InputStream)object).read(byArray2)) != -1) {
                byteArrayOutputStream.write(byArray2, 0, n);
            }
            byArray = byteArrayOutputStream.toByteArray();
        }
        catch (NullPointerException nullPointerException) {
            try {
                throw new IOException("Resource " + string + " missing");
            }
            catch (Throwable throwable) {
                try {
                    ((InputStream)object).close();
                    byteArrayOutputStream.close();
                    throw throwable;
                }
                catch (Exception exception) {}
                throw throwable;
            }
        }
        try {
            ((InputStream)object).close();
            byteArrayOutputStream.close();
            return byArray;
        }
        catch (Exception exception) {
            return byArray;
        }
    }

    public final synchronized Image a(String string, a a2) {
        if (a.containsKey(string)) {
            Image image = (Image)a.get(string);
            a2.a((byte)3, string, image);
            return image;
        }
        if (a.containsKey(string.toLowerCase())) {
            Image image = (Image)a.get(string.toLowerCase());
            a2.a((byte)3, string, image);
            return image;
        }
        if (b == null) {
            b = new f(this);
            b.start();
        }
        b.a(string, a2);
        return e;
    }

    public static final boolean a(Image image) {
        return image != null && image.equals(e);
    }

    private final void b() {
        try {
            this.f = RecordStore.openRecordStore((String)"dlData", (boolean)true);
            return;
        }
        catch (RecordStoreException recordStoreException) {
            try {
                this.f = RecordStore.openRecordStore((String)"dlData", (boolean)true);
                return;
            }
            catch (RecordStoreException recordStoreException2) {
                return;
            }
        }
    }

    public final void a(String string, byte[] byArray) {
        a.remove(string);
        this.b(string, byArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private final void b(String string, byte[] byArray) {
        FileConnection fileConnection = null;
        OutputStream outputStream = null;
        fileConnection = this.a(string, Main.l.j);
        outputStream = fileConnection.openDataOutputStream();
        outputStream.write(byArray);
        try {
            if (outputStream != null) {
                outputStream.close();
            }
            fileConnection.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
        catch (IOException iOException) {
            try {}
            catch (Throwable throwable) {
                try {
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    fileConnection.close();
                }
                catch (Exception exception) {}
                throw throwable;
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                fileConnection.close();
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public final void a(String string, InputStream inputStream, int n) {
        int n2;
        FileConnection fileConnection = null;
        OutputStream outputStream = null;
        fileConnection = this.a(string, "");
        outputStream = fileConnection.openDataOutputStream();
        byte[] byArray = new byte[2048];
        int n3 = 0;
        while ((n2 = inputStream.read(byArray)) != -1) {
            outputStream.write(byArray, 0, n2);
            n3 += n2;
            if (com.sk.jclient.g.b.d == null || n <= 100) continue;
            com.sk.jclient.g.b.d.d(n3 * com.sk.jclient.g.b.d.a / n);
        }
        try {
            if (outputStream != null) {
                outputStream.close();
            }
            fileConnection.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
        catch (IOException iOException) {
            try {}
            catch (Throwable throwable) {
                try {
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    fileConnection.close();
                }
                catch (Exception exception) {}
                throw throwable;
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                fileConnection.close();
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
    }

    private FileConnection a(String string, String string2) throws IOException {
        FileConnection fileConnection;
        FileConnection fileConnection2;
        block3: {
            block2: {
                String string3;
                FileConnection fileConnection3;
                block0: {
                    block1: {
                        fileConnection2 = null;
                        fileConnection3 = null;
                        int n = string.lastIndexOf(47);
                        String string4 = n != -1 ? string.substring(0, n) : "";
                        string3 = string2 + string;
                        String string5 = string2 + string4;
                        fileConnection3 = (FileConnection)Connector.open((String)string5);
                        if (!fileConnection3.exists()) break block0;
                        fileConnection3.close();
                        fileConnection2 = (FileConnection)Connector.open((String)string3);
                        if (!fileConnection2.exists()) break block1;
                        fileConnection2.delete();
                        break block2;
                    }
                    fileConnection = fileConnection2;
                    break block3;
                }
                fileConnection3.close();
                com.sk.jclient.util.c.l(string3);
                fileConnection2 = (FileConnection)Connector.open((String)string3);
            }
            fileConnection = fileConnection2;
        }
        fileConnection.create();
        return fileConnection2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private static synchronized void l(String string) {
        String string2 = com.sk.jclient.util.c.b(string);
        try {
            String string3;
            int n;
            String string4 = string2.substring(0, string2.lastIndexOf(47) + 1);
            StringBuffer stringBuffer = new StringBuffer(string4);
            StringBuffer stringBuffer2 = new StringBuffer("/");
            while ((n = (string3 = stringBuffer.toString()).indexOf(47)) != -1) {
                String string5;
                block14: {
                    FileConnection fileConnection;
                    block13: {
                        string5 = string3.substring(0, n + 1);
                        stringBuffer2.append(string5);
                        String string6 = stringBuffer2.toString();
                        fileConnection = null;
                        fileConnection = (FileConnection)Connector.open((String)("file://" + string6));
                        if (fileConnection.exists()) break block13;
                        fileConnection.mkdir();
                    }
                    try {
                        fileConnection.close();
                    }
                    catch (Exception exception) {}
                    break block14;
                    catch (IOException iOException) {
                        try {}
                        catch (Throwable throwable) {
                            try {
                                fileConnection.close();
                            }
                            catch (Exception exception) {}
                            throw throwable;
                        }
                        try {
                            fileConnection.close();
                        }
                        catch (Exception exception) {}
                    }
                }
                stringBuffer.delete(0, string5.length());
            }
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {}
    }

    static synchronized byte[] g(String string) throws RecordStoreException {
        try {
            if (string.startsWith("ca/")) {
                StringBuffer stringBuffer = new StringBuffer(string);
                stringBuffer.setCharAt(0, Character.toUpperCase(stringBuffer.charAt(0)));
                stringBuffer.setCharAt(1, Character.toUpperCase(stringBuffer.charAt(1)));
                string = stringBuffer.toString();
            }
            return com.sk.jclient.util.c.n(Main.l.j + string);
        }
        catch (IOException iOException) {
            throw new RecordStoreException();
        }
    }

    final void h(String string) {
        this.m(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private final void m(String string) {
        String string2;
        block26: {
            FileConnection fileConnection;
            block24: {
                block25: {
                    block23: {
                        if (string == null) {
                            return;
                        }
                        a.remove(string);
                        c.setLength(0);
                        if (!string.startsWith(Main.l.j)) {
                            c.append(Main.l.j);
                        }
                        c.append(string);
                        fileConnection = null;
                        fileConnection = (FileConnection)Connector.open((String)c.toString());
                        if (!fileConnection.exists()) break block23;
                        fileConnection.delete();
                    }
                    try {
                        fileConnection.close();
                    }
                    catch (Exception exception) {}
                    break block25;
                    catch (IOException iOException) {
                        try {}
                        catch (Throwable throwable) {
                            try {
                                fileConnection.close();
                            }
                            catch (Exception exception) {}
                            throw throwable;
                        }
                        try {
                            fileConnection.close();
                        }
                        catch (Exception exception) {}
                    }
                }
                int n = c.toString().lastIndexOf(47);
                c.delete(n, c.length());
                string2 = c.toString();
                fileConnection = (FileConnection)Connector.open((String)string2);
                Enumeration enumeration = fileConnection.list();
                if (!enumeration.hasMoreElements()) break block24;
                throw new IOException(string2 + " not empty");
            }
            try {
                fileConnection.close();
            }
            catch (Exception exception) {}
            break block26;
            catch (IOException iOException) {
                try {}
                catch (Throwable throwable) {
                    try {
                        fileConnection.close();
                    }
                    catch (Exception exception) {}
                    throw throwable;
                }
                try {
                    fileConnection.close();
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
        }
        if (c.toString().equals(Main.l.j)) {
            return;
        }
        this.m(string2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    static final Vector i(String string) {
        Vector vector;
        block14: {
            FileConnection fileConnection;
            block13: {
                fileConnection = null;
                vector = new Vector();
                fileConnection = (FileConnection)Connector.open((String)(Main.l.j + string));
                if (!fileConnection.exists()) break block13;
                Enumeration enumeration = fileConnection.list();
                fileConnection.close();
                while (enumeration.hasMoreElements()) {
                    Object object;
                    String string2 = (String)enumeration.nextElement();
                    fileConnection = (FileConnection)Connector.open((String)(Main.l.j + string + string2));
                    if (fileConnection.isDirectory()) {
                        fileConnection.close();
                        object = com.sk.jclient.util.c.i(string + string2);
                        for (int i = 0; i < ((Vector)object).size(); ++i) {
                            vector.addElement(((Vector)object).elementAt(i));
                        }
                        continue;
                    }
                    fileConnection.close();
                    object = string + string2;
                    byte[] byArray = com.sk.jclient.util.c.n(Main.l.j + (String)object);
                    d d2 = new d((String)object, null, 0, byArray);
                    vector.addElement(d2);
                }
            }
            try {
                fileConnection.close();
            }
            catch (Exception exception) {}
            break block14;
            catch (IOException iOException) {
                try {}
                catch (Throwable throwable) {
                    try {
                        fileConnection.close();
                    }
                    catch (Exception exception) {}
                    throw throwable;
                }
                try {
                    fileConnection.close();
                }
                catch (Exception exception) {}
            }
        }
        return vector;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte[] n(String string) throws IOException {
        FileConnection fileConnection = null;
        DataInputStream dataInputStream = null;
        byte[] byArray = null;
        byte[] byArray2 = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int n;
            fileConnection = (FileConnection)Connector.open((String)string);
            dataInputStream = fileConnection.openDataInputStream();
            while ((n = ((InputStream)dataInputStream).read(byArray2)) != -1) {
                byteArrayOutputStream.write(byArray2, 0, n);
            }
            byArray = byteArrayOutputStream.toByteArray();
        }
        catch (Throwable throwable) {
            try {
                if (dataInputStream != null) {
                    ((InputStream)dataInputStream).close();
                }
                byteArrayOutputStream.close();
                fileConnection.close();
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            if (dataInputStream != null) {
                ((InputStream)dataInputStream).close();
            }
            byteArrayOutputStream.close();
            fileConnection.close();
        }
        catch (Exception exception) {}
        return byArray;
    }

    public static final void b(boolean bl) {
        if (bl) {
            a.clear();
        }
        b.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private final synchronized void c() {
        this.b();
        int n = this.f.getNextRecordID();
        for (int i = 1; i < n; i += 2) {
            try {
                String string = new String(this.f.getRecord(i));
                this.d.put(string, new Integer(i));
                continue;
            }
            catch (InvalidRecordIDException invalidRecordIDException) {}
        }
        try {
            this.f.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
        catch (RecordStoreException recordStoreException) {
            try {}
            catch (Throwable throwable) {
                try {
                    this.f.closeRecordStore();
                }
                catch (Exception exception) {}
                throw throwable;
            }
            try {
                this.f.closeRecordStore();
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
    }

    public static synchronized void a(String string, Object object) {
        if (string.endsWith(".png")) {
            byte[] byArray = (byte[])object;
            object = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        }
        com.sk.jclient.util.f.a(b, (byte)3, string, object);
    }

    public final String a(byte by) {
        Closeable closeable;
        Closeable closeable2;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        byte[] byArray = null;
        try {
            byArray = com.sk.jclient.util.c.g("counter");
            closeable2 = new ByteArrayInputStream(byArray);
            closeable = new DataInputStream((InputStream)closeable2);
            n = ((DataInputStream)closeable).readShort();
            n2 = ((DataInputStream)closeable).readShort();
            n3 = ((DataInputStream)closeable).readShort();
            n4 = ((DataInputStream)closeable).readShort();
            n5 = ((DataInputStream)closeable).readShort();
            ((FilterInputStream)closeable).close();
            ((ByteArrayInputStream)closeable2).close();
        }
        catch (Exception exception) {}
        switch (by) {
            case 116: {
                n = (short)(n + 1);
                break;
            }
            case 117: {
                n2 = (short)(n2 + 1);
                break;
            }
            case 118: {
                n3 = (short)(n3 + 1);
                break;
            }
            case 119: {
                n4 = (short)(n4 + 1);
                break;
            }
            case 120: {
                n5 = (short)(n5 + 1);
                break;
            }
            case 121: {
                return com.sk.jclient.util.c.a(n, n2, n4);
            }
        }
        try {
            closeable2 = new ByteArrayOutputStream();
            closeable = new DataOutputStream((OutputStream)closeable2);
            ((DataOutputStream)closeable).writeShort(n);
            ((DataOutputStream)closeable).writeShort(n2);
            ((DataOutputStream)closeable).writeShort(n3);
            ((DataOutputStream)closeable).writeShort(n4);
            ((DataOutputStream)closeable).writeShort(n5);
            byArray = ((ByteArrayOutputStream)closeable2).toByteArray();
            ((FilterOutputStream)closeable).close();
            ((ByteArrayOutputStream)closeable2).close();
            this.a("counter", byArray);
        }
        catch (IOException iOException) {}
        return null;
    }

    private static String a(int n, int n2, int n3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int n4 = calendar.get(1);
        int n5 = calendar.get(2) + 1;
        int n6 = calendar.get(5);
        String string = Integer.toString(n5);
        if (n5 < 10) {
            string = "0" + string;
        }
        String string2 = n4 + string + n6;
        String string3 = "<counts>\n     <val date=\"" + string2 + "\" type=\"SMS\" total=\"" + n2 + "\"/>\n" + "     <val date=\"" + string2 + "\" type=\"MMS\" total=\"" + 0 + "\"/>\n" + "     <val date=\"" + string2 + "\" type=\"Voice\" total=\"" + 0 + "\"/>\n" + "     <val date=\"" + string2 + "\" type=\"ICMENU\" total=\"" + n3 + "\"/>\n" + "     <val date=\"" + string2 + "\" type=\"WAP\" total=\"" + n + "\"/>\n" + "</counts>";
        return string3;
    }

    public static final boolean j(String string) {
        return string.endsWith(".png") || string.endsWith(".jpg") || string.endsWith(".gif") || string.endsWith(".bmp");
    }

    static final int a(byte[] byArray) {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < byArray.length) {
            n3 = com.sk.jclient.util.c.a(byArray, n);
            n2 ^= n3;
            n4 = n + 4;
        }
        return n2;
    }

    private static final int a(byte[] byArray, int n) {
        int n2 = 0;
        for (int i = 0; i < 4; ++i) {
            n2 <<= 8;
            if (n + i >= byArray.length) {
                return n2;
            }
            n2 |= byArray[n + i];
        }
        return n2;
    }

    static {
        c = new StringBuffer();
        g = "/";
    }
}
