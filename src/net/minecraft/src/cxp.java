package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.Collections;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class cxp
/*  6:   */ {
/*  7:65 */   private List<cxq> a = Lists.newArrayList();
/*  8:   */   
/*  9:   */   public cxp a(cxe paramcxe, int paramInt)
/* 10:   */   {
/* 11:68 */     this.a.add(new cxq(paramcxe, paramInt));
/* 12:   */     
/* 13:70 */     return this;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public cxo a()
/* 17:   */   {
/* 18:74 */     Collections.sort(this.a);
/* 19:75 */     return new cxo(this.a);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public cxe b()
/* 23:   */   {
/* 24:79 */     return ((cxq)this.a.get(0)).b;
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxp
 * JD-Core Version:    0.7.0.1
 */