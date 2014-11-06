package net.minecraft.src;
/*   1:    */ import java.io.File;
/*   2:    */ import java.io.FilenameFilter;
/*   3:    */ 
/*   4:    */ class bqk
/*   5:    */   implements FilenameFilter
/*   6:    */ {
/*   7:    */   bqk(bqj parambqj) {}
/*   8:    */   
/*   9:    */   public boolean accept(File paramFile, String paramString)
/*  10:    */   {
/*  11:236 */     return paramString.endsWith(".mcr");
/*  12:    */   }
/*  13:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqk
 * JD-Core Version:    0.7.0.1
 */