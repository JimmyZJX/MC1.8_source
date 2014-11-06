package net.minecraft.src;
/*  1:   */ public class css
/*  2:   */   implements csq<EntitySlime>
/*  3:   */ {
/*  4:   */   private final crl a;
/*  5:14 */   private final ccq b = new cde(0);
/*  6:   */   
/*  7:   */   public css(crl paramcrl)
/*  8:   */   {
/*  9:17 */     this.a = paramcrl;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(EntitySlime paramafy, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 13:   */   {
/* 14:22 */     if (paramafy.ay()) {
/* 15:23 */       return;
/* 16:   */     }
/* 17:26 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 18:27 */     cjm.z();
/* 19:28 */     cjm.enableBlend();
/* 20:29 */     cjm.glBlendFunc(770, 771);
/* 21:   */     
/* 22:31 */     this.b.a(this.a.b());
/* 23:32 */     this.b.a(paramafy, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 24:   */     
/* 25:34 */     cjm.disableBlend();
/* 26:35 */     cjm.A();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public boolean b()
/* 30:   */   {
/* 31:40 */     return true;
/* 32:   */   }
/* 33:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     css
 * JD-Core Version:    0.7.0.1
 */