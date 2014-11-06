package net.minecraft.src;
/*  1:   */ import java.io.ByteArrayOutputStream;
import java.io.IOException;
/*  2:   */ import java.io.InputStream;
/*  3:   */ import java.io.PrintStream;

import org.apache.logging.log4j.Logger;
/*  5:   */ 
/*  6:   */ class cvd
/*  7:   */   extends InputStream
/*  8:   */ {
/*  9:   */   private final InputStream a;
/* 10:   */   private final String b;
/* 11:64 */   private boolean c = false;
/* 12:   */   
/* 13:   */   public cvd(InputStream paramInputStream, oa paramoa, String paramString)
/* 14:   */   {
/* 15:67 */     this.a = paramInputStream;
/* 16:68 */     ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
/* 17:69 */     new Exception().printStackTrace(new PrintStream(localByteArrayOutputStream));
/* 18:70 */     this.b = ("Leaked resource: '" + paramoa + "' loaded from pack: '" + paramString + "'\n" + localByteArrayOutputStream.toString());
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void close() throws IOException
/* 22:   */   {
/* 23:75 */     this.a.close();
/* 24:   */     
/* 25:77 */     this.c = true;
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected void finalize() throws Throwable
/* 29:   */   {
/* 30:82 */     if (!this.c) {
/* 31:83 */       cvc.b().warn(this.b);
/* 32:   */     }
/* 33:86 */     super.finalize();
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int read() throws IOException
/* 37:   */   {
/* 38:91 */     return this.a.read();
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvd
 * JD-Core Version:    0.7.0.1
 */