package net.minecraft.src;
/*  1:   */ public class amp
/*  2:   */   extends Item
/*  3:   */ {
/*  4:14 */   private static final eo a = new amq();
/*  5:   */   private final EnumMinecartVariant b;
/*  6:   */   
/*  7:   */   public amp(EnumMinecartVariant paramadz)
/*  8:   */   {
/*  9:70 */     this.maxStackSize = 1;
/* 10:71 */     this.b = paramadz;
/* 11:72 */     setTabToDisplayOn(CreativeTabs.tabTransport);
/* 12:73 */     ave.M.a(this, a);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 16:   */   {
/* 17:78 */     Block localbec = paramaqu.getBlock(paramdt);
/* 18:79 */     if (ati.d(localbec))
/* 19:   */     {
/* 20:80 */       if (!paramaqu.isClient)
/* 21:   */       {
/* 22:81 */         EnumRailState localatl = (localbec.getType() instanceof ati) ? (EnumRailState)localbec.getData(((ati)localbec.getType()).l()) : EnumRailState.a;
/* 23:82 */         double d = 0.0D;
/* 24:83 */         if (localatl.c()) {
/* 25:84 */           d = 0.5D;
/* 26:   */         }
/* 27:86 */         adx localadx = adx.a(paramaqu, paramdt.getX() + 0.5D, paramdt.getY() + 0.0625D + d, paramdt.getZ() + 0.5D, this.b);
/* 28:87 */         if (paramamj.s()) {
/* 29:88 */           localadx.a(paramamj.q());
/* 30:   */         }
/* 31:90 */         paramaqu.spawnEntity(localadx);
/* 32:   */       }
/* 33:92 */       paramamj.stackSize -= 1;
/* 34:93 */       return true;
/* 35:   */     }
/* 36:95 */     return false;
/* 37:   */   }
			  static EnumMinecartVariant a(amp arg0) {return arg0.b;}
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amp
 * JD-Core Version:    0.7.0.1
 */