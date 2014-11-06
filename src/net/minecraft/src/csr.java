package net.minecraft.src;
/*  1:   */ public class csr
/*  2:   */   implements csq<EntitySheep>
/*  3:   */ {
/*  4:11 */   private static final oa a = new oa("textures/entity/sheep/sheep_fur.png");
/*  5:   */   private final crh b;
/*  6:14 */   private final ccx c = new ccx();
/*  7:   */   
/*  8:   */   public csr(crh paramcrh)
/*  9:   */   {
/* 10:17 */     this.b = paramcrh;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(EntitySheep paramacl, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 14:   */   {
/* 15:22 */     if ((paramacl.ck()) || (paramacl.ay())) {
/* 16:23 */       return;
/* 17:   */     }
/* 18:26 */     this.b.a(a);
/* 19:29 */     if ((paramacl.k_()) && ("jeb_".equals(paramacl.aL())))
/* 20:   */     {
/* 21:30 */       int i = 25;
/* 22:31 */       int j = paramacl.W / 25 + paramacl.getID();
/* 23:32 */       int k = EnumDyeColor.values().length;
/* 24:33 */       int m = j % k;
/* 25:34 */       int n = (j + 1) % k;
/* 26:35 */       float f = (paramacl.W % 25 + paramFloat3) / 25.0F;
/* 27:36 */       float[] arrayOfFloat2 = EntitySheep.a(EnumDyeColor.b(m));
/* 28:37 */       float[] arrayOfFloat3 = EntitySheep.a(EnumDyeColor.b(n));
/* 29:38 */       cjm.c(arrayOfFloat2[0] * (1.0F - f) + arrayOfFloat3[0] * f, arrayOfFloat2[1] * (1.0F - f) + arrayOfFloat3[1] * f, arrayOfFloat2[2] * (1.0F - f) + arrayOfFloat3[2] * f);
/* 30:   */     }
/* 31:   */     else
/* 32:   */     {
/* 33:40 */       float[] arrayOfFloat1 = EntitySheep.a(paramacl.cj());
/* 34:41 */       cjm.c(arrayOfFloat1[0], arrayOfFloat1[1], arrayOfFloat1[2]);
/* 35:   */     }
/* 36:44 */     this.c.a(this.b.b());
/* 37:45 */     this.c.a(paramacl, paramFloat1, paramFloat2, paramFloat3);
/* 38:46 */     this.c.a(paramacl, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public boolean b()
/* 42:   */   {
/* 43:51 */     return true;
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csr
 * JD-Core Version:    0.7.0.1
 */