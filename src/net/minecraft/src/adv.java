package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   4:    */ 
/*   5:    */ public class adv
/*   6:    */   extends Entity
/*   7:    */ {
/*   8:    */   private Block d;
/*   9:    */   public int a;
/*  10: 28 */   public boolean b = true;
/*  11:    */   private boolean e;
/*  12:    */   private boolean f;
/*  13: 31 */   private int g = 40;
/*  14: 32 */   private float h = 2.0F;
/*  15:    */   public NBTTagCompound c;
/*  16:    */   
/*  17:    */   public adv(World paramaqu)
/*  18:    */   {
/*  19: 36 */     super(paramaqu);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public adv(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, Block parambec)
/*  23:    */   {
/*  24: 40 */     super(paramaqu);
/*  25: 41 */     this.d = parambec;
/*  26: 42 */     this.k = true;
/*  27: 43 */     a(0.98F, 0.98F);
/*  28: 44 */     setPos(paramDouble1, paramDouble2, paramDouble3);
/*  29:    */     
/*  30: 46 */     this.xVelocity = 0.0D;
/*  31: 47 */     this.yVelocity = 0.0D;
/*  32: 48 */     this.zVelocity = 0.0D;
/*  33:    */     
/*  34: 50 */     this.lastX = paramDouble1;
/*  35: 51 */     this.lastY = paramDouble2;
/*  36: 52 */     this.lastZ = paramDouble3;
/*  37:    */   }
/*  38:    */   
/*  39:    */   protected boolean r_()
/*  40:    */   {
/*  41: 57 */     return false;
/*  42:    */   }
/*  43:    */   
/*  44:    */   protected void h() {}
/*  45:    */   
/*  46:    */   public boolean ad()
/*  47:    */   {
/*  48: 66 */     return !this.isDead;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void onUpdate()
/*  52:    */   {
/*  53: 71 */     ProtoBlock localatr = this.d.getProto();
/*  54: 72 */     if (localatr.getMaterial() == Material.air)
/*  55:    */     {
/*  56: 73 */       setDead();
/*  57: 74 */       return;
/*  58:    */     }
/*  59: 77 */     this.lastX = this.xPos;
/*  60: 78 */     this.lastY = this.yPos;
/*  61: 79 */     this.lastZ = this.zPos;
/*  62:    */     BlockPosition localdt;
/*  63: 81 */     if (this.a++ == 0)
/*  64:    */     {
/*  65: 82 */       localdt = new BlockPosition(this);
/*  66: 83 */       if (this.world.getBlock(localdt).getProto() == localatr)
/*  67:    */       {
/*  68: 84 */         this.world.g(localdt);
/*  69:    */       }
/*  70: 85 */       else if (!this.world.isClient)
/*  71:    */       {
/*  72: 86 */         setDead();
/*  73: 87 */         return;
/*  74:    */       }
/*  75:    */     }
/*  76: 91 */     this.yVelocity -= 0.03999999910593033D;
/*  77: 92 */     d(this.xVelocity, this.yVelocity, this.zVelocity);
/*  78: 93 */     this.xVelocity *= 0.9800000190734863D;
/*  79: 94 */     this.yVelocity *= 0.9800000190734863D;
/*  80: 95 */     this.zVelocity *= 0.9800000190734863D;
/*  81: 97 */     if (!this.world.isClient)
/*  82:    */     {
/*  83: 98 */       localdt = new BlockPosition(this);
/*  84:100 */       if (this.C)
/*  85:    */       {
/*  86:101 */         this.xVelocity *= 0.699999988079071D;
/*  87:102 */         this.zVelocity *= 0.699999988079071D;
/*  88:103 */         this.yVelocity *= -0.5D;
/*  89:105 */         if (this.world.getBlock(localdt).getProto() != BlockList.M)
/*  90:    */         {
/*  91:106 */           setDead();
/*  92:108 */           if ((!this.e) && (this.world.a(localatr, localdt, true, EnumDirection.UP, null, null)) && (!avt.d(this.world, localdt.down())) && (this.world.setBlock(localdt, this.d, 3)))
/*  93:    */           {
/*  94:109 */             if ((localatr instanceof avt)) {
/*  95:110 */               ((avt)localatr).a_(this.world, localdt);
/*  96:    */             }
/*  97:112 */             if ((this.c != null) && ((localatr instanceof avs)))
/*  98:    */             {
/*  99:113 */               bcm localbcm = this.world.s(localdt);
/* 100:115 */               if (localbcm != null)
/* 101:    */               {
/* 102:116 */                 NBTTagCompound localfn = new NBTTagCompound();
/* 103:117 */                 localbcm.writeToNBT(localfn);
/* 104:118 */                 for (String str : this.c.c())
/* 105:    */                 {
/* 106:119 */                   NBTBase localgd = this.c.a(str);
/* 107:120 */                   if ((!str.equals("x")) && (!str.equals("y")) && (!str.equals("z"))) {
/* 108:123 */                     localfn.setNBT(str, localgd.b());
/* 109:    */                   }
/* 110:    */                 }
/* 111:125 */                 localbcm.readFromNBT(localfn);
/* 112:126 */                 localbcm.o_();
/* 113:    */               }
/* 114:    */             }
/* 115:    */           }
/* 116:130 */           else if ((this.b) && (!this.e) && (this.world.getGameRules().getBoolean("doTileDrops")))
/* 117:    */           {
/* 118:131 */             throwItem(new ItemStack(localatr, 1, localatr.a(this.d)), 0.0F);
/* 119:    */           }
/* 120:    */         }
/* 121:    */       }
/* 122:135 */       else if (((this.a > 100) && (!this.world.isClient) && ((localdt.getY() < 1) || (localdt.getY() > 256))) || (this.a > 600))
/* 123:    */       {
/* 124:136 */         if ((this.b) && (this.world.getGameRules().getBoolean("doTileDrops"))) {
/* 125:137 */           throwItem(new ItemStack(localatr, 1, localatr.a(this.d)), 0.0F);
/* 126:    */         }
/* 127:139 */         setDead();
/* 128:    */       }
/* 129:    */     }
/* 130:    */   }
/* 131:    */   
/* 132:    */   public void e(float paramFloat1, float paramFloat2)
/* 133:    */   {
/* 134:146 */     ProtoBlock localatr = this.d.getProto();
/* 135:147 */     if (this.f)
/* 136:    */     {
/* 137:148 */       int i = MathUtils.ceil(paramFloat1 - 1.0F);
/* 138:149 */       if (i > 0)
/* 139:    */       {
/* 140:150 */         ArrayList<Entity> localArrayList = Lists.newArrayList(this.world.b(this, getAABB()));
/* 141:151 */         int j = localatr == BlockList.cf ? 1 : 0;
/* 142:152 */         DamageSource localwh = j != 0 ? DamageSource.n : DamageSource.o;
/* 143:154 */         for (Entity localwv : localArrayList) {
/* 144:155 */           localwv.a(localwh, Math.min(MathUtils.floor(i * this.h), this.g));
/* 145:    */         }
/* 146:158 */         if ((j != 0) && (this.rng.nextFloat() < 0.0500000007450581D + i * 0.05D))
/* 147:    */         {
/* 148:159 */           int k = ((Integer)this.d.getProperty(BlockAnvil.b)).intValue();
/* 149:    */           
/* 150:161 */           k++;
/* 151:161 */           if (k > 2) {
/* 152:162 */             this.e = true;
/* 153:    */           } else {
/* 154:164 */             this.d = this.d.setData(BlockAnvil.b, Integer.valueOf(k));
/* 155:    */           }
/* 156:    */         }
/* 157:    */       }
/* 158:    */     }
/* 159:    */   }
/* 160:    */   
/* 161:    */   protected void writeEntityToNBT(NBTTagCompound paramfn)
/* 162:    */   {
/* 163:173 */     ProtoBlock localatr = this.d != null ? this.d.getProto() : BlockList.air;
/* 164:174 */     oa localoa = (oa)ProtoBlock.c.c(localatr);
/* 165:175 */     paramfn.setString("Block", localoa == null ? "" : localoa.toString());
/* 166:176 */     paramfn.setByte("Data", (byte)localatr.c(this.d));
/* 167:177 */     paramfn.setByte("Time", (byte)this.a);
/* 168:178 */     paramfn.setBoolean("DropItem", this.b);
/* 169:179 */     paramfn.setBoolean("HurtEntities", this.f);
/* 170:180 */     paramfn.setFloat("FallHurtAmount", this.h);
/* 171:181 */     paramfn.setInt("FallHurtMax", this.g);
/* 172:182 */     if (this.c != null) {
/* 173:183 */       paramfn.setNBT("TileEntityData", this.c);
/* 174:    */     }
/* 175:    */   }
/* 176:    */   
/* 177:    */   protected void readEntityFromNBT(NBTTagCompound paramfn)
/* 178:    */   {
/* 179:189 */     int i = paramfn.d("Data") & 0xFF;
/* 180:190 */     if (paramfn.hasKey("Block", 8)) {
/* 181:191 */       this.d = ProtoBlock.b(paramfn.getString("Block")).instance(i);
/* 182:192 */     } else if (paramfn.hasKey("TileID", 99)) {
/* 183:193 */       this.d = ProtoBlock.c(paramfn.getInteger("TileID")).instance(i);
/* 184:    */     } else {
/* 185:195 */       this.d = ProtoBlock.c(paramfn.d("Tile") & 0xFF).instance(i);
/* 186:    */     }
/* 187:198 */     this.a = (paramfn.d("Time") & 0xFF);
/* 188:    */     
/* 189:200 */     ProtoBlock localatr = this.d.getProto();
/* 190:201 */     if (paramfn.hasKey("HurtEntities", 99))
/* 191:    */     {
/* 192:202 */       this.f = paramfn.getBoolean("HurtEntities");
/* 193:203 */       this.h = paramfn.getFloat("FallHurtAmount");
/* 194:204 */       this.g = paramfn.getInteger("FallHurtMax");
/* 195:    */     }
/* 196:205 */     else if (localatr == BlockList.cf)
/* 197:    */     {
/* 198:206 */       this.f = true;
/* 199:    */     }
/* 200:209 */     if (paramfn.hasKey("DropItem", 99)) {
/* 201:210 */       this.b = paramfn.getBoolean("DropItem");
/* 202:    */     }
/* 203:213 */     if (paramfn.hasKey("TileEntityData", 10)) {
/* 204:214 */       this.c = paramfn.getCompoundTag("TileEntityData");
/* 205:    */     }
/* 206:217 */     if ((localatr == null) || (localatr.getMaterial() == Material.air)) {
/* 207:218 */       this.d = BlockList.sand.instance();
/* 208:    */     }
/* 209:    */   }
/* 210:    */   
/* 211:    */   public World j()
/* 212:    */   {
/* 213:223 */     return this.world;
/* 214:    */   }
/* 215:    */   
/* 216:    */   public void a(boolean paramBoolean)
/* 217:    */   {
/* 218:227 */     this.f = paramBoolean;
/* 219:    */   }
/* 220:    */   
/* 221:    */   public boolean aI()
/* 222:    */   {
/* 223:232 */     return false;
/* 224:    */   }
/* 225:    */   
/* 226:    */   public void a(j paramj)
/* 227:    */   {
/* 228:237 */     super.a(paramj);
/* 229:238 */     if (this.d != null)
/* 230:    */     {
/* 231:239 */       ProtoBlock localatr = this.d.getProto();
/* 232:240 */       paramj.a("Immitating block ID", Integer.valueOf(ProtoBlock.a(localatr)));
/* 233:241 */       paramj.a("Immitating block data", Integer.valueOf(localatr.c(this.d)));
/* 234:    */     }
/* 235:    */   }
/* 236:    */   
/* 237:    */   public Block l()
/* 238:    */   {
/* 239:247 */     return this.d;
/* 240:    */   }
/* 241:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adv
 * JD-Core Version:    0.7.0.1
 */