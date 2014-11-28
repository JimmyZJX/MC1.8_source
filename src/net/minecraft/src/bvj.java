package net.minecraft.src;
/*   1:    */ import com.google.common.collect.ComparisonChain;
/*   2:    */ import com.mojang.authlib.GameProfile;
/*   3:    */ import java.util.Comparator;
/*   4:    */ 
/*   5:    */ class bvj
/*   6:    */   implements Comparator<ces>
/*   7:    */ {
/*   8:    */   public int compare(ces paramces1, ces paramces2)
/*   9:    */   {
/*  10:309 */     brz localbrz1 = paramces1.i();
/*  11:310 */     brz localbrz2 = paramces2.i();
/*  12:    */     
/*  13:312 */     return ComparisonChain.start().compareTrueFirst(paramces1.b() != EnumGameMode.SPECTATOR, paramces2.b() != EnumGameMode.SPECTATOR).compare(localbrz1 != null ? localbrz1.b() : "", localbrz2 != null ? localbrz2.b() : "").compare(paramces1.a().getName(), paramces2.a().getName()).result(); 
/*  14:    */   }
				bvj(bvi arg0) {}
/*  15:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bvj
 * JD-Core Version:    0.7.0.1
 */