package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class ayb
/*   5:    */   extends BlockMushroom
/*   6:    */   implements atz
/*   7:    */ {
/*   8:    */   protected ayb()
/*   9:    */   {
/*  10: 13 */     float f = 0.2F;
/*  11: 14 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
/*  12: 15 */     a(true);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void b(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  16:    */   {
/*  17: 20 */     if (paramRandom.nextInt(25) == 0)
/*  18:    */     {
/*  19: 21 */       int i = 5;
/*  20: 22 */       int j = 4;
/*  21: 23 */       for (Iterator<dy> localObject = BlockPosition.b(paramdt.offset(-4, -1, -4), paramdt.offset(4, 1, 4)).iterator(); (localObject).hasNext();)
/*  22:    */       {
/*  23: 23 */         BlockPosition localdt = (BlockPosition)(localObject).next();
/*  24: 24 */         if (paramaqu.getBlock(localdt).getProto() == this)
/*  25:    */         {
/*  26: 24 */           i--;
/*  27: 24 */           if (i <= 0) {
/*  28: 25 */             return;
/*  29:    */           }
/*  30:    */         }
/*  31:    */       }
/*  32: 30 */       BlockPosition localObject = paramdt.offset(paramRandom.nextInt(3) - 1, paramRandom.nextInt(2) - paramRandom.nextInt(2), paramRandom.nextInt(3) - 1);
/*  33: 31 */       for (int k = 0; k < 4; k++)
/*  34:    */       {
/*  35: 32 */         if ((paramaqu.isEmpty((BlockPosition)localObject)) && (f(paramaqu, (BlockPosition)localObject, instance()))) {
/*  36: 33 */           paramdt = (BlockPosition)localObject;
/*  37:    */         }
/*  38: 35 */         localObject = paramdt.offset(paramRandom.nextInt(3) - 1, paramRandom.nextInt(2) - paramRandom.nextInt(2), paramRandom.nextInt(3) - 1);
/*  39:    */       }
/*  40: 38 */       if ((paramaqu.isEmpty((BlockPosition)localObject)) && (f(paramaqu, (BlockPosition)localObject, instance()))) {
/*  41: 39 */         paramaqu.setBlock((BlockPosition)localObject, instance(), 2);
/*  42:    */       }
/*  43:    */     }
/*  44:    */   }
/*  45:    */   
/*  46:    */   public boolean c(World paramaqu, BlockPosition paramdt)
/*  47:    */   {
/*  48: 46 */     return (super.c(paramaqu, paramdt)) && (f(paramaqu, paramdt, instance()));
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected boolean c(ProtoBlock paramatr)
/*  52:    */   {
/*  53: 51 */     return paramatr.m();
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean f(World paramaqu, BlockPosition paramdt, Block parambec)
/*  57:    */   {
/*  58: 56 */     if ((paramdt.getY() < 0) || (paramdt.getY() >= 256)) {
/*  59: 57 */       return false;
/*  60:    */     }
/*  61: 60 */     Block localbec = paramaqu.getBlock(paramdt.down());
/*  62: 61 */     if (localbec.getProto() == BlockList.bw) {
/*  63: 62 */       return true;
/*  64:    */     }
/*  65: 64 */     if ((localbec.getProto() == BlockList.dirt) && (localbec.getData(BlockDirt.a) == avd.c)) {
/*  66: 65 */       return true;
/*  67:    */     }
/*  68: 68 */     return (paramaqu.k(paramdt) < 13) && (c(localbec.getProto()));
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean d(World paramaqu, BlockPosition paramdt, Block parambec, Random paramRandom)
/*  72:    */   {
/*  73: 72 */     paramaqu.g(paramdt);
/*  74:    */     
/*  75: 74 */     bhv localbhv = null;
/*  76: 75 */     if (this == BlockList.brownMushroom) {
/*  77: 76 */       localbhv = new bhv(0);
/*  78: 77 */     } else if (this == BlockList.redMushroom) {
/*  79: 78 */       localbhv = new bhv(1);
/*  80:    */     }
/*  81: 81 */     if ((localbhv != null) && (localbhv.generate(paramaqu, paramRandom, paramdt))) {
/*  82: 82 */       return true;
/*  83:    */     }
/*  84: 85 */     paramaqu.setBlock(paramdt, parambec, 3);
/*  85: 86 */     return false;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public boolean a(World paramaqu, BlockPosition paramdt, Block parambec, boolean paramBoolean)
/*  89:    */   {
/*  90: 91 */     return true;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public boolean a(World paramaqu, Random paramRandom, BlockPosition paramdt, Block parambec)
/*  94:    */   {
/*  95: 96 */     return paramRandom.nextFloat() < 0.4D;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public void b(World paramaqu, Random paramRandom, BlockPosition paramdt, Block parambec)
/*  99:    */   {
/* 100:101 */     d(paramaqu, paramdt, parambec, paramRandom);
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ayb
 * JD-Core Version:    0.7.0.1
 */