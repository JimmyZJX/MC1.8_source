package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import org.lwjgl.input.Keyboard;
/*  3:   */ 
/*  4:   */ public class bxe
/*  5:   */   extends bxf
/*  6:   */ {
/*  7:   */   private bxf a;
/*  8:   */   private bul f;
/*  9:   */   private final String g;
/* 10:   */   
/* 11:   */   public bxe(bxf parambxf, String paramString)
/* 12:   */   {
/* 13:20 */     this.a = parambxf;
/* 14:21 */     this.g = paramString;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void e()
/* 18:   */   {
/* 19:26 */     this.f.a();
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void b()
/* 23:   */   {
/* 24:31 */     Keyboard.enableRepeatEvents(true);
/* 25:32 */     this.n.clear();
/* 26:33 */     this.n.add(new bug(0, this.l / 2 - 100, this.m / 4 + 96 + 12, cwc.a("selectWorld.renameButton", new Object[0])));
/* 27:34 */     this.n.add(new bug(1, this.l / 2 - 100, this.m / 4 + 120 + 12, cwc.a("gui.cancel", new Object[0])));
/* 28:   */     
/* 29:36 */     bra localbra = this.j.f();
/* 30:37 */     WorldInfo localbqo = localbra.c(this.g);
/* 31:38 */     String str = localbqo.k();
/* 32:   */     
/* 33:40 */     this.f = new bul(2, this.q, this.l / 2 - 100, 60, 200, 20);
/* 34:41 */     this.f.b(true);
/* 35:42 */     this.f.a(str);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void m()
/* 39:   */   {
/* 40:47 */     Keyboard.enableRepeatEvents(false);
/* 41:   */   }
/* 42:   */   
/* 43:   */   protected void a(bug parambug)
/* 44:   */   {
/* 45:52 */     if (!parambug.l) {
/* 46:53 */       return;
/* 47:   */     }
/* 48:55 */     if (parambug.k == 1)
/* 49:   */     {
/* 50:56 */       this.j.a(this.a);
/* 51:   */     }
/* 52:57 */     else if (parambug.k == 0)
/* 53:   */     {
/* 54:58 */       bra localbra = this.j.f();
/* 55:59 */       localbra.a(this.g, this.f.b().trim());
/* 56:   */       
/* 57:61 */       this.j.a(this.a);
/* 58:   */     }
/* 59:   */   }
/* 60:   */   
/* 61:   */   protected void a(char paramChar, int paramInt)
/* 62:   */   {
/* 63:67 */     this.f.a(paramChar, paramInt);
/* 64:68 */     ((bug)this.n.get(0)).l = (this.f.b().trim().length() > 0);
/* 65:70 */     if ((paramInt == 28) || (paramInt == 156)) {
/* 66:71 */       a((bug)this.n.get(0));
/* 67:   */     }
/* 68:   */   }
/* 69:   */   
/* 70:   */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/* 71:   */   {
/* 72:77 */     super.a(paramInt1, paramInt2, paramInt3);
/* 73:   */     
/* 74:79 */     this.f.a(paramInt1, paramInt2, paramInt3);
/* 75:   */   }
/* 76:   */   
/* 77:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 78:   */   {
/* 79:84 */     c();
/* 80:   */     
/* 81:86 */     a(this.q, cwc.a("selectWorld.renameTitle", new Object[0]), this.l / 2, 20, 16777215);
/* 82:87 */     c(this.q, cwc.a("selectWorld.enterName", new Object[0]), this.l / 2 - 100, 47, 10526880);
/* 83:   */     
/* 84:89 */     this.f.g();
/* 85:   */     
/* 86:91 */     super.a(paramInt1, paramInt2, paramFloat);
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxe
 * JD-Core Version:    0.7.0.1
 */