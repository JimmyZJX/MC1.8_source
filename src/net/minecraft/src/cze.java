package net.minecraft.src;
/*   1:    */ import java.io.IOException;
import java.io.InputStream;
/*   2:    */ import java.net.URL;
/*   3:    */ import java.net.URLConnection;
/*   4:    */ 
/*   5:    */ class cze
/*   6:    */   extends URLConnection
/*   7:    */ {
				private final czd a;
/*   8:    */   cze(czd paramczd, URL paramURL)
/*   9:    */   {
/*  10:397 */     super(paramURL);
				  a=paramczd;
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void connect() {}
/*  14:    */   
/*  15:    */   public InputStream getInputStream() throws IOException
/*  16:    */   {
/*  17:405 */     return bsu.z().O().a(this.a.a).b();
/*  18:    */   }
/*  19:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cze
 * JD-Core Version:    0.7.0.1
 */