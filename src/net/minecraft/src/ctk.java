package net.minecraft.src;
/*  1:   */ import org.apache.logging.log4j.LogManager;
/*  2:   */ import org.apache.logging.log4j.Logger;
/*  3:   */ 
/*  4:   */ public class ctk
/*  5:   */ {
/*  6:11 */   private static final Logger a = LogManager.getLogger();
/*  7:   */   private static ctk b;
/*  8:   */   
/*  9:   */   public static void a()
/* 10:   */   {
/* 11:15 */     b = new ctk();
/* 12:   */   }
/* 13:   */   
/* 14:   */   public static ctk b()
/* 15:   */   {
/* 16:19 */     return b;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(ctf paramctf)
/* 20:   */   {
/* 21:26 */     paramctf.f().b(paramctf);
/* 22:27 */     paramctf.e().b(paramctf);
/* 23:   */     
/* 24:29 */     dax.e(paramctf.h());
/* 25:   */   }
/* 26:   */   
/* 27:   */   public int c() throws ow
/* 28:   */   {
/* 29:33 */     int i = dax.d();
/* 30:35 */     if (i <= 0) {
/* 31:36 */       throw new ow("Could not create shader program (returned program ID " + i + ")");
/* 32:   */     }
/* 33:39 */     return i;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void b(ctf paramctf)
/* 37:   */   {
/* 38:43 */     paramctf.f().a(paramctf);
/* 39:44 */     paramctf.e().a(paramctf);
/* 40:   */     
/* 41:46 */     dax.f(paramctf.h());
/* 42:47 */     int i = dax.a(paramctf.h(), dax.l);
/* 43:48 */     if (i == 0)
/* 44:   */     {
/* 45:49 */       a.warn("Error encountered when linking program containing VS " + paramctf.e().a() + " and FS " + paramctf.f().a() + ". Log output:");
/* 46:50 */       a.warn(dax.e(paramctf.h(), 32768));
/* 47:   */     }
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctk
 * JD-Core Version:    0.7.0.1
 */