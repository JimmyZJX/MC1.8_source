package net.minecraft.src;
/*  1:   */ import java.awt.Graphics;
/*  2:   */ import java.awt.image.BufferedImage;
/*  3:   */ import java.io.IOException;
/*  4:   */ import java.io.InputStream;
/*  5:   */ import java.util.List;
/*  6:   */ import org.apache.logging.log4j.LogManager;
/*  7:   */ import org.apache.logging.log4j.Logger;
/*  8:   */ 
/*  9:   */ public class ctt
/* 10:   */   extends cto
/* 11:   */ {
/* 12:18 */   private static final Logger f = LogManager.getLogger();
/* 13:   */   private final oa g;
/* 14:   */   private final List h;
/* 15:   */   private final List i;
/* 16:   */   
/* 17:   */   public ctt(oa paramoa, List paramList1, List paramList2)
/* 18:   */   {
/* 19:24 */     this.g = paramoa;
/* 20:25 */     this.h = paramList1;
/* 21:26 */     this.i = paramList2;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void a(cvk paramcvk)
/* 25:   */   {
/* 26:31 */     c();
/* 27:   */     BufferedImage localBufferedImage1;
/* 28:   */     try
/* 29:   */     {
/* 30:37 */       BufferedImage localBufferedImage2 = cuj.a(paramcvk.a(this.g).b());
/* 31:   */       
/* 32:   */ 
/* 33:   */ 
/* 34:41 */       int j = localBufferedImage2.getType();
/* 35:42 */       if (j == 0) {
/* 36:43 */         j = 6;
/* 37:   */       }
/* 38:47 */       localBufferedImage1 = new BufferedImage(localBufferedImage2.getWidth(), localBufferedImage2.getHeight(), j);
/* 39:48 */       Graphics localGraphics = localBufferedImage1.getGraphics();
/* 40:49 */       localGraphics.drawImage(localBufferedImage2, 0, 0, null);
/* 41:51 */       for (int k = 0; (k < this.h.size()) && (k < this.i.size()); k++)
/* 42:   */       {
/* 43:52 */         String str = (String)this.h.get(k);
/* 44:53 */         MapColor localboh = ((EnumDyeColor)this.i.get(k)).e();
/* 45:55 */         if (str != null)
/* 46:   */         {
/* 47:58 */           InputStream localInputStream = paramcvk.a(new oa(str)).b();
/* 48:59 */           BufferedImage localBufferedImage3 = cuj.a(localInputStream);
/* 49:61 */           if ((localBufferedImage3.getWidth() == localBufferedImage1.getWidth()) && (localBufferedImage3.getHeight() == localBufferedImage1.getHeight()) && (localBufferedImage3.getType() == 6))
/* 50:   */           {
/* 51:67 */             for (int m = 0; m < localBufferedImage3.getHeight(); m++) {
/* 52:68 */               for (int n = 0; n < localBufferedImage3.getWidth(); n++)
/* 53:   */               {
/* 54:70 */                 int i1 = localBufferedImage3.getRGB(n, m);
/* 55:71 */                 if ((i1 & 0xFF000000) != 0)
/* 56:   */                 {
/* 57:74 */                   int i2 = (i1 & 0xFF0000) << 8 & 0xFF000000;
/* 58:   */                   
/* 59:76 */                   int i3 = localBufferedImage2.getRGB(n, m);
/* 60:   */                   
/* 61:78 */                   int i4 = MathUtils.d(i3, localboh.L) & 0xFFFFFF;
/* 62:79 */                   localBufferedImage3.setRGB(n, m, i2 | i4);
/* 63:   */                 }
/* 64:   */               }
/* 65:   */             }
/* 66:82 */             localBufferedImage1.getGraphics().drawImage(localBufferedImage3, 0, 0, null);
/* 67:   */           }
/* 68:   */         }
/* 69:   */       }
/* 70:   */     }
/* 71:   */     catch (IOException localIOException)
/* 72:   */     {
/* 73:85 */       f.error("Couldn't load layered image", localIOException);
/* 74:86 */       return;
/* 75:   */     }
/* 76:89 */     cuj.a(b(), localBufferedImage1);
/* 77:   */   }
/* 78:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctt
 * JD-Core Version:    0.7.0.1
 */