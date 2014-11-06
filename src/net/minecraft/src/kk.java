package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ 
/*   3:    */ public class kk
/*   4:    */ {
/*   5:    */   private final int b;
/*   6:    */   private final EnumGameType c;
/*   7:    */   private final GameProfile d;
/*   8:    */   private final ho e;
/*   9:    */   
/*  10:    */   public kk(kh paramkh, GameProfile paramGameProfile, int paramInt, EnumGameType paramarc, ho paramho)
/*  11:    */   {
/*  12:179 */     this.d = paramGameProfile;
/*  13:180 */     this.b = paramInt;
/*  14:181 */     this.c = paramarc;
/*  15:182 */     this.e = paramho;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public GameProfile a()
/*  19:    */   {
/*  20:186 */     return this.d;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public int b()
/*  24:    */   {
/*  25:190 */     return this.b;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public EnumGameType c()
/*  29:    */   {
/*  30:194 */     return this.c;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public ho d()
/*  34:    */   {
/*  35:199 */     return this.e;
/*  36:    */   }
/*  37:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kk
 * JD-Core Version:    0.7.0.1
 */