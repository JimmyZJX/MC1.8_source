package net.minecraft.src;
/*   1:    */ import java.util.concurrent.Callable;
/*   2:    */ 
/*   3:    */ class aqw
/*   4:    */   implements Callable<String>
/*   5:    */ {
				private final ProtoBlock a;
				private final World b;
/*   6:    */   aqw(World paramaqu, ProtoBlock paramatr) {a=paramatr;b=paramaqu;}
/*   7:    */   
/*   8:    */   public String call()
/*   9:    */   {
/*  10:    */     try
/*  11:    */     {
/*  12:436 */       return String.format("ID #%d (%s // %s)", new Object[] { Integer.valueOf(ProtoBlock.a(this.a)), this.a.a(), this.a.getClass().getCanonicalName() });
/*  13:    */     }
/*  14:    */     catch (Throwable localThrowable) {}
/*  15:438 */     return "ID #" + ProtoBlock.a(this.a);
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqw
 * JD-Core Version:    0.7.0.1
 */