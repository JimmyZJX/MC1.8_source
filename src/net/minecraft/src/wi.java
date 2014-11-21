package net.minecraft.src;
/*  1:   */ public class wi
/*  2:   */   extends DamageSource
/*  3:   */ {
/*  4:   */   protected Entity q;
/*  5:13 */   private boolean r = false;
/*  6:   */   
/*  7:   */   public wi(String paramString, Entity paramwv)
/*  8:   */   {
/*  9:16 */     super(paramString);
/* 10:17 */     this.q = paramwv;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public wi v()
/* 14:   */   {
/* 15:21 */     this.r = true;
/* 16:22 */     return this;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public boolean w()
/* 20:   */   {
/* 21:26 */     return this.r;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public Entity j()
/* 25:   */   {
/* 26:31 */     return this.q;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public ho b(EntityLiving paramxm)
/* 30:   */   {
/* 31:36 */     ItemStack localObject = (this.q instanceof EntityLiving) ? ((EntityLiving)this.q).getHeldItemStack() : null;
/* 32:37 */     String str1 = "death.attack." + this.p;
/* 33:38 */     String str2 = str1 + ".item";
/* 34:40 */     if ((localObject != null) && (localObject.s()) && (fi.c(str2))) {
/* 35:41 */       return new hz(str2, new Object[] { paramxm.e_(), this.q.e_(), localObject.C() });
/* 36:   */     }
/* 37:43 */     return new hz(str1, new Object[] { paramxm.e_(), this.q.e_() });
/* 38:   */   }
/* 39:   */   
/* 40:   */   public boolean r()
/* 41:   */   {
/* 42:49 */     return (this.q != null) && ((this.q instanceof EntityLiving)) && (!(this.q instanceof EntityPlayer));
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wi
 * JD-Core Version:    0.7.0.1
 */