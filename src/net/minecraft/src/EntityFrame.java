package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.List;
/*   3:    */ import org.apache.commons.lang3.Validate;
/*   4:    */ 
/*   5:    */ public abstract class EntityFrame
/*   6:    */   extends Entity
/*   7:    */ {
/*   8:    */   private int c;
/*   9:    */   protected BlockPosition a;
/*  10:    */   public EnumDirection b;
/*  11:    */   
/*  12:    */   public EntityFrame(World paramaqu)
/*  13:    */   {
/*  14: 24 */     super(paramaqu);
/*  15: 25 */     a(0.5F, 0.5F);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public EntityFrame(World paramaqu, BlockPosition paramdt)
/*  19:    */   {
/*  20: 29 */     this(paramaqu);
/*  21: 30 */     this.a = paramdt;
/*  22:    */   }
/*  23:    */   
/*  24:    */   protected void h() {}
/*  25:    */   
/*  26:    */   protected void a(EnumDirection paramej)
/*  27:    */   {
/*  28: 38 */     Validate.notNull(paramej);
/*  29: 39 */     Validate.isTrue(paramej.k().c());
/*  30:    */     
/*  31: 41 */     this.b = paramej;
/*  32: 42 */     this.lastYaw = (this.yaw = this.b.b() * 90);
/*  33:    */     
/*  34: 44 */     o();
/*  35:    */   }
/*  36:    */   
/*  37:    */   private void o()
/*  38:    */   {
/*  39: 48 */     if (this.b == null) {
/*  40: 49 */       return;
/*  41:    */     }
/*  42: 52 */     double d1 = this.a.getX() + 0.5D;
/*  43: 53 */     double d2 = this.a.getY() + 0.5D;
/*  44: 54 */     double d3 = this.a.getZ() + 0.5D;
/*  45:    */     
/*  46: 56 */     double d4 = 0.46875D;
/*  47: 57 */     double d5 = a(l());
/*  48: 58 */     double d6 = a(m());
/*  49:    */     
/*  50: 60 */     d1 -= this.b.g() * 0.46875D;
/*  51: 61 */     d3 -= this.b.i() * 0.46875D;
/*  52: 62 */     d2 += d6;
/*  53:    */     
/*  54: 64 */     EnumDirection localej = this.b.f();
/*  55: 65 */     d1 += d5 * localej.g();
/*  56: 66 */     d3 += d5 * localej.i();
/*  57:    */     
/*  58: 68 */     this.xPos = d1;
/*  59: 69 */     this.yPos = d2;
/*  60: 70 */     this.zPos = d3;
/*  61:    */     
/*  62: 72 */     double d7 = l();
/*  63: 73 */     double d8 = m();
/*  64: 74 */     double d9 = l();
/*  65: 76 */     if (this.b.k() == EnumAxis.Z) {
/*  66: 77 */       d9 = 1.0D;
/*  67:    */     } else {
/*  68: 79 */       d7 = 1.0D;
/*  69:    */     }
/*  70: 82 */     d7 /= 32.0D;
/*  71: 83 */     d8 /= 32.0D;
/*  72: 84 */     d9 /= 32.0D;
/*  73: 85 */     setAABB(new AABB(d1 - d7, d2 - d8, d3 - d9, d1 + d7, d2 + d8, d3 + d9));
/*  74:    */   }
/*  75:    */   
/*  76:    */   private double a(int paramInt)
/*  77:    */   {
/*  78: 89 */     return paramInt % 32 == 0 ? 0.5D : 0.0D;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void onUpdate()
/*  82:    */   {
/*  83: 94 */     this.lastX = this.xPos;
/*  84: 95 */     this.lastY = this.yPos;
/*  85: 96 */     this.lastZ = this.zPos;
/*  86: 97 */     if ((this.c++ == 100) && (!this.world.isClient))
/*  87:    */     {
/*  88: 98 */       this.c = 0;
/*  89: 99 */       if ((!this.isDead) && (!j()))
/*  90:    */       {
/*  91:100 */         setDead();
/*  92:101 */         b((Entity)null);
/*  93:    */       }
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   public boolean j()
/*  98:    */   {
/*  99:107 */     if (!this.world.getCollidingAABBs(this, getAABB()).isEmpty()) {
/* 100:108 */       return false;
/* 101:    */     }
/* 102:111 */     int i = Math.max(1, l() / 16);
/* 103:112 */     int j = Math.max(1, m() / 16);
/* 104:    */     
/* 105:114 */     BlockPosition localdt = this.a.a(this.b.d());
/* 106:115 */     EnumDirection localej = this.b.f();
/* 107:    */     Object localObject;
/* 108:117 */     for (int k = 0; k < i; k++) {
/* 109:118 */       for (int m = 0; m < j; m++)
/* 110:    */       {
/* 111:119 */         localObject = localdt.a(localej, k).up(m);
/* 112:    */         
/* 113:121 */         ProtoBlock localatr = this.world.getBlock((BlockPosition)localObject).getProto();
/* 114:122 */         if ((!localatr.getMaterial().a()) && (!ava.d(localatr))) {
/* 115:123 */           return false;
/* 116:    */         }
/* 117:    */       }
/* 118:    */     }
/* 119:128 */     List<Entity> localList = this.world.b(this, getAABB());
/* 120:129 */     for (Iterator<Entity> localIterator = localList.iterator(); localIterator.hasNext();)
/* 121:    */     {
/* 122:129 */       localObject = (Entity)localIterator.next();
/* 123:130 */       if ((localObject instanceof EntityFrame)) {
/* 124:131 */         return false;
/* 125:    */       }
/* 126:    */     }
/* 127:135 */     return true;
/* 128:    */   }
/* 129:    */   
/* 130:    */   public boolean ad()
/* 131:    */   {
/* 132:140 */     return true;
/* 133:    */   }
/* 134:    */   
/* 135:    */   public boolean l(Entity paramwv)
/* 136:    */   {
/* 137:145 */     if ((paramwv instanceof EntityPlayer)) {
/* 138:146 */       return a(DamageSource.a((EntityPlayer)paramwv), 0.0F);
/* 139:    */     }
/* 140:148 */     return false;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public EnumDirection aO()
/* 144:    */   {
/* 145:153 */     return this.b;
/* 146:    */   }
/* 147:    */   
/* 148:    */   public boolean a(DamageSource paramwh, float paramFloat)
/* 149:    */   {
/* 150:158 */     if (b(paramwh)) {
/* 151:159 */       return false;
/* 152:    */     }
/* 153:161 */     if ((!this.isDead) && (!this.world.isClient))
/* 154:    */     {
/* 155:162 */       setDead();
/* 156:163 */       ac();
/* 157:164 */       b(paramwh.j());
/* 158:    */     }
/* 159:166 */     return true;
/* 160:    */   }
/* 161:    */   
/* 162:    */   public void d(double paramDouble1, double paramDouble2, double paramDouble3)
/* 163:    */   {
/* 164:171 */     if ((!this.world.isClient) && (!this.isDead) && (paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3 > 0.0D))
/* 165:    */     {
/* 166:172 */       setDead();
/* 167:173 */       b((Entity)null);
/* 168:    */     }
/* 169:    */   }
/* 170:    */   
/* 171:    */   public void g(double paramDouble1, double paramDouble2, double paramDouble3)
/* 172:    */   {
/* 173:179 */     if ((!this.world.isClient) && (!this.isDead) && (paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2 + paramDouble3 * paramDouble3 > 0.0D))
/* 174:    */     {
/* 175:180 */       setDead();
/* 176:181 */       b((Entity)null);
/* 177:    */     }
/* 178:    */   }
/* 179:    */   
/* 180:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 181:    */   {
/* 182:187 */     paramfn.setByte("Facing", (byte)this.b.b());
/* 183:188 */     paramfn.setInt("TileX", n().getX());
/* 184:189 */     paramfn.setInt("TileY", n().getY());
/* 185:190 */     paramfn.setInt("TileZ", n().getZ());
/* 186:    */   }
/* 187:    */   
/* 188:    */   public void readEntityFromNBT(NBTTagCompound paramfn)
/* 189:    */   {
/* 190:196 */     this.a = new BlockPosition(paramfn.getInteger("TileX"), paramfn.getInteger("TileY"), paramfn.getInteger("TileZ"));
/* 191:    */     EnumDirection localej;
/* 192:198 */     if (paramfn.hasKey("Direction", 99))
/* 193:    */     {
/* 194:199 */       localej = EnumDirection.b(paramfn.d("Direction"));
/* 195:200 */       this.a = this.a.a(localej);
/* 196:    */     }
/* 197:201 */     else if (paramfn.hasKey("Facing", 99))
/* 198:    */     {
/* 199:202 */       localej = EnumDirection.b(paramfn.d("Facing"));
/* 200:    */     }
/* 201:    */     else
/* 202:    */     {
/* 203:204 */       localej = EnumDirection.b(paramfn.d("Dir"));
/* 204:    */     }
/* 205:207 */     a(localej);
/* 206:    */   }
/* 207:    */   
/* 208:    */   public abstract int l();
/* 209:    */   
/* 210:    */   public abstract int m();
/* 211:    */   
/* 212:    */   public abstract void b(Entity paramwv);
/* 213:    */   
/* 214:    */   protected boolean af()
/* 215:    */   {
/* 216:218 */     return false;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void b(double paramDouble1, double paramDouble2, double paramDouble3)
/* 220:    */   {
/* 221:223 */     this.xPos = paramDouble1;
/* 222:224 */     this.yPos = paramDouble2;
/* 223:225 */     this.zPos = paramDouble3;
/* 224:226 */     BlockPosition localdt = this.a;
/* 225:227 */     this.a = new BlockPosition(paramDouble1, paramDouble2, paramDouble3);
/* 226:228 */     if (!this.a.equals(localdt))
/* 227:    */     {
/* 228:229 */       o();
/* 229:230 */       this.ai = true;
/* 230:    */     }
/* 231:    */   }
/* 232:    */   
/* 233:    */   public BlockPosition n()
/* 234:    */   {
/* 235:235 */     return this.a;
/* 236:    */   }
/* 237:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adj
 * JD-Core Version:    0.7.0.1
 */