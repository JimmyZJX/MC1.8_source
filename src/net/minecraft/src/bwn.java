package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import org.lwjgl.input.Keyboard;
/*  3:   */ 
/*  4:   */ public class bwn
/*  5:   */   extends bxf
/*  6:   */ {
/*  7:   */   private final bxf a;
/*  8:   */   private final cew f;
/*  9:   */   private bul g;
/* 10:   */   
/* 11:   */   public bwn(bxf parambxf, cew paramcew)
/* 12:   */   {
/* 13:19 */     this.a = parambxf;
/* 14:20 */     this.f = paramcew;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void e()
/* 18:   */   {
/* 19:25 */     this.g.a();
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void b()
/* 23:   */   {
/* 24:30 */     Keyboard.enableRepeatEvents(true);
/* 25:31 */     this.n.clear();
/* 26:32 */     this.n.add(new bug(0, this.l / 2 - 100, this.m / 4 + 96 + 12, cwc.a("selectServer.select", new Object[0])));
/* 27:33 */     this.n.add(new bug(1, this.l / 2 - 100, this.m / 4 + 120 + 12, cwc.a("gui.cancel", new Object[0])));
/* 28:   */     
/* 29:35 */     this.g = new bul(2, this.q, this.l / 2 - 100, 116, 200, 20);
/* 30:36 */     this.g.f(128);
/* 31:37 */     this.g.b(true);
/* 32:38 */     this.g.a(this.j.t.aA);
/* 33:   */     
/* 34:40 */     ((bug)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0));
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void m()
/* 38:   */   {
/* 39:45 */     Keyboard.enableRepeatEvents(false);
/* 40:46 */     this.j.t.aA = this.g.b();
/* 41:47 */     this.j.t.b();
/* 42:   */   }
/* 43:   */   
/* 44:   */   protected void a(bug parambug)
/* 45:   */   {
/* 46:52 */     if (!parambug.l) {
/* 47:53 */       return;
/* 48:   */     }
/* 49:55 */     if (parambug.k == 1)
/* 50:   */     {
/* 51:56 */       this.a.a(false, 0);
/* 52:   */     }
/* 53:57 */     else if (parambug.k == 0)
/* 54:   */     {
/* 55:58 */       this.f.b = this.g.b();
/* 56:59 */       this.a.a(true, 0);
/* 57:   */     }
/* 58:   */   }
/* 59:   */   
/* 60:   */   protected void a(char paramChar, int paramInt)
/* 61:   */   {
/* 62:65 */     if (this.g.a(paramChar, paramInt)) {
/* 63:66 */       ((bug)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0));
/* 64:67 */     } else if ((paramInt == 28) || (paramInt == 156)) {
/* 65:68 */       a((bug)this.n.get(0));
/* 66:   */     }
/* 67:   */   }
/* 68:   */   
/* 69:   */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 70:   */   {
/* 71:74 */     super.a(paramInt1, paramInt2, paramInt3);
/* 72:   */     
/* 73:76 */     this.g.a(paramInt1, paramInt2, paramInt3);
/* 74:   */   }
/* 75:   */   
/* 76:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 77:   */   {
/* 78:81 */     c();
/* 79:   */     
/* 80:83 */     a(this.q, cwc.a("selectServer.direct", new Object[0]), this.l / 2, 20, 16777215);
/* 81:84 */     c(this.q, cwc.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 100, 10526880);
/* 82:   */     
/* 83:86 */     this.g.g();
/* 84:   */     
/* 85:88 */     super.a(paramInt1, paramInt2, paramFloat);
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwn
 * JD-Core Version:    0.7.0.1
 */