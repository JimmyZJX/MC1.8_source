package net.minecraft.src;
/*   3:    */ 
/*   4:    */ public class adk
/*   5:    */   extends adj
/*   6:    */ {
/*   7: 25 */   private float itemDropChance = 1.0F;
/*   8:    */   
/*   9:    */   public adk(World paramaqu)
/*  10:    */   {
/*  11: 28 */     super(paramaqu);
/*  12:    */   }
/*  13:    */   
/*  14:    */   public adk(World paramaqu, BlockPosition paramdt, EnumDirection paramej)
/*  15:    */   {
/*  16: 32 */     super(paramaqu, paramdt);
/*  17: 33 */     a(paramej);
/*  18:    */   }
/*  19:    */   
/*  20:    */   protected void h()
/*  21:    */   {
/*  22: 38 */     H().a(8, 5);
/*  23: 39 */     H().a(9, Byte.valueOf((byte)0));
/*  24:    */   }
/*  25:    */   
/*  26:    */   public float ao()
/*  27:    */   {
/*  28: 44 */     return 0.0F;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public boolean a(wh paramwh, float paramFloat)
/*  32:    */   {
/*  33: 49 */     if (b(paramwh)) {
/*  34: 50 */       return false;
/*  35:    */     }
/*  36: 53 */     if ((!paramwh.c()) && (getItem() != null))
/*  37:    */     {
/*  38: 54 */       if (!this.world.isClient)
/*  39:    */       {
/*  40: 55 */         dropItem(paramwh.j(), false);
/*  41: 56 */         a((ItemStack)null);
/*  42:    */       }
/*  43: 58 */       return true;
/*  44:    */     }
/*  45: 60 */     return super.a(paramwh, paramFloat);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public int l()
/*  49:    */   {
/*  50: 66 */     return 12;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public int m()
/*  54:    */   {
/*  55: 71 */     return 12;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public boolean a(double paramDouble)
/*  59:    */   {
/*  60: 76 */     double d = 16.0D;
/*  61: 77 */     d *= 64.0D * this.j;
/*  62: 78 */     return paramDouble < d * d;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void b(Entity paramwv)
/*  66:    */   {
/*  67: 83 */     dropItem(paramwv, true);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void dropItem(Entity paramwv, boolean paramBoolean)
/*  71:    */   {
/*  72: 87 */     if (!this.world.getGameRules().getBoolean("doTileDrops")) {
/*  73: 88 */       return;
/*  74:    */     }
/*  75: 91 */     ItemStack localamj = getItem();
/*  76: 93 */     if ((paramwv instanceof EntityPlayer))
/*  77:    */     {
/*  78: 94 */       EntityPlayer localahd = (EntityPlayer)paramwv;
/*  79: 96 */       if (localahd.by.d)
/*  80:    */       {
/*  81: 97 */         b(localamj);
/*  82: 98 */         return;
/*  83:    */       }
/*  84:    */     }
/*  85:102 */     if (paramBoolean) {
/*  86:103 */       a(new ItemStack(ItemList.bP), 0.0F);
/*  87:    */     }
/*  88:105 */     if ((localamj != null) && (this.random.nextFloat() < this.itemDropChance))
/*  89:    */     {
/*  90:106 */       localamj = localamj.k();
/*  91:107 */       b(localamj);
/*  92:108 */       a(localamj, 0.0F);
/*  93:    */     }
/*  94:    */   }
/*  95:    */   
/*  96:    */   private void b(ItemStack paramamj)
/*  97:    */   {
/*  98:113 */     if (paramamj == null) {
/*  99:114 */       return;
/* 100:    */     }
/* 101:116 */     if (paramamj.getItem() == ItemList.filledMap)
/* 102:    */     {
/* 103:117 */       MapInfo localbqe = ((ItemFilledMap)paramamj.getItem()).a(paramamj, this.world);
/* 104:118 */       localbqe.icons.remove("frame-" + getID());
/* 105:    */     }
/* 106:120 */     paramamj.a((adk)null);
/* 107:    */   }
/* 108:    */   
/* 109:    */   public ItemStack getItem()
/* 110:    */   {
/* 111:124 */     return H().f(8);
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void a(ItemStack paramamj)
/* 115:    */   {
/* 116:128 */     a(paramamj, true);
/* 117:    */   }
/* 118:    */   
/* 119:    */   private void a(ItemStack paramamj, boolean paramBoolean)
/* 120:    */   {
/* 121:132 */     if (paramamj != null)
/* 122:    */     {
/* 123:133 */       paramamj = paramamj.k();
/* 124:134 */       paramamj.stackSize = 1;
/* 125:135 */       paramamj.a(this);
/* 126:    */     }
/* 127:137 */     H().b(8, paramamj);
/* 128:138 */     H().i(8);
/* 129:140 */     if ((paramBoolean) && (this.a != null)) {
/* 130:141 */       this.world.e(this.a, BlockList.air);
/* 131:    */     }
/* 132:    */   }
/* 133:    */   
/* 134:    */   public int p()
/* 135:    */   {
/* 136:146 */     return H().a(9);
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void a(int paramInt)
/* 140:    */   {
/* 141:150 */     a(paramInt, true);
/* 142:    */   }
/* 143:    */   
/* 144:    */   private void a(int paramInt, boolean paramBoolean)
/* 145:    */   {
/* 146:154 */     H().b(9, Byte.valueOf((byte)(paramInt % 8)));
/* 147:156 */     if ((paramBoolean) && (this.a != null)) {
/* 148:157 */       this.world.e(this.a, BlockList.air);
/* 149:    */     }
/* 150:    */   }
/* 151:    */   
/* 152:    */   public void writeEntityToNBT(NBTTagCompound paramfn)
/* 153:    */   {
/* 154:163 */     if (getItem() != null)
/* 155:    */     {
/* 156:164 */       paramfn.setNBT("Item", getItem().writeToNBT(new NBTTagCompound()));
/* 157:165 */       paramfn.setByte("ItemRotation", (byte)p());
/* 158:166 */       paramfn.setFloat("ItemDropChance", this.itemDropChance);
/* 159:    */     }
/* 160:168 */     super.writeEntityToNBT(paramfn);
/* 161:    */   }
/* 162:    */   
/* 163:    */   public void readEntityFromNBT(NBTTagCompound tag)
/* 164:    */   {
/* 165:173 */     NBTTagCompound localfn = tag.getCompoundTag("Item");
/* 166:174 */     if ((localfn != null) && (!localfn.c_()))
/* 167:    */     {
/* 168:175 */       a(ItemStack.loadItemStackFromNBT(localfn), false);
/* 169:176 */       a(tag.d("ItemRotation"), false);
/* 170:178 */       if (tag.hasKey("ItemDropChance", 99)) {
/* 171:179 */         this.itemDropChance = tag.getFloat("ItemDropChance");
/* 172:    */       }
/* 173:182 */       if (tag.c("Direction")) {
/* 174:184 */         a(p() * 2, false);
/* 175:    */       }
/* 176:    */     }
/* 177:187 */     super.readEntityFromNBT(tag);
/* 178:    */   }
/* 179:    */   
/* 180:    */   public boolean e(EntityPlayer paramahd)
/* 181:    */   {
/* 182:192 */     if (getItem() == null)
/* 183:    */     {
/* 184:193 */       ItemStack localamj = paramahd.bz();
/* 185:194 */       if ((localamj != null) && 
/* 186:195 */         (!this.world.isClient))
/* 187:    */       {
/* 188:196 */         a(localamj);
/* 189:198 */         if (!paramahd.by.d) {
/* 190:199 */           if (--localamj.stackSize <= 0) {
/* 191:200 */             paramahd.bg.a(paramahd.bg.c, null);
/* 192:    */           }
/* 193:    */         }
/* 194:    */       }
/* 195:    */     }
/* 196:206 */     else if (!this.world.isClient)
/* 197:    */     {
/* 198:207 */       a(p() + 1);
/* 199:    */     }
/* 200:211 */     return true;
/* 201:    */   }
/* 202:    */   
/* 203:    */   public int q()
/* 204:    */   {
/* 205:215 */     if (getItem() == null) {
/* 206:216 */       return 0;
/* 207:    */     }
/* 208:219 */     return p() % 8 + 1;
/* 209:    */   }
/* 210:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     adk
 * JD-Core Version:    0.7.0.1
 */