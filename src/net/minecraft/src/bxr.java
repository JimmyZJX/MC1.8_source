package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class bxr
/*   4:    */   extends bxf
/*   5:    */ {
/*   6:    */   private bxf f;
/*   7: 15 */   protected String a = "Video Settings";
/*   8:    */   private bto g;
/*   9:    */   private buu h;
/*  10: 19 */   private static final btr[] i = { btr.l, btr.f, btr.m, btr.i, btr.h, btr.g, btr.n, btr.d, btr.k, btr.o, btr.v, btr.w, btr.D, btr.P, btr.x };
/*  11:    */   
/*  12:    */   public bxr(bxf parambxf, bto parambto)
/*  13:    */   {
/*  14: 38 */     this.f = parambxf;
/*  15: 39 */     this.g = parambto;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void b()
/*  19:    */   {
/*  20: 44 */     this.a = cwc.a("options.videoTitle", new Object[0]);
/*  21: 45 */     this.n.clear();
/*  22:    */     
/*  23: 47 */     this.n.add(new bug(200, this.l / 2 - 100, this.m - 27, cwc.a("gui.done", new Object[0])));
/*  24: 49 */     if (!dax.O)
/*  25:    */     {
/*  26: 50 */       btr[] arrayOfbtr1 = new btr[i.length - 1];
/*  27: 51 */       int j = 0;
/*  28: 52 */       for (btr localbtr : i)
/*  29:    */       {
/*  30: 53 */         if (localbtr == btr.x) {
/*  31:    */           break;
/*  32:    */         }
/*  33: 56 */         arrayOfbtr1[j] = localbtr;
/*  34: 57 */         j++;
/*  35:    */       }
/*  36: 59 */       this.h = new bux(this.j, this.l, this.m, 32, this.m - 32, 25, arrayOfbtr1);
/*  37:    */     }
/*  38:    */     else
/*  39:    */     {
/*  40: 61 */       this.h = new bux(this.j, this.l, this.m, 32, this.m - 32, 25, i);
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void k()
/*  45:    */   {
/*  46: 67 */     super.k();
/*  47: 68 */     this.h.p();
/*  48:    */   }
/*  49:    */   
/*  50:    */   protected void a(bug parambug)
/*  51:    */   {
/*  52: 73 */     if (!parambug.l) {
/*  53: 74 */       return;
/*  54:    */     }
/*  55: 77 */     if (parambug.k == 200)
/*  56:    */     {
/*  57: 78 */       this.j.t.b();
/*  58: 79 */       this.j.a(this.f);
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*  63:    */   {
/*  64: 85 */     int j = this.g.aG;
/*  65:    */     
/*  66: 87 */     super.a(paramInt1, paramInt2, paramInt3);
/*  67: 88 */     this.h.b(paramInt1, paramInt2, paramInt3);
/*  68: 90 */     if (this.g.aG != j)
/*  69:    */     {
/*  70: 91 */       buf localbuf = new buf(this.j, this.j.d, this.j.e);
/*  71: 92 */       int k = localbuf.a();
/*  72: 93 */       int m = localbuf.b();
/*  73: 94 */       a(this.j, k, m);
/*  74:    */     }
/*  75:    */   }
/*  76:    */   
/*  77:    */   protected void b(int paramInt1, int paramInt2, int paramInt3)
/*  78:    */   {
/*  79:100 */     int j = this.g.aG;
/*  80:    */     
/*  81:102 */     super.b(paramInt1, paramInt2, paramInt3);
/*  82:103 */     this.h.c(paramInt1, paramInt2, paramInt3);
/*  83:105 */     if (this.g.aG != j)
/*  84:    */     {
/*  85:106 */       buf localbuf = new buf(this.j, this.j.d, this.j.e);
/*  86:107 */       int k = localbuf.a();
/*  87:108 */       int m = localbuf.b();
/*  88:109 */       a(this.j, k, m);
/*  89:    */     }
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  93:    */   {
/*  94:115 */     c();
/*  95:116 */     this.h.a(paramInt1, paramInt2, paramFloat);
/*  96:    */     
/*  97:118 */     a(this.q, this.a, this.l / 2, 5, 16777215);
/*  98:    */     
/*  99:120 */     super.a(paramInt1, paramInt2, paramFloat);
/* 100:    */   }
/* 101:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxr
 * JD-Core Version:    0.7.0.1
 */