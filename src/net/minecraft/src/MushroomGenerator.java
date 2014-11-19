package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class MushroomGenerator
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   private BlockMushroom block;
/*  7:   */   
/*  8:   */   public MushroomGenerator(BlockMushroom paramauc)
/*  9:   */   {
/* 10:14 */     this.block = paramauc;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition pos)
/* 14:   */   {
/* 15:19 */     for (int i = 0; i < 64; i++)
/* 16:   */     {
/* 17:20 */       BlockPosition pos1 = pos.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 18:21 */       if ((paramaqu.isEmpty(pos1)) && ((!paramaqu.t.o()) || (pos1.getY() < 255)) && 
/* 19:22 */         (this.block.f(paramaqu, pos1, this.block.instance()))) {
/* 20:23 */         paramaqu.setBlock(pos1, this.block.instance(), 2);
/* 21:   */       }
/* 22:   */     }
/* 23:28 */     return true;
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhi
 * JD-Core Version:    0.7.0.1
 */