package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class yu
/*   4:    */   extends GoalType
/*   5:    */ {
/*   6:    */   private final EntityMob a;
/*   7:    */   private final float b;
/*   8:    */   private float c;
/*   9:    */   private boolean d;
/*  10:    */   private int e;
/*  11:    */   private int f;
/*  12:    */   
/*  13:    */   public yu(EntityMob paramxn, float paramFloat)
/*  14:    */   {
/*  15: 31 */     this.a = paramxn;
/*  16: 32 */     this.b = paramFloat;
/*  17: 33 */     a(7);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void start()
/*  21:    */   {
/*  22: 38 */     this.c = 0.0F;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void stop()
/*  26:    */   {
/*  27: 43 */     this.d = false;
/*  28: 44 */     this.c = 0.0F;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean canStart()
/*  32:    */   {
/*  33: 49 */     return (this.a.ai()) && (this.a.rider != null) && ((this.a.rider instanceof EntityPlayer)) && ((this.d) || (this.a.bV()));
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void tick()
/*  37:    */   {
/*  38: 54 */     EntityPlayer localahd = (EntityPlayer)this.a.rider;
/*  39: 55 */     EntityWalkingMob localxu = (EntityWalkingMob)this.a;
/*  40:    */     
/*  41: 57 */     float f1 = MathUtils.wrapDegrees(localahd.yaw - this.a.yaw) * 0.5F;
/*  42: 58 */     if (f1 > 5.0F) {
/*  43: 59 */       f1 = 5.0F;
/*  44:    */     }
/*  45: 61 */     if (f1 < -5.0F) {
/*  46: 62 */       f1 = -5.0F;
/*  47:    */     }
/*  48: 65 */     this.a.yaw = MathUtils.wrapDegrees(this.a.yaw + f1);
/*  49: 66 */     if (this.c < this.b) {
/*  50: 67 */       this.c += (this.b - this.c) * 0.01F;
/*  51:    */     }
/*  52: 69 */     if (this.c > this.b) {
/*  53: 70 */       this.c = this.b;
/*  54:    */     }
/*  55: 73 */     int i = MathUtils.floor(this.a.xPos);
/*  56: 74 */     int j = MathUtils.floor(this.a.yPos);
/*  57: 75 */     int k = MathUtils.floor(this.a.zPos);
/*  58: 76 */     float f2 = this.c;
/*  59: 77 */     if (this.d)
/*  60:    */     {
/*  61: 78 */       if (this.e++ > this.f) {
/*  62: 79 */         this.d = false;
/*  63:    */       }
/*  64: 81 */       f2 += f2 * 1.15F * MathUtils.sin(this.e / this.f * 3.141593F);
/*  65:    */     }
/*  66: 84 */     float f3 = 0.91F;
/*  67: 85 */     if (this.a.C) {
/*  68: 86 */       f3 = this.a.world.getBlock(new BlockPosition(MathUtils.floor(i), MathUtils.floor(j) - 1, MathUtils.floor(k))).getProto().K * 0.91F;
/*  69:    */     }
/*  70: 88 */     float f4 = 0.1627714F / (f3 * f3 * f3);
/*  71: 89 */     float f5 = MathUtils.sin(localxu.yaw * 3.141593F / 180.0F);
/*  72: 90 */     float f6 = MathUtils.cos(localxu.yaw * 3.141593F / 180.0F);
/*  73: 91 */     float f7 = localxu.bH() * f4;
/*  74: 92 */     float f8 = Math.max(f2, 1.0F);
/*  75: 93 */     f8 = f7 / f8;
/*  76: 94 */     float f9 = f2 * f8;
/*  77: 95 */     float f10 = -(f9 * f5);
/*  78: 96 */     float f11 = f9 * f6;
/*  79: 98 */     if (MathUtils.abs(f10) > MathUtils.abs(f11))
/*  80:    */     {
/*  81: 99 */       if (f10 < 0.0F) {
/*  82:100 */         f10 -= this.a.width / 2.0F;
/*  83:    */       }
/*  84:102 */       if (f10 > 0.0F) {
/*  85:103 */         f10 += this.a.width / 2.0F;
/*  86:    */       }
/*  87:105 */       f11 = 0.0F;
/*  88:    */     }
/*  89:    */     else
/*  90:    */     {
/*  91:107 */       f10 = 0.0F;
/*  92:108 */       if (f11 < 0.0F) {
/*  93:109 */         f11 -= this.a.width / 2.0F;
/*  94:    */       }
/*  95:111 */       if (f11 > 0.0F) {
/*  96:112 */         f11 += this.a.width / 2.0F;
/*  97:    */       }
/*  98:    */     }
/*  99:116 */     int m = MathUtils.floor(this.a.xPos + f10);
/* 100:117 */     int n = MathUtils.floor(this.a.zPos + f11);
/* 101:    */     
/* 102:119 */     int i1 = MathUtils.floor(this.a.width + 1.0F);
/* 103:120 */     int i2 = MathUtils.floor(this.a.height + localahd.height + 1.0F);
/* 104:121 */     int i3 = MathUtils.floor(this.a.width + 1.0F);
/* 105:    */     Object localObject;
/* 106:123 */     if ((i != m) || (k != n))
/* 107:    */     {
/* 108:126 */       localObject = this.a.world.getBlock(new BlockPosition(i, j, k)).getProto();
/* 109:127 */       int i4 = (!a((ProtoBlock)localObject)) && ((((ProtoBlock)localObject).getMaterial() != Material.air) || (!a(this.a.world.getBlock(new BlockPosition(i, j - 1, k)).getProto()))) ? 1 : 0;
/* 110:129 */       if ((i4 != 0) && (0 == bpy.a(this.a.world, this.a, m, j, n, i1, i2, i3, false, false, true)) && (1 == bpy.a(this.a.world, this.a, i, j + 1, k, i1, i2, i3, false, false, true)) && (1 == bpy.a(this.a.world, this.a, m, j + 1, n, i1, i2, i3, false, false, true))) {
/* 111:134 */         localxu.r().a();
/* 112:    */       }
/* 113:    */     }
/* 114:138 */     if ((!localahd.by.d) && (this.c >= this.b * 0.5F) && (this.a.getRNG().nextFloat() < 0.006F) && (!this.d))
/* 115:    */     {
/* 116:139 */       localObject = localahd.getHeldItemStack();
/* 117:141 */       if ((localObject != null) && (((ItemStack)localObject).getItem() == ItemList.bY))
/* 118:    */       {
/* 119:142 */         ((ItemStack)localObject).a(1, localahd);
/* 120:144 */         if (((ItemStack)localObject).stackSize == 0)
/* 121:    */         {
/* 122:145 */           ItemStack localamj = new ItemStack(ItemList.fishingRod);
/* 123:146 */           localamj.setTagCompound(((ItemStack)localObject).getTagCompound());
/* 124:147 */           localahd.bg.a[localahd.bg.c] = localamj;
/* 125:    */         }
/* 126:    */       }
/* 127:    */     }
/* 128:152 */     this.a.g(0.0F, f2);
/* 129:    */   }
/* 130:    */   
/* 131:    */   private boolean a(ProtoBlock paramatr)
/* 132:    */   {
/* 133:156 */     return ((paramatr instanceof BlockStairs)) || ((paramatr instanceof BlockSlab));
/* 134:    */   }
/* 135:    */   
/* 136:    */   public boolean f()
/* 137:    */   {
/* 138:160 */     return this.d;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void g()
/* 142:    */   {
/* 143:164 */     this.d = true;
/* 144:165 */     this.e = 0;
/* 145:166 */     this.f = (this.a.getRNG().nextInt(841) + 140);
/* 146:    */   }
/* 147:    */   
/* 148:    */   public boolean h()
/* 149:    */   {
/* 150:170 */     return (!f()) && (this.c > this.b * 0.3F);
/* 151:    */   }
/* 152:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yu
 * JD-Core Version:    0.7.0.1
 */