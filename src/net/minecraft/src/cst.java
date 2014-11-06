package net.minecraft.src;
/*  1:   */ public class cst
/*  2:   */   implements csq<EntitySnowGolem>
/*  3:   */ {
/*  4:   */   private final crm a;
/*  5:   */   
/*  6:   */   public cst(crm paramcrm)
/*  7:   */   {
/*  8:15 */     this.a = paramcrm;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(EntitySnowGolem paramacn, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 12:   */   {
/* 13:20 */     if (paramacn.ay()) {
/* 14:21 */       return;
/* 15:   */     }
/* 16:24 */     cjm.glPushMatrix();
/* 17:25 */     this.a.g().c.c(0.0625F);
/* 18:   */     
/* 19:27 */     float f = 0.625F;
/* 20:28 */     cjm.glTranslatef(0.0F, -0.34375F, 0.0F);
/* 21:29 */     cjm.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/* 22:30 */     cjm.glScalef(f, -f, -f);
/* 23:   */     
/* 24:32 */     bsu.z().ag().a(paramacn, new ItemStack(BlockList.pumpkin, 1), cmz.HEAD);
/* 25:33 */     cjm.glPopMatrix();
/* 26:   */   }
/* 27:   */   
/* 28:   */   public boolean b()
/* 29:   */   {
/* 30:38 */     return true;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cst
 * JD-Core Version:    0.7.0.1
 */