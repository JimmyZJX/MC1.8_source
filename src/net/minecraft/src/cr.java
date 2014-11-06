package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Sets;

/*   4:    */ import java.util.ArrayList;
/*   5:    */ import java.util.Collection;
/*   6:    */ import java.util.HashMap;
/*   7:    */ import java.util.HashSet;
/*   8:    */ import java.util.List;
/*   9:    */ import java.util.Map;
/*  10:    */ import java.util.Random;
/*  11:    */ import java.util.Set;

/*  12:    */ import net.minecraft.server.MinecraftServer;
/*  13:    */ 
/*  14:    */ public class cr
/*  15:    */   extends CommandBase
/*  16:    */ {
/*  17:    */   public String c()
/*  18:    */   {
/*  19: 34 */     return "spreadplayers";
/*  20:    */   }
/*  21:    */   
/*  22:    */   public int a()
/*  23:    */   {
/*  24: 39 */     return 2;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public String c(ICommandSender paramae)
/*  28:    */   {
/*  29: 44 */     return "commands.spreadplayers.usage";
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void a(ICommandSender paramae, String[] paramArrayOfString) throws CommandException
/*  33:    */   {
/*  34: 49 */     if (paramArrayOfString.length < 6) {
/*  35: 50 */       throw new WrongUsageException("commands.spreadplayers.usage", new Object[0]);
/*  36:    */     }
/*  37: 53 */     int i = 0;
/*  38: 54 */     BlockPosition localdt = paramae.c();
/*  39: 55 */     double d1 = b(localdt.getX(), paramArrayOfString[(i++)], true);
/*  40: 56 */     double d2 = b(localdt.getZ(), paramArrayOfString[(i++)], true);
/*  41: 57 */     double d3 = a(paramArrayOfString[(i++)], 0.0D);
/*  42: 58 */     double d4 = a(paramArrayOfString[(i++)], d3 + 1.0D);
/*  43: 59 */     boolean bool = d(paramArrayOfString[(i++)]);
/*  44:    */     
/*  45: 61 */     ArrayList<qw> localArrayList = Lists.newArrayList();
/*  46: 62 */     while (i < paramArrayOfString.length)
/*  47:    */     {
/*  48: 63 */       String str = paramArrayOfString[(i++)];
/*  49:    */       
/*  50: 65 */       if (ah.b(str))
/*  51:    */       {
/*  52: 66 */         List localObject = ah.b(paramae, str, Entity.class);
/*  53: 68 */         if (((List)localObject).size() == 0) {
/*  54: 69 */           throw new dj();
/*  55:    */         }
/*  56: 72 */         localArrayList.addAll((Collection)localObject);
/*  57:    */       }
/*  58:    */       else
/*  59:    */       {
/*  60: 74 */         qw localObject = MinecraftServer.M().an().a(str);
/*  61: 76 */         if (localObject == null) {
/*  62: 77 */           throw new dm();
/*  63:    */         }
/*  64: 80 */         localArrayList.add(localObject);
/*  65:    */       }
/*  66:    */     }
/*  67: 84 */     paramae.a(ag.c, localArrayList.size());
/*  68: 85 */     if (localArrayList.isEmpty()) {
/*  69: 86 */       throw new dj();
/*  70:    */     }
/*  71: 89 */     paramae.a(new hz("commands.spreadplayers.spreading." + (bool ? "teams" : "players"), new Object[] { Integer.valueOf(localArrayList.size()), Double.valueOf(d4), Double.valueOf(d1), Double.valueOf(d2), Double.valueOf(d3) }));
/*  72:    */     
/*  73: 91 */     a(paramae, localArrayList, new cs(d1, d2), d3, d4, ((Entity)localArrayList.get(0)).world, bool);
/*  74:    */   }
/*  75:    */   
/*  76:    */   private void a(ICommandSender paramae, List paramList, cs paramcs, double paramDouble1, double paramDouble2, World paramaqu, boolean paramBoolean) throws CommandException
/*  77:    */   {
/*  78: 95 */     Random localRandom = new Random();
/*  79: 96 */     double d1 = paramcs.a - paramDouble2;
/*  80: 97 */     double d2 = paramcs.b - paramDouble2;
/*  81: 98 */     double d3 = paramcs.a + paramDouble2;
/*  82: 99 */     double d4 = paramcs.b + paramDouble2;
/*  83:    */     
/*  84:101 */     cs[] arrayOfcs = a(localRandom, paramBoolean ? b(paramList) : paramList.size(), d1, d2, d3, d4);
/*  85:102 */     int i = a(paramcs, paramDouble1, paramaqu, localRandom, d1, d2, d3, d4, arrayOfcs, paramBoolean);
/*  86:103 */     double d5 = a(paramList, paramaqu, arrayOfcs, paramBoolean);
/*  87:    */     
/*  88:105 */     a(paramae, this, "commands.spreadplayers.success." + (paramBoolean ? "teams" : "players"), new Object[] { Integer.valueOf(arrayOfcs.length), Double.valueOf(paramcs.a), Double.valueOf(paramcs.b) });
/*  89:106 */     if (arrayOfcs.length > 1) {
/*  90:107 */       paramae.a(new hz("commands.spreadplayers.info." + (paramBoolean ? "teams" : "players"), new Object[] { String.format("%.2f", new Object[] { Double.valueOf(d5) }), Integer.valueOf(i) }));
/*  91:    */     }
/*  92:    */   }
/*  93:    */   
/*  94:    */   private int b(List<Entity> paramList)
/*  95:    */   {
/*  96:112 */     HashSet localHashSet = Sets.newHashSet();
/*  97:114 */     for (Entity localwv : paramList) {
/*  98:115 */       if ((localwv instanceof EntityPlayer)) {
/*  99:116 */         localHashSet.add(((EntityPlayer)localwv).bN());
/* 100:    */       } else {
/* 101:118 */         localHashSet.add(null);
/* 102:    */       }
/* 103:    */     }
/* 104:122 */     return localHashSet.size();
/* 105:    */   }
/* 106:    */   
/* 107:    */   private int a(cs paramcs, double paramDouble1, World paramaqu, Random paramRandom, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, cs[] paramArrayOfcs, boolean paramBoolean) throws CommandException
/* 108:    */   {
/* 109:126 */     int i = 1;
/* 110:    */     
/* 111:128 */     double d1 = 3.402823466385289E+038D;
				  int j;
/* 112:130 */     for (j = 0; (j < 10000) && (i != 0); j++)
/* 113:    */     {
/* 114:131 */       i = 0;
/* 115:132 */       d1 = 3.402823466385289E+038D;
/* 116:    */       int n;
/* 117:    */       cs localcs2;
/* 118:134 */       for (int k = 0; k < paramArrayOfcs.length; k++)
/* 119:    */       {
/* 120:135 */         cs localcs1 = paramArrayOfcs[k];
/* 121:136 */         n = 0;
/* 122:137 */         localcs2 = new cs();
/* 123:139 */         for (int i1 = 0; i1 < paramArrayOfcs.length; i1++) {
/* 124:140 */           if (k != i1)
/* 125:    */           {
/* 126:143 */             cs localcs3 = paramArrayOfcs[i1];
/* 127:    */             
/* 128:145 */             double d3 = localcs1.a(localcs3);
/* 129:146 */             d1 = Math.min(d3, d1);
/* 130:147 */             if (d3 < paramDouble1)
/* 131:    */             {
/* 132:148 */               n++;
/* 133:149 */               localcs2.a += localcs3.a - localcs1.a;
/* 134:150 */               localcs2.b += localcs3.b - localcs1.b;
/* 135:    */             }
/* 136:    */           }
/* 137:    */         }
/* 138:154 */         if (n > 0)
/* 139:    */         {
/* 140:155 */           localcs2.a /= n;
/* 141:156 */           localcs2.b /= n;
/* 142:157 */           double d2 = localcs2.b();
/* 143:159 */           if (d2 > 0.0D)
/* 144:    */           {
/* 145:160 */             localcs2.a();
/* 146:    */             
/* 147:162 */             localcs1.b(localcs2);
/* 148:    */           }
/* 149:    */           else
/* 150:    */           {
/* 151:164 */             localcs1.a(paramRandom, paramDouble2, paramDouble3, paramDouble4, paramDouble5);
/* 152:    */           }
/* 153:167 */           i = 1;
/* 154:    */         }
/* 155:170 */         if (localcs1.a(paramDouble2, paramDouble3, paramDouble4, paramDouble5)) {
/* 156:171 */           i = 1;
/* 157:    */         }
/* 158:    */       }
/* 159:175 */       if (i == 0) {
/* 160:176 */         for (cs localcs3 : paramArrayOfcs) {
/* 161:177 */           if (!localcs3.b(paramaqu))
/* 162:    */           {
/* 163:178 */             localcs3.a(paramRandom, paramDouble2, paramDouble3, paramDouble4, paramDouble5);
/* 164:179 */             i = 1;
/* 165:    */           }
/* 166:    */         }
/* 167:    */       }
/* 168:    */     }
/* 169:185 */     if (j >= 10000) {
/* 170:186 */       throw new CommandException("commands.spreadplayers.failure." + (paramBoolean ? "teams" : "players"), new Object[] { Integer.valueOf(paramArrayOfcs.length), Double.valueOf(paramcs.a), Double.valueOf(paramcs.b), String.format("%.2f", new Object[] { Double.valueOf(d1) }) });
/* 171:    */     }
/* 172:189 */     return j;
/* 173:    */   }
/* 174:    */   
/* 175:    */   private double a(List paramList, World paramaqu, cs[] paramArrayOfcs, boolean paramBoolean)
/* 176:    */   {
/* 177:193 */     double d1 = 0.0D;
/* 178:194 */     int i = 0;
/* 179:195 */     HashMap localHashMap = Maps.newHashMap();
/* 180:197 */     for (int j = 0; j < paramList.size(); j++)
/* 181:    */     {
/* 182:198 */       Entity localwv = (Entity)paramList.get(j);
/* 183:    */       cs localcs;
/* 184:201 */       if (paramBoolean)
/* 185:    */       {
/* 186:202 */         Object localObject = (localwv instanceof EntityPlayer) ? ((EntityPlayer)localwv).bN() : null;
/* 187:204 */         if (!localHashMap.containsKey(localObject)) {
/* 188:205 */           localHashMap.put(localObject, paramArrayOfcs[(i++)]);
/* 189:    */         }
/* 190:208 */         localcs = (cs)localHashMap.get(localObject);
/* 191:    */       }
/* 192:    */       else
/* 193:    */       {
/* 194:210 */         localcs = paramArrayOfcs[(i++)];
/* 195:    */       }
/* 196:213 */       localwv.setPosition(MathUtils.floor(localcs.a) + 0.5F, localcs.a(paramaqu), MathUtils.floor(localcs.b) + 0.5D);
/* 197:    */       
/* 198:215 */       double d2 = 1.7976931348623157E+308D;
/* 199:216 */       for (int k = 0; k < paramArrayOfcs.length; k++) {
/* 200:217 */         if (localcs != paramArrayOfcs[k])
/* 201:    */         {
/* 202:221 */           double d3 = localcs.a(paramArrayOfcs[k]);
/* 203:222 */           d2 = Math.min(d3, d2);
/* 204:    */         }
/* 205:    */       }
/* 206:224 */       d1 += d2;
/* 207:    */     }
/* 208:227 */     d1 /= paramList.size();
/* 209:228 */     return d1;
/* 210:    */   }
/* 211:    */   
/* 212:    */   private cs[] a(Random paramRandom, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
/* 213:    */   {
/* 214:232 */     cs[] arrayOfcs = new cs[paramInt];
/* 215:234 */     for (int i = 0; i < arrayOfcs.length; i++)
/* 216:    */     {
/* 217:235 */       cs localcs = new cs();
/* 218:236 */       localcs.a(paramRandom, paramDouble1, paramDouble2, paramDouble3, paramDouble4);
/* 219:237 */       arrayOfcs[i] = localcs;
/* 220:    */     }
/* 221:240 */     return arrayOfcs;
/* 222:    */   }
/* 223:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cr
 * JD-Core Version:    0.7.0.1
 */