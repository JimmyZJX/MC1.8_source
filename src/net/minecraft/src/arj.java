package net.minecraft.src;
/*   1:    */ public class arj
/*   2:    */   implements IBlockAccess
/*   3:    */ {
/*   4:    */   protected int a;
/*   5:    */   protected int b;
/*   6:    */   protected Chunk[][] c;
/*   7:    */   protected boolean d;
/*   8:    */   protected World e;
/*   9:    */   
/*  10:    */   public arj(World paramaqu, BlockPosition paramdt1, BlockPosition paramdt2, int paramInt)
/*  11:    */   {
/*  12: 24 */     this.e = paramaqu;
/*  13:    */     
/*  14: 26 */     this.a = (paramdt1.getX() - paramInt >> 4);
/*  15: 27 */     this.b = (paramdt1.getZ() - paramInt >> 4);
/*  16: 28 */     int i = paramdt2.getX() + paramInt >> 4;
/*  17: 29 */     int j = paramdt2.getZ() + paramInt >> 4;
/*  18:    */     
/*  19: 31 */     this.c = new Chunk[i - this.a + 1][j - this.b + 1];
/*  20:    */     
/*  21: 33 */     this.d = true;
/*  22:    */     int m;
/*  23: 34 */     for (int k = this.a; k <= i; k++) {
/*  24: 35 */       for (m = this.b; m <= j; m++) {
/*  25: 36 */         this.c[(k - this.a)][(m - this.b)] = paramaqu.getChunk(k, m);
/*  26:    */       }
/*  27:    */     }
/*  28: 40 */     for (int k = paramdt1.getX() >> 4; k <= paramdt2.getX() >> 4; k++) {
/*  29: 41 */       for (m = paramdt1.getZ() >> 4; m <= paramdt2.getZ() >> 4; m++)
/*  30:    */       {
/*  31: 42 */         Chunk localbfh = this.c[(k - this.a)][(m - this.b)];
/*  32: 43 */         if ((localbfh != null) && 
/*  33: 44 */           (!localbfh.c(paramdt1.getY(), paramdt2.getY()))) {
/*  34: 45 */           this.d = false;
/*  35:    */         }
/*  36:    */       }
/*  37:    */     }
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean W()
/*  41:    */   {
/*  42: 54 */     return this.d;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public bcm s(BlockPosition paramdt)
/*  46:    */   {
/*  47: 60 */     int i = (paramdt.getX() >> 4) - this.a;
/*  48: 61 */     int j = (paramdt.getZ() >> 4) - this.b;
/*  49:    */     
/*  50: 63 */     return this.c[i][j].a(paramdt, bfl.a);
/*  51:    */   }
/*  52:    */   
/*  53:    */   public int b(BlockPosition paramdt, int paramInt)
/*  54:    */   {
/*  55: 77 */     int i = a(EnumSkyBlock.SKY, paramdt);
/*  56: 78 */     int j = a(EnumSkyBlock.BLOCK, paramdt);
/*  57: 79 */     if (j < paramInt) {
/*  58: 80 */       j = paramInt;
/*  59:    */     }
/*  60: 82 */     return i << 20 | j << 4;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public Block getBlock(BlockPosition paramdt)
/*  64:    */   {
/*  65:134 */     if ((paramdt.getY() >= 0) && 
/*  66:135 */       (paramdt.getY() < 256))
/*  67:    */     {
/*  68:136 */       int i = (paramdt.getX() >> 4) - this.a;
/*  69:137 */       int j = (paramdt.getZ() >> 4) - this.b;
/*  70:139 */       if ((i >= 0) && (i < this.c.length) && (j >= 0) && (j < this.c[i].length))
/*  71:    */       {
/*  72:140 */         Chunk localbfh = this.c[i][j];
/*  73:141 */         if (localbfh != null) {
/*  74:142 */           return localbfh.g(paramdt);
/*  75:    */         }
/*  76:    */       }
/*  77:    */     }
/*  78:148 */     return BlockList.air.instance();
/*  79:    */   }
/*  80:    */   
/*  81:    */   public arm b(BlockPosition paramdt)
/*  82:    */   {
/*  83:158 */     return this.e.b(paramdt);
/*  84:    */   }
/*  85:    */   
/*  86:    */   private int a(EnumSkyBlock paramarf, BlockPosition paramdt)
/*  87:    */   {
/*  88:162 */     if ((paramarf == EnumSkyBlock.SKY) && (this.e.t.o())) {
/*  89:163 */       return 0;
/*  90:    */     }
/*  91:165 */     if ((paramdt.getY() < 0) || (paramdt.getY() >= 256)) {
/*  92:166 */       return paramarf.c;
/*  93:    */     }
/*  94:169 */     if (getBlock(paramdt).getType().q())
/*  95:    */     {
/*  96:170 */       int i = 0;
/*  97:171 */       for (EnumDirection localej : EnumDirection.values())
/*  98:    */       {
/*  99:172 */         int n = b(paramarf, paramdt.offset(localej));
/* 100:173 */         if (n > i) {
/* 101:174 */           i = n;
/* 102:    */         }
/* 103:176 */         if (i >= 15) {
/* 104:177 */           return i;
/* 105:    */         }
/* 106:    */       }
/* 107:180 */       return i;
/* 108:    */     }
/* 109:183 */     int i = (paramdt.getX() >> 4) - this.a;
/* 110:184 */     int j = (paramdt.getZ() >> 4) - this.b;
/* 111:    */     
/* 112:186 */     return this.c[i][j].a(paramarf, paramdt);
/* 113:    */   }
/* 114:    */   
/* 115:    */   public boolean isEmpty(BlockPosition paramdt)
/* 116:    */   {
/* 117:191 */     return getBlock(paramdt).getType().getMaterial() == Material.air;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public int b(EnumSkyBlock paramarf, BlockPosition paramdt)
/* 121:    */   {
/* 122:196 */     if ((paramdt.getY() < 0) || (paramdt.getY() >= 256)) {
/* 123:197 */       return paramarf.c;
/* 124:    */     }
/* 125:199 */     int i = (paramdt.getX() >> 4) - this.a;
/* 126:200 */     int j = (paramdt.getZ() >> 4) - this.b;
/* 127:    */     
/* 128:202 */     return this.c[i][j].a(paramarf, paramdt);
/* 129:    */   }
/* 130:    */   
/* 131:    */   public int getStrongRedstoneSignal(BlockPosition pos, EnumDirection dir)
/* 132:    */   {
/* 133:212 */     Block block = getBlock(pos);
/* 134:213 */     return block.getType().getStrongRedstoneSignal(this, pos, block, dir);
/* 135:    */   }
/* 136:    */   
/* 137:    */   public WorldType G()
/* 138:    */   {
/* 139:218 */     return this.e.G();
/* 140:    */   }
/* 141:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     arj
 * JD-Core Version:    0.7.0.1
 */