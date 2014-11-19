package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class bhh
/*  5:   */   extends TerrainGenerator
/*  6:   */ {
/*  7:   */   private final List a;
/*  8:   */   private final int b;
/*  9:   */   
/* 10:   */   public bhh(List paramList, int paramInt)
/* 11:   */   {
/* 12:20 */     this.a = paramList;
/* 13:21 */     this.b = paramInt;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 17:   */   {
/* 18:   */     ProtoBlock localatr;
/* 19:27 */     while ((((localatr = paramaqu.getBlock(paramdt).getProto()).getMaterial() == Material.air) || (localatr.getMaterial() == Material.leaves)) && (paramdt.getY() > 1)) {
/* 20:28 */       paramdt = paramdt.down();
/* 21:   */     }
/* 22:31 */     if (paramdt.getY() < 1) {
/* 23:32 */       return false;
/* 24:   */     }
/* 25:34 */     paramdt = paramdt.up();
/* 26:36 */     for (int i = 0; i < 4; i++)
/* 27:   */     {
/* 28:37 */       BlockPosition localdt1 = paramdt.offset(paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(3) - paramRandom.nextInt(3), paramRandom.nextInt(4) - paramRandom.nextInt(4));
/* 29:39 */       if ((paramaqu.isEmpty(localdt1)) && (World.isFlatSurface(paramaqu, localdt1.down())))
/* 30:   */       {
/* 31:40 */         paramaqu.setBlock(localdt1, BlockList.ae.instance(), 2);
/* 32:   */         
/* 33:42 */         bcm localbcm = paramaqu.s(localdt1);
/* 34:43 */         if ((localbcm instanceof bcr)) {
/* 35:44 */           vl.a(paramRandom, this.a, (bcr)localbcm, this.b);
/* 36:   */         }
/* 37:47 */         BlockPosition localdt2 = localdt1.east();
/* 38:48 */         BlockPosition localdt3 = localdt1.west();
/* 39:49 */         BlockPosition localdt4 = localdt1.north();
/* 40:50 */         BlockPosition localdt5 = localdt1.south();
/* 41:51 */         if ((paramaqu.isEmpty(localdt3)) && (World.isFlatSurface(paramaqu, localdt3.down()))) {
/* 42:52 */           paramaqu.setBlock(localdt3, BlockList.torch.instance(), 2);
/* 43:   */         }
/* 44:54 */         if ((paramaqu.isEmpty(localdt2)) && (World.isFlatSurface(paramaqu, localdt2.down()))) {
/* 45:55 */           paramaqu.setBlock(localdt2, BlockList.torch.instance(), 2);
/* 46:   */         }
/* 47:57 */         if ((paramaqu.isEmpty(localdt4)) && (World.isFlatSurface(paramaqu, localdt4.down()))) {
/* 48:58 */           paramaqu.setBlock(localdt4, BlockList.torch.instance(), 2);
/* 49:   */         }
/* 50:60 */         if ((paramaqu.isEmpty(localdt5)) && (World.isFlatSurface(paramaqu, localdt5.down()))) {
/* 51:61 */           paramaqu.setBlock(localdt5, BlockList.torch.instance(), 2);
/* 52:   */         }
/* 53:63 */         return true;
/* 54:   */       }
/* 55:   */     }
/* 56:67 */     return false;
/* 57:   */   }
/* 58:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhh
 * JD-Core Version:    0.7.0.1
 */