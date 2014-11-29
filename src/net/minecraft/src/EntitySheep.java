package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class EntitySheep
/*   6:    */   extends EntityAnimal
/*   7:    */ {
/*   8: 37 */   private final ain bk = new ain(new acm(this), 2, 1);
/*   9: 44 */   private static final Map<EnumDyeColor,float[]> rgb = Maps.newEnumMap(EnumDyeColor.class);
/*  10:    */   private int bn;
/*  11:    */   
/*  12:    */   static
/*  13:    */   {
/*  14: 46 */     rgb.put(EnumDyeColor.WHITE, new float[] { 1.0F, 1.0F, 1.0F });
/*  15: 47 */     rgb.put(EnumDyeColor.ORANGE, new float[] { 0.85F, 0.5F, 0.2F });
/*  16: 48 */     rgb.put(EnumDyeColor.MAGENTA, new float[] { 0.7F, 0.3F, 0.85F });
/*  17: 49 */     rgb.put(EnumDyeColor.LIGHT_BLUE, new float[] { 0.4F, 0.6F, 0.85F });
/*  18: 50 */     rgb.put(EnumDyeColor.YELLOW, new float[] { 0.9F, 0.9F, 0.2F });
/*  19: 51 */     rgb.put(EnumDyeColor.LIME, new float[] { 0.5F, 0.8F, 0.1F });
/*  20: 52 */     rgb.put(EnumDyeColor.PINK, new float[] { 0.95F, 0.5F, 0.65F });
/*  21: 53 */     rgb.put(EnumDyeColor.GRAY, new float[] { 0.3F, 0.3F, 0.3F });
/*  22: 54 */     rgb.put(EnumDyeColor.SILVER, new float[] { 0.6F, 0.6F, 0.6F });
/*  23: 55 */     rgb.put(EnumDyeColor.CYAN, new float[] { 0.3F, 0.5F, 0.6F });
/*  24: 56 */     rgb.put(EnumDyeColor.PURPLE, new float[] { 0.5F, 0.25F, 0.7F });
/*  25: 57 */     rgb.put(EnumDyeColor.BLUE, new float[] { 0.2F, 0.3F, 0.7F });
/*  26: 58 */     rgb.put(EnumDyeColor.BROWN, new float[] { 0.4F, 0.3F, 0.2F });
/*  27: 59 */     rgb.put(EnumDyeColor.GREEN, new float[] { 0.4F, 0.5F, 0.2F });
/*  28: 60 */     rgb.put(EnumDyeColor.RED, new float[] { 0.6F, 0.2F, 0.2F });
/*  29: 61 */     rgb.put(EnumDyeColor.BLACK, new float[] { 0.1F, 0.1F, 0.1F });
/*  30:    */   }
/*  31:    */   
/*  32:    */   public static float[] a(EnumDyeColor paramakv)
/*  33:    */   {
/*  34: 65 */     return rgb.get(paramakv);
/*  35:    */   }
/*  36:    */   
/*  37: 69 */   private yw bo = new yw(this);
/*  38:    */   
/*  39:    */   public EntitySheep(World paramaqu)
/*  40:    */   {
/*  41: 72 */     super(paramaqu);
/*  42: 73 */     a(0.9F, 1.3F);
/*  43:    */     
/*  44: 75 */     ((aay)getNavigator()).a(true);
/*  45: 76 */     this.goalSelector.addGoal(0, new GoalSwim(this));
/*  46: 77 */     this.goalSelector.addGoal(1, new zu(this, 1.25D));
/*  47: 78 */     this.goalSelector.addGoal(2, new yt(this, 1.0D));
/*  48: 79 */     this.goalSelector.addGoal(3, new aag(this, 1.1D, ItemList.wheat, false));
/*  49: 80 */     this.goalSelector.addGoal(4, new za(this, 1.1D));
/*  50: 81 */     this.goalSelector.addGoal(5, this.bo);
/*  51: 82 */     this.goalSelector.addGoal(6, new zy(this, 1.0D));
/*  52: 83 */     this.goalSelector.addGoal(7, new zh(this, EntityPlayer.class, 6.0F));
/*  53: 84 */     this.goalSelector.addGoal(8, new zx(this));
/*  54:    */     
/*  55: 86 */     this.bk.a(0, new ItemStack(ItemList.dye, 1, 0));
/*  56: 87 */     this.bk.a(1, new ItemStack(ItemList.dye, 1, 0));
/*  57:    */   }
/*  58:    */   
/*  59:    */   protected void mobTick()
/*  60:    */   {
/*  61: 92 */     this.bn = this.bo.f();
/*  62: 93 */     super.mobTick();
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void m()
/*  66:    */   {
/*  67: 98 */     if (this.world.isClient) {
/*  68: 99 */       this.bn = Math.max(0, this.bn - 1);
/*  69:    */     }
/*  70:101 */     super.m();
/*  71:    */   }
/*  72:    */   
/*  73:    */   protected void aW()
/*  74:    */   {
/*  75:106 */     super.aW();
/*  76:    */     
/*  77:108 */     getAttribute(MobAttribute.maxHealth).a(8.0D);
/*  78:109 */     getAttribute(MobAttribute.movementSpeed).a(0.2300000041723251D);
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected void h()
/*  82:    */   {
/*  83:114 */     super.h();
/*  84:    */     
/*  85:    */ 
/*  86:117 */     this.data.addData(16, new Byte((byte)0));
/*  87:    */   }
/*  88:    */   
/*  89:    */   protected void b(boolean paramBoolean, int paramInt)
/*  90:    */   {
/*  91:122 */     if (!ck()) {
/*  92:124 */       throwItem(new ItemStack(Item.fromBlock(BlockList.wool), 1, cj().a()), 0.0F);
/*  93:    */     }
/*  94:128 */     int i = this.rng.nextInt(2) + 1 + this.rng.nextInt(1 + paramInt);
/*  95:129 */     for (int j = 0; j < i; j++) {
/*  96:130 */       if (au()) {
/*  97:131 */         a(ItemList.bn, 1);
/*  98:    */       } else {
/*  99:133 */         a(ItemList.bm, 1);
/* 100:    */       }
/* 101:    */     }
/* 102:    */   }
/* 103:    */   
/* 104:    */   protected Item A()
/* 105:    */   {
/* 106:140 */     return Item.fromBlock(BlockList.wool);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void onSignal(byte paramByte)
/* 110:    */   {
/* 111:145 */     if (paramByte == 10) {
/* 112:146 */       this.bn = 40;
/* 113:    */     } else {
/* 114:148 */       super.onSignal(paramByte);
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public float o(float paramFloat)
/* 119:    */   {
/* 120:153 */     if (this.bn <= 0) {
/* 121:154 */       return 0.0F;
/* 122:    */     }
/* 123:156 */     if ((this.bn >= 4) && (this.bn <= 36)) {
/* 124:157 */       return 1.0F;
/* 125:    */     }
/* 126:159 */     if (this.bn < 4) {
/* 127:160 */       return (this.bn - paramFloat) / 4.0F;
/* 128:    */     }
/* 129:162 */     return -(this.bn - 40 - paramFloat) / 4.0F;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public float p(float paramFloat)
/* 133:    */   {
/* 134:166 */     if ((this.bn > 4) && (this.bn <= 36))
/* 135:    */     {
/* 136:167 */       float f = (this.bn - 4 - paramFloat) / 32.0F;
/* 137:168 */       return 0.6283186F + 0.2199115F * MathUtils.sin(f * 28.700001F);
/* 138:    */     }
/* 139:170 */     if (this.bn > 0) {
/* 140:171 */       return 0.6283186F;
/* 141:    */     }
/* 142:173 */     return this.pitch / 57.295776F;
/* 143:    */   }
/* 144:    */   
/* 145:    */   public boolean onRightClickMob(EntityPlayer paramahd)
/* 146:    */   {
/* 147:178 */     ItemStack localamj = paramahd.inventory.getHeldItem();
/* 148:180 */     if ((localamj != null) && (localamj.getItem() == ItemList.shears) && (!ck()) && (!i_()))
/* 149:    */     {
/* 150:181 */       if (!this.world.isClient)
/* 151:    */       {
/* 152:182 */         l(true);
/* 153:183 */         int i = 1 + this.rng.nextInt(3);
/* 154:184 */         for (int j = 0; j < i; j++)
/* 155:    */         {
/* 156:185 */           EntityItem localadw = throwItem(new ItemStack(Item.fromBlock(BlockList.wool), 1, cj().a()), 1.0F);
/* 157:186 */           localadw.yVelocity += this.rng.nextFloat() * 0.05F;
/* 158:187 */           localadw.xVelocity += (this.rng.nextFloat() - this.rng.nextFloat()) * 0.1F;
/* 159:188 */           localadw.zVelocity += (this.rng.nextFloat() - this.rng.nextFloat()) * 0.1F;
/* 160:    */         }
/* 161:    */       }
/* 162:191 */       localamj.a(1, paramahd);
/* 163:192 */       a("mob.sheep.shear", 1.0F, 1.0F);
/* 164:    */     }
/* 165:195 */     return super.onRightClickMob(paramahd);
/* 166:    */   }
/* 167:    */   
/* 168:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 169:    */   {
/* 170:200 */     super.writeEntityToNBT(paramfn);
/* 171:201 */     paramfn.setBoolean("Sheared", ck());
/* 172:202 */     paramfn.setByte("Color", (byte)cj().a());
/* 173:    */   }
/* 174:    */   
/* 175:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 176:    */   {
/* 177:207 */     super.readEntityFromNBT(paramfn);
/* 178:208 */     l(paramfn.getBoolean("Sheared"));
/* 179:209 */     b(EnumDyeColor.b(paramfn.d("Color")));
/* 180:    */   }
/* 181:    */   
/* 182:    */   protected String z()
/* 183:    */   {
/* 184:214 */     return "mob.sheep.say";
/* 185:    */   }
/* 186:    */   
/* 187:    */   protected String bn()
/* 188:    */   {
/* 189:219 */     return "mob.sheep.say";
/* 190:    */   }
/* 191:    */   
/* 192:    */   protected String bo()
/* 193:    */   {
/* 194:224 */     return "mob.sheep.say";
/* 195:    */   }
/* 196:    */   
/* 197:    */   protected void a(BlockPosition paramdt, BlockType paramatr)
/* 198:    */   {
/* 199:229 */     a("mob.sheep.step", 0.15F, 1.0F);
/* 200:    */   }
/* 201:    */   
/* 202:    */   public EnumDyeColor cj()
/* 203:    */   {
/* 204:233 */     return EnumDyeColor.b(this.data.getByte(16) & 0xF);
/* 205:    */   }
/* 206:    */   
/* 207:    */   public void b(EnumDyeColor paramakv)
/* 208:    */   {
/* 209:237 */     int i = this.data.getByte(16);
/* 210:238 */     this.data.b(16, Byte.valueOf((byte)(i & 0xF0 | paramakv.a() & 0xF)));
/* 211:    */   }
/* 212:    */   
/* 213:    */   public boolean ck()
/* 214:    */   {
/* 215:242 */     return (this.data.getByte(16) & 0x10) != 0;
/* 216:    */   }
/* 217:    */   
/* 218:    */   public void l(boolean paramBoolean)
/* 219:    */   {
/* 220:246 */     int i = this.data.getByte(16);
/* 221:247 */     if (paramBoolean) {
/* 222:248 */       this.data.b(16, Byte.valueOf((byte)(i | 0x10)));
/* 223:    */     } else {
/* 224:250 */       this.data.b(16, Byte.valueOf((byte)(i & 0xFFFFFFEF)));
/* 225:    */     }
/* 226:    */   }
/* 227:    */   
/* 228:    */   public static EnumDyeColor a(Random paramRandom)
/* 229:    */   {
/* 230:255 */     int i = paramRandom.nextInt(100);
/* 231:256 */     if (i < 5) {
/* 232:257 */       return EnumDyeColor.BLACK;
/* 233:    */     }
/* 234:259 */     if (i < 10) {
/* 235:260 */       return EnumDyeColor.GRAY;
/* 236:    */     }
/* 237:262 */     if (i < 15) {
/* 238:263 */       return EnumDyeColor.SILVER;
/* 239:    */     }
/* 240:265 */     if (i < 18) {
/* 241:266 */       return EnumDyeColor.BROWN;
/* 242:    */     }
/* 243:268 */     if (paramRandom.nextInt(500) == 0) {
/* 244:269 */       return EnumDyeColor.PINK;
/* 245:    */     }
/* 246:271 */     return EnumDyeColor.WHITE;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public EntitySheep getBaby(EntityPassiveMob paramws)
/* 250:    */   {
/* 251:276 */     EntitySheep localacl1 = (EntitySheep)paramws;
/* 252:277 */     EntitySheep localacl2 = new EntitySheep(this.world);
/* 253:    */     
/* 254:279 */     localacl2.b(a(this, localacl1));
/* 255:    */     
/* 256:281 */     return localacl2;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void v()
/* 260:    */   {
/* 261:286 */     l(false);
/* 262:287 */     if (i_()) {
/* 263:289 */       a(60);
/* 264:    */     }
/* 265:    */   }
/* 266:    */   
/* 267:    */   public xq beforeSpawn(vu paramvu, xq paramxq)
/* 268:    */   {
/* 269:296 */     paramxq = super.beforeSpawn(paramvu, paramxq);
/* 270:    */     
/* 271:298 */     b(a(this.world.rng));
/* 272:299 */     return paramxq;
/* 273:    */   }
/* 274:    */   
/* 275:    */   private EnumDyeColor a(EntityAnimal paramabq1, EntityAnimal paramabq2)
/* 276:    */   {
/* 277:303 */     int i = ((EntitySheep)paramabq1).cj().b();
/* 278:304 */     int j = ((EntitySheep)paramabq2).cj().b();
/* 279:    */     
/* 280:306 */     this.bk.get(0).b(i);
/* 281:307 */     this.bk.get(1).b(j);
/* 282:    */     
/* 283:309 */     ItemStack localamj = RecipeList.a().a(this.bk, ((EntitySheep)paramabq1).world);
/* 284:    */     int k;
/* 285:312 */     if ((localamj != null) && (localamj.getItem() == ItemList.dye)) {
/* 286:313 */       k = localamj.getDamage2();
/* 287:    */     } else {
/* 288:315 */       k = this.world.rng.nextBoolean() ? i : j;
/* 289:    */     }
/* 290:317 */     return EnumDyeColor.fromIndex(k);
/* 291:    */   }
/* 292:    */   
/* 293:    */   public float getEyeHeight()
/* 294:    */   {
/* 295:322 */     return 0.95F * this.height;
/* 296:    */   }
/* 297:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     acl
 * JD-Core Version:    0.7.0.1
 */