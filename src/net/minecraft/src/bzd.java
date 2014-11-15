package net.minecraft.src;
/*  1:   */ import java.util.Collection;
/*  2:   */ 
/*  3:   */ public abstract class bzd
/*  4:   */   extends byl
/*  5:   */ {
/*  6:   */   private boolean u;
/*  7:   */   
/*  8:   */   public bzd(aib paramaib)
/*  9:   */   {
/* 10:15 */     super(paramaib);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void b()
/* 14:   */   {
/* 15:20 */     super.b();
/* 16:21 */     g();
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void g()
/* 20:   */   {
/* 21:25 */     if (!this.j.h.bk().isEmpty())
/* 22:   */     {
/* 23:26 */       this.i = (160 + (this.l - this.f - 200) / 2);
/* 24:27 */       this.u = true;
/* 25:   */     }
/* 26:   */     else
/* 27:   */     {
/* 28:29 */       this.i = ((this.l - this.f) / 2);
/* 29:30 */       this.u = false;
/* 30:   */     }
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 34:   */   {
/* 35:36 */     super.a(paramInt1, paramInt2, paramFloat);
/* 36:37 */     if (this.u) {
/* 37:38 */       a();
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   private void a()
/* 42:   */   {
/* 43:43 */     int i = this.i - 124;
/* 44:44 */     int j = this.r;
/* 45:   */     
/* 46:46 */     int k = 166;
/* 47:   */     
/* 48:48 */     Collection localCollection = this.j.h.bk();
/* 49:50 */     if (localCollection.isEmpty()) {
/* 50:51 */       return;
/* 51:   */     }
/* 52:54 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 53:55 */     cjm.disableLighting();
/* 54:   */     
/* 55:57 */     int m = 33;
/* 56:58 */     if (localCollection.size() > 5) {
/* 57:59 */       m = 132 / (localCollection.size() - 1);
/* 58:   */     }
/* 59:62 */     for (PotionEffect localwq : this.j.h.bk())
/* 60:   */     {
/* 61:63 */       Potion localwp = Potion.potionList[localwq.getID()];
/* 62:   */       
/* 63:65 */       cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 64:66 */       this.j.N().a(a);
/* 65:   */       
/* 66:68 */       b(i, j, 0, 166, 140, 32);
/* 67:70 */       if (localwp.e())
/* 68:   */       {
/* 69:71 */         int n = localwp.f();
/* 70:72 */         b(i + 6, j + 7, 0 + n % 8 * 18, 198 + n / 8 * 18, 18, 18);
/* 71:   */       }
/* 72:75 */       String str1 = cwc.a(localwp.getName(), new Object[0]);
/* 73:77 */       if (localwq.getAmplifier() == 1) {
/* 74:78 */         str1 = str1 + " " + cwc.a("enchantment.level.2", new Object[0]);
/* 75:79 */       } else if (localwq.getAmplifier() == 2) {
/* 76:80 */         str1 = str1 + " " + cwc.a("enchantment.level.3", new Object[0]);
/* 77:81 */       } else if (localwq.getAmplifier() == 3) {
/* 78:82 */         str1 = str1 + " " + cwc.a("enchantment.level.4", new Object[0]);
/* 79:   */       }
/* 80:85 */       this.q.a(str1, i + 10 + 18, j + 6, 16777215);
/* 81:   */       
/* 82:87 */       String str2 = Potion.getDurationString(localwq);
/* 83:88 */       this.q.a(str2, i + 10 + 18, j + 6 + 10, 8355711);
/* 84:   */       
/* 85:90 */       j += m;
/* 86:   */     }
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzd
 * JD-Core Version:    0.7.0.1
 */