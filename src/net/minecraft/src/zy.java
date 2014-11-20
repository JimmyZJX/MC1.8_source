package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class zy
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   private EntityWalkingMob a;
/*  7:   */   private double b;
/*  8:   */   private double c;
/*  9:   */   private double d;
/* 10:   */   private double e;
/* 11:   */   private int f;
/* 12:   */   private boolean g;
/* 13:   */   
/* 14:   */   public zy(EntityWalkingMob paramxu, double paramDouble)
/* 15:   */   {
/* 16:17 */     this(paramxu, paramDouble, 120);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public zy(EntityWalkingMob paramxu, double paramDouble, int paramInt)
/* 20:   */   {
/* 21:21 */     this.a = paramxu;
/* 22:22 */     this.e = paramDouble;
/* 23:23 */     this.f = paramInt;
/* 24:24 */     a(1);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public boolean a()
/* 28:   */   {
/* 29:29 */     if (!this.g)
/* 30:   */     {
/* 31:30 */       if (this.a.bg() >= 100) {
/* 32:31 */         return false;
/* 33:   */       }
/* 34:33 */       if (this.a.getRNG().nextInt(this.f) != 0) {
/* 35:34 */         return false;
/* 36:   */       }
/* 37:   */     }
/* 38:38 */     Vec3 localbrw = abf.a(this.a, 10, 7);
/* 39:39 */     if (localbrw == null) {
/* 40:40 */       return false;
/* 41:   */     }
/* 42:42 */     this.b = localbrw.x;
/* 43:43 */     this.c = localbrw.y;
/* 44:44 */     this.d = localbrw.z;
/* 45:45 */     this.g = false;
/* 46:46 */     return true;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public boolean b()
/* 50:   */   {
/* 51:51 */     return !this.a.s().m();
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void c()
/* 55:   */   {
/* 56:56 */     this.a.s().a(this.b, this.c, this.d, this.e);
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void f()
/* 60:   */   {
/* 61:60 */     this.g = true;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public void b(int paramInt)
/* 65:   */   {
/* 66:64 */     this.f = paramInt;
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zy
 * JD-Core Version:    0.7.0.1
 */