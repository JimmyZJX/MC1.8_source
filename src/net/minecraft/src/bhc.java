package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public abstract class bhc
/*  4:   */   extends TerrainGenerator
/*  5:   */ {
/*  6:   */   public bhc(boolean paramBoolean)
/*  7:   */   {
/*  8:13 */     super(paramBoolean);
/*  9:   */   }
/* 10:   */   
/* 11:   */   protected boolean canGrowInto(ProtoBlock paramatr)
/* 12:   */   {
/* 13:17 */     return (paramatr.getMaterial() == Material.air) || (paramatr.getMaterial() == Material.leaves) || (paramatr == BlockList.grass) || (paramatr == BlockList.dirt) || (paramatr == BlockList.log) || (paramatr == BlockList.log2) || (paramatr == BlockList.sapling) || (paramatr == BlockList.vine);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void a(World paramaqu, Random paramRandom, BlockPosition paramdt) {}
/* 17:   */   
/* 18:   */   protected void makeDirt(World paramaqu, BlockPosition paramdt)
/* 19:   */   {
/* 20:25 */     if (paramaqu.getBlock(paramdt).getProto() != BlockList.dirt) {
/* 21:26 */       setBlock(paramaqu, paramdt, BlockList.dirt.instance());
/* 22:   */     }
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhc
 * JD-Core Version:    0.7.0.1
 */