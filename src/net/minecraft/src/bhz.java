package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhz
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  7:   */   {
/*  8:15 */     if (!paramaqu.isEmpty(paramdt)) {
/*  9:16 */       return false;
/* 10:   */     }
/* 11:18 */     if (paramaqu.getBlock(paramdt.up()).getProto() != BlockList.netherrack) {
/* 12:19 */       return false;
/* 13:   */     }
/* 14:21 */     paramaqu.setBlock(paramdt, BlockList.aX.instance(), 2);
/* 15:23 */     for (int i = 0; i < 1500; i++)
/* 16:   */     {
/* 17:24 */       BlockPosition localdt = paramdt.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), -paramRandom.nextInt(12), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 18:25 */       if (paramaqu.getBlock(localdt).getProto().getMaterial() == Material.air)
/* 19:   */       {
/* 20:29 */         int j = 0;
/* 21:30 */         for (EnumDirection localej : EnumDirection.values())
/* 22:   */         {
/* 23:31 */           if (paramaqu.getBlock(localdt.a(localej)).getProto() == BlockList.aX) {
/* 24:32 */             j++;
/* 25:   */           }
/* 26:35 */           if (j > 1) {
/* 27:   */             break;
/* 28:   */           }
/* 29:   */         }
/* 30:40 */         if (j == 1) {
/* 31:41 */           paramaqu.setBlock(localdt, BlockList.aX.instance(), 2);
/* 32:   */         }
/* 33:   */       }
/* 34:   */     }
/* 35:45 */     return true;
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhz
 * JD-Core Version:    0.7.0.1
 */