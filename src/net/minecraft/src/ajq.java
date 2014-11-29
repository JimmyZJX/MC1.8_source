package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class ajq
/*  5:   */   extends Item
/*  6:   */ {
/*  7:   */   public ajq()
/*  8:   */   {
/*  9:20 */     setTabToDisplayOn(CreativeTabs.tabDeco);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 13:   */   {
/* 14:25 */     if (paramej == EnumDirection.DOWN) {
/* 15:26 */       return false;
/* 16:   */     }
/* 17:29 */     boolean bool = paramaqu.getBlock(paramdt).getType().f(paramaqu, paramdt);
/* 18:30 */     BlockPosition localdt1 = bool ? paramdt : paramdt.offset(paramej);
/* 19:31 */     if (!paramahd.a(localdt1, paramej, paramamj)) {
/* 20:32 */       return false;
/* 21:   */     }
/* 22:35 */     BlockPosition localdt2 = localdt1.up();
/* 23:36 */     int i = (!paramaqu.isEmpty(localdt1)) && (!paramaqu.getBlock(localdt1).getType().f(paramaqu, localdt1)) ? 1 : 0;
/* 24:37 */     i |= ((!paramaqu.isEmpty(localdt2)) && (!paramaqu.getBlock(localdt2).getType().f(paramaqu, localdt2)) ? 1 : 0);
/* 25:38 */     if (i != 0) {
/* 26:39 */       return false;
/* 27:   */     }
/* 28:42 */     double d1 = localdt1.getX();
/* 29:43 */     double d2 = localdt1.getY();
/* 30:44 */     double d3 = localdt1.getZ();
/* 31:   */     
/* 32:46 */     List localList = paramaqu.b(null, AABB.a(d1, d2, d3, d1 + 1.0D, d2 + 2.0D, d3 + 1.0D));
/* 33:47 */     if (localList.size() > 0) {
/* 34:48 */       return false;
/* 35:   */     }
/* 36:51 */     if (!paramaqu.isClient)
/* 37:   */     {
/* 38:52 */       paramaqu.g(localdt1);
/* 39:53 */       paramaqu.g(localdt2);
/* 40:   */       
/* 41:55 */       EntityArmorStand localadi = new EntityArmorStand(paramaqu, d1 + 0.5D, d2, d3 + 0.5D);
/* 42:56 */       float f = MathUtils.floor((MathUtils.wrapDegrees(paramahd.yaw - 180.0F) + 22.5F) / 45.0F) * 45.0F;
/* 43:57 */       localadi.setPositionAndAngles(d1 + 0.5D, d2, d3 + 0.5D, f, 0.0F);
/* 44:58 */       a(localadi, paramaqu.rng);
/* 45:59 */       NBTTagCompound localfn1 = paramamj.getTagCompound();
/* 46:60 */       if ((localfn1 != null) && (localfn1.hasKey("EntityTag", 10)))
/* 47:   */       {
/* 48:61 */         NBTTagCompound localfn2 = new NBTTagCompound();
/* 49:62 */         localadi.d(localfn2);
/* 50:63 */         localfn2.a(localfn1.getCompoundTag("EntityTag"));
/* 51:64 */         localadi.f(localfn2);
/* 52:   */       }
/* 53:66 */       paramaqu.spawnEntity(localadi);
/* 54:   */     }
/* 55:68 */     paramamj.stackSize -= 1;
/* 56:69 */     return true;
/* 57:   */   }
/* 58:   */   
/* 59:   */   private void a(EntityArmorStand paramadi, Random paramRandom)
/* 60:   */   {
/* 61:78 */     fa localfa1 = paramadi.s();
/* 62:79 */     float f1 = paramRandom.nextFloat() * 5.0F;
/* 63:80 */     float f2 = paramRandom.nextFloat() * 20.0F - 10.0F;
/* 64:81 */     fa localfa2 = new fa(localfa1.b() + f1, localfa1.c() + f2, localfa1.d());
/* 65:82 */     paramadi.a(localfa2);
/* 66:   */     
/* 67:84 */     localfa1 = paramadi.t();
/* 68:85 */     f1 = paramRandom.nextFloat() * 10.0F - 5.0F;
/* 69:86 */     localfa2 = new fa(localfa1.b(), localfa1.c() + f1, localfa1.d());
/* 70:87 */     paramadi.b(localfa2);
/* 71:   */   }
/* 72:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajq
 * JD-Core Version:    0.7.0.1
 */