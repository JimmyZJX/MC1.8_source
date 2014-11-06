package net.minecraft.src;
/*    1:     */ import java.util.concurrent.Callable;
/*    2:     */ 
/*    3:     */ class cjl
/*    4:     */   implements Callable<String>
/*    5:     */ {
				  private final buf a;
				  private final cji b;
/*    6:     */   cjl(cji paramcji, buf parambuf) {a=parambuf;b=paramcji;}
/*    7:     */   
/*    8:     */   public String call()
/*    9:     */   {
/*   10:1042 */     return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", new Object[] { Integer.valueOf(this.a.a()), Integer.valueOf(this.a.b()), Integer.valueOf(cji.a(this.b).d), Integer.valueOf(cji.a(this.b).e), Integer.valueOf(this.a.e()) });
/*   11:     */   }
/*   12:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cjl
 * JD-Core Version:    0.7.0.1
 */