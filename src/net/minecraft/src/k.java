package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ final class k
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final int a;
				private final ProtoBlock b;
/*   6:    */   k(int paramInt, ProtoBlock paramatr) {a=paramInt;b=paramatr;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:    */     try
/*  11:    */     {
/*  12:170 */       return String.format("ID #%d (%s // %s)", new Object[] { Integer.valueOf(this.a), this.b.a(), this.b.getClass().getCanonicalName() });
/*  13:    */     }
/*  14:    */     catch (Throwable localThrowable) {}
/*  15:172 */     return "ID #" + this.a;
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     k
 * JD-Core Version:    0.7.0.1
 */