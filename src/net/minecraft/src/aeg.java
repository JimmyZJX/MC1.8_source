package net.minecraft.src;
/*  1:   */ public class aeg
/*  2:   */   extends adx
/*  3:   */ {
/*  4:   */   public aeg(World paramaqu)
/*  5:   */   {
/*  6: 8 */     super(paramaqu);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public aeg(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/* 10:   */   {
/* 11:12 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public boolean e(EntityPlayer paramahd)
/* 15:   */   {
/* 16:17 */     if ((this.rider != null) && ((this.rider instanceof EntityPlayer)) && (this.rider != paramahd)) {
/* 17:18 */       return true;
/* 18:   */     }
/* 19:20 */     if ((this.rider != null) && (this.rider != paramahd)) {
/* 20:21 */       return false;
/* 21:   */     }
/* 22:23 */     if (!this.world.isClient) {
/* 23:24 */       paramahd.mount(this);
/* 24:   */     }
/* 25:27 */     return true;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/* 29:   */   {
/* 30:32 */     if (paramBoolean)
/* 31:   */     {
/* 32:33 */       if (this.rider != null) {
/* 33:34 */         this.rider.mount((Entity)null);
/* 34:   */       }
/* 35:36 */       if (q() == 0)
/* 36:   */       {
/* 37:37 */         k(-r());
/* 38:38 */         j(10);
/* 39:39 */         a(50.0F);
/* 40:40 */         ac();
/* 41:   */       }
/* 42:   */     }
/* 43:   */   }
/* 44:   */   
/* 45:   */   public EnumMinecartVariant s()
/* 46:   */   {
/* 47:47 */     return EnumMinecartVariant.a;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aeg
 * JD-Core Version:    0.7.0.1
 */