package net.minecraft.src;
/*   1:    */ import com.google.common.base.Charsets;
/*   2:    */ import com.google.common.collect.Iterators;
/*   3:    */ import com.google.common.collect.Lists;
/*   4:    */ import com.google.common.collect.Maps;
/*   5:    */ import com.google.common.io.Files;
/*   6:    */ import com.google.gson.Gson;
/*   7:    */ import com.google.gson.GsonBuilder;
/*   8:    */ import com.mojang.authlib.Agent;
/*   9:    */ import com.mojang.authlib.GameProfile;
/*  12:    */ import java.io.BufferedReader;
/*  13:    */ import java.io.BufferedWriter;
/*  14:    */ import java.io.File;
/*  15:    */ import java.io.FileNotFoundException;
/*  16:    */ import java.io.IOException;
/*  17:    */ import java.lang.reflect.ParameterizedType;
/*  18:    */ import java.text.SimpleDateFormat;
/*  19:    */ import java.util.ArrayList;
/*  20:    */ import java.util.Calendar;
/*  21:    */ import java.util.Date;
/*  22:    */ import java.util.LinkedList;
/*  23:    */ import java.util.List;
/*  24:    */ import java.util.Locale;
/*  25:    */ import java.util.Map;
/*  26:    */ import java.util.UUID;
/*  27:    */ import net.minecraft.server.MinecraftServer;
/*  28:    */ import org.apache.commons.io.IOUtils;
/*  29:    */ 
/*  30:    */ public class ry
/*  31:    */ {
/*  32: 26 */   public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
/*  33: 27 */   private final Map<String,sb> c = Maps.newHashMap();
/*  34: 28 */   private final Map<UUID,sb> d = Maps.newHashMap();
/*  35: 29 */   private final LinkedList<GameProfile> e = Lists.newLinkedList();
/*  36:    */   private final MinecraftServer f;
/*  37:    */   protected final Gson b;
/*  38:    */   private final File g;
/*  39:    */   
/*  40:    */   public ry(MinecraftServer paramMinecraftServer, File paramFile)
/*  41:    */   {
/*  42: 35 */     this.f = paramMinecraftServer;
/*  43: 36 */     this.g = paramFile;
/*  44:    */     
/*  45: 38 */     GsonBuilder localGsonBuilder = new GsonBuilder();
/*  46: 39 */     localGsonBuilder.registerTypeHierarchyAdapter(sb.class, new sc(this, null));
/*  47: 40 */     this.b = localGsonBuilder.create();
/*  48:    */     
/*  49: 42 */     b();
/*  50:    */   }
/*  51:    */   
/*  52:    */   private static GameProfile a(MinecraftServer paramMinecraftServer, String paramString)
/*  53:    */   {
/*  54: 46 */     GameProfile[] arrayOfGameProfile = new GameProfile[1];
/*  55: 47 */     rz localrz = new rz(arrayOfGameProfile);
/*  56:    */     
/*  57:    */ 
/*  58:    */ 
/*  59:    */ 
/*  60:    */ 
/*  61:    */ 
/*  62:    */ 
/*  63:    */ 
/*  64:    */ 
/*  65:    */ 
/*  66:    */ 
/*  67: 59 */     paramMinecraftServer.aC().findProfilesByNames(new String[] { paramString }, Agent.MINECRAFT, localrz);
/*  68: 60 */     if ((!paramMinecraftServer.ae()) && (arrayOfGameProfile[0] == null))
/*  69:    */     {
/*  70: 61 */       UUID localUUID = EntityPlayer.a(new GameProfile(null, paramString));
/*  71: 62 */       GameProfile localGameProfile = new GameProfile(localUUID, paramString);
/*  72: 63 */       localrz.onProfileLookupSucceeded(localGameProfile);
/*  73:    */     }
/*  74: 65 */     return arrayOfGameProfile[0];
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a(GameProfile paramGameProfile)
/*  78:    */   {
/*  79: 69 */     a(paramGameProfile, null);
/*  80:    */   }
/*  81:    */   
/*  82:    */   private void a(GameProfile paramGameProfile, Date paramDate)
/*  83:    */   {
/*  84: 73 */     UUID localUUID = paramGameProfile.getId();
/*  85: 74 */     if (paramDate == null)
/*  86:    */     {
/*  87: 75 */       Calendar localObject = Calendar.getInstance();
/*  88: 76 */       ((Calendar)localObject).setTime(new Date());
/*  89: 77 */       ((Calendar)localObject).add(2, 1);
/*  90: 78 */       paramDate = ((Calendar)localObject).getTime();
/*  91:    */     }
/*  92: 80 */     String localObject = paramGameProfile.getName().toLowerCase(Locale.ROOT);
/*  93: 81 */     sb localsb1 = new sb(this, paramGameProfile, paramDate, null);
/*  94: 82 */     if (this.d.containsKey(localUUID))
/*  95:    */     {
/*  96: 83 */       sb localsb2 = (sb)this.d.get(localUUID);
/*  97: 84 */       this.c.remove(localsb2.a().getName().toLowerCase(Locale.ROOT));
/*  98: 85 */       this.c.put(paramGameProfile.getName().toLowerCase(Locale.ROOT), localsb1);
/*  99: 86 */       this.e.remove(paramGameProfile);
/* 100:    */     }
/* 101:    */     else
/* 102:    */     {
/* 103: 88 */       this.d.put(localUUID, localsb1);
/* 104: 89 */       this.c.put(localObject, localsb1);
/* 105:    */     }
/* 106: 91 */     this.e.addFirst(paramGameProfile);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public GameProfile a(String paramString)
/* 110:    */   {
/* 111: 95 */     String str = paramString.toLowerCase(Locale.ROOT);
/* 112: 96 */     sb localsb = (sb)this.c.get(str);
/* 113: 99 */     if ((localsb != null) && (new Date().getTime() >= sb.a(localsb).getTime()))
/* 114:    */     {
/* 115:100 */       this.d.remove(localsb.a().getId());
/* 116:101 */       this.c.remove(localsb.a().getName().toLowerCase(Locale.ROOT));
/* 117:102 */       this.e.remove(localsb.a());
/* 118:103 */       localsb = null;
/* 119:    */     }
/* 120:    */     GameProfile localGameProfile;
/* 121:106 */     if (localsb != null)
/* 122:    */     {
/* 123:108 */       localGameProfile = localsb.a();
/* 124:109 */       this.e.remove(localGameProfile);
/* 125:110 */       this.e.addFirst(localGameProfile);
/* 126:    */     }
/* 127:    */     else
/* 128:    */     {
/* 129:112 */       localGameProfile = a(this.f, str);
/* 130:113 */       if (localGameProfile != null)
/* 131:    */       {
/* 132:114 */         a(localGameProfile);
/* 133:115 */         localsb = (sb)this.c.get(str);
/* 134:    */       }
/* 135:    */     }
/* 136:118 */     c();
/* 137:119 */     return localsb == null ? null : localsb.a();
/* 138:    */   }
/* 139:    */   
/* 140:    */   public String[] a()
/* 141:    */   {
/* 142:123 */     ArrayList<String> localArrayList = Lists.newArrayList(this.c.keySet());
/* 143:124 */     return (String[])localArrayList.toArray(new String[localArrayList.size()]);
/* 144:    */   }
/* 145:    */   
/* 146:    */   public GameProfile a(UUID paramUUID)
/* 147:    */   {
/* 148:128 */     sb localsb = (sb)this.d.get(paramUUID);
/* 149:129 */     return localsb == null ? null : localsb.a();
/* 150:    */   }
/* 151:    */   
/* 152:    */   private sb b(UUID paramUUID)
/* 153:    */   {
/* 154:133 */     sb localsb = (sb)this.d.get(paramUUID);
/* 155:134 */     if (localsb != null)
/* 156:    */     {
/* 157:136 */       GameProfile localGameProfile = localsb.a();
/* 158:137 */       this.e.remove(localGameProfile);
/* 159:138 */       this.e.addFirst(localGameProfile);
/* 160:    */     }
/* 161:140 */     return localsb;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void b()
/* 165:    */   {
/* 166:144 */     List<sb> localList = null;
/* 167:145 */     BufferedReader localBufferedReader = null;
/* 168:    */     try
/* 169:    */     {
/* 170:147 */       localBufferedReader = Files.newReader(this.g, Charsets.UTF_8);
/* 171:148 */       localList = this.b.fromJson(localBufferedReader, h);
/* 172:    */     }
/* 173:    */     catch (FileNotFoundException localFileNotFoundException)
/* 174:    */     {
/* 175:    */       return;
/* 176:    */     }
/* 177:    */     finally
/* 178:    */     {
/* 179:152 */       IOUtils.closeQuietly(localBufferedReader);
/* 180:    */     }
/* 181:154 */     if (localList != null)
/* 182:    */     {
/* 183:155 */       this.c.clear();
/* 184:156 */       this.d.clear();
/* 185:157 */       this.e.clear();
/* 186:    */       
/* 187:    */ 
/* 188:160 */       localList = Lists.reverse(localList);
/* 189:161 */       for (sb localsb : localList) {
/* 190:162 */         if (localsb != null) {
/* 191:163 */           a(localsb.a(), localsb.b());
/* 192:    */         }
/* 193:    */       }
/* 194:    */     }
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void c()
/* 198:    */   {
/* 199:170 */     String str = this.b.toJson(a(1000));
/* 200:171 */     BufferedWriter localBufferedWriter = null;
/* 201:    */     try
/* 202:    */     {
/* 203:173 */       localBufferedWriter = Files.newWriter(this.g, Charsets.UTF_8);
/* 204:174 */       localBufferedWriter.write(str);
/* 205:    */     }
/* 206:    */     catch (FileNotFoundException localFileNotFoundException) {}catch (IOException localIOException) {}finally
/* 207:    */     {
/* 208:180 */       IOUtils.closeQuietly(localBufferedWriter);
/* 209:    */     }
/* 210:    */   }
/* 211:    */   
/* 212:    */   private List<sb> a(int paramInt)
/* 213:    */   {
/* 214:185 */     ArrayList<sb> localArrayList1 = Lists.newArrayList();
/* 215:186 */     ArrayList<GameProfile> localArrayList2 = Lists.newArrayList(Iterators.limit(this.e.iterator(), paramInt));
/* 216:187 */     for (GameProfile localGameProfile : localArrayList2)
/* 217:    */     {
/* 218:188 */       sb localsb = b(localGameProfile.getId());
/* 219:189 */       if (localsb != null) {
/* 220:192 */         localArrayList1.add(localsb);
/* 221:    */       }
/* 222:    */     }
/* 223:194 */     return localArrayList1;
/* 224:    */   }
/* 225:    */   
/* 226:262 */   private static final ParameterizedType h = new sa();
/* 227:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ry
 * JD-Core Version:    0.7.0.1
 */