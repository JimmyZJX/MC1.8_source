package net.minecraft.src;
/*   1:    */ import com.google.common.cache.CacheLoader;
/*   2:    */ 
/*   3:    */ class bel
/*   4:    */   extends CacheLoader<BlockPosition,bei>
/*   5:    */ {
/*   6:    */   private final World a;
/*   7:    */   
/*   8:    */   public bel(World paramaqu)
/*   9:    */   {
/*  10:120 */     this.a = paramaqu;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public bei load(BlockPosition paramdt)
/*  14:    */   {
/*  15:125 */     return new bei(this.a, paramdt);
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bel
 * JD-Core Version:    0.7.0.1
 */