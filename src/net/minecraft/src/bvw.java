package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class bvw
/*  4:   */   extends bxf
/*  5:   */ {
/*  6:11 */   private static final btr[] a = { btr.p, btr.q, btr.r, btr.s, btr.t, btr.z, btr.B, btr.C, btr.A, btr.Q };
/*  7:   */   private final bxf f;
/*  8:   */   private final bto g;
/*  9:   */   private String h;
/* 10:   */   private String i;
/* 11:   */   private int r;
/* 12:   */   
/* 13:   */   public bvw(bxf parambxf, bto parambto)
/* 14:   */   {
/* 15:26 */     this.f = parambxf;
/* 16:27 */     this.g = parambto;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void b()
/* 20:   */   {
/* 21:32 */     int j = 0;
/* 22:33 */     this.h = cwc.a("options.chat.title", new Object[0]);
/* 23:34 */     this.i = cwc.a("options.multiplayer.title", new Object[0]);
/* 24:36 */     for (btr localbtr : a)
/* 25:   */     {
/* 26:37 */       if (localbtr.a()) {
/* 27:38 */         this.n.add(new bvl(localbtr.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbtr));
/* 28:   */       } else {
/* 29:40 */         this.n.add(new buw(localbtr.c(), this.l / 2 - 155 + j % 2 * 160, this.m / 6 + 24 * (j >> 1), localbtr, this.g.c(localbtr)));
/* 30:   */       }
/* 31:43 */       j++;
/* 32:   */     }
/* 33:46 */     if (j % 2 == 1) {
/* 34:47 */       j++;
/* 35:   */     }
/* 36:49 */     this.r = (this.m / 6 + 24 * (j >> 1));
/* 37:   */     
/* 38:51 */     this.n.add(new bug(200, this.l / 2 - 100, this.m / 6 + 120, cwc.a("gui.done", new Object[0])));
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected void a(bug parambug)
/* 42:   */   {
/* 43:56 */     if (!parambug.l) {
/* 44:57 */       return;
/* 45:   */     }
/* 46:60 */     if ((parambug.k < 100) && ((parambug instanceof buw)))
/* 47:   */     {
/* 48:61 */       this.g.a(((buw)parambug).c(), 1);
/* 49:62 */       parambug.j = this.g.c(btr.a(parambug.k));
/* 50:   */     }
/* 51:64 */     if (parambug.k == 200)
/* 52:   */     {
/* 53:65 */       this.j.t.b();
/* 54:66 */       this.j.a(this.f);
/* 55:   */     }
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 59:   */   {
/* 60:72 */     c();
/* 61:73 */     a(this.q, this.h, this.l / 2, 20, 16777215);
/* 62:74 */     a(this.q, this.i, this.l / 2, this.r + 7, 16777215);
/* 63:   */     
/* 64:76 */     super.a(paramInt1, paramInt2, paramFloat);
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvw
 * JD-Core Version:    0.7.0.1
 */