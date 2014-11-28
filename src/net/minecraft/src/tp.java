package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import com.google.common.collect.Sets;
/*   3:    */ import com.google.gson.JsonElement;
/*   4:    */ import com.google.gson.JsonObject;
/*   5:    */ import com.google.gson.JsonParseException;
/*   6:    */ import com.google.gson.JsonParser;
/*   7:    */ import com.google.gson.JsonPrimitive;
/*   8:    */ import java.io.File;
/*   9:    */ import java.io.IOException;
/*  10:    */ import java.lang.reflect.Constructor;
/*  11:    */ import java.util.HashMap;
/*  12:    */ import java.util.HashSet;
/*  13:    */ import java.util.Map;
/*  14:    */ import java.util.Map.Entry;
/*  15:    */ import java.util.Set;
/*  16:    */ import net.minecraft.server.MinecraftServer;
/*  17:    */ import org.apache.commons.io.FileUtils;
/*  18:    */ import org.apache.logging.log4j.LogManager;
/*  19:    */ import org.apache.logging.log4j.Logger;
/*  20:    */ 
/*  21:    */ public class tp
/*  22:    */   extends tz
/*  23:    */ {
/*  24: 26 */   private static final Logger b = LogManager.getLogger();
/*  25:    */   private final MinecraftServer c;
/*  26:    */   private final File d;
/*  27: 30 */   private final Set<PlayerStat> e = Sets.newHashSet();
/*  28: 31 */   private int f = -300;
/*  29: 32 */   private boolean g = false;
/*  30:    */   
/*  31:    */   public tp(MinecraftServer paramMinecraftServer, File paramFile)
/*  32:    */   {
/*  33: 35 */     this.c = paramMinecraftServer;
/*  34: 36 */     this.d = paramFile;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void a()
/*  38:    */   {
/*  39: 40 */     if (this.d.isFile()) {
/*  40:    */       try
/*  41:    */       {
/*  42: 42 */         this.a.clear();
/*  43: 43 */         this.a.putAll(a(FileUtils.readFileToString(this.d)));
/*  44:    */       }
/*  45:    */       catch (IOException localIOException)
/*  46:    */       {
/*  47: 45 */         b.error("Couldn't read statistics file " + this.d, localIOException);
/*  48:    */       }
/*  49:    */       catch (JsonParseException localJsonParseException)
/*  50:    */       {
/*  51: 47 */         b.error("Couldn't parse statistics file " + this.d, localJsonParseException);
/*  52:    */       }
/*  53:    */     }
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void b()
/*  57:    */   {
/*  58:    */     try
/*  59:    */     {
/*  60: 54 */       FileUtils.writeStringToFile(this.d, a(this.a));
/*  61:    */     }
/*  62:    */     catch (IOException localIOException)
/*  63:    */     {
/*  64: 56 */       b.error("Couldn't save stats", localIOException);
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void a(EntityPlayer paramahd, PlayerStat paramtq, int paramInt)
/*  69:    */   {
/*  70: 62 */     int i = paramtq.d() ? a(paramtq) : 0;
/*  71: 63 */     super.a(paramahd, paramtq, paramInt);
/*  72: 64 */     this.e.add(paramtq);
/*  73: 66 */     if ((paramtq.d()) && (i == 0) && (paramInt > 0))
/*  74:    */     {
/*  75: 67 */       this.g = true;
/*  76: 68 */       if (this.c.az()) {
/*  77: 69 */         this.c.an().a(new hz("chat.type.achievement", new Object[] { paramahd.e_(), paramtq.j() }));
/*  78:    */       }
/*  79:    */     }
/*  80: 73 */     if ((paramtq.d()) && (i > 0) && (paramInt == 0))
/*  81:    */     {
/*  82: 74 */       this.g = true;
/*  83: 75 */       if (this.c.az()) {
/*  84: 76 */         this.c.an().a(new hz("chat.type.achievement.taken", new Object[] { paramahd.e_(), paramtq.j() }));
/*  85:    */       }
/*  86:    */     }
/*  87:    */   }
/*  88:    */   
/*  89:    */   public Set<PlayerStat> c()
/*  90:    */   {
/*  91: 82 */     HashSet<PlayerStat> localHashSet = Sets.newHashSet(this.e);
/*  92: 83 */     this.e.clear();
/*  93: 84 */     this.g = false;
/*  94: 85 */     return localHashSet;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public Map<PlayerStat,tw> a(String paramString)
/*  98:    */   {
/*  99: 89 */     JsonElement localJsonElement = new JsonParser().parse(paramString);
/* 100: 90 */     if (!localJsonElement.isJsonObject()) {
/* 101: 91 */       return Maps.newHashMap();
/* 102:    */     }
/* 103: 93 */     JsonObject localJsonObject1 = localJsonElement.getAsJsonObject();
/* 104: 94 */     HashMap<PlayerStat,tw> localHashMap = Maps.newHashMap();
/* 105: 96 */     for (Map.Entry<String,JsonElement> localEntry : localJsonObject1.entrySet())
/* 106:    */     {
/* 107: 97 */       PlayerStat localtq = StatList.a((String)localEntry.getKey());
/* 108: 99 */       if (localtq != null)
/* 109:    */       {
/* 110:100 */         tw localtw = new tw();
/* 111:102 */         if ((((JsonElement)localEntry.getValue()).isJsonPrimitive()) && (((JsonElement)localEntry.getValue()).getAsJsonPrimitive().isNumber()))
/* 112:    */         {
/* 113:103 */           localtw.a(((JsonElement)localEntry.getValue()).getAsInt());
/* 114:    */         }
/* 115:104 */         else if (((JsonElement)localEntry.getValue()).isJsonObject())
/* 116:    */         {
/* 117:105 */           JsonObject localJsonObject2 = ((JsonElement)localEntry.getValue()).getAsJsonObject();
/* 118:107 */           if ((localJsonObject2.has("value")) && (localJsonObject2.get("value").isJsonPrimitive()) && (localJsonObject2.get("value").getAsJsonPrimitive().isNumber())) {
/* 119:108 */             localtw.a(localJsonObject2.getAsJsonPrimitive("value").getAsInt());
/* 120:    */           }
/* 121:111 */           if ((localJsonObject2.has("progress")) && (localtq.l() != null)) {
/* 122:    */             try
/* 123:    */             {
/* 124:113 */               Constructor localConstructor = localtq.l().getConstructor(new Class[0]);
/* 125:114 */               tx localtx = (tx)localConstructor.newInstance(new Object[0]);
/* 126:115 */               localtx.a(localJsonObject2.get("progress"));
/* 127:116 */               localtw.a(localtx);
/* 128:    */             }
/* 129:    */             catch (Throwable localThrowable)
/* 130:    */             {
/* 131:118 */               b.warn("Invalid statistic progress in " + this.d, localThrowable);
/* 132:    */             }
/* 133:    */           }
/* 134:    */         }
/* 135:123 */         localHashMap.put(localtq, localtw);
/* 136:    */       }
/* 137:    */       else
/* 138:    */       {
/* 139:125 */         b.warn("Invalid statistic in " + this.d + ": Don't know what " + (String)localEntry.getKey() + " is");
/* 140:    */       }
/* 141:    */     }
/* 142:129 */     return localHashMap;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public static String a(Map<PlayerStat,tw> paramMap)
/* 146:    */   {
/* 147:133 */     JsonObject localJsonObject1 = new JsonObject();
/* 148:135 */     for (Map.Entry<PlayerStat,tw> localEntry : paramMap.entrySet()) {
/* 149:136 */       if (((tw)localEntry.getValue()).b() != null)
/* 150:    */       {
/* 151:137 */         JsonObject localJsonObject2 = new JsonObject();
/* 152:    */         
/* 153:139 */         localJsonObject2.addProperty("value", Integer.valueOf(((tw)localEntry.getValue()).a()));
/* 154:    */         try
/* 155:    */         {
/* 156:142 */           localJsonObject2.add("progress", ((tw)localEntry.getValue()).b().a());
/* 157:    */         }
/* 158:    */         catch (Throwable localThrowable)
/* 159:    */         {
/* 160:144 */           b.warn("Couldn't save statistic " + ((PlayerStat)localEntry.getKey()).e() + ": error serializing progress", localThrowable);
/* 161:    */         }
/* 162:147 */         localJsonObject1.add(((PlayerStat)localEntry.getKey()).e, localJsonObject2);
/* 163:    */       }
/* 164:    */       else
/* 165:    */       {
/* 166:149 */         localJsonObject1.addProperty(((PlayerStat)localEntry.getKey()).e, Integer.valueOf(((tw)localEntry.getValue()).a()));
/* 167:    */       }
/* 168:    */     }
/* 169:153 */     return localJsonObject1.toString();
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void d()
/* 173:    */   {
/* 174:157 */     for (PlayerStat localtq : this.a.keySet()) {
/* 175:158 */       this.e.add(localtq);
/* 176:    */     }
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void a(qw paramqw)
/* 180:    */   {
/* 181:163 */     int i = this.c.ar();
/* 182:164 */     HashMap localHashMap = Maps.newHashMap();
/* 183:166 */     if ((this.g) || (i - this.f > 300))
/* 184:    */     {
/* 185:167 */       this.f = i;
/* 186:169 */       for (PlayerStat localtq : c()) {
/* 187:170 */         localHashMap.put(localtq, Integer.valueOf(a(localtq)));
/* 188:    */       }
/* 189:    */     }
/* 190:174 */     paramqw.a.a(new is(localHashMap));
/* 191:    */   }
/* 192:    */   
/* 193:    */   public void b(qw paramqw)
/* 194:    */   {
/* 195:178 */     HashMap<PlayerStat,Integer> localHashMap = Maps.newHashMap();
/* 196:180 */     for (tk localtk : AchievementList.e) {
/* 197:181 */       if (a(localtk))
/* 198:    */       {
/* 199:182 */         localHashMap.put(localtk, Integer.valueOf(a((PlayerStat)localtk)));
/* 200:183 */         this.e.remove(localtk);
/* 201:    */       }
/* 202:    */     }
/* 203:187 */     paramqw.a.a(new is(localHashMap));
/* 204:    */   }
/* 205:    */   
/* 206:    */   public boolean e()
/* 207:    */   {
/* 208:191 */     return this.g;
/* 209:    */   }
/* 210:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     tp
 * JD-Core Version:    0.7.0.1
 */