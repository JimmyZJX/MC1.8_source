package net.minecraft.src;
/*  1:   */ import java.io.File;
/*  2:   */ 
/*  3:   */ public class bqi
/*  4:   */   extends bqm
/*  5:   */ {
/*  6:   */   public bqi(File paramFile, String paramString, boolean paramBoolean)
/*  7:   */   {
/*  8:19 */     super(paramFile, paramString, paramBoolean);
/*  9:   */   }
/* 10:   */   
/* 11:   */   public bfq a(bgd parambgd)
/* 12:   */   {
/* 13:24 */     File localFile1 = b();
/* 14:   */     File localFile2;
/* 15:26 */     if ((parambgd instanceof bge))
/* 16:   */     {
/* 17:27 */       localFile2 = new File(localFile1, "DIM-1");
/* 18:28 */       localFile2.mkdirs();
/* 19:29 */       return new bfy(localFile2);
/* 20:   */     }
/* 21:31 */     if ((parambgd instanceof bgh))
/* 22:   */     {
/* 23:32 */       localFile2 = new File(localFile1, "DIM1");
/* 24:33 */       localFile2.mkdirs();
/* 25:34 */       return new bfy(localFile2);
/* 26:   */     }
/* 27:37 */     return new bfy(localFile1);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void a(WorldInfo parambqo, NBTTagCompound paramfn)
/* 31:   */   {
/* 32:42 */     parambqo.e(19133);
/* 33:43 */     super.a(parambqo, paramfn);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a()
/* 37:   */   {
/* 38:   */     try
/* 39:   */     {
/* 40:49 */       brp.a().b();
/* 41:   */     }
/* 42:   */     catch (InterruptedException localInterruptedException)
/* 43:   */     {
/* 44:51 */       localInterruptedException.printStackTrace();
/* 45:   */     }
/* 46:54 */     bfx.a();
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqi
 * JD-Core Version:    0.7.0.1
 */