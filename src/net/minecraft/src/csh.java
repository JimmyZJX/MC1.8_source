package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ 
/*  3:   */ public class csh
/*  4:   */   implements csq<EntityLiving>
/*  5:   */ {
/*  6:   */   private final cdy a;
/*  7:   */   
/*  8:   */   public csh(cdy paramcdy)
/*  9:   */   {
/* 10:26 */     this.a = paramcdy;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/* 14:   */   {
/* 15:31 */     ItemStack localamj = paramxm.getArmor(3);
/* 16:32 */     if ((localamj == null) || (localamj.getItem() == null)) {
/* 17:33 */       return;
/* 18:   */     }
/* 19:36 */     Item localalq = localamj.getItem();
/* 20:37 */     bsu localbsu = bsu.z();
/* 21:   */     
/* 22:39 */     cjm.glPushMatrix();
/* 23:41 */     if (paramxm.aw()) {
/* 24:42 */       cjm.glTranslatef(0.0F, 0.2F, 0.0F);
/* 25:   */     }
/* 26:45 */     int i = ((paramxm instanceof EntityVillager)) || (((paramxm instanceof EntityZombie)) && (((EntityZombie)paramxm).cm())) ? 1 : 0;
/* 27:   */     float f1;
/* 28:47 */     if ((i == 0) && (paramxm.i_()))
/* 29:   */     {
/* 30:48 */       f1 = 2.0F;
/* 31:49 */       float f2 = 1.4F;
/* 32:50 */       cjm.glScalef(f2 / f1, f2 / f1, f2 / f1);
/* 33:51 */       cjm.glTranslatef(0.0F, 16.0F * paramFloat7, 0.0F);
/* 34:   */     }
/* 35:54 */     this.a.c(0.0625F);
/* 36:   */     
/* 37:56 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 38:58 */     if ((localalq instanceof aju))
/* 39:   */     {
/* 40:59 */       f1 = 0.625F;
/* 41:60 */       cjm.glTranslatef(0.0F, -0.25F, 0.0F);
/* 42:61 */       cjm.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/* 43:62 */       cjm.glScalef(f1, -f1, -f1);
/* 44:63 */       if (i != 0) {
/* 45:64 */         cjm.glTranslatef(0.0F, 0.1875F, 0.0F);
/* 46:   */       }
/* 47:67 */       localbsu.ag().a(paramxm, localamj, cmz.HEAD);
/* 48:   */     }
/* 49:68 */     else if (localalq == ItemList.skull)
/* 50:   */     {
/* 51:69 */       f1 = 1.1875F;
/* 52:70 */       cjm.glScalef(f1, -f1, -f1);
/* 53:71 */       if (i != 0) {
/* 54:72 */         cjm.glTranslatef(0.0F, 0.0625F, 0.0F);
/* 55:   */       }
/* 56:75 */       GameProfile localGameProfile = null;
/* 57:76 */       if (localamj.hasTagCompound())
/* 58:   */       {
/* 59:77 */         NBTTagCompound localfn = localamj.getTagCompound();
/* 60:78 */         if (localfn.hasKey("SkullOwner", 10))
/* 61:   */         {
/* 62:79 */           localGameProfile = ga.a(localfn.getCompoundTag("SkullOwner"));
/* 63:   */         }
/* 64:80 */         else if (localfn.hasKey("SkullOwner", 8))
/* 65:   */         {
/* 66:81 */           localGameProfile = bdm.b(new GameProfile(null, localfn.getString("SkullOwner")));
/* 67:82 */           localfn.setNBT("SkullOwner", ga.a(new NBTTagCompound(), localGameProfile));
/* 68:   */         }
/* 69:   */       }
/* 70:86 */       cnw.c.a(-0.5F, 0.0F, -0.5F, EnumDirection.UP, 180.0F, localamj.getDamage2(), localGameProfile, -1);
/* 71:   */     }
/* 72:88 */     cjm.glPopMatrix();
/* 73:   */   }
/* 74:   */   
/* 75:   */   public boolean b()
/* 76:   */   {
/* 77:93 */     return true;
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csh
 * JD-Core Version:    0.7.0.1
 */