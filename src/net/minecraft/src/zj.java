package net.minecraft.src;
/*   2:    */ 
/*   3:    */ public class zj
/*   4:    */   extends zb
/*   5:    */ {
/*   6:    */   private EntityVillager b;
/*   7:    */   private EntityVillager c;
/*   8:    */   private World d;
/*   9:    */   private int e;
/*  10:    */   abi a;
/*  11:    */   
/*  12:    */   public zj(EntityVillager paramagp)
/*  13:    */   {
/*  14: 18 */     this.b = paramagp;
/*  15: 19 */     this.d = paramagp.world;
/*  16: 20 */     a(3);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public boolean a()
/*  20:    */   {
/*  21: 25 */     if (this.b.l() != 0) {
/*  22: 26 */       return false;
/*  23:    */     }
/*  24: 28 */     if (this.b.bb().nextInt(500) != 0) {
/*  25: 29 */       return false;
/*  26:    */     }
/*  27: 32 */     this.a = this.d.ae().a(new BlockPosition(this.b), 0);
/*  28: 33 */     if (this.a == null) {
/*  29: 34 */       return false;
/*  30:    */     }
/*  31: 36 */     if ((!f()) || (!this.b.n(true))) {
/*  32: 37 */       return false;
/*  33:    */     }
/*  34: 40 */     Entity localwv = this.d.a(EntityVillager.class, this.b.getAABB().expand(8.0D, 3.0D, 8.0D), this.b);
/*  35: 41 */     if (localwv == null) {
/*  36: 42 */       return false;
/*  37:    */     }
/*  38: 45 */     this.c = ((EntityVillager)localwv);
/*  39: 46 */     if ((this.c.l() != 0) || (!this.c.n(true))) {
/*  40: 47 */       return false;
/*  41:    */     }
/*  42: 50 */     return true;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public void c()
/*  46:    */   {
/*  47: 55 */     this.e = 300;
/*  48: 56 */     this.b.l(true);
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void d()
/*  52:    */   {
/*  53: 61 */     this.a = null;
/*  54: 62 */     this.c = null;
/*  55: 63 */     this.b.l(false);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public boolean b()
/*  59:    */   {
/*  60: 68 */     return (this.e >= 0) && (f()) && (this.b.l() == 0) && (this.b.n(false));
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void e()
/*  64:    */   {
/*  65: 73 */     this.e -= 1;
/*  66: 74 */     this.b.p().a(this.c, 10.0F, 30.0F);
/*  67: 76 */     if (this.b.h(this.c) > 2.25D) {
/*  68: 77 */       this.b.s().a(this.c, 0.25D);
/*  69: 79 */     } else if ((this.e == 0) && (this.c.ck())) {
/*  70: 80 */       g();
/*  71:    */     }
/*  72: 84 */     if (this.b.bb().nextInt(35) == 0) {
/*  73: 85 */       this.d.a(this.b, (byte)12);
/*  74:    */     }
/*  75:    */   }
/*  76:    */   
/*  77:    */   private boolean f()
/*  78:    */   {
/*  79: 90 */     if (!this.a.i()) {
/*  80: 91 */       return false;
/*  81:    */     }
/*  82: 94 */     int i = (int)(this.a.c() * 0.35D);
/*  83: 95 */     return this.a.e() < i;
/*  84:    */   }
/*  85:    */   
/*  86:    */   private void g()
/*  87:    */   {
/*  88: 99 */     EntityVillager localagp = this.b.a(this.c);
/*  89:100 */     this.c.b(6000);
/*  90:101 */     this.b.b(6000);
/*  91:102 */     this.c.o(false);
/*  92:103 */     this.b.o(false);
/*  93:104 */     localagp.b(-24000);
/*  94:105 */     localagp.setPositionAndAngles(this.b.xPos, this.b.yPos, this.b.zPos, 0.0F, 0.0F);
/*  95:106 */     this.d.spawnEntity(localagp);
/*  96:107 */     this.d.a(localagp, (byte)12);
/*  97:    */   }
/*  98:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zj
 * JD-Core Version:    0.7.0.1
 */