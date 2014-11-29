package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class ajw
/*  4:   */   extends Item
/*  5:   */ {
/*  6:   */   public ajw()
/*  7:   */   {
/*  8:19 */     this.maxStackSize = 1;
/*  9:20 */     setTabToDisplayOn(CreativeTabs.tabTransport);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/* 13:   */   {
/* 14:25 */     float f1 = 1.0F;
/* 15:   */     
/* 16:27 */     float f2 = paramahd.lastPitch + (paramahd.pitch - paramahd.lastPitch) * f1;
/* 17:28 */     float f3 = paramahd.lastYaw + (paramahd.yaw - paramahd.lastYaw) * f1;
/* 18:   */     
/* 19:30 */     double d1 = paramahd.lastX + (paramahd.xPos - paramahd.lastX) * f1;
/* 20:31 */     double d2 = paramahd.lastY + (paramahd.yPos - paramahd.lastY) * f1 + paramahd.getEyeHeight();
/* 21:32 */     double d3 = paramahd.lastZ + (paramahd.zPos - paramahd.lastZ) * f1;
/* 22:   */     
/* 23:34 */     Vec3 localbrw1 = new Vec3(d1, d2, d3);
/* 24:   */     
/* 25:36 */     float f4 = MathUtils.cos(-f3 * 0.01745329F - 3.141593F);
/* 26:37 */     float f5 = MathUtils.sin(-f3 * 0.01745329F - 3.141593F);
/* 27:38 */     float f6 = -MathUtils.cos(-f2 * 0.01745329F);
/* 28:39 */     float f7 = MathUtils.sin(-f2 * 0.01745329F);
/* 29:   */     
/* 30:41 */     float f8 = f5 * f6;
/* 31:42 */     float f9 = f7;
/* 32:43 */     float f10 = f4 * f6;
/* 33:   */     
/* 34:45 */     double d4 = 5.0D;
/* 35:46 */     Vec3 localbrw2 = localbrw1.add(f8 * d4, f9 * d4, f10 * d4);
/* 36:47 */     HitResult localbru = paramaqu.a(localbrw1, localbrw2, true);
/* 37:48 */     if (localbru == null) {
/* 38:49 */       return paramamj;
/* 39:   */     }
/* 40:53 */     Vec3 localbrw3 = paramahd.d(f1);
/* 41:54 */     int i = 0;
/* 42:55 */     float f11 = 1.0F;
/* 43:56 */     List localList = paramaqu.b(paramahd, paramahd.getAABB().addCoord(localbrw3.x * d4, localbrw3.y * d4, localbrw3.z * d4).expand(f11, f11, f11));
/* 44:   */     Object localObject;
/* 45:57 */     for (int j = 0; j < localList.size(); j++)
/* 46:   */     {
/* 47:58 */       localObject = (Entity)localList.get(j);
/* 48:59 */       if (((Entity)localObject).ad())
/* 49:   */       {
/* 50:63 */         float f12 = ((Entity)localObject).ao();
/* 51:64 */         AABB localbrt = ((Entity)localObject).getAABB().expand(f12, f12, f12);
/* 52:65 */         if (localbrt.a(localbrw1)) {
/* 53:66 */           i = 1;
/* 54:   */         }
/* 55:   */       }
/* 56:   */     }
/* 57:69 */     if (i != 0) {
/* 58:70 */       return paramamj;
/* 59:   */     }
/* 60:73 */     if (localbru.a == brv.BLOCK)
/* 61:   */     {
/* 62:74 */       BlockPosition localdt = localbru.a();
/* 63:75 */       if (paramaqu.getBlock(localdt).getType() == BlockList.aH) {
/* 64:76 */         localdt = localdt.down();
/* 65:   */       }
/* 66:79 */       localObject = new EntityBoat(paramaqu, localdt.getX() + 0.5F, localdt.getY() + 1.0F, localdt.getZ() + 0.5F);
/* 67:80 */       ((EntityBoat)localObject).yaw = (((MathUtils.floor(paramahd.yaw * 4.0F / 360.0F + 0.5D) & 0x3) - 1) * 90);
/* 68:81 */       if (!paramaqu.getCollidingAABBs((Entity)localObject, ((EntityBoat)localObject).getAABB().expand(-0.1D, -0.1D, -0.1D)).isEmpty()) {
/* 69:82 */         return paramamj;
/* 70:   */       }
/* 71:84 */       if (!paramaqu.isClient) {
/* 72:85 */         paramaqu.spawnEntity((Entity)localObject);
/* 73:   */       }
/* 74:87 */       if (!paramahd.abilities.instabuild) {
/* 75:88 */         paramamj.stackSize -= 1;
/* 76:   */       }
/* 77:90 */       paramahd.increaseStat(StatList.J[Item.b(this)]);
/* 78:   */     }
/* 79:93 */     return paramamj;
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajw
 * JD-Core Version:    0.7.0.1
 */