package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ 
/*   3:    */ final class ok
/*   4:    */   extends eg
/*   5:    */ {
/*   6:356 */   private boolean b = true;
/*   7:    */   
/*   8:    */   protected ItemStack b(dz paramdz, ItemStack paramamj)
/*   9:    */   {
/*  10:360 */     World localaqu = paramdz.i();
/*  11:361 */     EnumDirection localej = ave.b(paramdz.f());
/*  12:362 */     BlockPosition localdt = paramdz.d().a(localej);
/*  13:363 */     baj localbaj = BlockList.ce;
/*  14:365 */     if ((localaqu.d(localdt)) && (localbaj.b(localaqu, localdt, paramamj)))
/*  15:    */     {
/*  16:366 */       if (!localaqu.isClient)
/*  17:    */       {
/*  18:367 */         localaqu.setBlock(localdt, localbaj.instance().a(baj.a, EnumDirection.UP), 3);
/*  19:368 */         bcm localbcm = localaqu.s(localdt);
/*  20:369 */         if ((localbcm instanceof bdm))
/*  21:    */         {
/*  22:370 */           if (paramamj.getDamage2() == 3)
/*  23:    */           {
/*  24:371 */             GameProfile localGameProfile = null;
/*  25:372 */             if (paramamj.hasTagCompound())
/*  26:    */             {
/*  27:373 */               NBTTagCompound localfn = paramamj.getTagCompound();
/*  28:375 */               if (localfn.hasKey("SkullOwner", 10)) {
/*  29:376 */                 localGameProfile = ga.a(localfn.getCompoundTag("SkullOwner"));
/*  30:377 */               } else if (localfn.hasKey("SkullOwner", 8)) {
/*  31:378 */                 localGameProfile = new GameProfile(null, localfn.getString("SkullOwner"));
/*  32:    */               }
/*  33:    */             }
/*  34:382 */             ((bdm)localbcm).a(localGameProfile);
/*  35:    */           }
/*  36:    */           else
/*  37:    */           {
/*  38:384 */             ((bdm)localbcm).a(paramamj.getDamage2());
/*  39:    */           }
/*  40:386 */           ((bdm)localbcm).b(localej.d().b() * 4);
/*  41:387 */           BlockList.ce.a(localaqu, localdt, (bdm)localbcm);
/*  42:    */         }
/*  43:389 */         paramamj.stackSize -= 1;
/*  44:    */       }
/*  45:    */     }
/*  46:    */     else {
/*  47:392 */       this.b = false;
/*  48:    */     }
/*  49:395 */     return paramamj;
/*  50:    */   }
/*  51:    */   
/*  52:    */   protected void a(dz paramdz)
/*  53:    */   {
/*  54:400 */     if (this.b) {
/*  55:401 */       paramdz.i().playLevelEvent(1000, paramdz.d(), 0);
/*  56:    */     } else {
/*  57:403 */       paramdz.i().playLevelEvent(1001, paramdz.d(), 0);
/*  58:    */     }
/*  59:    */   }
/*  60:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ok
 * JD-Core Version:    0.7.0.1
 */