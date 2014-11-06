package net.minecraft.src;
/* 1:  */ import java.io.File;
/* 2:  */ import java.io.FileNotFoundException;
/* 3:  */ 
/* 4:  */ public class cvn
/* 5:  */   extends FileNotFoundException
/* 6:  */ {
/* 7:  */   public cvn(File paramFile, String paramString)
/* 8:  */   {
/* 9:8 */     super(String.format("'%s' in ResourcePack '%s'", new Object[] { paramString, paramFile }));
/* ::  */   }
/* ;:  */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvn
 * JD-Core Version:    0.7.0.1
 */