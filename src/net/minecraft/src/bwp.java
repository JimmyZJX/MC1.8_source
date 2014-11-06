package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import org.lwjgl.input.Keyboard;
/*   3:    */ 
/*   4:    */ public class bwp
/*   5:    */   extends bxf
/*   6:    */ {
/*   7:    */   private final bxf a;
/*   8:    */   private final cew f;
/*   9:    */   private bul g;
/*  10:    */   private bul h;
/*  11:    */   private bug i;
/*  12:    */   
/*  13:    */   public bwp(bxf parambxf, cew paramcew)
/*  14:    */   {
/*  15: 20 */     this.a = parambxf;
/*  16: 21 */     this.f = paramcew;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public void e()
/*  20:    */   {
/*  21: 26 */     this.h.a();
/*  22: 27 */     this.g.a();
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void b()
/*  26:    */   {
/*  27: 32 */     Keyboard.enableRepeatEvents(true);
/*  28: 33 */     this.n.clear();
/*  29: 34 */     this.n.add(new bug(0, this.l / 2 - 100, this.m / 4 + 96 + 18, cwc.a("addServer.add", new Object[0])));
/*  30: 35 */     this.n.add(new bug(1, this.l / 2 - 100, this.m / 4 + 120 + 18, cwc.a("gui.cancel", new Object[0])));
/*  31: 36 */     this.n.add(this.i = new bug(2, this.l / 2 - 100, this.m / 4 + 72, cwc.a("addServer.resourcePack", new Object[0]) + ": " + this.f.b().a().d()));
/*  32:    */     
/*  33: 38 */     this.h = new bul(0, this.q, this.l / 2 - 100, 66, 200, 20);
/*  34: 39 */     this.h.b(true);
/*  35: 40 */     this.h.a(this.f.a);
/*  36:    */     
/*  37: 42 */     this.g = new bul(1, this.q, this.l / 2 - 100, 106, 200, 20);
/*  38: 43 */     this.g.f(128);
/*  39: 44 */     this.g.a(this.f.b);
/*  40:    */     
/*  41: 46 */     ((bug)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0) && (this.h.b().length() > 0));
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void m()
/*  45:    */   {
/*  46: 51 */     Keyboard.enableRepeatEvents(false);
/*  47:    */   }
/*  48:    */   
/*  49:    */   protected void a(bug parambug)
/*  50:    */   {
/*  51: 56 */     if (!parambug.l) {
/*  52: 57 */       return;
/*  53:    */     }
/*  54: 59 */     if (parambug.k == 2)
/*  55:    */     {
/*  56: 60 */       this.f.a(cex.values()[((this.f.b().ordinal() + 1) % cex.values().length)]);
/*  57: 61 */       this.i.j = (cwc.a("addServer.resourcePack", new Object[0]) + ": " + this.f.b().a().d());
/*  58:    */     }
/*  59: 62 */     else if (parambug.k == 1)
/*  60:    */     {
/*  61: 63 */       this.a.a(false, 0);
/*  62:    */     }
/*  63: 64 */     else if (parambug.k == 0)
/*  64:    */     {
/*  65: 65 */       this.f.a = this.h.b();
/*  66: 66 */       this.f.b = this.g.b();
/*  67: 67 */       this.a.a(true, 0);
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   protected void a(char paramChar, int paramInt)
/*  72:    */   {
/*  73: 73 */     this.h.a(paramChar, paramInt);
/*  74: 74 */     this.g.a(paramChar, paramInt);
/*  75: 76 */     if (paramInt == 15)
/*  76:    */     {
/*  77: 77 */       this.h.b(!this.h.m());
/*  78: 78 */       this.g.b(!this.g.m());
/*  79:    */     }
/*  80: 80 */     if ((paramInt == 28) || (paramInt == 156)) {
/*  81: 81 */       a((bug)this.n.get(0));
/*  82:    */     }
/*  83: 83 */     ((bug)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0) && (this.h.b().length() > 0));
/*  84:    */   }
/*  85:    */   
/*  86:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*  87:    */   {
/*  88: 88 */     super.a(paramInt1, paramInt2, paramInt3);
/*  89:    */     
/*  90: 90 */     this.g.a(paramInt1, paramInt2, paramInt3);
/*  91: 91 */     this.h.a(paramInt1, paramInt2, paramInt3);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  95:    */   {
/*  96: 96 */     c();
/*  97:    */     
/*  98: 98 */     a(this.q, cwc.a("addServer.title", new Object[0]), this.l / 2, 17, 16777215);
/*  99: 99 */     c(this.q, cwc.a("addServer.enterName", new Object[0]), this.l / 2 - 100, 53, 10526880);
/* 100:100 */     c(this.q, cwc.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 94, 10526880);
/* 101:    */     
/* 102:102 */     this.h.g();
/* 103:103 */     this.g.g();
/* 104:    */     
/* 105:105 */     super.a(paramInt1, paramInt2, paramFloat);
/* 106:    */   }
/* 107:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwp
 * JD-Core Version:    0.7.0.1
 */