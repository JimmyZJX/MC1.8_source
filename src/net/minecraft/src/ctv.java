package net.minecraft.src;
/*  1:   */ import java.awt.image.BufferedImage;
import java.io.IOException;
/*  2:   */ import java.io.InputStream;
/*  3:   */ import org.apache.logging.log4j.LogManager;
/*  4:   */ import org.apache.logging.log4j.Logger;
/*  5:   */ 
/*  6:   */ public class ctv
/*  7:   */   extends cto
/*  8:   */ {
/*  9:15 */   private static final Logger g = LogManager.getLogger();
/* 10:   */   protected final oa f;
/* 11:   */   
/* 12:   */   public ctv(oa paramoa)
/* 13:   */   {
/* 14:19 */     this.f = paramoa;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(cvk paramcvk) throws IOException
/* 18:   */   {
/* 19:24 */     c();
/* 20:   */     
/* 21:26 */     InputStream localInputStream = null;
/* 22:   */     try
/* 23:   */     {
/* 24:28 */       cvj localcvj = paramcvk.a(this.f);
/* 25:29 */       localInputStream = localcvj.b();
/* 26:30 */       BufferedImage localBufferedImage = cuj.a(localInputStream);
/* 27:   */       
/* 28:32 */       boolean bool1 = false;
/* 29:33 */       boolean bool2 = false;
/* 30:35 */       if (localcvj.c()) {
/* 31:   */         try
/* 32:   */         {
/* 33:37 */           cxb localcxb = (cxb)localcvj.a("texture");
/* 34:38 */           if (localcxb != null)
/* 35:   */           {
/* 36:39 */             bool1 = localcxb.a();
/* 37:40 */             bool2 = localcxb.b();
/* 38:   */           }
/* 39:   */         }
/* 40:   */         catch (RuntimeException localRuntimeException)
/* 41:   */         {
/* 42:43 */           g.warn("Failed reading metadata of: " + this.f, localRuntimeException);
/* 43:   */         }
/* 44:   */       }
/* 45:47 */       cuj.a(b(), localBufferedImage, bool1, bool2);
/* 46:   */     }
/* 47:   */     finally
/* 48:   */     {
/* 49:49 */       if (localInputStream != null) {
/* 50:50 */         localInputStream.close();
/* 51:   */       }
/* 52:   */     }
/* 53:   */   }
/* 54:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctv
 * JD-Core Version:    0.7.0.1
 */