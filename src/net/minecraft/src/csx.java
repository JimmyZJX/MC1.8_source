package net.minecraft.src;
/*  1:   */ public class csx
/*  2:   */   implements csq<EntityWitch>
/*  3:   */ {
/*  4:   */   private final crv a;
/*  5:   */   
/*  6:   */   public csx(crv paramcrv)
/*  7:   */   {
/*  8:19 */     this.a = paramcrv;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public void a(EntityWitch paramagi, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 12:   */   {
/* 13:25 */     ItemStack localamj = paramagi.bz();
/* 14:27 */     if (localamj == null) {
/* 15:28 */       return;
/* 16:   */     }
/* 17:31 */     cjm.c(1.0F, 1.0F, 1.0F);
/* 18:32 */     cjm.glPushMatrix();
/* 19:34 */     if (this.a.b().r)
/* 20:   */     {
/* 21:35 */       cjm.glTranslatef(0.0F, 0.625F, 0.0F);
/* 22:36 */       cjm.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
/* 23:   */       
/* 24:38 */       float f1 = 0.5F;
/* 25:39 */       cjm.glScalef(f1, f1, f1);
/* 26:   */     }
/* 27:42 */     ((cdm)this.a.b()).f.c(0.0625F);
/* 28:43 */     cjm.glTranslatef(-0.0625F, 0.53125F, 0.21875F);
/* 29:   */     
/* 30:45 */     Item localalq = localamj.getItem();
/* 31:46 */     bsu localbsu = bsu.z();
/* 32:   */     float f2;
/* 33:47 */     if (((localalq instanceof aju)) && (localbsu.ab().a(ProtoBlock.a(localalq), localamj.i())))
/* 34:   */     {
/* 35:48 */       cjm.glTranslatef(0.0F, 0.1875F, -0.3125F);
/* 36:49 */       cjm.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
/* 37:50 */       cjm.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 38:   */       
/* 39:52 */       f2 = 0.375F;
/* 40:53 */       cjm.glScalef(f2, -f2, f2);
/* 41:   */     }
/* 42:54 */     else if (localalq == ItemList.f)
/* 43:   */     {
/* 44:55 */       cjm.glTranslatef(0.0F, 0.125F, 0.3125F);
/* 45:56 */       cjm.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
/* 46:   */       
/* 47:58 */       f2 = 0.625F;
/* 48:59 */       cjm.glScalef(f2, -f2, f2);
/* 49:60 */       cjm.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 50:61 */       cjm.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 51:   */     }
/* 52:62 */     else if (localalq.v_())
/* 53:   */     {
/* 54:63 */       if (localalq.e())
/* 55:   */       {
/* 56:64 */         cjm.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
/* 57:65 */         cjm.glTranslatef(0.0F, -0.125F, 0.0F);
/* 58:   */       }
/* 59:67 */       this.a.B_();
/* 60:   */       
/* 61:69 */       f2 = 0.625F;
/* 62:70 */       cjm.glScalef(f2, -f2, f2);
/* 63:71 */       cjm.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
/* 64:72 */       cjm.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
/* 65:   */     }
/* 66:   */     else
/* 67:   */     {
/* 68:74 */       cjm.glTranslatef(0.25F, 0.1875F, -0.1875F);
/* 69:   */       
/* 70:76 */       f2 = 0.375F;
/* 71:77 */       cjm.glScalef(f2, f2, f2);
/* 72:78 */       cjm.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
/* 73:79 */       cjm.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/* 74:80 */       cjm.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
/* 75:   */     }
/* 76:83 */     cjm.glRotatef(-15.0F, 1.0F, 0.0F, 0.0F);
/* 77:84 */     cjm.glRotatef(40.0F, 0.0F, 0.0F, 1.0F);
/* 78:   */     
/* 79:86 */     localbsu.ag().a(paramagi, localamj, cmz.THIRD_PERSON);
/* 80:87 */     cjm.glPopMatrix();
/* 81:   */   }
/* 82:   */   
/* 83:   */   public boolean b()
/* 84:   */   {
/* 85:92 */     return false;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csx
 * JD-Core Version:    0.7.0.1
 */