package net.minecraft.src;
/*  1:   */ import java.io.File;
/*  2:   */ import java.io.FileFilter;
/*  3:   */ 
/*  4:   */ final class cvp
/*  5:   */   implements FileFilter
/*  6:   */ {
/*  7:   */   public boolean accept(File paramFile)
/*  8:   */   {
/*  9:44 */     int i = (paramFile.isFile()) && (paramFile.getName().endsWith(".zip")) ? 1 : 0;
/* 10:45 */     int j = (paramFile.isDirectory()) && (new File(paramFile, "pack.mcmeta").isFile()) ? 1 : 0;
/* 11:   */     
/* 12:47 */     return (i != 0) || (j != 0);
/* 13:   */   }
/* 14:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvp
 * JD-Core Version:    0.7.0.1
 */