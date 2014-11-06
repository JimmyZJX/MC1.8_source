package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ 
/*   4:    */ class cyn
/*   5:    */   implements Runnable
/*   6:    */ {
				private final cyk a;
/*   7:    */   cyn(cyk paramcyk) {a=paramcyk;}
/*   8:    */   
/*   9:    */   public void run()
/*  10:    */   {
/*  11:316 */     ArrayList<qw> localArrayList = Lists.newArrayList(this.a.an().e);
/*  12:317 */     for (qw localqw : localArrayList) {
/*  13:318 */       this.a.an().e(localqw);
/*  14:    */     }
/*  15:    */   }
/*  16:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cyn
 * JD-Core Version:    0.7.0.1
 */