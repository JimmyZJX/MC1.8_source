package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class cer
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final cen a;
/*   6:    */   cer(cen paramcen) {a=paramcen;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:334 */     return cen.c(this.a).F() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cer
 * JD-Core Version:    0.7.0.1
 */