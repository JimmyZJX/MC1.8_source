package net.minecraft.src;
/*  1:   */ import java.awt.Graphics;
/*  2:   */ import java.awt.image.BufferedImage;
/*  3:   */ import java.awt.image.DataBufferInt;
/*  4:   */ import java.awt.image.WritableRaster;
/*  5:   */ 
/*  6:   */ public class ckr
/*  7:   */   implements ckh
/*  8:   */ {
/*  9:   */   private int[] a;
/* 10:   */   private int b;
/* 11:   */   private int c;
/* 12:   */   
/* 13:   */   public BufferedImage a(BufferedImage paramBufferedImage)
/* 14:   */   {
/* 15:13 */     if (paramBufferedImage == null) {
/* 16:14 */       return null;
/* 17:   */     }
/* 18:17 */     this.b = 64;
/* 19:18 */     this.c = 64;
/* 20:   */     
/* 21:20 */     BufferedImage localBufferedImage = new BufferedImage(this.b, this.c, 2);
/* 22:21 */     Graphics localGraphics = localBufferedImage.getGraphics();
/* 23:22 */     localGraphics.drawImage(paramBufferedImage, 0, 0, null);
/* 24:24 */     if (paramBufferedImage.getHeight() == 32)
/* 25:   */     {
/* 26:26 */       localGraphics.drawImage(localBufferedImage, 24, 48, 20, 52, 4, 16, 8, 20, null);
/* 27:27 */       localGraphics.drawImage(localBufferedImage, 28, 48, 24, 52, 8, 16, 12, 20, null);
/* 28:28 */       localGraphics.drawImage(localBufferedImage, 20, 52, 16, 64, 8, 20, 12, 32, null);
/* 29:29 */       localGraphics.drawImage(localBufferedImage, 24, 52, 20, 64, 4, 20, 8, 32, null);
/* 30:30 */       localGraphics.drawImage(localBufferedImage, 28, 52, 24, 64, 0, 20, 4, 32, null);
/* 31:31 */       localGraphics.drawImage(localBufferedImage, 32, 52, 28, 64, 12, 20, 16, 32, null);
/* 32:   */       
/* 33:   */ 
/* 34:34 */       localGraphics.drawImage(localBufferedImage, 40, 48, 36, 52, 44, 16, 48, 20, null);
/* 35:35 */       localGraphics.drawImage(localBufferedImage, 44, 48, 40, 52, 48, 16, 52, 20, null);
/* 36:36 */       localGraphics.drawImage(localBufferedImage, 36, 52, 32, 64, 48, 20, 52, 32, null);
/* 37:37 */       localGraphics.drawImage(localBufferedImage, 40, 52, 36, 64, 44, 20, 48, 32, null);
/* 38:38 */       localGraphics.drawImage(localBufferedImage, 44, 52, 40, 64, 40, 20, 44, 32, null);
/* 39:39 */       localGraphics.drawImage(localBufferedImage, 48, 52, 44, 64, 52, 20, 56, 32, null);
/* 40:   */     }
/* 41:42 */     localGraphics.dispose();
/* 42:   */     
/* 43:44 */     this.a = ((DataBufferInt)localBufferedImage.getRaster().getDataBuffer()).getData();
/* 44:   */     
/* 45:46 */     b(0, 0, 32, 16);
/* 46:47 */     a(32, 0, 64, 32);
/* 47:48 */     b(0, 16, 64, 32);
/* 48:   */     
/* 49:50 */     a(0, 32, 16, 48);
/* 50:51 */     a(16, 32, 40, 48);
/* 51:52 */     a(40, 32, 56, 48);
/* 52:   */     
/* 53:54 */     a(0, 48, 16, 64);
/* 54:55 */     b(16, 48, 48, 64);
/* 55:56 */     a(48, 48, 64, 64);
/* 56:   */     
/* 57:58 */     return localBufferedImage;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public void a() {}
/* 61:   */   
/* 62:   */   private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 63:   */   {
/* 64:66 */     if (c(paramInt1, paramInt2, paramInt3, paramInt4)) {
/* 65:67 */       return;
/* 66:   */     }
/* 67:70 */     for (int i = paramInt1; i < paramInt3; i++) {
/* 68:71 */       for (int j = paramInt2; j < paramInt4; j++) {
/* 69:72 */         this.a[(i + j * this.b)] &= 0xFFFFFF;
/* 70:   */       }
/* 71:   */     }
/* 72:   */   }
/* 73:   */   
/* 74:   */   private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 75:   */   {
/* 76:78 */     for (int i = paramInt1; i < paramInt3; i++) {
/* 77:79 */       for (int j = paramInt2; j < paramInt4; j++) {
/* 78:80 */         this.a[(i + j * this.b)] |= 0xFF000000;
/* 79:   */       }
/* 80:   */     }
/* 81:   */   }
/* 82:   */   
/* 83:   */   private boolean c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 84:   */   {
/* 85:86 */     for (int i = paramInt1; i < paramInt3; i++) {
/* 86:87 */       for (int j = paramInt2; j < paramInt4; j++)
/* 87:   */       {
/* 88:88 */         int k = this.a[(i + j * this.b)];
/* 89:89 */         if ((k >> 24 & 0xFF) < 128) {
/* 90:90 */           return true;
/* 91:   */         }
/* 92:   */       }
/* 93:   */     }
/* 94:94 */     return false;
/* 95:   */   }
/* 96:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ckr
 * JD-Core Version:    0.7.0.1
 */