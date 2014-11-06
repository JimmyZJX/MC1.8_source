package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class cuf
/*   4:    */   implements Callable<String>
/*   5:    */ {
/*   6:    */   cuf(cue paramcue, int[][] paramArrayOfInt) {}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:293 */     StringBuilder localStringBuilder = new StringBuilder();
/*  11:295 */     for (int[] arrayOfInt1 : this.a)
/*  12:    */     {
/*  13:296 */       if (localStringBuilder.length() > 0) {
/*  14:297 */         localStringBuilder.append(", ");
/*  15:    */       }
/*  16:299 */       localStringBuilder.append(arrayOfInt1 == null ? "null" : Integer.valueOf(arrayOfInt1.length));
/*  17:    */     }
/*  18:302 */     return localStringBuilder.toString();
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cuf
 * JD-Core Version:    0.7.0.1
 */