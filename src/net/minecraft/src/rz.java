package net.minecraft.src;
/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ import com.mojang.authlib.ProfileLookupCallback;
/*  3:   */ 
/*  4:   */ final class rz
/*  5:   */   implements ProfileLookupCallback
/*  6:   */ {
			  private final GameProfile[] a;
/*  7:   */   rz(GameProfile[] paramArrayOfGameProfile) {a=paramArrayOfGameProfile;}
/*  8:   */   
/*  9:   */   public void onProfileLookupSucceeded(GameProfile paramGameProfile)
/* 10:   */   {
/* 11:50 */     this.a[0] = paramGameProfile;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void onProfileLookupFailed(GameProfile paramGameProfile, Exception paramException)
/* 15:   */   {
/* 16:55 */     this.a[0] = null;
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     rz
 * JD-Core Version:    0.7.0.1
 */