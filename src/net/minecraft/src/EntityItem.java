package net.minecraft.src;
/*   2:    */ import org.apache.logging.log4j.LogManager;
/*   3:    */ import org.apache.logging.log4j.Logger;
/*   4:    */ 
/*   5:    */ public class EntityItem
/*   6:    */   extends Entity
/*   7:    */ {
/*   8: 23 */   private static final Logger b = LogManager.getLogger();
/*   9:    */   private int age;
/*  10:    */   private int pickUpdelay;
/*  11: 33 */   private int health = 5;
/*  12:    */   private String thrower;
/*  13:    */   private String g;
/*  14: 36 */   public float a = (float)(Math.random() * 3.141592653589793D * 2.0D);
/*  15:    */   
/*  16:    */   public EntityItem(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  17:    */   {
/*  18: 39 */     super(paramaqu);
/*  19: 40 */     a(0.25F, 0.25F);
/*  20: 41 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/*  21:    */     
/*  22: 43 */     this.yaw = ((float)(Math.random() * 360.0D));
/*  23:    */     
/*  24: 45 */     this.xVelocity = ((float)(Math.random() * 0.2000000029802322D - 0.1000000014901161D));
/*  25: 46 */     this.yVelocity = 0.2000000029802322D;
/*  26: 47 */     this.zVelocity = ((float)(Math.random() * 0.2000000029802322D - 0.1000000014901161D));
/*  27:    */   }
/*  28:    */   
/*  29:    */   public EntityItem(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, ItemStack paramamj)
/*  30:    */   {
/*  31: 51 */     this(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  32: 52 */     a(paramamj);
/*  33:    */   }
/*  34:    */   
/*  35:    */   protected boolean r_()
/*  36:    */   {
/*  37: 57 */     return false;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public EntityItem(World paramaqu)
/*  41:    */   {
/*  42: 61 */     super(paramaqu);
/*  43: 62 */     a(0.25F, 0.25F);
/*  44: 63 */     a(new ItemStack(BlockList.air, 0));
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected void h()
/*  48:    */   {
/*  49: 68 */     H().a(10, 5);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void onUpdate()
/*  53:    */   {
/*  54: 73 */     if (getItemStack() == null)
/*  55:    */     {
/*  56: 74 */       setDead();
/*  57: 75 */       return;
/*  58:    */     }
/*  59: 77 */     super.onUpdate();
/*  60: 78 */     if ((this.pickUpdelay > 0) && (this.pickUpdelay != 32767)) {
/*  61: 79 */       this.pickUpdelay -= 1;
/*  62:    */     }
/*  63: 81 */     this.lastX = this.xPos;
/*  64: 82 */     this.lastY = this.yPos;
/*  65: 83 */     this.lastZ = this.zPos;
/*  66:    */     
/*  67: 85 */     this.yVelocity -= 0.03999999910593033D;
/*  68: 86 */     this.T = j(this.xPos, (getAABB().minY + getAABB().maxY) / 2.0D, this.zPos);
/*  69: 87 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/*  70:    */     
/*  71: 89 */     int i = ((int)this.lastX != (int)this.xPos) || ((int)this.lastY != (int)this.yPos) || ((int)this.lastZ != (int)this.zPos) ? 1 : 0;
/*  72: 91 */     if ((i != 0) || (this.W % 25 == 0))
/*  73:    */     {
/*  74: 92 */       if (this.world.getBlock(new BlockPosition(this)).getProto().getMaterial() == Material.lava)
/*  75:    */       {
/*  76: 93 */         this.yVelocity = 0.2000000029802322D;
/*  77: 94 */         this.xVelocity = ((this.rng.nextFloat() - this.rng.nextFloat()) * 0.2F);
/*  78: 95 */         this.zVelocity = ((this.rng.nextFloat() - this.rng.nextFloat()) * 0.2F);
/*  79: 96 */         a("random.fizz", 0.4F, 2.0F + this.rng.nextFloat() * 0.4F);
/*  80:    */       }
/*  81: 99 */       if (!this.world.isClient) {
/*  82:100 */         w();
/*  83:    */       }
/*  84:    */     }
/*  85:104 */     float f1 = 0.98F;
/*  86:105 */     if (this.C) {
/*  87:106 */       f1 = this.world.getBlock(new BlockPosition(MathUtils.floor(this.xPos), MathUtils.floor(getAABB().minY) - 1, MathUtils.floor(this.zPos))).getProto().K * 0.98F;
/*  88:    */     }
/*  89:109 */     this.xVelocity *= f1;
/*  90:110 */     this.yVelocity *= 0.9800000190734863D;
/*  91:111 */     this.zVelocity *= f1;
/*  92:113 */     if (this.C) {
/*  93:114 */       this.yVelocity *= -0.5D;
/*  94:    */     }
/*  95:117 */     if (this.age != -32768) {
/*  96:118 */       this.age += 1;
/*  97:    */     }
/*  98:121 */     W();
/*  99:123 */     if ((!this.world.isClient) && (this.age >= 6000)) {
/* 100:124 */       setDead();
/* 101:    */     }
/* 102:    */   }
/* 103:    */   
/* 104:    */   private void w()
/* 105:    */   {
/* 106:129 */     for (EntityItem localadw : this.world.getEntityList(EntityItem.class, getAABB().expand(0.5D, 0.0D, 0.5D))) {
/* 107:130 */       a(localadw);
/* 108:    */     }
/* 109:    */   }
/* 110:    */   
/* 111:    */   private boolean a(EntityItem paramadw)
/* 112:    */   {
/* 113:135 */     if (paramadw == this) {
/* 114:136 */       return false;
/* 115:    */     }
/* 116:138 */     if ((!paramadw.ai()) || (!ai())) {
/* 117:139 */       return false;
/* 118:    */     }
/* 119:141 */     ItemStack localamj1 = getItemStack();
/* 120:142 */     ItemStack localamj2 = paramadw.getItemStack();
/* 121:144 */     if ((this.pickUpdelay == 32767) || (paramadw.pickUpdelay == 32767)) {
/* 122:145 */       return false;
/* 123:    */     }
/* 124:147 */     if ((this.age == -32768) || (paramadw.age == -32768)) {
/* 125:148 */       return false;
/* 126:    */     }
/* 127:150 */     if (localamj2.getItem() != localamj1.getItem()) {
/* 128:151 */       return false;
/* 129:    */     }
/* 130:153 */     if ((localamj2.hasTagCompound() ^ localamj1.hasTagCompound())) {
/* 131:154 */       return false;
/* 132:    */     }
/* 133:156 */     if ((localamj2.hasTagCompound()) && (!localamj2.getTagCompound().equals(localamj1.getTagCompound()))) {
/* 134:157 */       return false;
/* 135:    */     }
/* 136:159 */     if (localamj2.getItem() == null) {
/* 137:160 */       return false;
/* 138:    */     }
/* 139:162 */     if ((localamj2.getItem().k()) && (localamj2.getDamage2() != localamj1.getDamage2())) {
/* 140:163 */       return false;
/* 141:    */     }
/* 142:165 */     if (localamj2.stackSize < localamj1.stackSize) {
/* 143:166 */       return paramadw.a(this);
/* 144:    */     }
/* 145:168 */     if (localamj2.stackSize + localamj1.stackSize > localamj2.getMaxStackSize()) {
/* 146:169 */       return false;
/* 147:    */     }
/* 148:172 */     localamj2.stackSize += localamj1.stackSize;
/* 149:173 */     paramadw.pickUpdelay = Math.max(paramadw.pickUpdelay, this.pickUpdelay);
/* 150:174 */     paramadw.age = Math.min(paramadw.age, this.age);
/* 151:175 */     paramadw.a(localamj2);
/* 152:176 */     setDead();
/* 153:    */     
/* 154:178 */     return true;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public void j()
/* 158:    */   {
/* 159:183 */     this.age = 4800;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public boolean W()
/* 163:    */   {
/* 164:188 */     if (this.world.a(getAABB(), Material.water, this))
/* 165:    */     {
/* 166:189 */       if ((!this.Y) && (!this.aa)) {
/* 167:190 */         X();
/* 168:    */       }
/* 169:192 */       this.Y = true;
/* 170:    */     }
/* 171:    */     else
/* 172:    */     {
/* 173:194 */       this.Y = false;
/* 174:    */     }
/* 175:196 */     return this.Y;
/* 176:    */   }
/* 177:    */   
/* 178:    */   protected void f(int paramInt)
/* 179:    */   {
/* 180:201 */     a(DamageSource.a, paramInt);
/* 181:    */   }
/* 182:    */   
/* 183:    */   public boolean a(DamageSource paramwh, float paramFloat)
/* 184:    */   {
/* 185:206 */     if (b(paramwh)) {
/* 186:207 */       return false;
/* 187:    */     }
/* 188:209 */     if ((getItemStack() != null) && (getItemStack().getItem() == ItemList.bZ) && (paramwh.c())) {
/* 189:210 */       return false;
/* 190:    */     }
/* 191:212 */     ac();
/* 192:213 */     this.health = ((int)(this.health - paramFloat));
/* 193:214 */     if (this.health <= 0) {
/* 194:215 */       setDead();
/* 195:    */     }
/* 196:217 */     return false;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void writeEntityToNBT(NBTTagCompound tag)
/* 200:    */   {
/* 201:222 */     tag.setShort("Health", (short)(byte)this.health);
/* 202:223 */     tag.setShort("Age", (short)this.age);
/* 203:224 */     tag.setShort("PickupDelay", (short)this.pickUpdelay);
/* 204:225 */     if (getThrower() != null) {
/* 205:226 */       tag.setString("Thrower", this.thrower);
/* 206:    */     }
/* 207:228 */     if (m() != null) {
/* 208:229 */       tag.setString("Owner", this.g);
/* 209:    */     }
/* 210:231 */     if (getItemStack() != null) {
/* 211:232 */       tag.setNBT("Item", getItemStack().writeToNBT(new NBTTagCompound()));
/* 212:    */     }
/* 213:    */   }
/* 214:    */   
/* 215:    */   public void readEntityFromNBT(NBTTagCompound tag)
/* 216:    */   {
/* 217:238 */     this.health = (tag.e("Health") & 0xFF);
/* 218:239 */     this.age = tag.e("Age");
/* 219:240 */     if (tag.c("PickupDelay")) {
/* 220:241 */       this.pickUpdelay = tag.e("PickupDelay");
/* 221:    */     }
/* 222:243 */     if (tag.c("Owner")) {
/* 223:244 */       this.g = tag.getString("Owner");
/* 224:    */     }
/* 225:246 */     if (tag.c("Thrower")) {
/* 226:247 */       this.thrower = tag.getString("Thrower");
/* 227:    */     }
/* 228:249 */     NBTTagCompound localfn = tag.getCompoundTag("Item");
/* 229:250 */     a(ItemStack.loadItemStackFromNBT(localfn));
/* 230:251 */     if (getItemStack() == null) {
/* 231:252 */       setDead();
/* 232:    */     }
/* 233:    */   }
/* 234:    */   
/* 235:    */   public void d(EntityPlayer player)
/* 236:    */   {
/* 237:258 */     if (this.world.isClient) {
/* 238:259 */       return;
/* 239:    */     }
/* 240:262 */     ItemStack stack = getItemStack();
/* 241:263 */     int i = stack.stackSize;
/* 242:264 */     if ((this.pickUpdelay == 0) && ((this.g == null) || (6000 - this.age <= 200) || (this.g.equals(player.getName()))) && (player.bg.a(stack)))
/* 243:    */     {
/* 244:265 */       if (stack.getItem() == Item.fromProtoBlock(BlockList.log)) {
/* 245:266 */         player.b(AchievementList.mineWood);
/* 246:    */       }
/* 247:268 */       if (stack.getItem() == Item.fromProtoBlock(BlockList.log2)) {
/* 248:269 */         player.b(AchievementList.mineWood);
/* 249:    */       }
/* 250:271 */       if (stack.getItem() == ItemList.leather) {
/* 251:272 */         player.b(AchievementList.killCow);
/* 252:    */       }
/* 253:274 */       if (stack.getItem() == ItemList.diamond) {
/* 254:275 */         player.b(AchievementList.w);
/* 255:    */       }
/* 256:277 */       if (stack.getItem() == ItemList.bv) {
/* 257:278 */         player.b(AchievementList.A);
/* 258:    */       }
/* 259:280 */       if ((stack.getItem() == ItemList.diamond) && (getThrower() != null))
/* 260:    */       {
/* 261:281 */         EntityPlayer thrower = this.world.getPlayer(getThrower());
/* 262:282 */         if ((thrower != null) && (thrower != player)) {
/* 263:283 */           thrower.b(AchievementList.diamondsToYou);
/* 264:    */         }
/* 265:    */       }
/* 266:286 */       if (!R()) {
/* 267:287 */         this.world.a(player, "random.pop", 0.2F, ((this.rng.nextFloat() - this.rng.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 268:    */       }
/* 269:289 */       player.a(this, i);
/* 270:290 */       if (stack.stackSize <= 0) {
/* 271:291 */         setDead();
/* 272:    */       }
/* 273:    */     }
/* 274:    */   }
/* 275:    */   
/* 276:    */   public String getName()
/* 277:    */   {
/* 278:298 */     if (k_()) {
/* 279:299 */       return aL();
/* 280:    */     }
/* 281:302 */     return fi.a("item." + getItemStack().a());
/* 282:    */   }
/* 283:    */   
/* 284:    */   public boolean aE()
/* 285:    */   {
/* 286:307 */     return false;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void c(int paramInt)
/* 290:    */   {
/* 291:312 */     super.c(paramInt);
/* 292:314 */     if (!this.world.isClient) {
/* 293:315 */       w();
/* 294:    */     }
/* 295:    */   }
/* 296:    */   
/* 297:    */   public ItemStack getItemStack()
/* 298:    */   {
/* 299:320 */     ItemStack stack = H().f(10);
/* 300:322 */     if (stack == null)
/* 301:    */     {
/* 302:323 */       if (this.world != null) {
/* 303:324 */         b.error("Item entity " + getID() + " has no item?!");
/* 304:    */       }
/* 305:326 */       return new ItemStack(BlockList.stone);
/* 306:    */     }
/* 307:329 */     return stack;
/* 308:    */   }
/* 309:    */   
/* 310:    */   public void a(ItemStack paramamj)
/* 311:    */   {
/* 312:333 */     H().b(10, paramamj);
/* 313:334 */     H().i(10);
/* 314:    */   }
/* 315:    */   
/* 316:    */   public String m()
/* 317:    */   {
/* 318:338 */     return this.g;
/* 319:    */   }
/* 320:    */   
/* 321:    */   public void b(String paramString)
/* 322:    */   {
/* 323:342 */     this.g = paramString;
/* 324:    */   }
/* 325:    */   
/* 326:    */   public String getThrower()
/* 327:    */   {
/* 328:346 */     return this.thrower;
/* 329:    */   }
/* 330:    */   
/* 331:    */   public void setThrower(String paramString)
/* 332:    */   {
/* 333:350 */     this.thrower = paramString;
/* 334:    */   }
/* 335:    */   
/* 336:    */   public int getAge()
/* 337:    */   {
/* 338:354 */     return this.age;
/* 339:    */   }
/* 340:    */   
/* 341:    */   public void initPickupDelay()
/* 342:    */   {
/* 343:358 */     this.pickUpdelay = 10;
/* 344:    */   }
/* 345:    */   
/* 346:    */   public void q()
/* 347:    */   {
/* 348:362 */     this.pickUpdelay = 0;
/* 349:    */   }
/* 350:    */   
/* 351:    */   public void r()
/* 352:    */   {
/* 353:366 */     this.pickUpdelay = 32767;
/* 354:    */   }
/* 355:    */   
/* 356:    */   public void a(int paramInt)
/* 357:    */   {
/* 358:370 */     this.pickUpdelay = paramInt;
/* 359:    */   }
/* 360:    */   
/* 361:    */   public boolean s()
/* 362:    */   {
/* 363:374 */     return this.pickUpdelay > 0;
/* 364:    */   }
/* 365:    */   
/* 366:    */   public void u()
/* 367:    */   {
/* 368:382 */     this.age = -6000;
/* 369:    */   }
/* 370:    */   
/* 371:    */   public void v()
/* 372:    */   {
/* 373:386 */     r();
/* 374:387 */     this.age = 5999;
/* 375:    */   }
/* 376:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adw
 * JD-Core Version:    0.7.0.1
 */