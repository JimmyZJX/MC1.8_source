package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class zl
/*  4:   */   extends zb
/*  5:   */ {
/*  6:16 */   private int d = -1;
/*  7:16 */   private int c = -1;
/*  8:   */   private abh b;
/*  9:   */   private EntityWalkingMob a;
/* 10:   */   
/* 11:   */   public zl(EntityWalkingMob paramxu)
/* 12:   */   {
/* 13:19 */     this.a = paramxu;
/* 14:20 */     a(1);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public boolean a()
/* 18:   */   {
/* 19:25 */     BlockPosition localdt = new BlockPosition(this.a);
/* 20:26 */     if (((this.a.world.w()) && ((!this.a.world.S()) || (this.a.world.b(localdt).e()))) || (this.a.world.t.o())) {
/* 21:27 */       return false;
/* 22:   */     }
/* 23:29 */     if (this.a.bb().nextInt(50) != 0) {
/* 24:30 */       return false;
/* 25:   */     }
/* 26:32 */     if ((this.c != -1) && (this.a.e(this.c, this.a.yPos, this.d) < 4.0D)) {
/* 27:33 */       return false;
/* 28:   */     }
/* 29:35 */     abi localabi = this.a.world.ae().a(localdt, 14);
/* 30:36 */     if (localabi == null) {
/* 31:37 */       return false;
/* 32:   */     }
/* 33:39 */     this.b = localabi.c(localdt);
/* 34:40 */     return this.b != null;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public boolean b()
/* 38:   */   {
/* 39:45 */     return !this.a.s().m();
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void c()
/* 43:   */   {
/* 44:50 */     this.c = -1;
/* 45:51 */     BlockPosition localdt = this.b.e();
/* 46:52 */     int i = localdt.getX();
/* 47:53 */     int j = localdt.getY();
/* 48:54 */     int k = localdt.getZ();
/* 49:56 */     if (this.a.b(localdt) > 256.0D)
/* 50:   */     {
/* 51:57 */       Vec3 localbrw = abf.a(this.a, 14, 3, new Vec3(i + 0.5D, j, k + 0.5D));
/* 52:58 */       if (localbrw != null) {
/* 53:59 */         this.a.s().a(localbrw.x, localbrw.y, localbrw.z, 1.0D);
/* 54:   */       }
/* 55:   */     }
/* 56:   */     else
/* 57:   */     {
/* 58:62 */       this.a.s().a(i + 0.5D, j, k + 0.5D, 1.0D);
/* 59:   */     }
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void d()
/* 63:   */   {
/* 64:68 */     this.c = this.b.e().getX();
/* 65:69 */     this.d = this.b.e().getZ();
/* 66:70 */     this.b = null;
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zl
 * JD-Core Version:    0.7.0.1
 */