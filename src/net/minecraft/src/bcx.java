package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bcx
/*   4:    */   extends bdf
/*   5:    */   implements vq
/*   6:    */ {
/*   7: 19 */   private static final Random f = new Random();
/*   8: 21 */   private ItemStack[] g = new ItemStack[9];
/*   9:    */   protected String a;
/*  10:    */   
/*  11:    */   public int n_()
/*  12:    */   {
/*  13: 26 */     return 9;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public ItemStack a(int paramInt)
/*  17:    */   {
/*  18: 32 */     return this.g[paramInt];
/*  19:    */   }
/*  20:    */   
/*  21:    */   public ItemStack a(int paramInt1, int paramInt2)
/*  22:    */   {
/*  23: 38 */     if (this.g[paramInt1] != null)
/*  24:    */     {
/*  25: 39 */       if (this.g[paramInt1].stackSize <= paramInt2)
/*  26:    */       {
/*  27: 40 */         ItemStack localamj = this.g[paramInt1];
/*  28: 41 */         this.g[paramInt1] = null;
/*  29: 42 */         o_();
/*  30: 43 */         return localamj;
/*  31:    */       }
/*  32: 45 */       ItemStack localamj = this.g[paramInt1].split(paramInt2);
/*  33: 46 */       if (this.g[paramInt1].stackSize == 0) {
/*  34: 47 */         this.g[paramInt1] = null;
/*  35:    */       }
/*  36: 49 */       o_();
/*  37: 50 */       return localamj;
/*  38:    */     }
/*  39: 53 */     return null;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public ItemStack b(int paramInt)
/*  43:    */   {
/*  44: 59 */     if (this.g[paramInt] != null)
/*  45:    */     {
/*  46: 60 */       ItemStack localamj = this.g[paramInt];
/*  47: 61 */       this.g[paramInt] = null;
/*  48: 62 */       return localamj;
/*  49:    */     }
/*  50: 64 */     return null;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public int m()
/*  54:    */   {
/*  55: 84 */     int i = -1;
/*  56: 85 */     int j = 1;
/*  57: 87 */     for (int k = 0; k < this.g.length; k++) {
/*  58: 88 */       if ((this.g[k] != null) && (f.nextInt(j++) == 0)) {
/*  59: 89 */         i = k;
/*  60:    */       }
/*  61:    */     }
/*  62: 93 */     return i;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void a(int paramInt, ItemStack paramamj)
/*  66:    */   {
/*  67: 98 */     this.g[paramInt] = paramamj;
/*  68: 99 */     if ((paramamj != null) && (paramamj.stackSize > p_())) {
/*  69:100 */       paramamj.stackSize = p_();
/*  70:    */     }
/*  71:102 */     o_();
/*  72:    */   }
/*  73:    */   
/*  74:    */   public int a(ItemStack paramamj)
/*  75:    */   {
/*  76:106 */     for (int i = 0; i < this.g.length; i++) {
/*  77:107 */       if ((this.g[i] == null) || (this.g[i].getItem() == null))
/*  78:    */       {
/*  79:108 */         a(i, paramamj);
/*  80:109 */         return i;
/*  81:    */       }
/*  82:    */     }
/*  83:113 */     return -1;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getName()
/*  87:    */   {
/*  88:118 */     return k_() ? this.a : "container.dispenser";
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void a(String paramString)
/*  92:    */   {
/*  93:122 */     this.a = paramString;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean k_()
/*  97:    */   {
/*  98:127 */     return this.a != null;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void readFromNBT(NBTTagCompound paramfn)
/* 102:    */   {
/* 103:133 */     super.readFromNBT(paramfn);
/* 104:134 */     fv localfv = paramfn.c("Items", 10);
/* 105:135 */     this.g = new ItemStack[n_()];
/* 106:136 */     for (int i = 0; i < localfv.c(); i++)
/* 107:    */     {
/* 108:137 */       NBTTagCompound localfn = localfv.b(i);
/* 109:138 */       int j = localfn.d("Slot") & 0xFF;
/* 110:139 */       if ((j >= 0) && (j < this.g.length)) {
/* 111:140 */         this.g[j] = ItemStack.loadItemStackFromNBT(localfn);
/* 112:    */       }
/* 113:    */     }
/* 114:143 */     if (paramfn.hasKey("CustomName", 8)) {
/* 115:144 */       this.a = paramfn.getString("CustomName");
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void writeToNBT(NBTTagCompound paramfn)
/* 120:    */   {
/* 121:150 */     super.writeToNBT(paramfn);
/* 122:151 */     fv localfv = new fv();
/* 123:153 */     for (int i = 0; i < this.g.length; i++) {
/* 124:154 */       if (this.g[i] != null)
/* 125:    */       {
/* 126:155 */         NBTTagCompound localfn = new NBTTagCompound();
/* 127:156 */         localfn.setByte("Slot", (byte)i);
/* 128:157 */         this.g[i].writeToNBT(localfn);
/* 129:158 */         localfv.a(localfn);
/* 130:    */       }
/* 131:    */     }
/* 132:161 */     paramfn.setNBT("Items", localfv);
/* 133:162 */     if (k_()) {
/* 134:163 */       paramfn.setString("CustomName", this.a);
/* 135:    */     }
/* 136:    */   }
/* 137:    */   
/* 138:    */   public int p_()
/* 139:    */   {
/* 140:169 */     return 64;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public boolean a(EntityPlayer paramahd)
/* 144:    */   {
/* 145:174 */     if (this.world.s(this.pos) != this) {
/* 146:175 */       return false;
/* 147:    */     }
/* 148:177 */     if (paramahd.e(this.pos.getX() + 0.5D, this.pos.getY() + 0.5D, this.pos.getZ() + 0.5D) > 64.0D) {
/* 149:178 */       return false;
/* 150:    */     }
/* 151:180 */     return true;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public void b(EntityPlayer paramahd) {}
/* 155:    */   
/* 156:    */   public void c(EntityPlayer paramahd) {}
/* 157:    */   
/* 158:    */   public boolean b(int paramInt, ItemStack paramamj)
/* 159:    */   {
/* 160:193 */     return true;
/* 161:    */   }
/* 162:    */   
/* 163:    */   public String k()
/* 164:    */   {
/* 165:198 */     return "minecraft:dispenser";
/* 166:    */   }
/* 167:    */   
/* 168:    */   public aib a(ahb paramahb, EntityPlayer paramahd)
/* 169:    */   {
/* 170:203 */     return new aip(paramahb, this);
/* 171:    */   }
/* 172:    */   
/* 173:    */   public int a_(int paramInt)
/* 174:    */   {
/* 175:208 */     return 0;
/* 176:    */   }
/* 177:    */   
/* 178:    */   public void b(int paramInt1, int paramInt2) {}
/* 179:    */   
/* 180:    */   public int g()
/* 181:    */   {
/* 182:217 */     return 0;
/* 183:    */   }
/* 184:    */   
/* 185:    */   public void l()
/* 186:    */   {
/* 187:222 */     for (int i = 0; i < this.g.length; i++) {
/* 188:223 */       this.g[i] = null;
/* 189:    */     }
/* 190:    */   }
/* 191:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bcx
 * JD-Core Version:    0.7.0.1
 */