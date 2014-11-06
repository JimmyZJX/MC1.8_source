package net.minecraft.src;
/*   2:    */ import java.util.concurrent.atomic.AtomicInteger;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public class bwb
/*   7:    */   extends bxf
/*   8:    */ {
/*   9: 24 */   private static final AtomicInteger a = new AtomicInteger(0);
/*  10: 25 */   private static final Logger f = LogManager.getLogger();
/*  11:    */   private gr g;
/*  12:    */   private boolean h;
/*  13:    */   private final bxf i;
/*  14:    */   
/*  15:    */   public bwb(bxf parambxf, bsu parambsu, cew paramcew)
/*  16:    */   {
/*  17: 32 */     this.j = parambsu;
/*  18: 33 */     this.i = parambxf;
/*  19: 34 */     cev localcev = cev.a(paramcew.b);
/*  20:    */     
/*  21: 36 */     parambsu.a((cen)null);
/*  22: 37 */     parambsu.a(paramcew);
/*  23: 38 */     a(localcev.a(), localcev.b());
/*  24:    */   }
/*  25:    */   
/*  26:    */   public bwb(bxf parambxf, bsu parambsu, String paramString, int paramInt)
/*  27:    */   {
/*  28: 42 */     this.j = parambsu;
/*  29: 43 */     this.i = parambxf;
/*  30: 44 */     parambsu.a((cen)null);
/*  31: 45 */     a(paramString, paramInt);
/*  32:    */   }
/*  33:    */   
/*  34:    */   private void a(String paramString, int paramInt)
/*  35:    */   {
/*  36: 49 */     f.info("Connecting to " + paramString + ", " + paramInt);
/*  37: 50 */     new bwc(this, "Server Connector #" + a.incrementAndGet(), paramString, paramInt).start();
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void e()
/*  41:    */   {
/*  42: 87 */     if (this.g != null) {
/*  43: 88 */       if (this.g.g()) {
/*  44: 89 */         this.g.a();
/*  45:    */       } else {
/*  46: 91 */         this.g.l();
/*  47:    */       }
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected void a(char paramChar, int paramInt) {}
/*  52:    */   
/*  53:    */   public void b()
/*  54:    */   {
/*  55:102 */     this.n.clear();
/*  56:103 */     this.n.add(new bug(0, this.l / 2 - 100, this.m / 4 + 120 + 12, cwc.a("gui.cancel", new Object[0])));
/*  57:    */   }
/*  58:    */   
/*  59:    */   protected void a(bug parambug)
/*  60:    */   {
/*  61:108 */     if (parambug.k == 0)
/*  62:    */     {
/*  63:109 */       this.h = true;
/*  64:110 */       if (this.g != null) {
/*  65:111 */         this.g.a(new hy("Aborted"));
/*  66:    */       }
/*  67:113 */       this.j.a(this.i);
/*  68:    */     }
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  72:    */   {
/*  73:119 */     c();
/*  74:121 */     if (this.g == null) {
/*  75:122 */       a(this.q, cwc.a("connect.connecting", new Object[0]), this.l / 2, this.m / 2 - 50, 16777215);
/*  76:    */     } else {
/*  77:124 */       a(this.q, cwc.a("connect.authorizing", new Object[0]), this.l / 2, this.m / 2 - 50, 16777215);
/*  78:    */     }
/*  79:127 */     super.a(paramInt1, paramInt2, paramFloat);
/*  80:    */   }
				static boolean a(bwb arg0) {return arg0.h;}
				static gr a(bwb arg0, gr arg1) {return arg0.g=arg1;}
				static gr b(bwb arg0) {return arg0.g;}
				static bxf c(bwb arg0) {return arg0.i;}
				static Logger a() {return f;}
/*  81:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwb
 * JD-Core Version:    0.7.0.1
 */