package net.minecraft.src;
/*   1:    */ public class ExtendedBlockStorage
/*   2:    */ {
/*   3:    */   private int a;
/*   4:    */   private int b;
/*   5:    */   private int c;
/*   6:    */   private char[] d;
/*   7:    */   private bff e;
/*   8:    */   private bff f;
/*   9:    */   
/*  10:    */   public ExtendedBlockStorage(int paramInt, boolean paramBoolean)
/*  11:    */   {
/*  12: 21 */     this.a = paramInt;
/*  13: 22 */     this.d = new char[4096];
/*  14: 23 */     this.e = new bff();
/*  15: 24 */     if (paramBoolean) {
/*  16: 25 */       this.f = new bff();
/*  17:    */     }
/*  18:    */   }
/*  19:    */   
/*  20:    */   public Block a(int paramInt1, int paramInt2, int paramInt3)
/*  21:    */   {
/*  22: 30 */     Block result = BlockType.d.a(this.d[(paramInt2 << 8 | paramInt3 << 4 | paramInt1)]);
/*  23: 31 */     if (result != null) {
/*  24: 32 */       return result;
/*  25:    */     }
/*  26: 34 */     return BlockList.air.instance();
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void a(int paramInt1, int paramInt2, int paramInt3, Block parambec)
/*  30:    */   {
/*  31: 39 */     Block localbec = a(paramInt1, paramInt2, paramInt3);
/*  32: 40 */     BlockType localatr1 = localbec.getType();
/*  33: 41 */     BlockType localatr2 = parambec.getType();
/*  34: 43 */     if (localatr1 != BlockList.air)
/*  35:    */     {
/*  36: 44 */       this.b -= 1;
/*  37: 45 */       if (localatr1.w()) {
/*  38: 46 */         this.c -= 1;
/*  39:    */       }
/*  40:    */     }
/*  41: 50 */     if (localatr2 != BlockList.air)
/*  42:    */     {
/*  43: 51 */       this.b += 1;
/*  44: 52 */       if (localatr2.w()) {
/*  45: 53 */         this.c += 1;
/*  46:    */       }
/*  47:    */     }
/*  48: 57 */     this.d[(paramInt2 << 8 | paramInt3 << 4 | paramInt1)] = ((char)BlockType.d.b(parambec));
/*  49:    */   }
/*  50:    */   
/*  51:    */   public BlockType b(int paramInt1, int paramInt2, int paramInt3)
/*  52:    */   {
/*  53: 61 */     return a(paramInt1, paramInt2, paramInt3).getType();
/*  54:    */   }
/*  55:    */   
/*  56:    */   public int c(int paramInt1, int paramInt2, int paramInt3)
/*  57:    */   {
/*  58: 69 */     Block localbec = a(paramInt1, paramInt2, paramInt3);
/*  59: 70 */     return localbec.getType().c(localbec);
/*  60:    */   }
/*  61:    */   
/*  62:    */   public boolean a()
/*  63:    */   {
/*  64: 74 */     return this.b == 0;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public boolean b()
/*  68:    */   {
/*  69: 78 */     return this.c > 0;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public int getY()
/*  73:    */   {
/*  74: 86 */     return this.a;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  78:    */   {
/*  79: 90 */     this.f.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public int d(int paramInt1, int paramInt2, int paramInt3)
/*  83:    */   {
/*  84: 94 */     return this.f.a(paramInt1, paramInt2, paramInt3);
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  88:    */   {
/*  89: 98 */     this.e.a(paramInt1, paramInt2, paramInt3, paramInt4);
/*  90:    */   }
/*  91:    */   
/*  92:    */   public int e(int paramInt1, int paramInt2, int paramInt3)
/*  93:    */   {
/*  94:102 */     return this.e.a(paramInt1, paramInt2, paramInt3);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void e()
/*  98:    */   {
/*  99:106 */     this.b = 0;
/* 100:107 */     this.c = 0;
/* 101:109 */     for (int i = 0; i < 16; i++) {
/* 102:110 */       for (int j = 0; j < 16; j++) {
/* 103:111 */         for (int k = 0; k < 16; k++)
/* 104:    */         {
/* 105:112 */           BlockType localatr = b(i, j, k);
/* 106:114 */           if (localatr != BlockList.air)
/* 107:    */           {
/* 108:115 */             this.b += 1;
/* 109:116 */             if (localatr.w()) {
/* 110:117 */               this.c += 1;
/* 111:    */             }
/* 112:    */           }
/* 113:    */         }
/* 114:    */       }
/* 115:    */     }
/* 116:    */   }
/* 117:    */   
/* 118:    */   public char[] g()
/* 119:    */   {
/* 120:130 */     return this.d;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void a(char[] paramArrayOfChar)
/* 124:    */   {
/* 125:134 */     this.d = paramArrayOfChar;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public bff h()
/* 129:    */   {
/* 130:138 */     return this.e;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public bff i()
/* 134:    */   {
/* 135:142 */     return this.f;
/* 136:    */   }
/* 137:    */   
/* 138:    */   public void a(bff parambff)
/* 139:    */   {
/* 140:146 */     this.e = parambff;
/* 141:    */   }
/* 142:    */   
/* 143:    */   public void b(bff parambff)
/* 144:    */   {
/* 145:150 */     this.f = parambff;
/* 146:    */   }
/* 147:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfm
 * JD-Core Version:    0.7.0.1
 */