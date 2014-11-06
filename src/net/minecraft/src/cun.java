package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class cun
/*  4:   */   extends cue
/*  5:   */ {
/*  6:   */   public double j;
/*  7:   */   public double k;
/*  8:   */   public static String l;
/*  9:   */   
/* 10:   */   public cun(String paramString)
/* 11:   */   {
/* 12:15 */     super(paramString);
/* 13:16 */     l = paramString;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void j()
/* 17:   */   {
/* 18:21 */     bsu localbsu = bsu.z();
/* 19:23 */     if ((localbsu.f != null) && (localbsu.h != null)) {
/* 20:24 */       a(localbsu.f, localbsu.h.xPos, localbsu.h.zPos, localbsu.h.yaw, false, false);
/* 21:   */     } else {
/* 22:26 */       a(null, 0.0D, 0.0D, 0.0D, true, false);
/* 23:   */     }
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void a(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean1, boolean paramBoolean2)
/* 27:   */   {
/* 28:33 */     if (this.a.isEmpty()) {
/* 29:34 */       return;
/* 30:   */     }
/* 31:37 */     double d1 = 0.0D;
/* 32:38 */     if ((paramaqu != null) && (!paramBoolean1))
/* 33:   */     {
/* 34:39 */       BlockPosition localdt = paramaqu.getWorldSpawn();
/* 35:40 */       double d3 = localdt.getX() - paramDouble1;
/* 36:41 */       double d4 = localdt.getZ() - paramDouble2;
/* 37:42 */       paramDouble3 %= 360.0D;
/* 38:43 */       d1 = -((paramDouble3 - 90.0D) * 3.141592653589793D / 180.0D - Math.atan2(d4, d3));
/* 39:44 */       if (!paramaqu.t.d()) {
/* 40:45 */         d1 = Math.random() * 3.141592741012573D * 2.0D;
/* 41:   */       }
/* 42:   */     }
/* 43:49 */     if (paramBoolean2)
/* 44:   */     {
/* 45:50 */       this.j = d1;
/* 46:   */     }
/* 47:   */     else
/* 48:   */     {
/* 49:52 */       double d2 = d1 - this.j;
/* 50:53 */       while (d2 < -3.141592653589793D) {
/* 51:54 */         d2 += 6.283185307179586D;
/* 52:   */       }
/* 53:56 */       while (d2 >= 3.141592653589793D) {
/* 54:57 */         d2 -= 6.283185307179586D;
/* 55:   */       }
/* 56:59 */       d2 = MathUtils.clamp(d2, -1.0D, 1.0D);
/* 57:60 */       this.k += d2 * 0.1D;
/* 58:61 */       this.k *= 0.8D;
/* 59:62 */       this.j += this.k;
/* 60:   */     }
/* 61:65 */     int i = (int)((this.j / 6.283185307179586D + 1.0D) * this.a.size()) % this.a.size();
/* 62:66 */     while (i < 0) {
/* 63:67 */       i = (i + this.a.size()) % this.a.size();
/* 64:   */     }
/* 65:69 */     if (i != this.h)
/* 66:   */     {
/* 67:70 */       this.h = i;
/* 68:71 */       cuj.a((int[][])this.a.get(this.h), this.f, this.g, this.d, this.e, false, false);
/* 69:   */     }
/* 70:   */   }
/* 71:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cun
 * JD-Core Version:    0.7.0.1
 */