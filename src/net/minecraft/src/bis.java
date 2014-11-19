package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bis
/*  4:   */   extends bhp
/*  5:   */ {
/*  6:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  7:   */   {
/*  8:16 */     while (paramdt.getY() < 128)
/*  9:   */     {
/* 10:17 */       if (paramaqu.isEmpty(paramdt)) {
/* 11:19 */         for (EnumDirection localej : en.HORIZONTAL.getDirectionList()) {
/* 12:20 */           if (BlockList.vine.a(paramaqu, paramdt, localej))
/* 13:   */           {
/* 14:21 */             Block localbec = BlockList.vine.instance().a(bbv.b, Boolean.valueOf(localej == EnumDirection.NORTH)).a(bbv.M, Boolean.valueOf(localej == EnumDirection.EAST)).a(bbv.N, Boolean.valueOf(localej == EnumDirection.SOUTH)).a(bbv.O, Boolean.valueOf(localej == EnumDirection.WEST));
/* 15:   */             
/* 16:   */ 
/* 17:   */ 
/* 18:   */ 
/* 19:   */ 
/* 20:27 */             paramaqu.setBlock(paramdt, localbec, 2);
/* 21:28 */             break;
/* 22:   */           }
/* 23:   */         }
/* 24:   */       } else {
/* 25:32 */         paramdt = paramdt.offset(paramRandom.nextInt(4) - paramRandom.nextInt(4), 0, paramRandom.nextInt(4) - paramRandom.nextInt(4));
/* 26:   */       }
/* 27:34 */       paramdt = paramdt.up();
/* 28:   */     }
/* 29:37 */     return true;
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bis
 * JD-Core Version:    0.7.0.1
 */