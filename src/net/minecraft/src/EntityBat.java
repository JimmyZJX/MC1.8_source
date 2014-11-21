package net.minecraft.src;
/*   1:    */ import java.util.Calendar;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class EntityBat
/*   5:    */   extends EntityAmbientMob
/*   6:    */ {
/*   7:    */   private BlockPosition a;
/*   8:    */   
/*   9:    */   public EntityBat(World paramaqu)
/*  10:    */   {
/*  11: 22 */     super(paramaqu);
/*  12:    */     
/*  13: 24 */     a(0.5F, 0.9F);
/*  14: 25 */     a(true);
/*  15:    */   }
/*  16:    */   
/*  17:    */   protected void h()
/*  18:    */   {
/*  19: 30 */     super.h();
/*  20:    */     
/*  21: 32 */     this.ac.a(16, new Byte((byte)0));
/*  22:    */   }
/*  23:    */   
/*  24:    */   protected float bA()
/*  25:    */   {
/*  26: 37 */     return 0.1F;
/*  27:    */   }
/*  28:    */   
/*  29:    */   protected float bB()
/*  30:    */   {
/*  31: 42 */     return super.bB() * 0.95F;
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected String z()
/*  35:    */   {
/*  36: 47 */     if ((n()) && (this.rng.nextInt(4) != 0)) {
/*  37: 48 */       return null;
/*  38:    */     }
/*  39: 50 */     return "mob.bat.idle";
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected String bn()
/*  43:    */   {
/*  44: 55 */     return "mob.bat.hurt";
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected String bo()
/*  48:    */   {
/*  49: 60 */     return "mob.bat.death";
/*  50:    */   }
/*  51:    */   
/*  52:    */   public boolean ae()
/*  53:    */   {
/*  54: 66 */     return false;
/*  55:    */   }
/*  56:    */   
/*  57:    */   protected void s(Entity paramwv) {}
/*  58:    */   
/*  59:    */   protected void bK() {}
/*  60:    */   
/*  61:    */   protected void aW()
/*  62:    */   {
/*  63: 81 */     super.aW();
/*  64:    */     
/*  65: 83 */     a(afs.a).a(6.0D);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public boolean n()
/*  69:    */   {
/*  70: 87 */     return (this.ac.a(16) & 0x1) != 0;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void a(boolean paramBoolean)
/*  74:    */   {
/*  75: 91 */     int i = this.ac.a(16);
/*  76: 92 */     if (paramBoolean) {
/*  77: 93 */       this.ac.b(16, Byte.valueOf((byte)(i | 0x1)));
/*  78:    */     } else {
/*  79: 95 */       this.ac.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFE)));
/*  80:    */     }
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void onUpdate()
/*  84:    */   {
/*  85:101 */     super.onUpdate();
/*  86:103 */     if (n())
/*  87:    */     {
/*  88:104 */       this.xVelocity = (this.yVelocity = this.zVelocity = 0.0D);
/*  89:105 */       this.yPos = (MathUtils.floor(this.yPos) + 1.0D - this.height);
/*  90:    */     }
/*  91:    */     else
/*  92:    */     {
/*  93:107 */       this.yVelocity *= 0.6000000238418579D;
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   protected void mobTick()
/*  98:    */   {
/*  99:113 */     super.mobTick();
/* 100:    */     
/* 101:115 */     BlockPosition localdt1 = new BlockPosition(this);
/* 102:116 */     BlockPosition localdt2 = localdt1.up();
/* 103:118 */     if (n())
/* 104:    */     {
/* 105:119 */       if (!this.world.getBlock(localdt2).getProto().blocksMovement())
/* 106:    */       {
/* 107:120 */         a(false);
/* 108:121 */         this.world.playLevelEvent(null, 1015, localdt1, 0);
/* 109:    */       }
/* 110:    */       else
/* 111:    */       {
/* 112:123 */         if (this.rng.nextInt(200) == 0) {
/* 113:124 */           this.aI = this.rng.nextInt(360);
/* 114:    */         }
/* 115:127 */         if (this.world.getNearestPlayer(this, 4.0D) != null)
/* 116:    */         {
/* 117:128 */           a(false);
/* 118:129 */           this.world.playLevelEvent(null, 1015, localdt1, 0);
/* 119:    */         }
/* 120:    */       }
/* 121:    */     }
/* 122:    */     else
/* 123:    */     {
/* 124:133 */       if ((this.a != null) && ((!this.world.isEmpty(this.a)) || (this.a.getY() < 1))) {
/* 125:134 */         this.a = null;
/* 126:    */       }
/* 127:136 */       if ((this.a == null) || (this.rng.nextInt(30) == 0) || (this.a.dist2((int)this.xPos, (int)this.yPos, (int)this.zPos) < 4.0D)) {
/* 128:137 */         this.a = new BlockPosition((int)this.xPos + this.rng.nextInt(7) - this.rng.nextInt(7), (int)this.yPos + this.rng.nextInt(6) - 2, (int)this.zPos + this.rng.nextInt(7) - this.rng.nextInt(7));
/* 129:    */       }
/* 130:140 */       double d1 = this.a.getX() + 0.5D - this.xPos;
/* 131:141 */       double d2 = this.a.getY() + 0.1D - this.yPos;
/* 132:142 */       double d3 = this.a.getZ() + 0.5D - this.zPos;
/* 133:    */       
/* 134:144 */       this.xVelocity += (Math.signum(d1) * 0.5D - this.xVelocity) * 0.1000000014901161D;
/* 135:145 */       this.yVelocity += (Math.signum(d2) * 0.699999988079071D - this.yVelocity) * 0.1000000014901161D;
/* 136:146 */       this.zVelocity += (Math.signum(d3) * 0.5D - this.zVelocity) * 0.1000000014901161D;
/* 137:    */       
/* 138:148 */       float f1 = (float)(Math.atan2(this.zVelocity, this.xVelocity) * 180.0D / 3.141592741012573D) - 90.0F;
/* 139:149 */       float f2 = MathUtils.wrapDegrees(f1 - this.yaw);
/* 140:150 */       this.aY = 0.5F;
/* 141:151 */       this.yaw += f2;
/* 142:153 */       if ((this.rng.nextInt(100) == 0) && (this.world.getBlock(localdt2).getProto().blocksMovement())) {
/* 143:154 */         a(true);
/* 144:    */       }
/* 145:    */     }
/* 146:    */   }
/* 147:    */   
/* 148:    */   protected boolean r_()
/* 149:    */   {
/* 150:161 */     return false;
/* 151:    */   }
/* 152:    */   
/* 153:    */   public void e(float paramFloat1, float paramFloat2) {}
/* 154:    */   
/* 155:    */   protected void a(double paramDouble, boolean paramBoolean, ProtoBlock paramatr, BlockPosition paramdt) {}
/* 156:    */   
/* 157:    */   public boolean aH()
/* 158:    */   {
/* 159:176 */     return true;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public boolean a(DamageSource paramwh, float paramFloat)
/* 163:    */   {
/* 164:181 */     if (b(paramwh)) {
/* 165:182 */       return false;
/* 166:    */     }
/* 167:184 */     if ((!this.world.isClient) && 
/* 168:185 */       (n())) {
/* 169:186 */       a(false);
/* 170:    */     }
/* 171:190 */     return super.a(paramwh, paramFloat);
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 175:    */   {
/* 176:195 */     super.readEntityFromNBT(paramfn);
/* 177:    */     
/* 178:197 */     this.ac.b(16, Byte.valueOf(paramfn.d("BatFlags")));
/* 179:    */   }
/* 180:    */   
/* 181:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 182:    */   {
/* 183:202 */     super.writeEntityToNBT(paramfn);
/* 184:    */     
/* 185:204 */     paramfn.setByte("BatFlags", this.ac.a(16));
/* 186:    */   }
/* 187:    */   
/* 188:    */   public boolean canSpawn()
/* 189:    */   {
/* 190:209 */     BlockPosition localdt = new BlockPosition(this.xPos, getAABB().minY, this.zPos);
/* 191:210 */     if (localdt.getY() >= 63) {
/* 192:211 */       return false;
/* 193:    */     }
/* 194:214 */     int i = this.world.l(localdt);
/* 195:215 */     int j = 4;
/* 196:217 */     if (a(this.world.Y())) {
/* 197:218 */       j = 7;
/* 198:219 */     } else if (this.rng.nextBoolean()) {
/* 199:220 */       return false;
/* 200:    */     }
/* 201:223 */     if (i > this.rng.nextInt(j)) {
/* 202:224 */       return false;
/* 203:    */     }
/* 204:227 */     return super.canSpawn();
/* 205:    */   }
/* 206:    */   
/* 207:    */   private boolean a(Calendar paramCalendar)
/* 208:    */   {
/* 209:231 */     return ((paramCalendar.get(2) + 1 == 10) && (paramCalendar.get(5) >= 20)) || ((paramCalendar.get(2) + 1 == 11) && (paramCalendar.get(5) <= 3));
/* 210:    */   }
/* 211:    */   
/* 212:    */   public float getEyeHeight()
/* 213:    */   {
/* 214:236 */     return this.height / 2.0F;
/* 215:    */   }
/* 216:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abo
 * JD-Core Version:    0.7.0.1
 */