package net.minecraft.src;
/*  1:   */ import java.io.BufferedInputStream;
import java.io.IOException;
/*  2:   */ import java.nio.ByteBuffer;
/*  3:   */ import java.util.Map;

/*  4:   */ import org.apache.commons.io.IOUtils;
/*  5:   */ import org.apache.commons.lang3.StringUtils;
/*  6:   */ import org.lwjgl.BufferUtils;
/*  7:   */ 
/*  8:   */ public class cti
/*  9:   */ {
/* 10:   */   private final ctj a;
/* 11:   */   private final String b;
/* 12:   */   private int c;
/* 13:24 */   private int d = 0;
/* 14:   */   
/* 15:   */   private cti(ctj paramctj, int paramInt, String paramString)
/* 16:   */   {
/* 17:27 */     this.a = paramctj;
/* 18:28 */     this.c = paramInt;
/* 19:29 */     this.b = paramString;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(ctf paramctf)
/* 23:   */   {
/* 24:33 */     this.d += 1;
/* 25:34 */     dax.b(paramctf.h(), this.c);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void b(ctf paramctf)
/* 29:   */   {
/* 30:38 */     this.d -= 1;
/* 31:40 */     if (this.d <= 0)
/* 32:   */     {
/* 33:41 */       dax.a(this.c);
/* 34:42 */       this.a.d().remove(this.b);
/* 35:   */     }
/* 36:   */   }
/* 37:   */   
/* 38:   */   public String a()
/* 39:   */   {
/* 40:47 */     return this.b;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public static cti a(cvk paramcvk, ctj paramctj, String paramString) throws IOException
/* 44:   */   {
/* 45:51 */     cti localcti = (cti)paramctj.d().get(paramString);
/* 46:53 */     if (localcti == null)
/* 47:   */     {
/* 48:54 */       oa localoa = new oa("shaders/program/" + paramString + paramctj.b());
/* 49:55 */       BufferedInputStream localBufferedInputStream = new BufferedInputStream(paramcvk.a(localoa).b());
/* 50:56 */       byte[] arrayOfByte = a(localBufferedInputStream);
/* 51:57 */       ByteBuffer localByteBuffer = BufferUtils.createByteBuffer(arrayOfByte.length);
/* 52:58 */       localByteBuffer.put(arrayOfByte);
/* 53:59 */       localByteBuffer.position(0);
/* 54:   */       
/* 55:61 */       int i = dax.b(paramctj.c());
/* 56:62 */       dax.a(i, localByteBuffer);
/* 57:63 */       dax.c(i);
/* 58:65 */       if (dax.c(i, dax.m) == 0)
/* 59:   */       {
/* 60:66 */         String str = StringUtils.trim(dax.d(i, 32768));
/* 61:67 */         ow localow = new ow("Couldn't compile " + paramctj.a() + " program: " + str);
/* 62:68 */         localow.b(localoa.a());
/* 63:69 */         throw localow;
/* 64:   */       }
/* 65:72 */       localcti = new cti(paramctj, i, paramString);
/* 66:73 */       paramctj.d().put(paramString, localcti);
/* 67:   */     }
/* 68:76 */     return localcti;
/* 69:   */   }
/* 70:   */   
/* 71:   */   protected static byte[] a(BufferedInputStream paramBufferedInputStream) throws IOException
/* 72:   */   {
/* 73:   */     try
/* 74:   */     {
/* 75:81 */       return IOUtils.toByteArray(paramBufferedInputStream);
/* 76:   */     }
/* 77:   */     finally
/* 78:   */     {
/* 79:83 */       paramBufferedInputStream.close();
/* 80:   */     }
/* 81:   */   }
/* 82:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cti
 * JD-Core Version:    0.7.0.1
 */