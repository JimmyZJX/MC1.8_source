package net.minecraft.src;
/*  1:   */ import com.google.common.cache.CacheLoader;
/*  2:   */ import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*  4:   */ import java.util.Map;
/*  5:   */ 
/*  6:   */ class cvx
/*  7:   */   extends CacheLoader<GameProfile,Map<MinecraftProfileTexture.Type,MinecraftProfileTexture>>
/*  8:   */ {
/*  9:   */   cvx(cvw paramcvw) {}
/* 10:   */   
/* 11:   */   public Map<MinecraftProfileTexture.Type,MinecraftProfileTexture> load(GameProfile paramGameProfile)
/* 12:   */   {
/* 13:47 */     return bsu.z().Y().getTextures(paramGameProfile, false);
/* 14:   */   }
/* 15:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvx
 * JD-Core Version:    0.7.0.1
 */