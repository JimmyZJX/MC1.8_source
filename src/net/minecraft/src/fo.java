package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class fo
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final String a;
				private final NBTTagCompound b;
/*   6:    */   fo(NBTTagCompound paramfn, String paramString) {a=paramString;b=paramfn;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:320 */     return NBTBase.a[((NBTBase)NBTTagCompound.b(this.b).get(this.a)).a()];
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     fo
 * JD-Core Version:    0.7.0.1
 */