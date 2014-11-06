package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.io.DataInputStream;
/*  3:   */ import java.io.DataOutputStream;
/*  4:   */ import java.io.File;
/*  5:   */ import java.io.IOException;
/*  6:   */ import java.util.Map;
/*  7:   */ 
/*  8:   */ public class bfx
/*  9:   */ {
/* 10:42 */   private static final Map<File,bfv> a = Maps.newHashMap();
/* 11:   */   
/* 12:   */   public static synchronized bfv a(File paramFile, int paramInt1, int paramInt2)
/* 13:   */   {
/* 14:48 */     File localFile1 = new File(paramFile, "region");
/* 15:49 */     File localFile2 = new File(localFile1, "r." + (paramInt1 >> 5) + "." + (paramInt2 >> 5) + ".mca");
/* 16:   */     
/* 17:51 */     bfv localbfv1 = (bfv)a.get(localFile2);
/* 18:52 */     if (localbfv1 != null) {
/* 19:53 */       return localbfv1;
/* 20:   */     }
/* 21:56 */     if (!localFile1.exists()) {
/* 22:57 */       localFile1.mkdirs();
/* 23:   */     }
/* 24:60 */     if (a.size() >= 256) {
/* 25:61 */       a();
/* 26:   */     }
/* 27:64 */     bfv localbfv2 = new bfv(localFile2);
/* 28:65 */     a.put(localFile2, localbfv2);
/* 29:66 */     return localbfv2;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public static synchronized void a()
/* 33:   */   {
/* 34:70 */     for (bfv localbfv : a.values()) {
/* 35:   */       try
/* 36:   */       {
/* 37:72 */         if (localbfv != null) {
/* 38:73 */           localbfv.c();
/* 39:   */         }
/* 40:   */       }
/* 41:   */       catch (IOException localIOException)
/* 42:   */       {
/* 43:76 */         localIOException.printStackTrace();
/* 44:   */       }
/* 45:   */     }
/* 46:79 */     a.clear();
/* 47:   */   }
/* 48:   */   
/* 49:   */   public static DataInputStream c(File paramFile, int paramInt1, int paramInt2)
/* 50:   */   {
/* 51:88 */     bfv localbfv = a(paramFile, paramInt1, paramInt2);
/* 52:89 */     return localbfv.a(paramInt1 & 0x1F, paramInt2 & 0x1F);
/* 53:   */   }
/* 54:   */   
/* 55:   */   public static DataOutputStream d(File paramFile, int paramInt1, int paramInt2)
/* 56:   */   {
/* 57:93 */     bfv localbfv = a(paramFile, paramInt1, paramInt2);
/* 58:94 */     return localbfv.b(paramInt1 & 0x1F, paramInt2 & 0x1F);
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfx
 * JD-Core Version:    0.7.0.1
 */