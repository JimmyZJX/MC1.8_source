package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.Iterator;
/*   3:    */ import java.util.List;
/*   6:    */ 
/*   7:    */ public abstract class aqi
/*   8:    */ {
/*   9:    */   private int a;
/*  10:    */   private String b;
/*  11:    */   private final List<aqj> c;
/*  12:    */   private aqj d;
/*  13:    */   private double e;
/*  14:    */   private double f;
/*  15:    */   private int g;
/*  16:    */   private int h;
/*  17:    */   private int i;
/*  18:    */   private Entity j;
/*  19:    */   private int k;
/*  20:    */   private int l;
/*  21:    */   private int m;
/*  22:    */   
/*  23:    */   public aqi()
/*  24:    */   {
/*  25: 24 */     this.a = 20;
/*  26: 25 */     this.b = "Pig";
/*  27: 26 */     this.c = Lists.newArrayList();
/*  28:    */     
/*  29:    */ 
/*  30:    */ 
/*  31: 30 */     this.g = 200;
/*  32: 31 */     this.h = 800;
/*  33: 32 */     this.i = 4;
/*  34:    */     
/*  35: 34 */     this.k = 6;
/*  36: 35 */     this.l = 16;
/*  37: 36 */     this.m = 4;
/*  38:    */   }
/*  39:    */   
/*  40:    */   private String f()
/*  41:    */   {
/*  42: 39 */     if (i() == null)
/*  43:    */     {
/*  44: 40 */       if (this.b.equals("Minecart")) {
/*  45: 41 */         this.b = "MinecartRideable";
/*  46:    */       }
/*  47: 43 */       return this.b;
/*  48:    */     }
/*  49: 45 */     return aqj.a(i());
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void a(String paramString)
/*  53:    */   {
/*  54: 50 */     this.b = paramString;
/*  55:    */   }
/*  56:    */   
/*  57:    */   private boolean g()
/*  58:    */   {
/*  59: 54 */     BlockPosition localdt = b();
/*  60: 55 */     return a().isWithinRangeOfAnyPlayer(localdt.getX() + 0.5D, localdt.getY() + 0.5D, localdt.getZ() + 0.5D, this.l);
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void c()
/*  64:    */   {
/*  65: 59 */     if (!g()) {
/*  66: 60 */       return;
/*  67:    */     }
/*  68: 63 */     BlockPosition localdt = b();
/*  69:    */     double d3;
/*  70: 64 */     if (a().isClient)
/*  71:    */     {
/*  72: 65 */       double d1 = localdt.getX() + a().rng.nextFloat();
/*  73: 66 */       double d2 = localdt.getY() + a().rng.nextFloat();
/*  74: 67 */       d3 = localdt.getZ() + a().rng.nextFloat();
/*  75: 68 */       a().a(ew.l, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*  76: 69 */       a().a(ew.A, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
/*  77: 71 */       if (this.a > 0) {
/*  78: 72 */         this.a -= 1;
/*  79:    */       }
/*  80: 74 */       this.f = this.e;
/*  81: 75 */       this.e = ((this.e + 1000.0F / (this.a + 200.0F)) % 360.0D);
/*  82:    */     }
/*  83:    */     else
/*  84:    */     {
/*  85: 77 */       if (this.a == -1) {
/*  86: 78 */         h();
/*  87:    */       }
/*  88: 81 */       if (this.a > 0)
/*  89:    */       {
/*  90: 82 */         this.a -= 1;
/*  91: 83 */         return;
/*  92:    */       }
/*  93: 86 */       int n = 0;
/*  94: 88 */       for (int i1 = 0; i1 < this.i; i1++)
/*  95:    */       {
/*  96: 89 */         Entity localwv = EntityList.a(f(), a());
/*  97: 90 */         if (localwv == null) {
/*  98: 91 */           return;
/*  99:    */         }
/* 100: 94 */         int i2 = a().a(localwv.getClass(), new AABB(localdt.getX(), localdt.getY(), localdt.getZ(), localdt.getX() + 1, localdt.getY() + 1, localdt.getZ() + 1).expand(this.m, this.m, this.m)).size();
/* 101: 95 */         if (i2 >= this.k)
/* 102:    */         {
/* 103: 96 */           h();
/* 104: 97 */           return;
/* 105:    */         }
/* 106:100 */         d3 = localdt.getX() + (a().rng.nextDouble() - a().rng.nextDouble()) * this.m + 0.5D;
/* 107:101 */         double d4 = localdt.getY() + a().rng.nextInt(3) - 1;
/* 108:102 */         double d5 = localdt.getZ() + (a().rng.nextDouble() - a().rng.nextDouble()) * this.m + 0.5D;
/* 109:103 */         EntityMob localObject = (localwv instanceof EntityMob) ? (EntityMob)localwv : null;
/* 110:    */         
/* 111:105 */         localwv.setPositionAndAngles(d3, d4, d5, a().rng.nextFloat() * 360.0F, 0.0F);
/* 112:107 */         if ((localObject == null) || ((localObject.canSpawn()) && (localObject.spawnAABBCheck())))
/* 113:    */         {
/* 114:108 */           a(localwv, true);
/* 115:109 */           a().playLevelEvent(2004, localdt, 0);
/* 116:111 */           if (localObject != null) {
/* 117:112 */             localObject.y();
/* 118:    */           }
/* 119:115 */           n = 1;
/* 120:    */         }
/* 121:    */       }
/* 122:119 */       if (n != 0) {
/* 123:120 */         h();
/* 124:    */       }
/* 125:    */     }
/* 126:    */   }
/* 127:    */   
/* 128:    */   private Entity a(Entity paramwv, boolean paramBoolean)
/* 129:    */   {
/* 130:126 */     if (i() != null)
/* 131:    */     {
/* 132:127 */       Object localObject1 = new NBTTagCompound();
/* 133:128 */       paramwv.d((NBTTagCompound)localObject1);
/* 134:130 */       for (Iterator<String> localObject2 = aqj.b(i()).c().iterator(); (localObject2).hasNext();)
/* 135:    */       {
/* 136:130 */         String localObject3 = (String)(localObject2).next();
/* 137:131 */         NBTBase localObject4 = aqj.b(i()).a((String)localObject3);
/* 138:132 */         ((NBTTagCompound)localObject1).setNBT((String)localObject3, ((NBTBase)localObject4).b());
/* 139:    */       }
/* 140:    */       
/* 141:    */       
/* 142:135 */       paramwv.f((NBTTagCompound)localObject1);
/* 143:136 */       if ((paramwv.world != null) && (paramBoolean)) {
/* 144:137 */         paramwv.world.spawnEntity(paramwv);
/* 145:    */       }
/* 146:141 */       Entity localObject2 = paramwv;
/* 147:142 */       while (((NBTTagCompound)localObject1).hasKey("Riding", 10))
/* 148:    */       {
/* 149:143 */         NBTTagCompound localObject3 = ((NBTTagCompound)localObject1).getCompoundTag("Riding");
/* 150:144 */         Entity localObject4 = EntityList.a(((NBTTagCompound)localObject3).getString("id"), paramwv.world);
/* 151:145 */         if (localObject4 != null)
/* 152:    */         {
/* 153:146 */           NBTTagCompound localfn = new NBTTagCompound();
/* 154:147 */           ((Entity)localObject4).d(localfn);
/* 155:149 */           for (String str : ((NBTTagCompound)localObject3).c())
/* 156:    */           {
/* 157:150 */             NBTBase localgd = ((NBTTagCompound)localObject3).a(str);
/* 158:151 */             localfn.setNBT(str, localgd.b());
/* 159:    */           }
/* 160:153 */           ((Entity)localObject4).f(localfn);
/* 161:154 */           ((Entity)localObject4).setPositionAndAngles(((Entity)localObject2).xPos, ((Entity)localObject2).yPos, ((Entity)localObject2).zPos, ((Entity)localObject2).yaw, ((Entity)localObject2).pitch);
/* 162:156 */           if ((paramwv.world != null) && (paramBoolean)) {
/* 163:157 */             paramwv.world.spawnEntity((Entity)localObject4);
/* 164:    */           }
/* 165:159 */           ((Entity)localObject2).mount((Entity)localObject4);
/* 166:    */         }
/* 167:161 */         localObject2 = localObject4;
/* 168:162 */         localObject1 = localObject3;
/* 169:    */       }
/* 170:    */     }
/* 171:164 */     else if (((paramwv instanceof EntityLiving)) && (paramwv.world != null) && (paramBoolean))
/* 172:    */     {
/* 173:165 */       ((EntityMob)paramwv).beforeSpawn(paramwv.world.E(new BlockPosition(paramwv)), null);
/* 174:166 */       paramwv.world.spawnEntity(paramwv);
/* 175:    */     }
/* 176:169 */     return paramwv;
/* 177:    */   }
/* 178:    */   
/* 179:    */   private void h()
/* 180:    */   {
/* 181:173 */     if (this.h <= this.g) {
/* 182:174 */       this.a = this.g;
/* 183:    */     } else {
/* 184:176 */       this.a = (this.g + a().rng.nextInt(this.h - this.g));
/* 185:    */     }
/* 186:179 */     if (this.c.size() > 0) {
/* 187:180 */       a((aqj)WeightedRandom.getRandomItem(a().rng, this.c));
/* 188:    */     }
/* 189:183 */     a(1);
/* 190:    */   }
/* 191:    */   
/* 192:    */   public void a(NBTTagCompound paramfn)
/* 193:    */   {
/* 194:187 */     this.b = paramfn.getString("EntityId");
/* 195:188 */     this.a = paramfn.e("Delay");
/* 196:    */     
/* 197:190 */     this.c.clear();
/* 198:191 */     if (paramfn.hasKey("SpawnPotentials", 9))
/* 199:    */     {
/* 200:192 */       fv localfv = paramfn.c("SpawnPotentials", 10);
/* 201:194 */       for (int n = 0; n < localfv.c(); n++) {
/* 202:195 */         this.c.add(new aqj(this, localfv.b(n)));
/* 203:    */       }
/* 204:    */     }
/* 205:199 */     if (paramfn.hasKey("SpawnData", 10)) {
/* 206:200 */       a(new aqj(this, paramfn.getCompoundTag("SpawnData"), this.b));
/* 207:    */     } else {
/* 208:202 */       a((aqj)null);
/* 209:    */     }
/* 210:205 */     if (paramfn.hasKey("MinSpawnDelay", 99))
/* 211:    */     {
/* 212:206 */       this.g = paramfn.e("MinSpawnDelay");
/* 213:207 */       this.h = paramfn.e("MaxSpawnDelay");
/* 214:208 */       this.i = paramfn.e("SpawnCount");
/* 215:    */     }
/* 216:211 */     if (paramfn.hasKey("MaxNearbyEntities", 99))
/* 217:    */     {
/* 218:212 */       this.k = paramfn.e("MaxNearbyEntities");
/* 219:213 */       this.l = paramfn.e("RequiredPlayerRange");
/* 220:    */     }
/* 221:216 */     if (paramfn.hasKey("SpawnRange", 99)) {
/* 222:217 */       this.m = paramfn.e("SpawnRange");
/* 223:    */     }
/* 224:220 */     if (a() != null) {
/* 225:221 */       this.j = null;
/* 226:    */     }
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void b(NBTTagCompound paramfn)
/* 230:    */   {
/* 231:226 */     paramfn.setString("EntityId", f());
/* 232:227 */     paramfn.setShort("Delay", (short)this.a);
/* 233:228 */     paramfn.setShort("MinSpawnDelay", (short)this.g);
/* 234:229 */     paramfn.setShort("MaxSpawnDelay", (short)this.h);
/* 235:230 */     paramfn.setShort("SpawnCount", (short)this.i);
/* 236:231 */     paramfn.setShort("MaxNearbyEntities", (short)this.k);
/* 237:232 */     paramfn.setShort("RequiredPlayerRange", (short)this.l);
/* 238:233 */     paramfn.setShort("SpawnRange", (short)this.m);
/* 239:235 */     if (i() != null) {
/* 240:236 */       paramfn.setNBT("SpawnData", aqj.b(i()).b());
/* 241:    */     }
/* 242:239 */     if ((i() != null) || (this.c.size() > 0))
/* 243:    */     {
/* 244:240 */       fv localfv = new fv();
/* 245:242 */       if (this.c.size() > 0) {
/* 246:243 */         for (aqj localaqj : this.c) {
/* 247:244 */           localfv.a(localaqj.a());
/* 248:    */         }
/* 249:    */       } else {
/* 250:247 */         localfv.a(i().a());
/* 251:    */       }
/* 252:250 */       paramfn.setNBT("SpawnPotentials", localfv);
/* 253:    */     }
/* 254:    */   }
/* 255:    */   
/* 256:    */   public Entity a(World paramaqu)
/* 257:    */   {
/* 258:255 */     if (this.j == null)
/* 259:    */     {
/* 260:256 */       Entity localwv = EntityList.a(f(), paramaqu);
/* 261:257 */       if (localwv != null)
/* 262:    */       {
/* 263:258 */         localwv = a(localwv, false);
/* 264:259 */         this.j = localwv;
/* 265:    */       }
/* 266:    */     }
/* 267:263 */     return this.j;
/* 268:    */   }
/* 269:    */   
/* 270:    */   public boolean b(int paramInt)
/* 271:    */   {
/* 272:267 */     if ((paramInt == 1) && (a().isClient))
/* 273:    */     {
/* 274:268 */       this.a = this.g;
/* 275:269 */       return true;
/* 276:    */     }
/* 277:271 */     return false;
/* 278:    */   }
/* 279:    */   
/* 280:    */   private aqj i()
/* 281:    */   {
/* 282:275 */     return this.d;
/* 283:    */   }
/* 284:    */   
/* 285:    */   public void a(aqj paramaqj)
/* 286:    */   {
/* 287:279 */     this.d = paramaqj;
/* 288:    */   }
/* 289:    */   
/* 290:    */   public abstract void a(int paramInt);
/* 291:    */   
/* 292:    */   public abstract World a();
/* 293:    */   
/* 294:    */   public abstract BlockPosition b();
/* 295:    */   
/* 296:    */   public double d()
/* 297:    */   {
/* 298:289 */     return this.e;
/* 299:    */   }
/* 300:    */   
/* 301:    */   public double e()
/* 302:    */   {
/* 303:293 */     return this.f;
/* 304:    */   }
/* 305:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqi
 * JD-Core Version:    0.7.0.1
 */