package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class wa
/*   5:    */   implements vq
/*   6:    */ {
/*   7:    */   private String a;
/*   8:    */   private int b;
/*   9:    */   private ItemStack[] c;
/*  10:    */   private List<vr> d;
/*  11:    */   private boolean e;
/*  12:    */   
/*  13:    */   public wa(String paramString, boolean paramBoolean, int paramInt)
/*  14:    */   {
/*  15: 21 */     this.a = paramString;
/*  16: 22 */     this.e = paramBoolean;
/*  17: 23 */     this.b = paramInt;
/*  18: 24 */     this.c = new ItemStack[paramInt];
/*  19:    */   }
/*  20:    */   
/*  21:    */   public wa(ho paramho, int paramInt)
/*  22:    */   {
/*  23: 28 */     this(paramho.c(), true, paramInt);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void a(vr paramvr)
/*  27:    */   {
/*  28: 32 */     if (this.d == null) {
/*  29: 33 */       this.d = Lists.newArrayList();
/*  30:    */     }
/*  31: 35 */     this.d.add(paramvr);
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void b(vr paramvr)
/*  35:    */   {
/*  36: 39 */     this.d.remove(paramvr);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public ItemStack a(int paramInt)
/*  40:    */   {
/*  41: 45 */     if ((paramInt < 0) || (paramInt >= this.c.length)) {
/*  42: 46 */       return null;
/*  43:    */     }
/*  44: 48 */     return this.c[paramInt];
/*  45:    */   }
/*  46:    */   
/*  47:    */   public ItemStack a(int paramInt1, int paramInt2)
/*  48:    */   {
/*  49: 54 */     if (this.c[paramInt1] != null)
/*  50:    */     {
/*  51: 55 */       if (this.c[paramInt1].stackSize <= paramInt2)
/*  52:    */       {
/*  53: 56 */         ItemStack localamj = this.c[paramInt1];
/*  54: 57 */         this.c[paramInt1] = null;
/*  55: 58 */         o_();
/*  56: 59 */         return localamj;
/*  57:    */       }
/*  58: 61 */       ItemStack localamj = this.c[paramInt1].split(paramInt2);
/*  59: 62 */       if (this.c[paramInt1].stackSize == 0) {
/*  60: 63 */         this.c[paramInt1] = null;
/*  61:    */       }
/*  62: 65 */       o_();
/*  63: 66 */       return localamj;
/*  64:    */     }
/*  65: 69 */     return null;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public ItemStack a(ItemStack paramamj)
/*  69:    */   {
/*  70: 74 */     ItemStack localamj1 = paramamj.k();
/*  71: 76 */     for (int i = 0; i < this.b; i++)
/*  72:    */     {
/*  73: 77 */       ItemStack localamj2 = a(i);
/*  74: 78 */       if (localamj2 == null)
/*  75:    */       {
/*  76: 79 */         a(i, localamj1);
/*  77: 80 */         o_();
/*  78: 81 */         return null;
/*  79:    */       }
/*  80: 83 */       if (ItemStack.c(localamj2, localamj1))
/*  81:    */       {
/*  82: 84 */         int j = Math.min(p_(), localamj2.getMaxStackSize());
/*  83: 85 */         int k = Math.min(localamj1.stackSize, j - localamj2.stackSize);
/*  84: 86 */         if (k > 0)
/*  85:    */         {
/*  86: 87 */           localamj2.stackSize += k;
/*  87: 88 */           localamj1.stackSize -= k;
/*  88: 89 */           if (localamj1.stackSize <= 0)
/*  89:    */           {
/*  90: 90 */             o_();
/*  91: 91 */             return null;
/*  92:    */           }
/*  93:    */         }
/*  94:    */       }
/*  95:    */     }
/*  96: 96 */     if (localamj1.stackSize != paramamj.stackSize) {
/*  97: 97 */       o_();
/*  98:    */     }
/*  99: 99 */     return localamj1;
/* 100:    */   }
/* 101:    */   
/* 102:    */   public ItemStack b(int paramInt)
/* 103:    */   {
/* 104:105 */     if (this.c[paramInt] != null)
/* 105:    */     {
/* 106:106 */       ItemStack localamj = this.c[paramInt];
/* 107:107 */       this.c[paramInt] = null;
/* 108:108 */       return localamj;
/* 109:    */     }
/* 110:110 */     return null;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public void a(int paramInt, ItemStack paramamj)
/* 114:    */   {
/* 115:115 */     this.c[paramInt] = paramamj;
/* 116:116 */     if ((paramamj != null) && (paramamj.stackSize > p_())) {
/* 117:117 */       paramamj.stackSize = p_();
/* 118:    */     }
/* 119:119 */     o_();
/* 120:    */   }
/* 121:    */   
/* 122:    */   public int n_()
/* 123:    */   {
/* 124:124 */     return this.b;
/* 125:    */   }
/* 126:    */   
/* 127:    */   public String getName()
/* 128:    */   {
/* 129:129 */     return this.a;
/* 130:    */   }
/* 131:    */   
/* 132:    */   public boolean k_()
/* 133:    */   {
/* 134:134 */     return this.e;
/* 135:    */   }
/* 136:    */   
/* 137:    */   public void a(String paramString)
/* 138:    */   {
/* 139:138 */     this.e = true;
/* 140:139 */     this.a = paramString;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public ho e_()
/* 144:    */   {
/* 145:144 */     if (k_()) {
/* 146:145 */       return new hy(getName());
/* 147:    */     }
/* 148:147 */     return new hz(getName(), new Object[0]);
/* 149:    */   }
/* 150:    */   
/* 151:    */   public int p_()
/* 152:    */   {
/* 153:152 */     return 64;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public void o_()
/* 157:    */   {
/* 158:157 */     if (this.d != null) {
/* 159:158 */       for (int i = 0; i < this.d.size(); i++) {
/* 160:159 */         ((vr)this.d.get(i)).a(this);
/* 161:    */       }
/* 162:    */     }
/* 163:    */   }
/* 164:    */   
/* 165:    */   public boolean a(EntityPlayer paramahd)
/* 166:    */   {
/* 167:166 */     return true;
/* 168:    */   }
/* 169:    */   
/* 170:    */   public void b(EntityPlayer paramahd) {}
/* 171:    */   
/* 172:    */   public void c(EntityPlayer paramahd) {}
/* 173:    */   
/* 174:    */   public boolean b(int paramInt, ItemStack paramamj)
/* 175:    */   {
/* 176:179 */     return true;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public int a_(int paramInt)
/* 180:    */   {
/* 181:184 */     return 0;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void b(int paramInt1, int paramInt2) {}
/* 185:    */   
/* 186:    */   public int g()
/* 187:    */   {
/* 188:193 */     return 0;
/* 189:    */   }
/* 190:    */   
/* 191:    */   public void l()
/* 192:    */   {
/* 193:198 */     for (int i = 0; i < this.c.length; i++) {
/* 194:199 */       this.c[i] = null;
/* 195:    */     }
/* 196:    */   }
/* 197:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wa
 * JD-Core Version:    0.7.0.1
 */