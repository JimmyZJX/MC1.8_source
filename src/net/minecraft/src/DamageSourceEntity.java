package net.minecraft.src;
/*  1:   */ public class DamageSourceEntity
/*  2:   */   extends DamageSource
/*  3:   */ {
/*  4:   */   protected Entity entity;
/*  5:13 */   private boolean r = false;
/*  6:   */   
/*  7:   */   public DamageSourceEntity(String paramString, Entity paramwv)
/*  8:   */   {
/*  9:16 */     super(paramString);
/* 10:17 */     this.entity = paramwv;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public DamageSourceEntity v()
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
/* 24:   */   public Entity getAttacker()
/* 25:   */   {
/* 26:31 */     return this.entity;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public ho b(EntityLiving paramxm)
/* 30:   */   {
/* 31:36 */     ItemStack weapon = (this.entity instanceof EntityLiving) ? ((EntityLiving)this.entity).getHeldItemStack() : null;
/* 32:37 */     String str1 = "death.attack." + this.p;
/* 33:38 */     String str2 = str1 + ".item";
/* 34:40 */     if ((weapon != null) && (weapon.s()) && (fi.c(str2))) {
/* 35:41 */       return new hz(str2, new Object[] { paramxm.e_(), this.entity.e_(), weapon.C() });
/* 36:   */     }
/* 37:43 */     return new hz(str1, new Object[] { paramxm.e_(), this.entity.e_() });
/* 38:   */   }
/* 39:   */   
/* 40:   */   public boolean r()
/* 41:   */   {
/* 42:49 */     return (this.entity != null) && ((this.entity instanceof EntityLiving)) && (!(this.entity instanceof EntityPlayer));
/* 43:   */   }
/* 44:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wi
 * JD-Core Version:    0.7.0.1
 */