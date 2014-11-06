package net.minecraft.src;
/*   1:    */ public abstract class aed
/*   2:    */   extends adx
/*   3:    */   implements vy
/*   4:    */ {
/*   5: 20 */   private ItemStack[] a = new ItemStack[36];
/*   6: 21 */   private boolean b = true;
/*   7:    */   
/*   8:    */   public aed(World paramaqu)
/*   9:    */   {
/*  10: 24 */     super(paramaqu);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public aed(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  14:    */   {
/*  15: 28 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void a(wh paramwh)
/*  19:    */   {
/*  20: 33 */     super.a(paramwh);
/*  21:    */     
/*  22: 35 */     vs.a(this.world, this, this);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public ItemStack a(int paramInt)
/*  26:    */   {
/*  27: 41 */     return this.a[paramInt];
/*  28:    */   }
/*  29:    */   
/*  30:    */   public ItemStack a(int paramInt1, int paramInt2)
/*  31:    */   {
/*  32: 47 */     if (this.a[paramInt1] != null)
/*  33:    */     {
/*  34: 48 */       if (this.a[paramInt1].stackSize <= paramInt2)
/*  35:    */       {
/*  36: 49 */         ItemStack localamj = this.a[paramInt1];
/*  37: 50 */         this.a[paramInt1] = null;
/*  38: 51 */         return localamj;
/*  39:    */       }
/*  40: 53 */       ItemStack localamj = this.a[paramInt1].split(paramInt2);
/*  41: 54 */       if (this.a[paramInt1].stackSize == 0) {
/*  42: 55 */         this.a[paramInt1] = null;
/*  43:    */       }
/*  44: 57 */       return localamj;
/*  45:    */     }
/*  46: 60 */     return null;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public ItemStack b(int paramInt)
/*  50:    */   {
/*  51: 66 */     if (this.a[paramInt] != null)
/*  52:    */     {
/*  53: 67 */       ItemStack localamj = this.a[paramInt];
/*  54: 68 */       this.a[paramInt] = null;
/*  55: 69 */       return localamj;
/*  56:    */     }
/*  57: 71 */     return null;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void a(int paramInt, ItemStack paramamj)
/*  61:    */   {
/*  62: 76 */     this.a[paramInt] = paramamj;
/*  63: 77 */     if ((paramamj != null) && (paramamj.stackSize > p_())) {
/*  64: 78 */       paramamj.stackSize = p_();
/*  65:    */     }
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void o_() {}
/*  69:    */   
/*  70:    */   public boolean a(EntityPlayer paramahd)
/*  71:    */   {
/*  72: 88 */     if (this.isDead) {
/*  73: 89 */       return false;
/*  74:    */     }
/*  75: 91 */     if (paramahd.h(this) > 64.0D) {
/*  76: 92 */       return false;
/*  77:    */     }
/*  78: 94 */     return true;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void b(EntityPlayer paramahd) {}
/*  82:    */   
/*  83:    */   public void c(EntityPlayer paramahd) {}
/*  84:    */   
/*  85:    */   public boolean b(int paramInt, ItemStack paramamj)
/*  86:    */   {
/*  87:107 */     return true;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public String getName()
/*  91:    */   {
/*  92:112 */     return k_() ? aL() : "container.minecart";
/*  93:    */   }
/*  94:    */   
/*  95:    */   public int p_()
/*  96:    */   {
/*  97:117 */     return 64;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void c(int paramInt)
/* 101:    */   {
/* 102:122 */     this.b = false;
/* 103:123 */     super.c(paramInt);
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setDead()
/* 107:    */   {
/* 108:128 */     if (this.b) {
/* 109:129 */       vs.a(this.world, this, this);
/* 110:    */     }
/* 111:132 */     super.setDead();
/* 112:    */   }
/* 113:    */   
/* 114:    */   protected void writeEntityToNBT(NBTTagCompound paramfn)
/* 115:    */   {
/* 116:137 */     super.writeEntityToNBT(paramfn);
/* 117:    */     
/* 118:139 */     fv localfv = new fv();
/* 119:141 */     for (int i = 0; i < this.a.length; i++) {
/* 120:142 */       if (this.a[i] != null)
/* 121:    */       {
/* 122:143 */         NBTTagCompound localfn = new NBTTagCompound();
/* 123:144 */         localfn.setByte("Slot", (byte)i);
/* 124:145 */         this.a[i].writeToNBT(localfn);
/* 125:146 */         localfv.a(localfn);
/* 126:    */       }
/* 127:    */     }
/* 128:149 */     paramfn.setNBT("Items", localfv);
/* 129:    */   }
/* 130:    */   
/* 131:    */   protected void readEntityFromNBT(NBTTagCompound paramfn)
/* 132:    */   {
/* 133:155 */     super.readEntityFromNBT(paramfn);
/* 134:    */     
/* 135:157 */     fv localfv = paramfn.c("Items", 10);
/* 136:158 */     this.a = new ItemStack[n_()];
/* 137:159 */     for (int i = 0; i < localfv.c(); i++)
/* 138:    */     {
/* 139:160 */       NBTTagCompound localfn = localfv.b(i);
/* 140:161 */       int j = localfn.d("Slot") & 0xFF;
/* 141:162 */       if ((j >= 0) && (j < this.a.length)) {
/* 142:163 */         this.a[j] = ItemStack.loadItemStackFromNBT(localfn);
/* 143:    */       }
/* 144:    */     }
/* 145:    */   }
/* 146:    */   
/* 147:    */   public boolean e(EntityPlayer paramahd)
/* 148:    */   {
/* 149:170 */     if (!this.world.isClient) {
/* 150:171 */       paramahd.a((vq)this);
/* 151:    */     }
/* 152:174 */     return true;
/* 153:    */   }
/* 154:    */   
/* 155:    */   protected void o()
/* 156:    */   {
/* 157:179 */     int i = 15 - aib.b(this);
/* 158:180 */     float f = 0.98F + i * 0.001F;
/* 159:    */     
/* 160:182 */     this.xVelocity *= f;
/* 161:183 */     this.yVelocity *= 0.0D;
/* 162:184 */     this.zVelocity *= f;
/* 163:    */   }
/* 164:    */   
/* 165:    */   public int a_(int paramInt)
/* 166:    */   {
/* 167:189 */     return 0;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void b(int paramInt1, int paramInt2) {}
/* 171:    */   
/* 172:    */   public int g()
/* 173:    */   {
/* 174:198 */     return 0;
/* 175:    */   }
/* 176:    */   
/* 177:    */   public boolean q_()
/* 178:    */   {
/* 179:203 */     return false;
/* 180:    */   }
/* 181:    */   
/* 182:    */   public void a(vx paramvx) {}
/* 183:    */   
/* 184:    */   public vx i()
/* 185:    */   {
/* 186:212 */     return vx.a;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void l()
/* 190:    */   {
/* 191:221 */     for (int i = 0; i < this.a.length; i++) {
/* 192:222 */       this.a[i] = null;
/* 193:    */     }
/* 194:    */   }
/* 195:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aed
 * JD-Core Version:    0.7.0.1
 */