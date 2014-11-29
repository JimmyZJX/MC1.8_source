package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bhm
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/*  7:   */   {
/*  8:   */     BlockType localatr;
/*  9:18 */     while ((((localatr = paramaqu.getBlock(paramdt).getType()).getMaterial() == Material.air) || (localatr.getMaterial() == Material.leaves)) && (paramdt.getY() > 0)) {
/* 10:19 */       paramdt = paramdt.down();
/* 11:   */     }
/* 12:22 */     for (int i = 0; i < 4; i++)
/* 13:   */     {
/* 14:23 */       BlockPosition localdt = paramdt.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 15:24 */       if ((paramaqu.isEmpty(localdt)) && 
/* 16:25 */         (BlockList.deadbush.f(paramaqu, localdt, BlockList.deadbush.instance()))) {
/* 17:26 */         paramaqu.setBlock(localdt, BlockList.deadbush.instance(), 2);
/* 18:   */       }
/* 19:   */     }
/* 20:31 */     return true;
/* 21:   */   }
/* 22:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhm
 * JD-Core Version:    0.7.0.1
 */