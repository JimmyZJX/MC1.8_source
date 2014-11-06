package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class zx
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   private EntityMob a;
/*  7:   */   private double b;
/*  8:   */   private double c;
/*  9:   */   private int d;
/* 10:   */   
/* 11:   */   public zx(EntityMob paramxn)
/* 12:   */   {
/* 13:12 */     this.a = paramxn;
/* 14:13 */     a(3);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a()
/* 18:   */   {
/* 19:18 */     return this.a.bb().nextFloat() < 0.02F;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public boolean b()
/* 23:   */   {
/* 24:23 */     return this.d >= 0;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void c()
/* 28:   */   {
/* 29:28 */     double d1 = 6.283185307179586D * this.a.bb().nextDouble();
/* 30:29 */     this.b = Math.cos(d1);
/* 31:30 */     this.c = Math.sin(d1);
/* 32:31 */     this.d = (20 + this.a.bb().nextInt(20));
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void e()
/* 36:   */   {
/* 37:36 */     this.d -= 1;
/* 38:37 */     this.a.p().a(this.a.xPos + this.b, this.a.yPos + this.a.aR(), this.a.zPos + this.c, 10.0F, this.a.bP());
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zx
 * JD-Core Version:    0.7.0.1
 */