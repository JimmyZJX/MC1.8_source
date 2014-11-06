package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*   2:    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
/*   3:    */ 
/*   4:    */ class cet
/*   5:    */   implements cwb
/*   6:    */ {
				private final ces a;
/*   7:    */   cet(ces paramces) {a=paramces;}
/*   8:    */   
/*   9:    */   public void a(MinecraftProfileTexture.Type paramType, oa paramoa, MinecraftProfileTexture paramMinecraftProfileTexture)
/*  10:    */   {
/*  11:109 */     switch (ceu.a[paramType.ordinal()])
/*  12:    */     {
/*  13:    */     case 1: 
/*  14:111 */       ces.a(this.a, paramoa);
/*  15:112 */       ces.a(this.a, paramMinecraftProfileTexture.getMetadata("model"));
/*  16:113 */       if (ces.a(this.a) == null) {
/*  17:115 */         ces.a(this.a, "default");
/*  18:    */       }
/*  19:    */       break;
/*  20:    */     case 2: 
/*  21:119 */       ces.b(this.a, paramoa);
/*  22:    */     }
/*  23:    */   }
/*  24:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cet
 * JD-Core Version:    0.7.0.1
 */