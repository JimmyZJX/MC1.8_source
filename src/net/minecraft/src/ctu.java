package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;

/*  2:   */ import java.awt.Graphics;
/*  3:   */ import java.awt.image.BufferedImage;
/*  4:   */ import java.io.IOException;
/*  5:   */ import java.io.InputStream;
/*  6:   */ import java.util.List;

/*  7:   */ import org.apache.logging.log4j.LogManager;
/*  8:   */ import org.apache.logging.log4j.Logger;
/*  9:   */ 
/* 10:   */ public class ctu
/* 11:   */   extends cto
/* 12:   */ {
/* 13:15 */   private static final Logger g = LogManager.getLogger();
/* 14:   */   public final List<String> f;
/* 15:   */   
/* 16:   */   public ctu(String... paramVarArgs)
/* 17:   */   {
/* 18:20 */     this.f = Lists.newArrayList(paramVarArgs);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(cvk paramcvk)
/* 22:   */   {
/* 23:25 */     c();
/* 24:   */     
/* 25:27 */     BufferedImage localBufferedImage1 = null;
/* 26:   */     try
/* 27:   */     {
/* 28:30 */       for (String str : this.f) {
/* 29:31 */         if (str != null)
/* 30:   */         {
/* 31:34 */           InputStream localInputStream = paramcvk.a(new oa(str)).b();
/* 32:35 */           BufferedImage localBufferedImage2 = cuj.a(localInputStream);
/* 33:38 */           if (localBufferedImage1 == null) {
/* 34:39 */             localBufferedImage1 = new BufferedImage(localBufferedImage2.getWidth(), localBufferedImage2.getHeight(), 2);
/* 35:   */           }
/* 36:41 */           localBufferedImage1.getGraphics().drawImage(localBufferedImage2, 0, 0, null);
/* 37:   */         }
/* 38:   */       }
/* 39:   */     }
/* 40:   */     catch (IOException localIOException)
/* 41:   */     {
/* 42:44 */       g.error("Couldn't load layered image", localIOException);
/* 43:45 */       return;
/* 44:   */     }
/* 45:48 */     cuj.a(b(), localBufferedImage1);
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctu
 * JD-Core Version:    0.7.0.1
 */