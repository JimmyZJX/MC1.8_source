package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Sets;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ import java.util.Set;
/*   5:    */ import java.util.UUID;
/*   6:    */ 
/*   7:    */ public class EntityEnderman
/*   8:    */   extends EntityHostileMob
/*   9:    */ {
/*  10: 35 */   private static final UUID b = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
/*  11: 36 */   private static final ya c = new ya(b, "Attacking speed boost", 0.1500000059604645D, 0).a(false);
/*  12: 38 */   private static final Set bk = Sets.newIdentityHashSet();
/*  13:    */   private boolean bl;
/*  14:    */   
/*  15:    */   static
/*  16:    */   {
/*  17: 41 */     bk.add(BlockList.grass);
/*  18: 42 */     bk.add(BlockList.dirt);
/*  19: 43 */     bk.add(BlockList.sand);
/*  20: 44 */     bk.add(BlockList.gravel);
/*  21: 45 */     bk.add(BlockList.yellowFlower);
/*  22: 46 */     bk.add(BlockList.redFlower);
/*  23: 47 */     bk.add(BlockList.brownMushroom);
/*  24: 48 */     bk.add(BlockList.redMushroom);
/*  25: 49 */     bk.add(BlockList.W);
/*  26: 50 */     bk.add(BlockList.cactus);
/*  27: 51 */     bk.add(BlockList.aL);
/*  28: 52 */     bk.add(BlockList.pumpkin);
/*  29: 53 */     bk.add(BlockList.bk);
/*  30: 54 */     bk.add(BlockList.bw);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public EntityEnderman(World paramaqu)
/*  34:    */   {
/*  35: 64 */     super(paramaqu);
/*  36: 65 */     a(0.6F, 2.9F);
/*  37: 66 */     this.S = 1.0F;
/*  38:    */     
/*  39: 68 */     this.i.a(0, new yy(this));
/*  40: 69 */     this.i.a(2, new zk(this, 1.0D, false));
/*  41:    */     
/*  42: 71 */     this.i.a(7, new zy(this, 1.0D));
/*  43: 72 */     this.i.a(8, new zh(this, EntityPlayer.class, 8.0F));
/*  44: 73 */     this.i.a(8, new zx(this));
/*  45:    */     
/*  46: 75 */     this.i.a(10, new aet(this));
/*  47: 76 */     this.i.a(11, new aev(this));
/*  48:    */     
/*  49: 78 */     this.bg.a(1, new aal(this, false, new Class[0]));
/*  50: 79 */     this.bg.a(2, new aeu(this));
/*  51: 80 */     this.bg.a(3, new aaq(this, EntityEndermite.class, 10, true, false, new aes(this)));
/*  52:    */   }
/*  53:    */   
/*  54:    */   protected void aW()
/*  55:    */   {
/*  56: 90 */     super.aW();
/*  57:    */     
/*  58: 92 */     a(afs.a).a(40.0D);
/*  59: 93 */     a(afs.d).a(0.300000011920929D);
/*  60: 94 */     a(afs.e).a(7.0D);
/*  61: 95 */     a(afs.b).a(64.0D);
/*  62:    */   }
/*  63:    */   
/*  64:    */   protected void h()
/*  65:    */   {
/*  66:100 */     super.h();
/*  67:    */     
/*  68:102 */     this.ac.a(16, new Short((short)0));
/*  69:103 */     this.ac.a(17, new Byte((byte)0));
/*  70:104 */     this.ac.a(18, new Byte((byte)0));
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/*  74:    */   {
/*  75:109 */     super.writeEntityToNBT(paramfn);
/*  76:110 */     Block localbec = ck();
/*  77:111 */     paramfn.setShort("carried", (short)ProtoBlock.a(localbec.getProto()));
/*  78:112 */     paramfn.setShort("carriedData", (short)localbec.getProto().c(localbec));
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  82:    */   {
/*  83:117 */     super.readEntityFromNBT(paramfn);
/*  84:    */     Block localbec;
/*  85:119 */     if (paramfn.hasKey("carried", 8)) {
/*  86:120 */       localbec = ProtoBlock.b(paramfn.getString("carried")).a(paramfn.e("carriedData") & 0xFFFF);
/*  87:    */     } else {
/*  88:122 */       localbec = ProtoBlock.c(paramfn.e("carried")).a(paramfn.e("carriedData") & 0xFFFF);
/*  89:    */     }
/*  90:124 */     a(localbec);
/*  91:    */   }
/*  92:    */   
/*  93:    */   private boolean c(EntityPlayer paramahd)
/*  94:    */   {
/*  95:128 */     ItemStack localamj = paramahd.bg.b[3];
/*  96:129 */     if ((localamj != null) && (localamj.getItem() == Item.fromProtoBlock(BlockList.pumpkin))) {
/*  97:130 */       return false;
/*  98:    */     }
/*  99:133 */     Vec3 localbrw1 = paramahd.d(1.0F).normalize();
/* 100:134 */     Vec3 localbrw2 = new Vec3(this.xPos - paramahd.xPos, getAABB().minY + this.K / 2.0F - (paramahd.yPos + paramahd.aR()), this.zPos - paramahd.zPos);
/* 101:135 */     double d1 = localbrw2.b();
/* 102:136 */     localbrw2 = localbrw2.normalize();
/* 103:137 */     double d2 = localbrw1.dot(localbrw2);
/* 104:138 */     if (d2 > 1.0D - 0.025D / d1) {
/* 105:139 */       return paramahd.t(this);
/* 106:    */     }
/* 107:141 */     return false;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public float aR()
/* 111:    */   {
/* 112:146 */     return 2.55F;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void m()
/* 116:    */   {
/* 117:151 */     if (this.world.isClient) {
/* 118:152 */       for (int i = 0; i < 2; i++) {
/* 119:153 */         this.world.a(ew.y, this.xPos + (this.random.nextDouble() - 0.5D) * this.J, this.yPos + this.random.nextDouble() * this.K - 0.25D, this.zPos + (this.random.nextDouble() - 0.5D) * this.J, (this.random.nextDouble() - 0.5D) * 2.0D, -this.random.nextDouble(), (this.random.nextDouble() - 0.5D) * 2.0D, new int[0]);
/* 120:    */       }
/* 121:    */     }
/* 122:157 */     this.aW = false;
/* 123:    */     
/* 124:159 */     super.m();
/* 125:    */   }
/* 126:    */   
/* 127:    */   protected void E()
/* 128:    */   {
/* 129:164 */     if (U()) {
/* 130:165 */       a(wh.f, 1.0F);
/* 131:    */     }
/* 132:168 */     if ((cm()) && (!this.bl) && (this.random.nextInt(100) == 0)) {
/* 133:169 */       a(false);
/* 134:    */     }
/* 135:172 */     if (this.world.w())
/* 136:    */     {
/* 137:173 */       float f = c(1.0F);
/* 138:174 */       if ((f > 0.5F) && 
/* 139:175 */         (this.world.i(new BlockPosition(this))) && (this.random.nextFloat() * 30.0F < (f - 0.4F) * 2.0F))
/* 140:    */       {
/* 141:176 */         d((EntityLiving)null);
/* 142:177 */         a(false);
/* 143:178 */         this.bl = false;
/* 144:179 */         n();
/* 145:    */       }
/* 146:    */     }
/* 147:184 */     super.E();
/* 148:    */   }
/* 149:    */   
/* 150:    */   protected boolean n()
/* 151:    */   {
/* 152:188 */     double d1 = this.xPos + (this.random.nextDouble() - 0.5D) * 64.0D;
/* 153:189 */     double d2 = this.yPos + (this.random.nextInt(64) - 32);
/* 154:190 */     double d3 = this.zPos + (this.random.nextDouble() - 0.5D) * 64.0D;
/* 155:191 */     return k(d1, d2, d3);
/* 156:    */   }
/* 157:    */   
/* 158:    */   protected boolean b(Entity paramwv)
/* 159:    */   {
/* 160:195 */     Vec3 localbrw = new Vec3(this.xPos - paramwv.xPos, getAABB().minY + this.K / 2.0F - paramwv.yPos + paramwv.aR(), this.zPos - paramwv.zPos);
/* 161:196 */     localbrw = localbrw.normalize();
/* 162:197 */     double d1 = 16.0D;
/* 163:198 */     double d2 = this.xPos + (this.random.nextDouble() - 0.5D) * 8.0D - localbrw.x * d1;
/* 164:199 */     double d3 = this.yPos + (this.random.nextInt(16) - 8) - localbrw.y * d1;
/* 165:200 */     double d4 = this.zPos + (this.random.nextDouble() - 0.5D) * 8.0D - localbrw.z * d1;
/* 166:201 */     return k(d2, d3, d4);
/* 167:    */   }
/* 168:    */   
/* 169:    */   protected boolean k(double paramDouble1, double paramDouble2, double paramDouble3)
/* 170:    */   {
/* 171:205 */     double d1 = this.xPos;
/* 172:206 */     double d2 = this.yPos;
/* 173:207 */     double d3 = this.zPos;
/* 174:    */     
/* 175:209 */     this.xPos = paramDouble1;
/* 176:210 */     this.yPos = paramDouble2;
/* 177:211 */     this.zPos = paramDouble3;
/* 178:212 */     int i = 0;
/* 179:213 */     Object localObject = new BlockPosition(this.xPos, this.yPos, this.zPos);
/* 180:    */     int j;
/* 181:215 */     if (this.world.e((BlockPosition)localObject))
/* 182:    */     {
/* 183:216 */       j = 0;
/* 184:217 */       while ((j == 0) && (((BlockPosition)localObject).getY() > 0))
/* 185:    */       {
/* 186:218 */         BlockPosition localdt = ((BlockPosition)localObject).down();
/* 187:219 */         ProtoBlock localatr = this.world.getBlock(localdt).getProto();
/* 188:220 */         if (localatr.getMaterial().c())
/* 189:    */         {
/* 190:221 */           j = 1;
/* 191:    */         }
/* 192:    */         else
/* 193:    */         {
/* 194:223 */           this.yPos -= 1.0D;
/* 195:224 */           localObject = localdt;
/* 196:    */         }
/* 197:    */       }
/* 198:227 */       if (j != 0)
/* 199:    */       {
/* 200:228 */         super.setPosition(this.xPos, this.yPos, this.zPos);
/* 201:230 */         if ((this.world.getCollidingAABBs(this, getAABB()).isEmpty()) && (!this.world.isInLiquid(getAABB()))) {
/* 202:231 */           i = 1;
/* 203:    */         }
/* 204:    */       }
/* 205:    */     }
/* 206:236 */     if (i != 0)
/* 207:    */     {
/* 208:237 */       j = 128;
/* 209:239 */       for (int k = 0; k < j; k++)
/* 210:    */       {
/* 211:240 */         double d4 = k / (j - 1.0D);
/* 212:241 */         float f1 = (this.random.nextFloat() - 0.5F) * 0.2F;
/* 213:242 */         float f2 = (this.random.nextFloat() - 0.5F) * 0.2F;
/* 214:243 */         float f3 = (this.random.nextFloat() - 0.5F) * 0.2F;
/* 215:    */         
/* 216:245 */         double d5 = d1 + (this.xPos - d1) * d4 + (this.random.nextDouble() - 0.5D) * this.J * 2.0D;
/* 217:246 */         double d6 = d2 + (this.yPos - d2) * d4 + this.random.nextDouble() * this.K;
/* 218:247 */         double d7 = d3 + (this.zPos - d3) * d4 + (this.random.nextDouble() - 0.5D) * this.J * 2.0D;
/* 219:248 */         this.world.a(ew.y, d5, d6, d7, f1, f2, f3, new int[0]);
/* 220:    */       }
/* 221:251 */       this.world.a(d1, d2, d3, "mob.endermen.portal", 1.0F, 1.0F);
/* 222:252 */       a("mob.endermen.portal", 1.0F, 1.0F);
/* 223:    */       
/* 224:254 */       return true;
/* 225:    */     }
/* 226:256 */     b(d1, d2, d3);
/* 227:257 */     return false;
/* 228:    */   }
/* 229:    */   
/* 230:    */   protected String z()
/* 231:    */   {
/* 232:263 */     return cm() ? "mob.endermen.scream" : "mob.endermen.idle";
/* 233:    */   }
/* 234:    */   
/* 235:    */   protected String bn()
/* 236:    */   {
/* 237:268 */     return "mob.endermen.hit";
/* 238:    */   }
/* 239:    */   
/* 240:    */   protected String bo()
/* 241:    */   {
/* 242:273 */     return "mob.endermen.death";
/* 243:    */   }
/* 244:    */   
/* 245:    */   protected Item A()
/* 246:    */   {
/* 247:278 */     return ItemList.bu;
/* 248:    */   }
/* 249:    */   
/* 250:    */   protected void b(boolean paramBoolean, int paramInt)
/* 251:    */   {
/* 252:283 */     Item localalq = A();
/* 253:284 */     if (localalq != null)
/* 254:    */     {
/* 255:285 */       int i = this.random.nextInt(2 + paramInt);
/* 256:286 */       for (int j = 0; j < i; j++) {
/* 257:287 */         a(localalq, 1);
/* 258:    */       }
/* 259:    */     }
/* 260:    */   }
/* 261:    */   
/* 262:    */   public void a(Block parambec)
/* 263:    */   {
/* 264:293 */     this.ac.b(16, Short.valueOf((short)(ProtoBlock.f(parambec) & 0xFFFF)));
/* 265:    */   }
/* 266:    */   
/* 267:    */   public Block ck()
/* 268:    */   {
/* 269:297 */     return ProtoBlock.d(this.ac.b(16) & 0xFFFF);
/* 270:    */   }
/* 271:    */   
/* 272:    */   public boolean a(wh paramwh, float paramFloat)
/* 273:    */   {
/* 274:310 */     if (b(paramwh)) {
/* 275:311 */       return false;
/* 276:    */     }
/* 277:314 */     if ((paramwh.j() == null) || (!(paramwh.j() instanceof EntityEndermite)))
/* 278:    */     {
/* 279:315 */       if (!this.world.isClient) {
/* 280:316 */         a(true);
/* 281:    */       }
/* 282:319 */       if (((paramwh instanceof wi)) && ((paramwh.j() instanceof EntityPlayer))) {
/* 283:321 */         if (((paramwh.j() instanceof qw)) && (((qw)paramwh.j()).c.d())) {
/* 284:322 */           a(false);
/* 285:    */         } else {
/* 286:324 */           this.bl = true;
/* 287:    */         }
/* 288:    */       }
/* 289:328 */       if ((paramwh instanceof wj))
/* 290:    */       {
/* 291:329 */         this.bl = false;
/* 292:330 */         for (int i = 0; i < 64; i++) {
/* 293:331 */           if (n()) {
/* 294:332 */             return true;
/* 295:    */           }
/* 296:    */         }
/* 297:335 */         return false;
/* 298:    */       }
/* 299:    */     }
/* 300:339 */     boolean bool = super.a(paramwh, paramFloat);
/* 301:340 */     if ((paramwh.e()) && (this.random.nextInt(10) != 0)) {
/* 302:341 */       n();
/* 303:    */     }
/* 304:343 */     return bool;
/* 305:    */   }
/* 306:    */   
/* 307:    */   public boolean cm()
/* 308:    */   {
/* 309:347 */     return this.ac.a(18) > 0;
/* 310:    */   }
/* 311:    */   
/* 312:    */   public void a(boolean paramBoolean)
/* 313:    */   {
/* 314:351 */     this.ac.b(18, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/* 315:    */   }
				static ya cn() {return c;}
				static boolean a(EntityEnderman arg0, EntityPlayer arg1) {return arg0.c(arg1);}
				static boolean a(EntityEnderman arg0, boolean arg1) {return arg0.bl=arg1;}
				static Set co() {return bk;}
/* 316:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aer
 * JD-Core Version:    0.7.0.1
 */