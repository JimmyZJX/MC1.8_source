package net.minecraft.src;
/*  1:   */ import java.awt.image.BufferedImage;
/*  2:   */ 
/*  3:   */ public class ctp
/*  4:   */   extends cto
/*  5:   */ {
/*  6:   */   private final int[] f;
/*  7:   */   private final int g;
/*  8:   */   private final int h;
/*  9:   */   
/* 10:   */   public ctp(BufferedImage paramBufferedImage)
/* 11:   */   {
/* 12:14 */     this(paramBufferedImage.getWidth(), paramBufferedImage.getHeight());
/* 13:   */     
/* 14:16 */     paramBufferedImage.getRGB(0, 0, paramBufferedImage.getWidth(), paramBufferedImage.getHeight(), this.f, 0, paramBufferedImage.getWidth());
/* 15:   */     
/* 16:18 */     d();
/* 17:   */   }
/* 18:   */   
/* 19:   */   public ctp(int paramInt1, int paramInt2)
/* 20:   */   {
/* 21:22 */     this.g = paramInt1;
/* 22:23 */     this.h = paramInt2;
/* 23:24 */     this.f = new int[paramInt1 * paramInt2];
/* 24:   */     
/* 25:26 */     cuj.a(b(), paramInt1, paramInt2);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(cvk paramcvk) {}
/* 29:   */   
/* 30:   */   public void d()
/* 31:   */   {
/* 32:35 */     cuj.a(b(), this.f, this.g, this.h);
/* 33:   */   }
/* 34:   */   
/* 35:   */   public int[] e()
/* 36:   */   {
/* 37:39 */     return this.f;
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctp
 * JD-Core Version:    0.7.0.1
 */