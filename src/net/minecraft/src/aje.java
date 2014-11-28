package net.minecraft.src;
/*   1:    */ public class aje
/*   2:    */   implements vq
/*   3:    */ {
/*   4:    */   private final aqb a;
/*   5: 17 */   private ItemStack[] b = new ItemStack[3];
/*   6:    */   private final EntityPlayer c;
/*   7:    */   private TradeOffer d;
/*   8:    */   private int e;
/*   9:    */   
/*  10:    */   public aje(EntityPlayer paramahd, aqb paramaqb)
/*  11:    */   {
/*  12: 23 */     this.c = paramahd;
/*  13: 24 */     this.a = paramaqb;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public int getSize()
/*  17:    */   {
/*  18: 29 */     return this.b.length;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public ItemStack get(int paramInt)
/*  22:    */   {
/*  23: 35 */     return this.b[paramInt];
/*  24:    */   }
/*  25:    */   
/*  26:    */   public ItemStack removeItems(int paramInt1, int paramInt2)
/*  27:    */   {
/*  28: 41 */     if (this.b[paramInt1] != null)
/*  29:    */     {
/*  30: 42 */       if (paramInt1 == 2)
/*  31:    */       {
/*  32: 43 */         ItemStack localamj = this.b[paramInt1];
/*  33: 44 */         this.b[paramInt1] = null;
/*  34: 45 */         return localamj;
/*  35:    */       }
/*  36: 47 */       if (this.b[paramInt1].stackSize <= paramInt2)
/*  37:    */       {
/*  38: 48 */         ItemStack localamj = this.b[paramInt1];
/*  39: 49 */         this.b[paramInt1] = null;
/*  40: 50 */         if (e(paramInt1)) {
/*  41: 51 */           h();
/*  42:    */         }
/*  43: 53 */         return localamj;
/*  44:    */       }
/*  45: 55 */       ItemStack localamj = this.b[paramInt1].split(paramInt2);
/*  46: 56 */       if (this.b[paramInt1].stackSize == 0) {
/*  47: 57 */         this.b[paramInt1] = null;
/*  48:    */       }
/*  49: 59 */       if (e(paramInt1)) {
/*  50: 60 */         h();
/*  51:    */       }
/*  52: 62 */       return localamj;
/*  53:    */     }
/*  54: 65 */     return null;
/*  55:    */   }
/*  56:    */   
/*  57:    */   private boolean e(int paramInt)
/*  58:    */   {
/*  59: 69 */     return (paramInt == 0) || (paramInt == 1);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public ItemStack b(int paramInt)
/*  63:    */   {
/*  64: 75 */     if (this.b[paramInt] != null)
/*  65:    */     {
/*  66: 76 */       ItemStack localamj = this.b[paramInt];
/*  67: 77 */       this.b[paramInt] = null;
/*  68: 78 */       return localamj;
/*  69:    */     }
/*  70: 80 */     return null;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void a(int paramInt, ItemStack paramamj)
/*  74:    */   {
/*  75: 85 */     this.b[paramInt] = paramamj;
/*  76: 86 */     if ((paramamj != null) && (paramamj.stackSize > p_())) {
/*  77: 87 */       paramamj.stackSize = p_();
/*  78:    */     }
/*  79: 89 */     if (e(paramInt)) {
/*  80: 90 */       h();
/*  81:    */     }
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getName()
/*  85:    */   {
/*  86: 96 */     return "mob.villager";
/*  87:    */   }
/*  88:    */   
/*  89:    */   public boolean k_()
/*  90:    */   {
/*  91:101 */     return false;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public ho e_()
/*  95:    */   {
/*  96:106 */     if (k_()) {
/*  97:107 */       return new hy(getName());
/*  98:    */     }
/*  99:109 */     return new hz(getName(), new Object[0]);
/* 100:    */   }
/* 101:    */   
/* 102:    */   public int p_()
/* 103:    */   {
/* 104:114 */     return 64;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public boolean a(EntityPlayer paramahd)
/* 108:    */   {
/* 109:119 */     return this.a.u_() == paramahd;
/* 110:    */   }
/* 111:    */   
/* 112:    */   public void b(EntityPlayer paramahd) {}
/* 113:    */   
/* 114:    */   public void c(EntityPlayer paramahd) {}
/* 115:    */   
/* 116:    */   public boolean b(int paramInt, ItemStack paramamj)
/* 117:    */   {
/* 118:132 */     return true;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void o_()
/* 122:    */   {
/* 123:137 */     h();
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void h()
/* 127:    */   {
/* 128:141 */     this.d = null;
/* 129:    */     
/* 130:143 */     Object localObject = this.b[0];
/* 131:144 */     ItemStack localamj = this.b[1];
/* 132:146 */     if (localObject == null)
/* 133:    */     {
/* 134:147 */       localObject = localamj;
/* 135:148 */       localamj = null;
/* 136:    */     }
/* 137:151 */     if (localObject == null)
/* 138:    */     {
/* 139:152 */       a(2, null);
/* 140:    */     }
/* 141:    */     else
/* 142:    */     {
/* 143:154 */       TradeOfferList localaqd = this.a.b_(this.c);
/* 144:155 */       if (localaqd != null)
/* 145:    */       {
/* 146:156 */         TradeOffer localaqc = localaqd.a((ItemStack)localObject, localamj, this.e);
/* 147:157 */         if ((localaqc != null) && (!localaqc.isBlocked()))
/* 148:    */         {
/* 149:158 */           this.d = localaqc;
/* 150:159 */           a(2, localaqc.getItemSold().k());
/* 151:    */         }
/* 152:160 */         else if (localamj != null)
/* 153:    */         {
/* 154:162 */           localaqc = localaqd.a(localamj, (ItemStack)localObject, this.e);
/* 155:163 */           if ((localaqc != null) && (!localaqc.isBlocked()))
/* 156:    */           {
/* 157:164 */             this.d = localaqc;
/* 158:165 */             a(2, localaqc.getItemSold().k());
/* 159:    */           }
/* 160:    */           else
/* 161:    */           {
/* 162:167 */             a(2, null);
/* 163:    */           }
/* 164:    */         }
/* 165:    */         else
/* 166:    */         {
/* 167:170 */           a(2, null);
/* 168:    */         }
/* 169:    */       }
/* 170:    */     }
/* 171:175 */     this.a.a_(get(2));
/* 172:    */   }
/* 173:    */   
/* 174:    */   public TradeOffer i()
/* 175:    */   {
/* 176:179 */     return this.d;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void d(int paramInt)
/* 180:    */   {
/* 181:183 */     this.e = paramInt;
/* 182:184 */     h();
/* 183:    */   }
/* 184:    */   
/* 185:    */   public int a_(int paramInt)
/* 186:    */   {
/* 187:189 */     return 0;
/* 188:    */   }
/* 189:    */   
/* 190:    */   public void b(int paramInt1, int paramInt2) {}
/* 191:    */   
/* 192:    */   public int g()
/* 193:    */   {
/* 194:198 */     return 0;
/* 195:    */   }
/* 196:    */   
/* 197:    */   public void l()
/* 198:    */   {
/* 199:203 */     for (int i = 0; i < this.b.length; i++) {
/* 200:204 */       this.b[i] = null;
/* 201:    */     }
/* 202:    */   }
/* 203:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aje
 * JD-Core Version:    0.7.0.1
 */