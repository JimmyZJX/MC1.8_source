package net.minecraft.src;
/*  1:   */ public class yl
/*  2:   */ {
/*  3:   */   private EntityMob b;
/*  4:   */   protected boolean a;
/*  5:   */   
/*  6:   */   public yl(EntityMob paramxn)
/*  7:   */   {
/*  8:10 */     this.b = paramxn;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a()
/* 12:   */   {
/* 13:14 */     this.a = true;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public void b()
/* 17:   */   {
/* 18:18 */     this.b.i(this.a);
/* 19:19 */     this.a = false;
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yl
 * JD-Core Version:    0.7.0.1
 */