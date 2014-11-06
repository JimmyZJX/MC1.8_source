package net.minecraft.src;
/*  1:   */ public class csz
/*  2:   */   implements csq<EntityWolf>
/*  3:   */ {
/*  4:11 */   private static final oa a = new oa("textures/entity/wolf/wolf_collar.png");
/*  5:   */   private final cry b;
/*  6:   */   
/*  7:   */   public csz(cry paramcry)
/*  8:   */   {
/*  9:15 */     this.b = paramcry;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void a(EntityWolf paramacu, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 13:   */   {
/* 14:20 */     if ((!paramacu.cj()) || (paramacu.ay())) {
/* 15:21 */       return;
/* 16:   */     }
/* 17:24 */     this.b.a(a);
/* 18:   */     
/* 19:26 */     EnumDyeColor localakv = EnumDyeColor.b(paramacu.cu().a());
/* 20:27 */     float[] arrayOfFloat = EntitySheep.a(localakv);
/* 21:   */     
/* 22:29 */     cjm.c(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2]);
/* 23:   */     
/* 24:31 */     this.b.b().a(paramacu, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public boolean b()
/* 28:   */   {
/* 29:36 */     return true;
/* 30:   */   }
/* 31:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csz
 * JD-Core Version:    0.7.0.1
 */