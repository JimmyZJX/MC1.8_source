package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class bqv
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final WorldInfo a;
/*   6:    */   bqv(WorldInfo parambqo) {a=parambqo;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:618 */     String str = "Unknown?";
/*  11:    */     try
/*  12:    */     {
/*  13:621 */       switch (WorldInfo.j(this.a))
/*  14:    */       {
/*  15:    */       case 19133: 
/*  16:623 */         str = "Anvil";
/*  17:624 */         break;
/*  18:    */       case 19132: 
/*  19:626 */         str = "McRegion";
/*  20:    */       }
/*  21:    */     }
/*  22:    */     catch (Throwable localThrowable) {}
/*  23:632 */     return String.format("0x%05X - %s", new Object[] { Integer.valueOf(WorldInfo.j(this.a)), str });
/*  24:    */   }
/*  25:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqv
 * JD-Core Version:    0.7.0.1
 */