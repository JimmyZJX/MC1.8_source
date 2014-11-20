package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class yy
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   private EntityMob a;
/*  7:   */   
/*  8:   */   public yy(EntityMob paramxn)
/*  9:   */   {
/* 10:11 */     this.a = paramxn;
/* 11:12 */     a(4);
/* 12:13 */     ((aay)paramxn.s()).d(true);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean a()
/* 16:   */   {
/* 17:18 */     return (this.a.V()) || (this.a.ab());
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void e()
/* 21:   */   {
/* 22:23 */     if (this.a.getRNG().nextFloat() < 0.8F) {
/* 23:24 */       this.a.r().a();
/* 24:   */     }
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yy
 * JD-Core Version:    0.7.0.1
 */