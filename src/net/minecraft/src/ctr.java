package net.minecraft.src;
/*   1:    */ import java.awt.image.BufferedImage;
/*   2:    */ import java.net.HttpURLConnection;
/*   3:    */ import java.net.URL;
/*   4:    */ import javax.imageio.ImageIO;
/*   5:    */ import org.apache.commons.io.FileUtils;
/*   7:    */ 
/*   8:    */ class ctr
/*   9:    */   extends Thread
/*  10:    */ {
				private final ctq a;
/*  11:    */   ctr(ctq paramctq, String paramString)
/*  12:    */   {
/*  13: 97 */     super(paramString);
				  a=paramctq;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public void run()
/*  17:    */   {
/*  18:100 */     HttpURLConnection localHttpURLConnection = null;
/*  19:101 */     ctq.f().debug("Downloading http texture from {} to {}", new Object[] { ctq.a(this.a), ctq.b(this.a) });
/*  20:    */     try
/*  21:    */     {
/*  22:103 */       localHttpURLConnection = (HttpURLConnection)new URL(ctq.a(this.a)).openConnection(bsu.z().M());
/*  23:104 */       localHttpURLConnection.setDoInput(true);
/*  24:105 */       localHttpURLConnection.setDoOutput(false);
/*  25:106 */       localHttpURLConnection.connect();
/*  26:108 */       if (localHttpURLConnection.getResponseCode() / 100 != 2) {
/*  27:    */         return;
/*  28:    */       }
/*  29:    */       BufferedImage localBufferedImage;
/*  30:114 */       if (ctq.b(this.a) != null)
/*  31:    */       {
/*  32:115 */         FileUtils.copyInputStreamToFile(localHttpURLConnection.getInputStream(), ctq.b(this.a));
/*  33:116 */         localBufferedImage = ImageIO.read(ctq.b(this.a));
/*  34:    */       }
/*  35:    */       else
/*  36:    */       {
/*  37:118 */         localBufferedImage = cuj.a(localHttpURLConnection.getInputStream());
/*  38:    */       }
/*  39:121 */       if (ctq.c(this.a) != null) {
/*  40:122 */         localBufferedImage = ctq.c(this.a).a(localBufferedImage);
/*  41:    */       }
/*  42:125 */       this.a.a(localBufferedImage);
/*  43:    */     }
/*  44:    */     catch (Exception localException)
/*  45:    */     {
/*  46:127 */       ctq.f().error("Couldn't download http texture", localException);
/*  47:    */     }
/*  48:    */     finally
/*  49:    */     {
/*  50:129 */       if (localHttpURLConnection != null) {
/*  51:130 */         localHttpURLConnection.disconnect();
/*  52:    */       }
/*  53:    */     }
/*  54:    */   }
/*  55:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctr
 * JD-Core Version:    0.7.0.1
 */