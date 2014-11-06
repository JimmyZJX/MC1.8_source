package net.minecraft.src;
/*  2:   */ 
/*  3:   */ public class yr
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   private EntityWolf a;
/*  7:   */   private EntityPlayer b;
/*  8:   */   private World c;
/*  9:   */   private float d;
/* 10:   */   private int e;
/* 11:   */   
/* 12:   */   public yr(EntityWolf paramacu, float paramFloat)
/* 13:   */   {
/* 14:18 */     this.a = paramacu;
/* 15:19 */     this.c = paramacu.world;
/* 16:20 */     this.d = paramFloat;
/* 17:21 */     a(2);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean a()
/* 21:   */   {
/* 22:26 */     this.b = this.c.a(this.a, (double)this.d);
/* 23:27 */     if (this.b == null) {
/* 24:28 */       return false;
/* 25:   */     }
/* 26:30 */     return a(this.b);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public boolean b()
/* 30:   */   {
/* 31:35 */     if (!this.b.ai()) {
/* 32:36 */       return false;
/* 33:   */     }
/* 34:38 */     if (this.a.h(this.b) > this.d * this.d) {
/* 35:39 */       return false;
/* 36:   */     }
/* 37:41 */     return (this.e > 0) && (a(this.b));
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void c()
/* 41:   */   {
/* 42:46 */     this.a.p(true);
/* 43:47 */     this.e = (40 + this.a.bb().nextInt(40));
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void d()
/* 47:   */   {
/* 48:52 */     this.a.p(false);
/* 49:53 */     this.b = null;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void e()
/* 53:   */   {
/* 54:58 */     this.a.p().a(this.b.xPos, this.b.yPos + this.b.aR(), this.b.zPos, 10.0F, this.a.bP());
/* 55:59 */     this.e -= 1;
/* 56:   */   }
/* 57:   */   
/* 58:   */   private boolean a(EntityPlayer paramahd)
/* 59:   */   {
/* 60:63 */     ItemStack localamj = paramahd.bg.h();
/* 61:64 */     if (localamj == null) {
/* 62:65 */       return false;
/* 63:   */     }
/* 64:67 */     if ((!this.a.cj()) && (localamj.getItem() == ItemList.bone)) {
/* 65:68 */       return true;
/* 66:   */     }
/* 67:70 */     return this.a.d(localamj);
/* 68:   */   }
/* 69:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yr
 * JD-Core Version:    0.7.0.1
 */