package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class cum
/*  4:   */   extends cue
/*  5:   */ {
/*  6:   */   private double j;
/*  7:   */   private double k;
/*  8:   */   
/*  9:   */   public cum(String paramString)
/* 10:   */   {
/* 11:12 */     super(paramString);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void j()
/* 15:   */   {
/* 16:19 */     if (this.a.isEmpty()) {
/* 17:20 */       return;
/* 18:   */     }
/* 19:23 */     bsu localbsu = bsu.z();
/* 20:   */     
/* 21:25 */     double d1 = 0.0D;
/* 22:26 */     if ((localbsu.f != null) && (localbsu.h != null))
/* 23:   */     {
/* 24:27 */       float f = localbsu.f.c(1.0F);
/* 25:28 */       d1 = f;
/* 26:29 */       if (!localbsu.f.t.d()) {
/* 27:30 */         d1 = Math.random();
/* 28:   */       }
/* 29:   */     }
/* 30:34 */     double d2 = d1 - this.j;
/* 31:35 */     while (d2 < -0.5D) {
/* 32:36 */       d2 += 1.0D;
/* 33:   */     }
/* 34:38 */     while (d2 >= 0.5D) {
/* 35:39 */       d2 -= 1.0D;
/* 36:   */     }
/* 37:41 */     d2 = MathUtils.clamp(d2, -1.0D, 1.0D);
/* 38:42 */     this.k += d2 * 0.1D;
/* 39:43 */     this.k *= 0.8D;
/* 40:   */     
/* 41:45 */     this.j += this.k;
/* 42:   */     
/* 43:47 */     int i = (int)((this.j + 1.0D) * this.a.size()) % this.a.size();
/* 44:48 */     while (i < 0) {
/* 45:49 */       i = (i + this.a.size()) % this.a.size();
/* 46:   */     }
/* 47:51 */     if (i != this.h)
/* 48:   */     {
/* 49:52 */       this.h = i;
/* 50:53 */       cuj.a((int[][])this.a.get(this.h), this.f, this.g, this.d, this.e, false, false);
/* 51:   */     }
/* 52:   */   }
/* 53:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cum
 * JD-Core Version:    0.7.0.1
 */