package net.minecraft.src;
/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class avl
/*   4:    */   extends ProtoBlock
/*   5:    */ {
/*   6:    */   public avl()
/*   7:    */   {
/*   8: 18 */     super(Material.D);
/*   9:    */     
/*  10: 20 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void c(World paramaqu, BlockPosition paramdt, Block parambec)
/*  14:    */   {
/*  15: 25 */     paramaqu.a(paramdt, this, a(paramaqu));
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void a(World paramaqu, BlockPosition paramdt, Block parambec, ProtoBlock paramatr)
/*  19:    */   {
/*  20: 30 */     paramaqu.a(paramdt, this, a(paramaqu));
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  24:    */   {
/*  25: 35 */     d(paramaqu, paramdt);
/*  26:    */   }
/*  27:    */   
/*  28:    */   private void d(World paramaqu, BlockPosition paramdt)
/*  29:    */   {
/*  30: 39 */     if ((!avt.d(paramaqu, paramdt.down())) || (paramdt.getY() < 0)) {
/*  31: 40 */       return;
/*  32:    */     }
/*  33: 43 */     int i = 32;
/*  34: 44 */     if ((avt.M) || (!paramaqu.a(paramdt.offset(-i, -i, -i), paramdt.offset(i, i, i))))
/*  35:    */     {
/*  36: 45 */       paramaqu.g(paramdt);
/*  37:    */       
/*  38: 47 */       BlockPosition localdt = paramdt;
/*  39: 48 */       while ((avt.d(paramaqu, localdt)) && (localdt.getY() > 0)) {
/*  40: 49 */         localdt = localdt.down();
/*  41:    */       }
/*  42: 51 */       if (localdt.getY() > 0) {
/*  43: 52 */         paramaqu.setBlock(localdt, instance(), 2);
/*  44:    */       }
/*  45:    */     }
/*  46:    */     else
/*  47:    */     {
/*  48: 55 */       paramaqu.spawnEntity(new adv(paramaqu, paramdt.getX() + 0.5F, paramdt.getY(), paramdt.getZ() + 0.5F, instance()));
/*  49:    */     }
/*  50:    */   }
/*  51:    */   
/*  52:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, EntityPlayer paramahd, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  53:    */   {
/*  54: 61 */     e(paramaqu, paramdt);
/*  55: 62 */     return true;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void a(World paramaqu, BlockPosition paramdt, EntityPlayer paramahd)
/*  59:    */   {
/*  60: 67 */     e(paramaqu, paramdt);
/*  61:    */   }
/*  62:    */   
/*  63:    */   private void e(World paramaqu, BlockPosition paramdt)
/*  64:    */   {
/*  65: 71 */     Block localbec = paramaqu.getBlock(paramdt);
/*  66: 72 */     if (localbec.getProto() != this) {
/*  67: 73 */       return;
/*  68:    */     }
/*  69: 76 */     for (int i = 0; i < 1000; i++)
/*  70:    */     {
/*  71: 77 */       BlockPosition localdt = paramdt.offset(paramaqu.rng.nextInt(16) - paramaqu.rng.nextInt(16), paramaqu.rng.nextInt(8) - paramaqu.rng.nextInt(8), paramaqu.rng.nextInt(16) - paramaqu.rng.nextInt(16));
/*  72: 78 */       if (paramaqu.getBlock(localdt).getProto().material == Material.air)
/*  73:    */       {
/*  74: 79 */         if (paramaqu.isClient)
/*  75:    */         {
/*  76: 80 */           for (int j = 0; j < 128; j++)
/*  77:    */           {
/*  78: 81 */             double d1 = paramaqu.rng.nextDouble();
/*  79: 82 */             float f1 = (paramaqu.rng.nextFloat() - 0.5F) * 0.2F;
/*  80: 83 */             float f2 = (paramaqu.rng.nextFloat() - 0.5F) * 0.2F;
/*  81: 84 */             float f3 = (paramaqu.rng.nextFloat() - 0.5F) * 0.2F;
/*  82:    */             
/*  83: 86 */             double d2 = localdt.getX() + (paramdt.getX() - localdt.getX()) * d1 + (paramaqu.rng.nextDouble() - 0.5D) * 1.0D + 0.5D;
/*  84: 87 */             double d3 = localdt.getY() + (paramdt.getY() - localdt.getY()) * d1 + paramaqu.rng.nextDouble() * 1.0D - 0.5D;
/*  85: 88 */             double d4 = localdt.getZ() + (paramdt.getZ() - localdt.getZ()) * d1 + (paramaqu.rng.nextDouble() - 0.5D) * 1.0D + 0.5D;
/*  86: 89 */             paramaqu.a(EnumParticleEffect.y, d2, d3, d4, f1, f2, f3, new int[0]);
/*  87:    */           }
/*  88:    */         }
/*  89:    */         else
/*  90:    */         {
/*  91: 92 */           paramaqu.setBlock(localdt, localbec, 2);
/*  92: 93 */           paramaqu.g(paramdt);
/*  93:    */         }
/*  94: 95 */         return;
/*  95:    */       }
/*  96:    */     }
/*  97:    */   }
/*  98:    */   
/*  99:    */   public int a(World paramaqu)
/* 100:    */   {
/* 101:102 */     return 5;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public boolean c()
/* 105:    */   {
/* 106:107 */     return false;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public boolean isOpaqueCube()
/* 110:    */   {
/* 111:112 */     return false;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 115:    */   {
/* 116:117 */     return true;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public Item b(World paramaqu, BlockPosition paramdt)
/* 120:    */   {
/* 121:122 */     return null;
/* 122:    */   }
/* 123:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     avl
 * JD-Core Version:    0.7.0.1
 */