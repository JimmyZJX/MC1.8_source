package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class biq
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   private final Block a;
/*  7:   */   
/*  8:   */   public biq(bbi parambbi)
/*  9:   */   {
/* 10:17 */     this.a = BlockList.tallgrass.instance().setData(bbh.a, parambbi);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt)
/* 14:   */   {
/* 15:   */     ProtoBlock localatr;
/* 16:24 */     while ((((localatr = paramaqu.getBlock(paramdt).getProto()).getMaterial() == Material.air) || (localatr.getMaterial() == Material.leaves)) && (paramdt.getY() > 0)) {
/* 17:25 */       paramdt = paramdt.down();
/* 18:   */     }
/* 19:28 */     for (int i = 0; i < 128; i++)
/* 20:   */     {
/* 21:29 */       BlockPosition localdt = paramdt.offset(paramRandom.nextInt(8) - paramRandom.nextInt(8), paramRandom.nextInt(4) - paramRandom.nextInt(4), paramRandom.nextInt(8) - paramRandom.nextInt(8));
/* 22:30 */       if ((paramaqu.isEmpty(localdt)) && 
/* 23:31 */         (BlockList.tallgrass.f(paramaqu, localdt, this.a))) {
/* 24:32 */         paramaqu.setBlock(localdt, this.a, 2);
/* 25:   */       }
/* 26:   */     }
/* 27:37 */     return true;
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     biq
 * JD-Core Version:    0.7.0.1
 */