package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class za
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   EntityAnimal a;
/*  7:   */   EntityAnimal b;
/*  8:   */   double c;
/*  9:   */   private int d;
/* 10:   */   
/* 11:   */   public za(EntityAnimal paramabq, double paramDouble)
/* 12:   */   {
/* 13:14 */     this.a = paramabq;
/* 14:15 */     this.c = paramDouble;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a()
/* 18:   */   {
/* 19:20 */     if (this.a.l() >= 0) {
/* 20:21 */       return false;
/* 21:   */     }
/* 22:24 */     List<? extends EntityAnimal> localList = this.a.world.a(this.a.getClass(), this.a.getAABB().expand(8.0D, 4.0D, 8.0D));
/* 23:   */     
/* 24:26 */     EntityAnimal localObject = null;
/* 25:27 */     double d1 = 1.7976931348623157E+308D;
/* 26:28 */     for (EntityAnimal localabq : localList) {
/* 27:29 */       if (localabq.l() >= 0)
/* 28:   */       {
/* 29:32 */         double d2 = this.a.h(localabq);
/* 30:33 */         if (d2 <= d1)
/* 31:   */         {
/* 32:36 */           d1 = d2;
/* 33:37 */           localObject = localabq;
/* 34:   */         }
/* 35:   */       }
/* 36:   */     }
/* 37:40 */     if (localObject == null) {
/* 38:41 */       return false;
/* 39:   */     }
/* 40:43 */     if (d1 < 9.0D) {
/* 41:44 */       return false;
/* 42:   */     }
/* 43:46 */     this.b = localObject;
/* 44:47 */     return true;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public boolean b()
/* 48:   */   {
/* 49:52 */     if (this.a.l() >= 0) {
/* 50:53 */       return false;
/* 51:   */     }
/* 52:55 */     if (!this.b.ai()) {
/* 53:56 */       return false;
/* 54:   */     }
/* 55:58 */     double d1 = this.a.h(this.b);
/* 56:59 */     if ((d1 < 9.0D) || (d1 > 256.0D)) {
/* 57:60 */       return false;
/* 58:   */     }
/* 59:62 */     return true;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void c()
/* 63:   */   {
/* 64:67 */     this.d = 0;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public void d()
/* 68:   */   {
/* 69:72 */     this.b = null;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public void e()
/* 73:   */   {
/* 74:77 */     if (--this.d > 0) {
/* 75:78 */       return;
/* 76:   */     }
/* 77:80 */     this.d = 10;
/* 78:81 */     this.a.s().a(this.b, this.c);
/* 79:   */   }
/* 80:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     za
 * JD-Core Version:    0.7.0.1
 */