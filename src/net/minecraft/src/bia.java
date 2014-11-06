package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bia
/*   4:    */   extends bic
/*   5:    */ {
/*   6:    */   public bia(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*   7:    */   {
/*   8: 14 */     super(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  12:    */   {
/*  13: 19 */     int i = a(paramRandom);
/*  14: 20 */     if (!a(paramaqu, paramRandom, paramdt, i)) {
/*  15: 21 */       return false;
/*  16:    */     }
/*  17: 24 */     c(paramaqu, paramdt.up(i), 2);
/*  18:    */     
/*  19: 26 */     int j = paramdt.getY() + i - 2 - paramRandom.nextInt(4);
/*  20: 29 */     while (j > paramdt.getY() + i / 2)
/*  21:    */     {
/*  22: 30 */       float f = paramRandom.nextFloat() * 3.141593F * 2.0F;
/*  23: 31 */       int m = paramdt.getX() + (int)(0.5F + MathUtils.cos(f) * 4.0F);
/*  24: 32 */       int n = paramdt.getZ() + (int)(0.5F + MathUtils.sin(f) * 4.0F);
/*  25: 34 */       for (int i1 = 0; i1 < 5; i1++)
/*  26:    */       {
/*  27: 35 */         m = paramdt.getX() + (int)(1.5F + MathUtils.cos(f) * i1);
/*  28: 36 */         n = paramdt.getZ() + (int)(1.5F + MathUtils.sin(f) * i1);
/*  29: 37 */         setBlock(paramaqu, new BlockPosition(m, j - 3 + i1 / 2, n), BlockList.log, this.b);
/*  30:    */       }
/*  31: 39 */       int i1 = 1 + paramRandom.nextInt(2);
/*  32: 40 */       int i2 = j;
/*  33: 41 */       for (int i3 = i2 - i1; i3 <= i2; i3++)
/*  34:    */       {
/*  35: 42 */         int i4 = i3 - i2;
/*  36: 43 */         b(paramaqu, new BlockPosition(m, i3, n), 1 - i4);
/*  37:    */       }
/*  38: 46 */       j -= 2 + paramRandom.nextInt(4);
/*  39:    */     }
/*  40: 49 */     for (int k = 0; k < i; k++)
/*  41:    */     {
/*  42: 50 */       BlockPosition localdt1 = paramdt.up(k);
/*  43: 51 */       if (a(paramaqu.getBlock(localdt1).getProto().getMaterial()))
/*  44:    */       {
/*  45: 52 */         setBlock(paramaqu, localdt1, BlockList.log, this.b);
/*  46: 53 */         if (k > 0)
/*  47:    */         {
/*  48: 54 */           b(paramaqu, paramRandom, localdt1.west(), bbv.S);
/*  49: 55 */           b(paramaqu, paramRandom, localdt1.north(), bbv.Q);
/*  50:    */         }
/*  51:    */       }
/*  52: 59 */       if (k < i - 1)
/*  53:    */       {
/*  54: 60 */         BlockPosition localdt2 = localdt1.east();
/*  55: 61 */         if (a(paramaqu.getBlock(localdt2).getProto().getMaterial()))
/*  56:    */         {
/*  57: 62 */           setBlock(paramaqu, localdt2, BlockList.log, this.b);
/*  58: 63 */           if (k > 0)
/*  59:    */           {
/*  60: 64 */             b(paramaqu, paramRandom, localdt2.east(), bbv.T);
/*  61: 65 */             b(paramaqu, paramRandom, localdt2.north(), bbv.Q);
/*  62:    */           }
/*  63:    */         }
/*  64: 69 */         BlockPosition localdt3 = localdt1.south().east();
/*  65: 70 */         if (a(paramaqu.getBlock(localdt3).getProto().getMaterial()))
/*  66:    */         {
/*  67: 71 */           setBlock(paramaqu, localdt3, BlockList.log, this.b);
/*  68: 72 */           if (k > 0)
/*  69:    */           {
/*  70: 73 */             b(paramaqu, paramRandom, localdt3.east(), bbv.T);
/*  71: 74 */             b(paramaqu, paramRandom, localdt3.south(), bbv.R);
/*  72:    */           }
/*  73:    */         }
/*  74: 78 */         BlockPosition localdt4 = localdt1.south();
/*  75: 79 */         if (a(paramaqu.getBlock(localdt4).getProto().getMaterial()))
/*  76:    */         {
/*  77: 80 */           setBlock(paramaqu, localdt4, BlockList.log, this.b);
/*  78: 81 */           if (k > 0)
/*  79:    */           {
/*  80: 82 */             b(paramaqu, paramRandom, localdt4.west(), bbv.S);
/*  81: 83 */             b(paramaqu, paramRandom, localdt4.south(), bbv.R);
/*  82:    */           }
/*  83:    */         }
/*  84:    */       }
/*  85:    */     }
/*  86: 89 */     return true;
/*  87:    */   }
/*  88:    */   
/*  89:    */   private boolean a(Material parambof)
/*  90:    */   {
/*  91: 93 */     return (parambof == Material.air) || (parambof == Material.leaves);
/*  92:    */   }
/*  93:    */   
/*  94:    */   private void b(World paramaqu, Random paramRandom, BlockPosition paramdt, int paramInt)
/*  95:    */   {
/*  96: 97 */     if ((paramRandom.nextInt(3) > 0) && (paramaqu.d(paramdt))) {
/*  97: 98 */       setBlock(paramaqu, paramdt, BlockList.vine, paramInt);
/*  98:    */     }
/*  99:    */   }
/* 100:    */   
/* 101:    */   private void c(World paramaqu, BlockPosition paramdt, int paramInt)
/* 102:    */   {
/* 103:103 */     int i = 2;
/* 104:104 */     for (int j = -i; j <= 0; j++) {
/* 105:105 */       a(paramaqu, paramdt.up(j), paramInt + 1 - j);
/* 106:    */     }
/* 107:    */   }
/* 108:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bia
 * JD-Core Version:    0.7.0.1
 */