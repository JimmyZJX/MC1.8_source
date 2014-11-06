package net.minecraft.src;
/*  2:   */ import java.net.URI;
/*  4:   */ import org.apache.logging.log4j.LogManager;
/*  5:   */ import org.apache.logging.log4j.Logger;
/*  6:   */ 
/*  7:   */ public class bwm
/*  8:   */   extends bxf
/*  9:   */ {
/* 10:14 */   private static final Logger a = LogManager.getLogger();
/* 11:18 */   private static final oa f = new oa("textures/gui/demo_background.png");
/* 12:   */   
/* 13:   */   public void b()
/* 14:   */   {
/* 15:22 */     this.n.clear();
/* 16:   */     
/* 17:24 */     int i = -16;
/* 18:   */     
/* 19:26 */     this.n.add(new bug(1, this.l / 2 - 116, this.m / 2 + 62 + i, 114, 20, cwc.a("demo.help.buy", new Object[0])));
/* 20:27 */     this.n.add(new bug(2, this.l / 2 + 2, this.m / 2 + 62 + i, 114, 20, cwc.a("demo.help.later", new Object[0])));
/* 21:   */   }
/* 22:   */   
/* 23:   */   protected void a(bug parambug)
/* 24:   */   {
/* 25:32 */     switch (parambug.k)
/* 26:   */     {
/* 27:   */     case 2: 
/* 28:34 */       this.j.a((bxf)null);
/* 29:35 */       this.j.n();
/* 30:36 */       break;
/* 31:   */     case 1: 
/* 32:38 */       parambug.l = false;
/* 33:   */       try
/* 34:   */       {
/* 35:40 */         Class<?> localClass = Class.forName("java.awt.Desktop");
/* 36:41 */         Object localObject = localClass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 37:42 */         localClass.getMethod("browse", new Class[] { URI.class }).invoke(localObject, new Object[] { new URI("http://www.minecraft.net/store?source=demo") });
/* 38:   */       }
/* 39:   */       catch (Throwable localThrowable)
/* 40:   */       {
/* 41:44 */         a.error("Couldn't open link", localThrowable);
/* 42:   */       }
/* 43:   */     }
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void e()
/* 47:   */   {
/* 48:52 */     super.e();
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void c()
/* 52:   */   {
/* 53:57 */     super.c();
/* 54:   */     
/* 55:59 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 56:60 */     this.j.N().a(f);
/* 57:61 */     int i = (this.l - 248) / 2;
/* 58:62 */     int j = (this.m - 166) / 2;
/* 59:63 */     b(i, j, 0, 0, 248, 166);
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 63:   */   {
/* 64:68 */     c();
/* 65:   */     
/* 66:70 */     int i = (this.l - 248) / 2 + 10;
/* 67:   */     
/* 68:72 */     int j = (this.m - 166) / 2 + 8;
/* 69:   */     
/* 70:74 */     this.q.a(cwc.a("demo.help.title", new Object[0]), i, j, 2039583);
/* 71:75 */     j += 12;
/* 72:   */     
/* 73:77 */     bto localbto = this.j.t;
/* 74:   */     
/* 75:79 */     this.q.a(cwc.a("demo.help.movementShort", new Object[] { bto.c(localbto.U.i()), bto.c(localbto.V.i()), bto.c(localbto.W.i()), bto.c(localbto.X.i()) }), i, j, 5197647);
/* 76:   */     
/* 77:81 */     this.q.a(cwc.a("demo.help.movementMouse", new Object[0]), i, j + 12, 5197647);
/* 78:   */     
/* 79:83 */     this.q.a(cwc.a("demo.help.jump", new Object[] { bto.c(localbto.Y.i()) }), i, j + 24, 5197647);
/* 80:   */     
/* 81:85 */     this.q.a(cwc.a("demo.help.inventory", new Object[] { bto.c(localbto.aa.i()) }), i, j + 36, 5197647);
/* 82:   */     
/* 83:87 */     this.q.a(cwc.a("demo.help.fullWrapped", new Object[0]), i, j + 68, 218, 2039583);
/* 84:   */     
/* 85:89 */     super.a(paramInt1, paramInt2, paramFloat);
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwm
 * JD-Core Version:    0.7.0.1
 */