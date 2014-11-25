package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public abstract class TerrainGenerator
/*  4:   */ {
/*  5:   */   private final boolean a;
/*  6:   */   
/*  7:   */   public TerrainGenerator()
/*  8:   */   {
/*  9:14 */     this(false);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public TerrainGenerator(boolean paramBoolean)
/* 13:   */   {
/* 14:18 */     this.a = paramBoolean;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public abstract boolean generate(World paramaqu, Random paramRandom, BlockPosition paramdt);
/* 18:   */   
/* 19:   */   public void e() {}
/* 20:   */   
/* 21:   */   protected void setBlock(World paramaqu, BlockPosition paramdt, ProtoBlock paramatr)
/* 22:   */   {
/* 23:29 */     setBlock(paramaqu, paramdt, paramatr, 0);
/* 24:   */   }
/* 25:   */   
/* 26:   */   protected void setBlock(World paramaqu, BlockPosition paramdt, ProtoBlock paramatr, int paramInt)
/* 27:   */   {
/* 28:34 */     setBlock(paramaqu, paramdt, paramatr.instance(paramInt));
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected void setBlock(World paramaqu, BlockPosition paramdt, Block parambec)
/* 32:   */   {
/* 33:38 */     if (this.a) {
/* 34:39 */       paramaqu.setBlock(paramdt, parambec, 3);
/* 35:   */     } else {
/* 36:41 */       paramaqu.setBlock(paramdt, parambec, 2);
/* 37:   */     }
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bhp
 * JD-Core Version:    0.7.0.1
 */