package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class UpwardsGlowstoneGenerator
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   public boolean generate(World world, Random paramRandom, BlockPosition pos)
/*  7:   */   {
/*  8:15 */     if (!world.isEmpty(pos)) {
/*  9:16 */       return false;
/* 10:   */     }
/* 11:18 */     if (world.getBlock(pos.up()).getProto() != BlockList.netherrack) {
/* 12:19 */       return false;
/* 13:   */     }
/* 14:21 */     world.setBlock(pos, BlockList.glowstone.instance(), 2);
/* 15:23 */     for (int i = 0; i < 1500; i++)
/* 16:   */     {
/* 17:24 */       BlockPosition pos1 = pos.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(12), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 18:25 */       if (world.getBlock(pos1).getProto().getMaterial() == Material.air)
/* 19:   */       {
/* 20:29 */         int j = 0;
/* 21:30 */         for (EnumDirection localej : EnumDirection.values())
/* 22:   */         {
/* 23:31 */           if (world.getBlock(pos1.a(localej)).getProto() == BlockList.glowstone) {
/* 24:32 */             j++;
/* 25:   */           }
/* 26:35 */           if (j > 1) {
/* 27:   */             break;
/* 28:   */           }
/* 29:   */         }
/* 30:40 */         if (j == 1) {
/* 31:41 */           world.setBlock(pos1, BlockList.glowstone.instance(), 2);
/* 32:   */         }
/* 33:   */       }
/* 34:   */     }
/* 35:45 */     return true;
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bht
 * JD-Core Version:    0.7.0.1
 */