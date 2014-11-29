package net.minecraft.src;
/*  1:   */ public class bbo
/*  2:   */   extends BlockType
/*  3:   */ {
/*  4:   */   protected boolean Q;
/*  5:   */   
/*  6:   */   protected bbo(Material parambof, boolean paramBoolean)
/*  7:   */   {
/*  8:12 */     super(parambof);
/*  9:13 */     this.Q = paramBoolean;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean c()
/* 13:   */   {
/* 14:18 */     return false;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a(IBlockAccess paramard, BlockPosition paramdt, EnumDirection paramej)
/* 18:   */   {
/* 19:23 */     if ((!this.Q) && (paramard.getBlock(paramdt).getType() == this)) {
/* 20:24 */       return false;
/* 21:   */     }
/* 22:27 */     return super.a(paramard, paramdt, paramej);
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bbo
 * JD-Core Version:    0.7.0.1
 */