package net.minecraft.src;
/*   4:    */ 
/*   5:    */ public class EntityOcelot
/*   6:    */   extends EntityPet
/*   7:    */ {
/*   8:    */   private yp bm;
/*   9:    */   private aag bn;
/*  10:    */   
/*  11:    */   public EntityOcelot(World paramaqu)
/*  12:    */   {
/*  13: 43 */     super(paramaqu);
/*  14: 44 */     a(0.6F, 0.7F);
/*  15:    */     
/*  16: 46 */     ((aay)s()).a(true);
/*  17: 47 */     this.i.a(1, new yy(this));
/*  18: 48 */     this.i.a(2, this.bk);
/*  19: 49 */     this.i.a(3, this.bn = new aag(this, 0.6D, ItemList.fish, true));
/*  20: 50 */     this.i.a(5, new yz(this, 1.0D, 10.0F, 5.0F));
/*  21: 51 */     this.i.a(6, new zr(this, 0.8D));
/*  22: 52 */     this.i.a(7, new zg(this, 0.3F));
/*  23: 53 */     this.i.a(8, new zq(this));
/*  24: 54 */     this.i.a(9, new yt(this, 0.8D));
/*  25: 55 */     this.i.a(10, new zy(this, 0.8D));
/*  26: 56 */     this.i.a(11, new zh(this, EntityPlayer.class, 10.0F));
/*  27:    */     
/*  28: 58 */     this.bg.a(1, new aat(this, EntityChicken.class, false, null));
/*  29:    */   }
/*  30:    */   
/*  31:    */   protected void h()
/*  32:    */   {
/*  33: 63 */     super.h();
/*  34:    */     
/*  35: 65 */     this.ac.a(18, Byte.valueOf((byte)0));
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void E()
/*  39:    */   {
/*  40: 70 */     if (q().a())
/*  41:    */     {
/*  42: 71 */       double d = q().b();
/*  43: 72 */       if (d == 0.6D)
/*  44:    */       {
/*  45: 73 */         c(true);
/*  46: 74 */         d(false);
/*  47:    */       }
/*  48: 75 */       else if (d == 1.33D)
/*  49:    */       {
/*  50: 76 */         c(false);
/*  51: 77 */         d(true);
/*  52:    */       }
/*  53:    */       else
/*  54:    */       {
/*  55: 79 */         c(false);
/*  56: 80 */         d(false);
/*  57:    */       }
/*  58:    */     }
/*  59:    */     else
/*  60:    */     {
/*  61: 83 */       c(false);
/*  62: 84 */       d(false);
/*  63:    */     }
/*  64:    */   }
/*  65:    */   
/*  66:    */   protected boolean C()
/*  67:    */   {
/*  68: 90 */     return (!cj()) && (this.W > 2400);
/*  69:    */   }
/*  70:    */   
/*  71:    */   protected void aW()
/*  72:    */   {
/*  73: 95 */     super.aW();
/*  74:    */     
/*  75: 97 */     a(afs.a).a(10.0D);
/*  76: 98 */     a(afs.d).a(0.300000011920929D);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void e(float paramFloat1, float paramFloat2) {}
/*  80:    */   
/*  81:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/*  82:    */   {
/*  83:108 */     super.writeEntityToNBT(paramfn);
/*  84:109 */     paramfn.setInt("CatType", cr());
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  88:    */   {
/*  89:114 */     super.readEntityFromNBT(paramfn);
/*  90:115 */     r(paramfn.getInteger("CatType"));
/*  91:    */   }
/*  92:    */   
/*  93:    */   protected String z()
/*  94:    */   {
/*  95:120 */     if (cj())
/*  96:    */     {
/*  97:121 */       if (cp()) {
/*  98:122 */         return "mob.cat.purr";
/*  99:    */       }
/* 100:124 */       if (this.random.nextInt(4) == 0) {
/* 101:125 */         return "mob.cat.purreow";
/* 102:    */       }
/* 103:127 */       return "mob.cat.meow";
/* 104:    */     }
/* 105:130 */     return "";
/* 106:    */   }
/* 107:    */   
/* 108:    */   protected String bn()
/* 109:    */   {
/* 110:135 */     return "mob.cat.hitt";
/* 111:    */   }
/* 112:    */   
/* 113:    */   protected String bo()
/* 114:    */   {
/* 115:140 */     return "mob.cat.hitt";
/* 116:    */   }
/* 117:    */   
/* 118:    */   protected float bA()
/* 119:    */   {
/* 120:145 */     return 0.4F;
/* 121:    */   }
/* 122:    */   
/* 123:    */   protected Item A()
/* 124:    */   {
/* 125:150 */     return ItemList.leather;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public boolean r(Entity paramwv)
/* 129:    */   {
/* 130:155 */     return paramwv.a(wh.a(this), 3.0F);
/* 131:    */   }
/* 132:    */   
/* 133:    */   public boolean a(wh paramwh, float paramFloat)
/* 134:    */   {
/* 135:160 */     if (b(paramwh)) {
/* 136:161 */       return false;
/* 137:    */     }
/* 138:163 */     this.bk.a(false);
/* 139:164 */     return super.a(paramwh, paramFloat);
/* 140:    */   }
/* 141:    */   
/* 142:    */   protected void b(boolean paramBoolean, int paramInt) {}
/* 143:    */   
/* 144:    */   public boolean a(EntityPlayer paramahd)
/* 145:    */   {
/* 146:173 */     ItemStack localamj = paramahd.bg.h();
/* 147:174 */     if (cj())
/* 148:    */     {
/* 149:175 */       if ((e(paramahd)) && 
/* 150:176 */         (!this.world.isClient) && (!d(localamj))) {
/* 151:177 */         this.bk.a(!cl());
/* 152:    */       }
/* 153:    */     }
/* 154:181 */     else if ((this.bn.f()) && (localamj != null) && (localamj.getItem() == ItemList.fish) && (paramahd.h(this) < 9.0D))
/* 155:    */     {
/* 156:182 */       if (!paramahd.by.d) {
/* 157:183 */         localamj.stackSize -= 1;
/* 158:    */       }
/* 159:185 */       if (localamj.stackSize <= 0) {
/* 160:186 */         paramahd.bg.a(paramahd.bg.c, null);
/* 161:    */       }
/* 162:189 */       if (!this.world.isClient) {
/* 163:190 */         if (this.random.nextInt(3) == 0)
/* 164:    */         {
/* 165:191 */           m(true);
/* 166:192 */           r(1 + this.world.rng.nextInt(3));
/* 167:193 */           b(paramahd.getUUID().toString());
/* 168:194 */           l(true);
/* 169:195 */           this.bk.a(true);
/* 170:196 */           this.world.a(this, (byte)7);
/* 171:    */         }
/* 172:    */         else
/* 173:    */         {
/* 174:198 */           l(false);
/* 175:199 */           this.world.a(this, (byte)6);
/* 176:    */         }
/* 177:    */       }
/* 178:202 */       return true;
/* 179:    */     }
/* 180:205 */     return super.a(paramahd);
/* 181:    */   }
/* 182:    */   
/* 183:    */   public EntityOcelot a(EntityPassiveMob paramws)
/* 184:    */   {
/* 185:210 */     EntityOcelot localaby = new EntityOcelot(this.world);
/* 186:211 */     if (cj())
/* 187:    */     {
/* 188:212 */       localaby.b(b());
/* 189:213 */       localaby.m(true);
/* 190:214 */       localaby.r(cr());
/* 191:    */     }
/* 192:216 */     return localaby;
/* 193:    */   }
/* 194:    */   
/* 195:    */   public boolean d(ItemStack paramamj)
/* 196:    */   {
/* 197:221 */     return (paramamj != null) && (paramamj.getItem() == ItemList.fish);
/* 198:    */   }
/* 199:    */   
/* 200:    */   public boolean a(EntityAnimal paramabq)
/* 201:    */   {
/* 202:226 */     if (paramabq == this) {
/* 203:227 */       return false;
/* 204:    */     }
/* 205:229 */     if (!cj()) {
/* 206:230 */       return false;
/* 207:    */     }
/* 208:232 */     if (!(paramabq instanceof EntityOcelot)) {
/* 209:233 */       return false;
/* 210:    */     }
/* 211:236 */     EntityOcelot localaby = (EntityOcelot)paramabq;
/* 212:237 */     if (!localaby.cj()) {
/* 213:238 */       return false;
/* 214:    */     }
/* 215:241 */     return (cp()) && (localaby.cp());
/* 216:    */   }
/* 217:    */   
/* 218:    */   public int cr()
/* 219:    */   {
/* 220:245 */     return this.ac.a(18);
/* 221:    */   }
/* 222:    */   
/* 223:    */   public void r(int paramInt)
/* 224:    */   {
/* 225:249 */     this.ac.b(18, Byte.valueOf((byte)paramInt));
/* 226:    */   }
/* 227:    */   
/* 228:    */   public boolean canSpawn()
/* 229:    */   {
/* 230:255 */     if (this.world.rng.nextInt(3) == 0) {
/* 231:256 */       return false;
/* 232:    */     }
/* 233:259 */     return true;
/* 234:    */   }
/* 235:    */   
/* 236:    */   public boolean spawnAABBCheck()
/* 237:    */   {
/* 238:264 */     if ((this.world.isCollisionFree(getAABB(), this)) && (this.world.getCollidingAABBs(this, getAABB()).isEmpty()) && (!this.world.isInLiquid(getAABB())))
/* 239:    */     {
/* 240:265 */       BlockPosition localdt = new BlockPosition(this.xPos, getAABB().minY, this.zPos);
/* 241:266 */       if (localdt.getY() < 63) {
/* 242:267 */         return false;
/* 243:    */       }
/* 244:270 */       ProtoBlock localatr = this.world.getBlock(localdt.down()).getProto();
/* 245:271 */       if ((localatr == BlockList.grass) || (localatr.getMaterial() == Material.leaves)) {
/* 246:272 */         return true;
/* 247:    */       }
/* 248:    */     }
/* 249:275 */     return false;
/* 250:    */   }
/* 251:    */   
/* 252:    */   public String getName()
/* 253:    */   {
/* 254:280 */     if (k_()) {
/* 255:281 */       return aL();
/* 256:    */     }
/* 257:283 */     if (cj()) {
/* 258:284 */       return fi.a("entity.Cat.name");
/* 259:    */     }
/* 260:286 */     return super.getName();
/* 261:    */   }
/* 262:    */   
/* 263:    */   public void m(boolean paramBoolean)
/* 264:    */   {
/* 265:291 */     super.m(paramBoolean);
/* 266:    */   }
/* 267:    */   
/* 268:    */   protected void ck()
/* 269:    */   {
/* 270:296 */     if (this.bm == null) {
/* 271:297 */       this.bm = new yp(this, new abz(this), 16.0F, 0.8D, 1.33D);
/* 272:    */     }
/* 273:305 */     this.i.a(this.bm);
/* 274:307 */     if (!cj()) {
/* 275:308 */       this.i.a(4, this.bm);
/* 276:    */     }
/* 277:    */   }
/* 278:    */   
/* 279:    */   public xq beforeSpawn(vu paramvu, xq paramxq)
/* 280:    */   {
/* 281:315 */     paramxq = super.beforeSpawn(paramvu, paramxq);
/* 282:317 */     if (this.world.rng.nextInt(7) == 0) {
/* 283:318 */       for (int i = 0; i < 2; i++)
/* 284:    */       {
/* 285:319 */         EntityOcelot localaby = new EntityOcelot(this.world);
/* 286:320 */         localaby.setPositionAndAngles(this.xPos, this.yPos, this.zPos, this.yaw, 0.0F);
/* 287:321 */         localaby.b(-24000);
/* 288:322 */         this.world.spawnEntity(localaby);
/* 289:    */       }
/* 290:    */     }
/* 291:325 */     return paramxq;
/* 292:    */   }
/* 293:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aby
 * JD-Core Version:    0.7.0.1
 */