package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import com.google.common.collect.Sets;

/*   4:    */ import java.util.Collection;
/*   5:    */ import java.util.HashSet;
/*   6:    */ import java.util.Iterator;
/*   7:    */ import java.util.List;
/*   8:    */ import java.util.Map;
/*   9:    */ import java.util.Set;
/*  10:    */ 
/*  11:    */ public class StatList
/*  12:    */ {
/*  13: 23 */   protected static Map<String,PlayerStat> a = Maps.newHashMap();
/*  14: 25 */   public static List<PlayerStat> b = Lists.newArrayList();
/*  15: 26 */   public static List<PlayerStat> c = Lists.newArrayList();
/*  16: 27 */   public static List<to> d = Lists.newArrayList();
/*  17: 28 */   public static List<to> e = Lists.newArrayList();
/*  18: 30 */   public static PlayerStat f = new tn("stat.leaveGame", new hz("stat.leaveGame", new Object[0])).i().h();
/*  19: 32 */   public static PlayerStat g = new tn("stat.playOneMinute", new hz("stat.playOneMinute", new Object[0]), PlayerStat.h).i().h();
/*  20: 33 */   public static PlayerStat h = new tn("stat.timeSinceDeath", new hz("stat.timeSinceDeath", new Object[0]), PlayerStat.h).i().h();
/*  21: 35 */   public static PlayerStat i = new tn("stat.walkOneCm", new hz("stat.walkOneCm", new Object[0]), PlayerStat.i).i().h();
/*  22: 36 */   public static PlayerStat j = new tn("stat.crouchOneCm", new hz("stat.crouchOneCm", new Object[0]), PlayerStat.i).i().h();
/*  23: 37 */   public static PlayerStat k = new tn("stat.sprintOneCm", new hz("stat.sprintOneCm", new Object[0]), PlayerStat.i).i().h();
/*  24: 38 */   public static PlayerStat l = new tn("stat.swimOneCm", new hz("stat.swimOneCm", new Object[0]), PlayerStat.i).i().h();
/*  25: 39 */   public static PlayerStat m = new tn("stat.fallOneCm", new hz("stat.fallOneCm", new Object[0]), PlayerStat.i).i().h();
/*  26: 40 */   public static PlayerStat n = new tn("stat.climbOneCm", new hz("stat.climbOneCm", new Object[0]), PlayerStat.i).i().h();
/*  27: 41 */   public static PlayerStat o = new tn("stat.flyOneCm", new hz("stat.flyOneCm", new Object[0]), PlayerStat.i).i().h();
/*  28: 42 */   public static PlayerStat p = new tn("stat.diveOneCm", new hz("stat.diveOneCm", new Object[0]), PlayerStat.i).i().h();
/*  29: 43 */   public static PlayerStat q = new tn("stat.minecartOneCm", new hz("stat.minecartOneCm", new Object[0]), PlayerStat.i).i().h();
/*  30: 44 */   public static PlayerStat r = new tn("stat.boatOneCm", new hz("stat.boatOneCm", new Object[0]), PlayerStat.i).i().h();
/*  31: 45 */   public static PlayerStat s = new tn("stat.pigOneCm", new hz("stat.pigOneCm", new Object[0]), PlayerStat.i).i().h();
/*  32: 46 */   public static PlayerStat t = new tn("stat.horseOneCm", new hz("stat.horseOneCm", new Object[0]), PlayerStat.i).i().h();
/*  33: 48 */   public static PlayerStat jump = new tn("stat.jump", new hz("stat.jump", new Object[0])).i().h();
/*  34: 49 */   public static PlayerStat v = new tn("stat.drop", new hz("stat.drop", new Object[0])).i().h();
/*  35: 51 */   public static PlayerStat w = new tn("stat.damageDealt", new hz("stat.damageDealt", new Object[0]), PlayerStat.j).h();
/*  36: 52 */   public static PlayerStat damageTaken = new tn("stat.damageTaken", new hz("stat.damageTaken", new Object[0]), PlayerStat.j).h();
/*  37: 53 */   public static PlayerStat y = new tn("stat.deaths", new hz("stat.deaths", new Object[0])).h();
/*  38: 54 */   public static PlayerStat z = new tn("stat.mobKills", new hz("stat.mobKills", new Object[0])).h();
/*  39: 55 */   public static PlayerStat A = new tn("stat.animalsBred", new hz("stat.animalsBred", new Object[0])).h();
/*  40: 56 */   public static PlayerStat B = new tn("stat.playerKills", new hz("stat.playerKills", new Object[0])).h();
/*  41: 57 */   public static PlayerStat fishCaught = new tn("stat.fishCaught", new hz("stat.fishCaught", new Object[0])).h();
/*  42: 58 */   public static PlayerStat junkFished = new tn("stat.junkFished", new hz("stat.junkFished", new Object[0])).h();
/*  43: 59 */   public static PlayerStat treasureFished = new tn("stat.treasureFished", new hz("stat.treasureFished", new Object[0])).h();
/*  44: 60 */   public static PlayerStat talkedToVillager = new tn("stat.talkedToVillager", new hz("stat.talkedToVillager", new Object[0])).h();
/*  45: 61 */   public static PlayerStat tradedWithVillager = new tn("stat.tradedWithVillager", new hz("stat.tradedWithVillager", new Object[0])).h();
/*  46: 63 */   public static final PlayerStat[] H = new PlayerStat[4096];
/*  47: 64 */   public static final PlayerStat[] I = new PlayerStat[32000];
/*  48: 65 */   public static final PlayerStat[] J = new PlayerStat[32000];
/*  49: 66 */   public static final PlayerStat[] K = new PlayerStat[32000];
/*  50:    */   
/*  51:    */   public static void a()
/*  52:    */   {
/*  53: 69 */     c();
/*  54: 70 */     d();
/*  55: 71 */     e();
/*  56: 72 */     b();
/*  57:    */     
/*  58: 74 */     AchievementList.a();
/*  59: 75 */     EntityList.a();
/*  60:    */   }
/*  61:    */   
/*  62:    */   private static void b()
/*  63:    */   {
/*  64: 79 */     HashSet<Item> localHashSet = Sets.newHashSet();
/*  65: 81 */     for (Iterator<aoo> localIterator = RecipeList.a().b().iterator(); localIterator.hasNext();)
/*  66:    */     {
/*  67: 81 */       aoo localObject = (aoo)localIterator.next();
/*  68: 82 */       if (localObject.b() != null) {
/*  69: 85 */         localHashSet.add(localObject.b().getItem());
/*  70:    */       }
/*  71:    */     }
/*  72:    */     
/*  73: 87 */     for (Iterator<ItemStack> localIterator = aok.a().b().values().iterator(); localIterator.hasNext();)
/*  74:    */     {
/*  75: 87 */       ItemStack localObject = localIterator.next();
/*  76: 88 */       localHashSet.add(localObject.getItem());
/*  77:    */     }
/*  78: 91 */     for (Iterator<Item> localIterator = localHashSet.iterator(); localIterator.hasNext();)
/*  79:    */     {
/*  80: 91 */       Item localObject = localIterator.next();
/*  81: 92 */       if (localObject != null)
/*  82:    */       {
/*  83: 96 */         int i1 = Item.b((Item)localObject);
/*  84: 97 */         String str = a((Item)localObject);
/*  85: 98 */         if (str != null) {
/*  86: 99 */           I[i1] = new to("stat.craftItem.", str, new hz("stat.craftItem", new Object[] { new ItemStack((Item)localObject).C() }), (Item)localObject).h();
/*  87:    */         }
/*  88:    */       }
/*  89:    */     }
/*  90:103 */     a(I);
/*  91:    */   }
/*  92:    */   
/*  93:    */   private static void c()
/*  94:    */   {
/*  95:107 */     for (BlockType localatr : BlockType.c)
/*  96:    */     {
/*  97:108 */       Item localalq = Item.fromBlock(localatr);
/*  98:109 */       if (localalq != null)
/*  99:    */       {
/* 100:113 */         int i1 = BlockType.a(localatr);
/* 101:114 */         String str = a(localalq);
/* 102:115 */         if ((str != null) && (localatr.I()))
/* 103:    */         {
/* 104:116 */           H[i1] = new to("stat.mineBlock.", str, new hz("stat.mineBlock", new Object[] { new ItemStack(localatr).C() }), localalq).h();
/* 105:117 */           e.add((to)H[i1]);
/* 106:    */         }
/* 107:    */       }
/* 108:    */     }
/* 109:121 */     a(H);
/* 110:    */   }
/* 111:    */   
/* 112:    */   private static void d()
/* 113:    */   {
/* 114:125 */     for (Item localalq : Item.e) {
/* 115:126 */       if (localalq != null)
/* 116:    */       {
/* 117:130 */         int i1 = Item.b(localalq);
/* 118:131 */         String str = a(localalq);
/* 119:132 */         if (str != null)
/* 120:    */         {
/* 121:133 */           J[i1] = new to("stat.useItem.", str, new hz("stat.useItem", new Object[] { new ItemStack(localalq).C() }), localalq).h();
/* 122:135 */           if (!(localalq instanceof aju)) {
/* 123:136 */             d.add((to)J[i1]);
/* 124:    */           }
/* 125:    */         }
/* 126:    */       }
/* 127:    */     }
/* 128:141 */     a(J);
/* 129:    */   }
/* 130:    */   
/* 131:    */   private static void e()
/* 132:    */   {
/* 133:145 */     for (Item localalq : Item.e) {
/* 134:146 */       if (localalq != null)
/* 135:    */       {
/* 136:150 */         int i1 = Item.b(localalq);
/* 137:151 */         String str = a(localalq);
/* 138:152 */         if ((str != null) && (localalq.m())) {
/* 139:153 */           K[i1] = new to("stat.breakItem.", str, new hz("stat.breakItem", new Object[] { new ItemStack(localalq).C() }), localalq).h();
/* 140:    */         }
/* 141:    */       }
/* 142:    */     }
/* 143:157 */     a(K);
/* 144:    */   }
/* 145:    */   
/* 146:    */   private static String a(Item paramalq)
/* 147:    */   {
/* 148:161 */     oa localoa = (oa)Item.e.c(paramalq);
/* 149:162 */     if (localoa != null) {
/* 150:163 */       return localoa.toString().replace(':', '.');
/* 151:    */     }
/* 152:165 */     return null;
/* 153:    */   }
/* 154:    */   
/* 155:    */   private static void a(PlayerStat[] paramArrayOftq)
/* 156:    */   {
/* 157:169 */     a(paramArrayOftq, BlockList.water, BlockList.flowingWater);
/* 158:170 */     a(paramArrayOftq, BlockList.lava, BlockList.flowingLava);
/* 159:    */     
/* 160:172 */     a(paramArrayOftq, BlockList.aZ, BlockList.pumpkin);
/* 161:173 */     a(paramArrayOftq, BlockList.am, BlockList.al);
/* 162:174 */     a(paramArrayOftq, BlockList.aD, BlockList.redstoneOre);
/* 163:    */     
/* 164:176 */     a(paramArrayOftq, BlockList.poweredRepeater, BlockList.unpoweredRepeater);
/* 165:177 */     a(paramArrayOftq, BlockList.ck, BlockList.unpowered_comparator);
/* 166:178 */     a(paramArrayOftq, BlockList.aF, BlockList.aE);
/* 167:179 */     a(paramArrayOftq, BlockList.bK, BlockList.bJ);
/* 168:    */     
/* 169:181 */     a(paramArrayOftq, BlockList.T, BlockList.U);
/* 170:182 */     a(paramArrayOftq, BlockList.bL, BlockList.bM);
/* 171:183 */     a(paramArrayOftq, BlockList.cO, BlockList.cP);
/* 172:    */     
/* 173:185 */     a(paramArrayOftq, BlockList.grass, BlockList.dirt);
/* 174:186 */     a(paramArrayOftq, BlockList.ak, BlockList.dirt);
/* 175:    */   }
/* 176:    */   
/* 177:    */   private static void a(PlayerStat[] paramArrayOftq, BlockType paramatr1, BlockType paramatr2)
/* 178:    */   {
/* 179:190 */     int i1 = BlockType.a(paramatr1);
/* 180:191 */     int i2 = BlockType.a(paramatr2);
/* 181:193 */     if ((paramArrayOftq[i1] != null) && (paramArrayOftq[i2] == null))
/* 182:    */     {
/* 183:195 */       paramArrayOftq[i2] = paramArrayOftq[i1];
/* 184:196 */       return;
/* 185:    */     }
/* 186:199 */     b.remove(paramArrayOftq[i1]);
/* 187:200 */     e.remove(paramArrayOftq[i1]);
/* 188:201 */     c.remove(paramArrayOftq[i1]);
/* 189:202 */     paramArrayOftq[i1] = paramArrayOftq[i2];
/* 190:    */   }
/* 191:    */   
/* 192:    */   public static PlayerStat a(xc paramxc)
/* 193:    */   {
/* 194:206 */     String str = EntityList.b(paramxc.a);
/* 195:207 */     if (str == null) {
/* 196:208 */       return null;
/* 197:    */     }
/* 198:210 */     return new PlayerStat("stat.killEntity." + str, new hz("stat.entityKill", new Object[] { new hz("entity." + str + ".name", new Object[0]) })).h();
/* 199:    */   }
/* 200:    */   
/* 201:    */   public static PlayerStat b(xc paramxc)
/* 202:    */   {
/* 203:214 */     String str = EntityList.b(paramxc.a);
/* 204:215 */     if (str == null) {
/* 205:216 */       return null;
/* 206:    */     }
/* 207:218 */     return new PlayerStat("stat.entityKilledBy." + str, new hz("stat.entityKilledBy", new Object[] { new hz("entity." + str + ".name", new Object[0]) })).h();
/* 208:    */   }
/* 209:    */   
/* 210:    */   public static PlayerStat a(String paramString)
/* 211:    */   {
/* 212:222 */     return a.get(paramString);
/* 213:    */   }
/* 214:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ty
 * JD-Core Version:    0.7.0.1
 */