package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ 
/*  3:   */ public class cap
/*  4:   */   implements caw
/*  5:   */ {
/*  6:   */   private final GameProfile a;
/*  7:   */   private final oa b;
/*  8:   */   
/*  9:   */   public cap(GameProfile paramGameProfile)
/* 10:   */   {
/* 11:19 */     this.a = paramGameProfile;
/* 12:20 */     this.b = cil.c(paramGameProfile.getName());
/* 13:   */     
/* 14:22 */     cil.a(this.b, paramGameProfile.getName());
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(car paramcar)
/* 18:   */   {
/* 19:27 */     bsu.z().t().a(new mw(this.a.getId()));
/* 20:   */   }
/* 21:   */   
/* 22:   */   public ho z_()
/* 23:   */   {
/* 24:32 */     return new hy(this.a.getName());
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(float paramFloat, int paramInt)
/* 28:   */   {
/* 29:37 */     bsu.z().N().a(this.b);
/* 30:38 */     cjm.c(1.0F, 1.0F, 1.0F, paramInt / 255.0F);
/* 31:39 */     bub.a(2, 2, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
/* 32:40 */     bub.a(2, 2, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
/* 33:   */   }
/* 34:   */   
/* 35:   */   public boolean A_()
/* 36:   */   {
/* 37:45 */     return true;
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cap
 * JD-Core Version:    0.7.0.1
 */