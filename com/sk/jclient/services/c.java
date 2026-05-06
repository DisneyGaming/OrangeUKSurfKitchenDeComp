package com.sk.jclient.services;

import com.sk.jclient.a;
import com.sk.jclient.services.b;
import com.sk.jclient.services.d;
import com.sk.jclient.services.f;
import com.sk.jclient.services.g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VideoControl;
import javax.microedition.media.control.VolumeControl;

public final class c
implements d {
    private Player b;
    private VideoControl c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private static boolean i;
    private static boolean j;
    private com.sk.jclient.g k;
    private a l;
    private c m;
    public PlayerListener a = new f(this);

    public c() {
        this.m = this;
    }

    public final void a(a a2, com.sk.jclient.g g2) {
        block20: {
            block17: {
                block19: {
                    VolumeControl volumeControl;
                    block18: {
                        this.k = g2;
                        this.l = a2;
                        j = false;
                        if (a2.b.equals("play")) {
                            new b(this, a2).start();
                        } else if (a2.b.equals("playVideo")) {
                            new g(this, a2).start();
                        } else if (a2.b.equals("toggleFullScreen") && this.c != null) {
                            try {
                                if (!this.d) {
                                    this.c.setDisplayFullScreen(true);
                                    this.d = true;
                                } else {
                                    this.c.setDisplayFullScreen(false);
                                    this.d = false;
                                }
                            }
                            catch (MediaException mediaException) {}
                        }
                        if (!a2.b.equals("volUp") && !a2.b.equals("volDown")) break block17;
                        if (this.b == null) {
                            return;
                        }
                        volumeControl = (VolumeControl)this.b.getControl("VolumeControl");
                        if (!a2.b.equals("volUp")) break block18;
                        if (volumeControl == null || volumeControl.getLevel() >= 100) break block19;
                        volumeControl.setLevel((volumeControl.getLevel() + 10) % 100);
                        break block20;
                    }
                    if (a2.b.equals("volDown") && volumeControl != null && volumeControl.getLevel() > 10) {
                        volumeControl.setLevel(volumeControl.getLevel() - 10);
                    }
                }
                return;
            }
            if (a2.b.equals("togglePlayback")) {
                if (this.b == null) {
                    return;
                }
                try {
                    this.b.stop();
                    return;
                }
                catch (Exception exception) {
                    try {
                        this.b.start();
                        return;
                    }
                    catch (Exception exception2) {}
                }
            }
        }
    }

    public final void a() {
        j = true;
        this.c();
    }

    private final Player a(Player player, int n) throws MediaException {
        if (j) {
            throw new MediaException("playback cancelled");
        }
        player.realize();
        player.prefetch();
        try {
            player.setLoopCount(n);
        }
        catch (Exception exception) {}
        if (i) {
            this.l.f.c = (byte)(this.l.f.c | 1);
            this.c = (VideoControl)player.getControl("VideoControl");
            if (this.c != null) {
                this.c.initDisplayMode(1, (Object)this.l.f);
                if (this.g != 1 && this.h != -1) {
                    this.c.setDisplayLocation(this.g, this.h);
                }
                if (this.e != 1 && this.f != -1) {
                    this.c.setDisplaySize(this.e, this.f);
                } else {
                    this.c.setDisplayFullScreen(true);
                    this.d = true;
                }
                this.c.setVisible(true);
            }
        }
        player.start();
        return player;
    }

    private static final Player b(String string, String string2, PlayerListener playerListener) throws MediaException {
        Player player = null;
        String string3 = com.sk.jclient.util.c.a(string);
        String string4 = com.sk.jclient.util.c.b(string);
        String string5 = null;
        string5 = string2 != null && string2.trim().length() != 0 ? string2 : com.sk.jclient.services.c.a(string);
        try {
            if (string5.startsWith("video")) {
                i = true;
            }
            if (string3.equals("http") || string3.equals("https")) {
                player = Manager.createPlayer((String)string);
            } else if (string3.equals("file")) {
                player = Manager.createPlayer((InputStream)string4.getClass().getResourceAsStream("/" + string4), (String)string5);
            } else {
                byte[] byArray = com.sk.jclient.g.h.e(string);
                player = Manager.createPlayer((InputStream)new ByteArrayInputStream(byArray), (String)string5);
            }
        }
        catch (IOException iOException) {
            throw new MediaException("Unable to initplayer " + iOException.getMessage());
        }
        player.addPlayerListener(playerListener);
        return player;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void c() {
        try {
            if (this.c != null) {
                this.c.setVisible(false);
                this.c = null;
            }
            if (this.m.b != null) {
                this.m.b.removePlayerListener(this.a);
                this.m.b.close();
                this.m.b = null;
            }
            this.a = null;
        }
        catch (Exception exception) {
        }
        finally {
            System.gc();
        }
        com.sk.jclient.g.a(false, null);
        if (i) {
            this.l.f.c = (byte)(this.l.f.c & 0xFFFFFFFE);
            this.l.f.c = (byte)(this.l.f.c | 0x1A);
        }
        com.sk.jclient.g.a(this);
    }

    private static final String a(String string) {
        if (string.endsWith(".mid") || string.endsWith(".midi")) {
            return "audio/midi";
        }
        if (string.endsWith(".mp3")) {
            return "audio/mpeg";
        }
        if (string.endsWith(".wav")) {
            return "audio/x-wav";
        }
        if (string.endsWith(".3gp")) {
            return "video/3gpp";
        }
        if (string.endsWith(".mpg") || string.endsWith(".mpeg")) {
            return "video/mpeg";
        }
        return "";
    }

    static void a(c c2) {
        c2.c();
    }

    static a b(c c2) {
        return c2.l;
    }

    static boolean b() {
        return j;
    }

    static com.sk.jclient.g c(c c2) {
        return c2.k;
    }

    static c d(c c2) {
        return c2.m;
    }

    static Player a(c c2, Player player) {
        c2.b = player;
        return c2.b;
    }

    static Player a(String string, String string2, PlayerListener playerListener) throws MediaException {
        return com.sk.jclient.services.c.b(string, string2, playerListener);
    }

    static Player e(c c2) {
        return c2.b;
    }

    static Player a(c c2, Player player, int n) throws MediaException {
        return c2.a(player, n);
    }

    static int a(c c2, int n) {
        c2.g = n;
        return c2.g;
    }

    static int b(c c2, int n) {
        c2.h = n;
        return c2.h;
    }

    static int c(c c2, int n) {
        c2.e = n;
        return c2.e;
    }

    static int d(c c2, int n) {
        c2.f = n;
        return c2.f;
    }

    static boolean a(boolean bl) {
        i = bl;
        return i;
    }
}
