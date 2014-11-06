package net.minecraft.src;
/*  1:   */ import com.google.gson.JsonParseException;
/*  2:   */ import java.io.IOException;
/*  3:   */ import org.apache.logging.log4j.LogManager;
/*  4:   */ import org.apache.logging.log4j.Logger;
/*  5:   */ 
/*  6:   */ public class bzz
/*  7:   */   extends bzy
/*  8:   */ {
/*  9:17 */   private static final Logger c = LogManager.getLogger();
/* 10:23 */   private final cvm d = this.a.P().a;
/* 11:   */   private final oa e;
/* 12:   */   
/* 13:   */   public bzz(bzx parambzx)
/* 14:   */   {
/* 15:22 */     super(parambzx);
/* 16:   */     ctp localctp;
/* 17:   */     try
/* 18:   */     {
/* 19:27 */       localctp = new ctp(this.d.a());
/* 20:   */     }
/* 21:   */     catch (IOException localIOException)
/* 22:   */     {
/* 23:29 */       localctp = cuj.a;
/* 24:   */     }
/* 25:32 */     this.e = this.a.N().a("texturepackicon", localctp);
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected String a()
/* 29:   */   {
/* 30:   */     try
/* 31:   */     {
/* 32:38 */       cwx localcwx = (cwx)this.d.a(this.a.P().b, "pack");
/* 33:39 */       if (localcwx != null) {
/* 34:40 */         return localcwx.a().d();
/* 35:   */       }
/* 36:   */     }
/* 37:   */     catch (JsonParseException localJsonParseException)
/* 38:   */     {
/* 39:43 */       c.error("Couldn't load metadata info", localJsonParseException);
/* 40:   */     }
/* 41:   */     catch (IOException localIOException)
/* 42:   */     {
/* 43:45 */       c.error("Couldn't load metadata info", localIOException);
/* 44:   */     }
/* 45:48 */     return a.m + "Missing " + "pack.mcmeta" + " :(";
/* 46:   */   }
/* 47:   */   
/* 48:   */   protected boolean e()
/* 49:   */   {
/* 50:53 */     return false;
/* 51:   */   }
/* 52:   */   
/* 53:   */   protected boolean f()
/* 54:   */   {
/* 55:58 */     return false;
/* 56:   */   }
/* 57:   */   
/* 58:   */   protected boolean g()
/* 59:   */   {
/* 60:63 */     return false;
/* 61:   */   }
/* 62:   */   
/* 63:   */   protected boolean h()
/* 64:   */   {
/* 65:68 */     return false;
/* 66:   */   }
/* 67:   */   
/* 68:   */   protected String b()
/* 69:   */   {
/* 70:73 */     return "Default";
/* 71:   */   }
/* 72:   */   
/* 73:   */   protected void c()
/* 74:   */   {
/* 75:78 */     this.a.N().a(this.e);
/* 76:   */   }
/* 77:   */   
/* 78:   */   protected boolean d()
/* 79:   */   {
/* 80:83 */     return false;
/* 81:   */   }
/* 82:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzz
 * JD-Core Version:    0.7.0.1
 */