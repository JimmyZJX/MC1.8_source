package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class yx
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   private EntityWalkingMob a;
/*  7:   */   private double b;
/*  8:   */   private double c;
/*  9:   */   private double d;
/* 10:   */   private double e;
/* 11:   */   private World f;
/* 12:   */   
/* 13:   */   public yx(EntityWalkingMob paramxu, double paramDouble)
/* 14:   */   {
/* 15:18 */     this.a = paramxu;
/* 16:19 */     this.e = paramDouble;
/* 17:20 */     this.f = paramxu.world;
/* 18:21 */     a(1);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public boolean a()
/* 22:   */   {
/* 23:26 */     if (!this.f.w()) {
/* 24:27 */       return false;
/* 25:   */     }
/* 26:29 */     if (!this.a.au()) {
/* 27:30 */       return false;
/* 28:   */     }
/* 29:32 */     if (!this.f.i(new BlockPosition(this.a.xPos, this.a.getAABB().minY, this.a.zPos))) {
/* 30:33 */       return false;
/* 31:   */     }
/* 32:36 */     Vec3 localbrw = f();
/* 33:37 */     if (localbrw == null) {
/* 34:38 */       return false;
/* 35:   */     }
/* 36:40 */     this.b = localbrw.x;
/* 37:41 */     this.c = localbrw.y;
/* 38:42 */     this.d = localbrw.z;
/* 39:43 */     return true;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean b()
/* 43:   */   {
/* 44:48 */     return !this.a.s().m();
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void c()
/* 48:   */   {
/* 49:53 */     this.a.s().a(this.b, this.c, this.d, this.e);
/* 50:   */   }
/* 51:   */   
/* 52:   */   private Vec3 f()
/* 53:   */   {
/* 54:57 */     Random localRandom = this.a.getRNG();
/* 55:58 */     BlockPosition localdt1 = new BlockPosition(this.a.xPos, this.a.getAABB().minY, this.a.zPos);
/* 56:60 */     for (int i = 0; i < 10; i++)
/* 57:   */     {
/* 58:61 */       BlockPosition localdt2 = localdt1.offset(localRandom.nextInt(20) - 10, localRandom.nextInt(6) - 3, localRandom.nextInt(20) - 10);
/* 59:63 */       if ((!this.f.i(localdt2)) && (this.a.a(localdt2) < 0.0F)) {
/* 60:64 */         return new Vec3(localdt2.getX(), localdt2.getY(), localdt2.getZ());
/* 61:   */       }
/* 62:   */     }
/* 63:67 */     return null;
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yx
 * JD-Core Version:    0.7.0.1
 */