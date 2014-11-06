package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import com.google.common.base.Predicates;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class yp
/*  6:   */   extends zb
/*  7:   */ {
/*  8:17 */   public final Predicate<Entity> a = new yq(this);
/*  9:   */   protected EntityWalkingMob b;
/* 10:   */   private double d;
/* 11:   */   private double e;
/* 12:   */   protected Entity c;
/* 13:   */   private float f;
/* 14:   */   private bpv g;
/* 15:   */   private aaz h;
/* 16:   */   private Predicate i;
/* 17:   */   
/* 18:   */   public yp(EntityWalkingMob paramxu, Predicate paramPredicate, float paramFloat, double paramDouble1, double paramDouble2)
/* 19:   */   {
/* 20:33 */     this.b = paramxu;
/* 21:34 */     this.i = paramPredicate;
/* 22:35 */     this.f = paramFloat;
/* 23:36 */     this.d = paramDouble1;
/* 24:37 */     this.e = paramDouble2;
/* 25:38 */     this.h = paramxu.s();
/* 26:39 */     a(1);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public boolean a()
/* 30:   */   {
/* 31:44 */     List localList = this.b.world.a(this.b, this.b.getAABB().expand(this.f, 3.0D, this.f), Predicates.and(new Predicate[] { xe.d, this.a, this.i }));
/* 32:45 */     if (localList.isEmpty()) {
/* 33:46 */       return false;
/* 34:   */     }
/* 35:48 */     this.c = ((Entity)localList.get(0));
/* 36:   */     
/* 37:50 */     Vec3 localbrw = abf.b(this.b, 16, 7, new Vec3(this.c.xPos, this.c.yPos, this.c.zPos));
/* 38:51 */     if (localbrw == null) {
/* 39:52 */       return false;
/* 40:   */     }
/* 41:54 */     if (this.c.e(localbrw.x, localbrw.y, localbrw.z) < this.c.h(this.b)) {
/* 42:55 */       return false;
/* 43:   */     }
/* 44:57 */     this.g = this.h.a(localbrw.x, localbrw.y, localbrw.z);
/* 45:58 */     if (this.g == null) {
/* 46:59 */       return false;
/* 47:   */     }
/* 48:61 */     if (!this.g.b(localbrw)) {
/* 49:62 */       return false;
/* 50:   */     }
/* 51:64 */     return true;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public boolean b()
/* 55:   */   {
/* 56:69 */     return !this.h.m();
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void c()
/* 60:   */   {
/* 61:74 */     this.h.a(this.g, this.d);
/* 62:   */   }
/* 63:   */   
/* 64:   */   public void d()
/* 65:   */   {
/* 66:79 */     this.c = null;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public void e()
/* 70:   */   {
/* 71:84 */     if (this.b.h(this.c) < 49.0D) {
/* 72:85 */       this.b.s().a(this.e);
/* 73:   */     } else {
/* 74:87 */       this.b.s().a(this.d);
/* 75:   */     }
/* 76:   */   }
/* 77:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yp
 * JD-Core Version:    0.7.0.1
 */