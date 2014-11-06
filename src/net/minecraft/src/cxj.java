package net.minecraft.src;
/*   2:    */ import java.util.Set;
/*   3:    */ 
/*   4:    */ class cxj
/*   5:    */   implements cts
/*   6:    */ {
				private final Set<oa> a;
				private final cxh b;
/*   7:    */   cxj(cxh paramcxh, Set<oa> paramSet) {a=paramSet;b=paramcxh;}
/*   8:    */   
/*   9:    */   public void a(cua paramcua)
/*  10:    */   {
/*  11:546 */     for (oa localoa : this.a)
/*  12:    */     {
/*  13:547 */       cue localcue = paramcua.a(localoa);
/*  14:548 */       cxh.a(this.b).put(localoa, localcue);
/*  15:    */     }
/*  16:    */   }
/*  17:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxj
 * JD-Core Version:    0.7.0.1
 */