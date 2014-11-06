package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bib
/*   4:    */   extends bic
/*   5:    */ {
/*   6:    */   private boolean e;
/*   7:    */   
/*   8:    */   public bib(boolean paramBoolean1, boolean paramBoolean2)
/*   9:    */   {
/*  10: 18 */     super(paramBoolean1, 13, 15, EnumWoodVariant.SPRUCE.getIndex(), EnumWoodVariant.SPRUCE.getIndex());
/*  11: 19 */     this.e = paramBoolean2;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  15:    */   {
/*  16: 24 */     int i = a(paramRandom);
/*  17: 25 */     if (!a(paramaqu, paramRandom, paramdt, i)) {
/*  18: 26 */       return false;
/*  19:    */     }
/*  20: 29 */     a(paramaqu, paramdt.getX(), paramdt.getZ(), paramdt.getY() + i, 0, paramRandom);
/*  21: 31 */     for (int j = 0; j < i; j++)
/*  22:    */     {
/*  23: 32 */       ProtoBlock localatr = paramaqu.getBlock(paramdt.up(j)).getProto();
/*  24: 33 */       if ((localatr.getMaterial() == Material.air) || (localatr.getMaterial() == Material.leaves)) {
/*  25: 34 */         setBlock(paramaqu, paramdt.up(j), BlockList.log, this.b);
/*  26:    */       }
/*  27: 36 */       if (j < i - 1)
/*  28:    */       {
/*  29: 37 */         localatr = paramaqu.getBlock(paramdt.offset(1, j, 0)).getProto();
/*  30: 38 */         if ((localatr.getMaterial() == Material.air) || (localatr.getMaterial() == Material.leaves)) {
/*  31: 39 */           setBlock(paramaqu, paramdt.offset(1, j, 0), BlockList.log, this.b);
/*  32:    */         }
/*  33: 41 */         localatr = paramaqu.getBlock(paramdt.offset(1, j, 1)).getProto();
/*  34: 42 */         if ((localatr.getMaterial() == Material.air) || (localatr.getMaterial() == Material.leaves)) {
/*  35: 43 */           setBlock(paramaqu, paramdt.offset(1, j, 1), BlockList.log, this.b);
/*  36:    */         }
/*  37: 45 */         localatr = paramaqu.getBlock(paramdt.offset(0, j, 1)).getProto();
/*  38: 46 */         if ((localatr.getMaterial() == Material.air) || (localatr.getMaterial() == Material.leaves)) {
/*  39: 47 */           setBlock(paramaqu, paramdt.offset(0, j, 1), BlockList.log, this.b);
/*  40:    */         }
/*  41:    */       }
/*  42:    */     }
/*  43: 52 */     return true;
/*  44:    */   }
/*  45:    */   
/*  46:    */   private void a(World paramaqu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom)
/*  47:    */   {
/*  48: 56 */     int i = paramRandom.nextInt(5) + (this.e ? this.a : 3);
/*  49:    */     
/*  50: 58 */     int j = 0;
/*  51: 59 */     for (int k = paramInt3 - i; k <= paramInt3; k++)
/*  52:    */     {
/*  53: 60 */       int m = paramInt3 - k;
/*  54: 61 */       int n = paramInt4 + MathUtils.floor(m / i * 3.5F);
/*  55: 62 */       a(paramaqu, new BlockPosition(paramInt1, k, paramInt2), n + ((m > 0) && (n == j) && ((k & 0x1) == 0) ? 1 : 0));
/*  56: 63 */       j = n;
/*  57:    */     }
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  61:    */   {
/*  62: 69 */     b(paramaqu, paramdt.west().north());
/*  63: 70 */     b(paramaqu, paramdt.east(2).north());
/*  64: 71 */     b(paramaqu, paramdt.west().south(2));
/*  65: 72 */     b(paramaqu, paramdt.east(2).south(2));
/*  66: 74 */     for (int i = 0; i < 5; i++)
/*  67:    */     {
/*  68: 75 */       int j = paramRandom.nextInt(64);
/*  69: 76 */       int k = j % 8;
/*  70: 77 */       int m = j / 8;
/*  71: 78 */       if ((k == 0) || (k == 7) || (m == 0) || (m == 7)) {
/*  72: 79 */         b(paramaqu, paramdt.offset(-3 + k, 0, -3 + m));
/*  73:    */       }
/*  74:    */     }
/*  75:    */   }
/*  76:    */   
/*  77:    */   private void b(World paramaqu, BlockPosition paramdt)
/*  78:    */   {
/*  79: 85 */     for (int i = -2; i <= 2; i++) {
/*  80: 86 */       for (int j = -2; j <= 2; j++) {
/*  81: 87 */         if ((Math.abs(i) != 2) || (Math.abs(j) != 2)) {
/*  82: 88 */           c(paramaqu, paramdt.offset(i, 0, j));
/*  83:    */         }
/*  84:    */       }
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   private void c(World paramaqu, BlockPosition paramdt)
/*  89:    */   {
/*  90: 95 */     for (int i = 2; i >= -3; i--)
/*  91:    */     {
/*  92: 96 */       BlockPosition localdt = paramdt.up(i);
/*  93: 97 */       ProtoBlock localatr = paramaqu.getBlock(localdt).getProto();
/*  94: 98 */       if ((localatr == BlockList.grass) || (localatr == BlockList.dirt)) {
/*  95: 99 */         setBlock(paramaqu, localdt, BlockList.dirt, avd.c.a());
/*  96:    */       } else {
/*  97:101 */         if ((localatr.getMaterial() != Material.air) && (i < 0)) {
/*  98:    */           break;
/*  99:    */         }
/* 100:    */       }
/* 101:    */     }
/* 102:    */   }
/* 103:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bib
 * JD-Core Version:    0.7.0.1
 */