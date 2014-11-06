package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*   2:    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
/*   3:    */ import java.util.Map;
/*   4:    */ 
/*   5:    */ class cwa
/*   6:    */   implements Runnable
/*   7:    */ {
				private final Map a;
				private final cvz b;
/*   8:    */   cwa(cvz paramcvz, Map paramMap) {a=paramMap;b=paramcvz;}
/*   9:    */   
/*  10:    */   public void run()
/*  11:    */   {
/*  12:111 */     if (this.a.containsKey(MinecraftProfileTexture.Type.SKIN)) {
/*  13:112 */       this.b.d.a((MinecraftProfileTexture)this.a.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, this.b.c);
/*  14:    */     }
/*  15:114 */     if (this.a.containsKey(MinecraftProfileTexture.Type.CAPE)) {
/*  16:115 */       this.b.d.a((MinecraftProfileTexture)this.a.get(MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, this.b.c);
/*  17:    */     }
/*  18:    */   }
/*  19:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cwa
 * JD-Core Version:    0.7.0.1
 */