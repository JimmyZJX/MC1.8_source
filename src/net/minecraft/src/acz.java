package net.minecraft.src;
/*  1:   */ public class acz
/*  2:   */   extends Entity
/*  3:   */ {
/*  4:   */   public final acy a;
/*  5:   */   public final String b;
/*  6:   */   
/*  7:   */   public acz(acy paramacy, String paramString, float paramFloat1, float paramFloat2)
/*  8:   */   {
/*  9:12 */     super(paramacy.a());
/* 10:13 */     a(paramFloat1, paramFloat2);
/* 11:14 */     this.a = paramacy;
/* 12:15 */     this.b = paramString;
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected void h() {}
/* 16:   */   
/* 17:   */   protected void readEntityFromNBT(NBTTagCompound paramfn) {}
/* 18:   */   
/* 19:   */   protected void writeEntityToNBT(NBTTagCompound paramfn) {}
/* 20:   */   
/* 21:   */   public boolean ad()
/* 22:   */   {
/* 23:32 */     return true;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public boolean a(DamageSource paramwh, float paramFloat)
/* 27:   */   {
/* 28:37 */     if (isImmuneTo(paramwh)) {
/* 29:38 */       return false;
/* 30:   */     }
/* 31:40 */     return this.a.a(this, paramwh, paramFloat);
/* 32:   */   }
/* 33:   */   
/* 34:   */   public boolean k(Entity paramwv)
/* 35:   */   {
/* 36:45 */     return (this == paramwv) || (this.a == paramwv);
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     acz
 * JD-Core Version:    0.7.0.1
 */