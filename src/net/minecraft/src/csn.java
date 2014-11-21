package net.minecraft.src;
/*  1:   */ public class csn
/*  2:   */   implements csq
/*  3:   */ {
/*  4:   */   private final cqv a;
/*  5:   */   
/*  6:   */   public csn(cqv paramcqv)
/*  7:   */   {
/*  8:17 */     this.a = paramcqv;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 12:   */   {
/* 13:22 */     ItemStack localamj = paramxm.getHeldItemStack();
/* 14:23 */     if (localamj == null) {
/* 15:24 */       return;
/* 16:   */     }
/* 17:27 */     cjm.glPushMatrix();
/* 18:29 */     if (this.a.b().r)
/* 19:   */     {
/* 20:30 */       float f1 = 0.5F;
/* 21:31 */       cjm.glTranslatef(0.0F, 0.625F, 0.0F);
/* 22:32 */       cjm.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
/* 23:33 */       cjm.glScalef(f1, f1, f1);
/* 24:   */     }
/* 25:36 */     ((ccl)this.a.b()).a(0.0625F);
/* 26:37 */     cjm.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
/* 27:40 */     if (((paramxm instanceof EntityPlayer)) && (((EntityPlayer)paramxm).bE != null)) {
/* 28:41 */       localamj = new ItemStack(ItemList.fishingRod, 0);
/* 29:   */     }
/* 30:44 */     Item localalq = localamj.getItem();
/* 31:45 */     bsu localbsu = bsu.z();
/* 32:46 */     if (((localalq instanceof aju)) && (ProtoBlock.a(localalq).b() == 2))
/* 33:   */     {
/* 34:47 */       cjm.glTranslatef(0.0F, 0.1875F, -0.3125F);
/* 35:48 */       cjm.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/* 36:49 */       cjm.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 37:   */       
/* 38:51 */       float f2 = 0.375F;
/* 39:52 */       cjm.glScalef(-f2, -f2, f2);
/* 40:   */     }
/* 41:55 */     localbsu.ag().a(paramxm, localamj, cmz.THIRD_PERSON);
/* 42:   */     
/* 43:57 */     cjm.glPopMatrix();
/* 44:   */   }
/* 45:   */   
/* 46:   */   public boolean b()
/* 47:   */   {
/* 48:62 */     return false;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csn
 * JD-Core Version:    0.7.0.1
 */