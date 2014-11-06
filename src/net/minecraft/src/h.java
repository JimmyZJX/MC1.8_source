package net.minecraft.src;
/*   1:    */ import java.lang.management.ManagementFactory;
/*   2:    */ import java.lang.management.RuntimeMXBean;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.concurrent.Callable;
/*   5:    */ 
/*   6:    */ class h
/*   7:    */   implements Callable<String>
/*   8:    */ {
/*   9:    */   h(b paramb) {}
/*  10:    */   
/*  11:    */   public String call()
/*  12:    */   {
/*  13: 85 */     RuntimeMXBean localRuntimeMXBean = ManagementFactory.getRuntimeMXBean();
/*  14: 86 */     List<String> localList = localRuntimeMXBean.getInputArguments();
/*  15: 87 */     int i = 0;
/*  16: 88 */     StringBuilder localStringBuilder = new StringBuilder();
/*  17: 90 */     for (String str : localList) {
/*  18: 91 */       if (str.startsWith("-X"))
/*  19:    */       {
/*  20: 92 */         if (i++ > 0) {
/*  21: 93 */           localStringBuilder.append(" ");
/*  22:    */         }
/*  23: 96 */         localStringBuilder.append(str);
/*  24:    */       }
/*  25:    */     }
/*  26:100 */     return String.format("%d total; %s", new Object[] { Integer.valueOf(i), localStringBuilder.toString() });
/*  27:    */   }
/*  28:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     h
 * JD-Core Version:    0.7.0.1
 */