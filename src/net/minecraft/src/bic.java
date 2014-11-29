package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public abstract class bic
/*   4:    */   extends bhc
/*   5:    */ {
/*   6:    */   protected final int a;
/*   7:    */   protected final int b;
/*   8:    */   protected final int c;
/*   9:    */   protected int d;
/*  10:    */   
/*  11:    */   public bic(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  12:    */   {
/*  13: 18 */     super(paramBoolean);
/*  14: 19 */     this.a = paramInt1;
/*  15: 20 */     this.d = paramInt2;
/*  16: 21 */     this.b = paramInt3;
/*  17: 22 */     this.c = paramInt4;
/*  18:    */   }
/*  19:    */   
/*  20:    */   protected int a(Random paramRandom)
/*  21:    */   {
/*  22: 26 */     int i = paramRandom.nextInt(3) + this.a;
/*  23: 27 */     if (this.d > 1) {
/*  24: 28 */       i += paramRandom.nextInt(this.d);
/*  25:    */     }
/*  26: 30 */     return i;
/*  27:    */   }
/*  28:    */   
/*  29:    */   private boolean c(World paramaqu, BlockPosition paramdt, int paramInt)
/*  30:    */   {
/*  31: 34 */     boolean bool = true;
/*  32: 36 */     if ((paramdt.getY() < 1) || (paramdt.getY() + paramInt + 1 > 256)) {
/*  33: 37 */       return false;
/*  34:    */     }
/*  35: 40 */     for (int i = 0; i <= 1 + paramInt; i++)
/*  36:    */     {
/*  37: 41 */       int j = 2;
/*  38: 42 */       if (i == 0) {
/*  39: 43 */         j = 1;
/*  40: 44 */       } else if (i >= 1 + paramInt - 2) {
/*  41: 45 */         j = 2;
/*  42:    */       }
/*  43: 48 */       for (int k = -j; (k <= j) && (bool); k++) {
/*  44: 49 */         for (int m = -j; (m <= j) && (bool); m++) {
/*  45: 50 */           if ((paramdt.getY() + i < 0) || (paramdt.getY() + i >= 256) || 
/*  46: 51 */             (!canGrowInto(paramaqu.getBlock(paramdt.offset(k, i, m)).getType()))) {
/*  47: 55 */             bool = false;
/*  48:    */           }
/*  49:    */         }
/*  50:    */       }
/*  51:    */     }
/*  52: 60 */     return bool;
/*  53:    */   }
/*  54:    */   
/*  55:    */   private boolean a(BlockPosition paramdt, World paramaqu)
/*  56:    */   {
/*  57: 64 */     BlockPosition localdt = paramdt.down();
/*  58: 65 */     BlockType localatr = paramaqu.getBlock(localdt).getType();
/*  59: 66 */     if (((localatr != BlockList.grass) && (localatr != BlockList.dirt)) || (paramdt.getY() < 2)) {
/*  60: 67 */       return false;
/*  61:    */     }
/*  62: 70 */     makeDirt(paramaqu, localdt);
/*  63: 71 */     makeDirt(paramaqu, localdt.east());
/*  64: 72 */     makeDirt(paramaqu, localdt.south());
/*  65: 73 */     makeDirt(paramaqu, localdt.south().east());
/*  66:    */     
/*  67: 75 */     return true;
/*  68:    */   }
/*  69:    */   
/*  70:    */   protected boolean a(World paramaqu, Random paramRandom, BlockPosition paramdt, int paramInt)
/*  71:    */   {
/*  72: 79 */     return (c(paramaqu, paramdt, paramInt)) && (a(paramdt, paramaqu));
/*  73:    */   }
/*  74:    */   
/*  75:    */   protected void a(World paramaqu, BlockPosition paramdt, int paramInt)
/*  76:    */   {
/*  77: 83 */     int i = paramInt * paramInt;
/*  78: 85 */     for (int j = -paramInt; j <= paramInt + 1; j++) {
/*  79: 86 */       for (int k = -paramInt; k <= paramInt + 1; k++)
/*  80:    */       {
/*  81: 87 */         int m = j - 1;
/*  82: 88 */         int n = k - 1;
/*  83: 89 */         if ((j * j + k * k <= i) || (m * m + n * n <= i) || (j * j + n * n <= i) || (m * m + k * k <= i))
/*  84:    */         {
/*  85: 93 */           BlockPosition localdt = paramdt.offset(j, 0, k);
/*  86: 94 */           Material localbof = paramaqu.getBlock(localdt).getType().getMaterial();
/*  87: 95 */           if ((localbof == Material.air) || (localbof == Material.leaves)) {
/*  88: 96 */             setBlock(paramaqu, localdt, BlockList.leaves, this.c);
/*  89:    */           }
/*  90:    */         }
/*  91:    */       }
/*  92:    */     }
/*  93:    */   }
/*  94:    */   
/*  95:    */   protected void b(World paramaqu, BlockPosition paramdt, int paramInt)
/*  96:    */   {
/*  97:103 */     int i = paramInt * paramInt;
/*  98:105 */     for (int j = -paramInt; j <= paramInt; j++) {
/*  99:106 */       for (int k = -paramInt; k <= paramInt; k++) {
/* 100:107 */         if (j * j + k * k <= i)
/* 101:    */         {
/* 102:111 */           BlockPosition localdt = paramdt.offset(j, 0, k);
/* 103:112 */           Material localbof = paramaqu.getBlock(localdt).getType().getMaterial();
/* 104:113 */           if ((localbof == Material.air) || (localbof == Material.leaves)) {
/* 105:114 */             setBlock(paramaqu, localdt, BlockList.leaves, this.c);
/* 106:    */           }
/* 107:    */         }
/* 108:    */       }
/* 109:    */     }
/* 110:    */   }
/* 111:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bic
 * JD-Core Version:    0.7.0.1
 */