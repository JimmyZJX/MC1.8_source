package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class EntityCreeper
/*   4:    */   extends EntityHostileMob
/*   5:    */ {
/*   6:    */   private int b;
/*   7:    */   private int c;
/*   8: 31 */   private int bk = 30;
/*   9: 32 */   private int bl = 3;
/*  10: 33 */   private int bm = 0;
/*  11:    */   
/*  12:    */   public EntityCreeper(World paramaqu)
/*  13:    */   {
/*  14: 36 */     super(paramaqu);
/*  15:    */     
/*  16: 38 */     this.i.a(1, new yy(this));
/*  17: 39 */     this.i.a(2, new aae(this));
/*  18: 40 */     this.i.a(2, this.a);
/*  19: 41 */     this.i.a(3, new yp(this, new aeq(this), 6.0F, 1.0D, 1.2D));
/*  20:    */     
/*  21:    */ 
/*  22:    */ 
/*  23:    */ 
/*  24:    */ 
/*  25: 47 */     this.i.a(4, new zk(this, 1.0D, false));
/*  26: 48 */     this.i.a(5, new zy(this, 0.8D));
/*  27: 49 */     this.i.a(6, new zh(this, EntityPlayer.class, 8.0F));
/*  28: 50 */     this.i.a(6, new zx(this));
/*  29:    */     
/*  30: 52 */     this.bg.a(1, new aaq(this, EntityPlayer.class, true));
/*  31: 53 */     this.bg.a(2, new aal(this, false, new Class[0]));
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void aW()
/*  35:    */   {
/*  36: 58 */     super.aW();
/*  37:    */     
/*  38: 60 */     a(afs.d).a(0.25D);
/*  39:    */   }
/*  40:    */   
/*  41:    */   public int aF()
/*  42:    */   {
/*  43: 65 */     if (u() == null) {
/*  44: 66 */       return 3;
/*  45:    */     }
/*  46: 69 */     return 3 + (int)(getHealth() - 1.0F);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void e(float paramFloat1, float paramFloat2)
/*  50:    */   {
/*  51: 74 */     super.e(paramFloat1, paramFloat2);
/*  52:    */     
/*  53: 76 */     this.c = ((int)(this.c + paramFloat1 * 1.5F));
/*  54: 77 */     if (this.c > this.bk - 5) {
/*  55: 78 */       this.c = (this.bk - 5);
/*  56:    */     }
/*  57:    */   }
/*  58:    */   
/*  59:    */   protected void h()
/*  60:    */   {
/*  61: 84 */     super.h();
/*  62:    */     
/*  63: 86 */     this.ac.a(16, Byte.valueOf((byte)-1));
/*  64: 87 */     this.ac.a(17, Byte.valueOf((byte)0));
/*  65: 88 */     this.ac.a(18, Byte.valueOf((byte)0));
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/*  69:    */   {
/*  70: 93 */     super.writeEntityToNBT(paramfn);
/*  71: 94 */     if (this.ac.a(17) == 1) {
/*  72: 95 */       paramfn.setBoolean("powered", true);
/*  73:    */     }
/*  74: 97 */     paramfn.setShort("Fuse", (short)this.bk);
/*  75: 98 */     paramfn.setByte("ExplosionRadius", (byte)this.bl);
/*  76: 99 */     paramfn.setBoolean("ignited", cl());
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/*  80:    */   {
/*  81:104 */     super.readEntityFromNBT(paramfn);
/*  82:105 */     this.ac.b(17, Byte.valueOf((byte)(paramfn.getBoolean("powered") ? 1 : 0)));
/*  83:106 */     if (paramfn.hasKey("Fuse", 99)) {
/*  84:107 */       this.bk = paramfn.e("Fuse");
/*  85:    */     }
/*  86:109 */     if (paramfn.hasKey("ExplosionRadius", 99)) {
/*  87:110 */       this.bl = paramfn.d("ExplosionRadius");
/*  88:    */     }
/*  89:112 */     if (paramfn.getBoolean("ignited")) {
/*  90:113 */       cm();
/*  91:    */     }
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void onUpdate()
/*  95:    */   {
/*  96:119 */     if (ai())
/*  97:    */     {
/*  98:120 */       this.b = this.c;
/*  99:123 */       if (cl()) {
/* 100:124 */         a(1);
/* 101:    */       }
/* 102:127 */       int i = ck();
/* 103:128 */       if ((i > 0) && (this.c == 0)) {
/* 104:129 */         a("creeper.primed", 1.0F, 0.5F);
/* 105:    */       }
/* 106:131 */       this.c += i;
/* 107:132 */       if (this.c < 0) {
/* 108:133 */         this.c = 0;
/* 109:    */       }
/* 110:135 */       if (this.c >= this.bk)
/* 111:    */       {
/* 112:136 */         this.c = this.bk;
/* 113:137 */         cp();
/* 114:    */       }
/* 115:    */     }
/* 116:140 */     super.onUpdate();
/* 117:    */   }
/* 118:    */   
/* 119:    */   protected String bn()
/* 120:    */   {
/* 121:145 */     return "mob.creeper.say";
/* 122:    */   }
/* 123:    */   
/* 124:    */   protected String bo()
/* 125:    */   {
/* 126:150 */     return "mob.creeper.death";
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void a(wh paramwh)
/* 130:    */   {
/* 131:155 */     super.a(paramwh);
/* 132:157 */     if ((paramwh.j() instanceof EntitySkeleton))
/* 133:    */     {
/* 134:159 */       int i = Item.b(ItemList.cq);
/* 135:160 */       int j = Item.b(ItemList.cB);
/* 136:161 */       int k = i + this.random.nextInt(j - i + 1);
/* 137:162 */       a(Item.b(k), 1);
/* 138:    */     }
/* 139:163 */     else if (((paramwh.j() instanceof EntityCreeper)) && 
/* 140:164 */       (paramwh.j() != this) && (((EntityCreeper)paramwh.j()).n()) && (((EntityCreeper)paramwh.j()).cn()))
/* 141:    */     {
/* 142:165 */       ((EntityCreeper)paramwh.j()).co();
/* 143:166 */       a(new ItemStack(ItemList.bX, 1, 4), 0.0F);
/* 144:    */     }
/* 145:    */   }
/* 146:    */   
/* 147:    */   public boolean r(Entity paramwv)
/* 148:    */   {
/* 149:173 */     return true;
/* 150:    */   }
/* 151:    */   
/* 152:    */   public boolean n()
/* 153:    */   {
/* 154:177 */     return this.ac.a(17) == 1;
/* 155:    */   }
/* 156:    */   
/* 157:    */   public float a(float paramFloat)
/* 158:    */   {
/* 159:181 */     return (this.b + (this.c - this.b) * paramFloat) / (this.bk - 2);
/* 160:    */   }
/* 161:    */   
/* 162:    */   protected Item A()
/* 163:    */   {
/* 164:186 */     return ItemList.H;
/* 165:    */   }
/* 166:    */   
/* 167:    */   public int ck()
/* 168:    */   {
/* 169:190 */     return this.ac.a(16);
/* 170:    */   }
/* 171:    */   
/* 172:    */   public void a(int paramInt)
/* 173:    */   {
/* 174:194 */     this.ac.b(16, Byte.valueOf((byte)paramInt));
/* 175:    */   }
/* 176:    */   
/* 177:    */   public void a(ads paramads)
/* 178:    */   {
/* 179:199 */     super.a(paramads);
/* 180:200 */     this.ac.b(17, Byte.valueOf((byte)1));
/* 181:    */   }
/* 182:    */   
/* 183:    */   protected boolean a(EntityPlayer paramahd)
/* 184:    */   {
/* 185:205 */     ItemStack localamj = paramahd.bg.h();
/* 186:206 */     if ((localamj != null) && (localamj.getItem() == ItemList.d))
/* 187:    */     {
/* 188:207 */       this.world.a(this.xPos + 0.5D, this.yPos + 0.5D, this.zPos + 0.5D, "fire.ignite", 1.0F, this.random.nextFloat() * 0.4F + 0.8F);
/* 189:208 */       paramahd.bv();
/* 190:209 */       if (!this.world.isClient)
/* 191:    */       {
/* 192:210 */         cm();
/* 193:211 */         localamj.a(1, paramahd);
/* 194:212 */         return true;
/* 195:    */       }
/* 196:    */     }
/* 197:216 */     return super.a(paramahd);
/* 198:    */   }
/* 199:    */   
/* 200:    */   private void cp()
/* 201:    */   {
/* 202:220 */     if (!this.world.isClient)
/* 203:    */     {
/* 204:221 */       boolean bool = this.world.getGameRules().getBoolean("mobGriefing");
/* 205:222 */       float f = n() ? 2.0F : 1.0F;
/* 206:223 */       this.world.a(this, this.xPos, this.yPos, this.zPos, this.bl * f, bool);
/* 207:224 */       setDead();
/* 208:    */     }
/* 209:    */   }
/* 210:    */   
/* 211:    */   public boolean cl()
/* 212:    */   {
/* 213:229 */     return this.ac.a(18) != 0;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void cm()
/* 217:    */   {
/* 218:233 */     this.ac.b(18, Byte.valueOf((byte)1));
/* 219:    */   }
/* 220:    */   
/* 221:    */   public boolean cn()
/* 222:    */   {
/* 223:237 */     return (this.bm < 1) && (this.world.getGameRules().getBoolean("doMobLoot"));
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void co()
/* 227:    */   {
/* 228:241 */     this.bm += 1;
/* 229:    */   }
/* 230:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aep
 * JD-Core Version:    0.7.0.1
 */