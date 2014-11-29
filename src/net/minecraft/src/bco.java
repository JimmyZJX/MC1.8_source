package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class bco
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final bcm a;
/*   6:    */   bco(bcm parambcm) {a=parambcm;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:199 */     int i = BlockType.a(this.a.world.getBlock(this.a.pos).getType());
/*  11:    */     try
/*  12:    */     {
/*  13:201 */       return String.format("ID #%d (%s // %s)", new Object[] { Integer.valueOf(i), BlockType.c(i).a(), BlockType.c(i).getClass().getCanonicalName() });
/*  14:    */     }
/*  15:    */     catch (Throwable localThrowable) {}
/*  16:203 */     return "ID #" + i;
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bco
 * JD-Core Version:    0.7.0.1
 */