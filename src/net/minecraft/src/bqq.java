package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class bqq
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final WorldInfo a;
/*   6:    */   bqq(WorldInfo parambqo) {a=parambqo;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:583 */     return String.format("ID %02d - %s, ver %d. Features enabled: %b", new Object[] { Integer.valueOf(WorldInfo.a(this.a).g()), WorldInfo.a(this.a).a(), Integer.valueOf(WorldInfo.a(this.a).d()), Boolean.valueOf(WorldInfo.b(this.a)) });
/*  11:    */   }
/*  12:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqq
 * JD-Core Version:    0.7.0.1
 */