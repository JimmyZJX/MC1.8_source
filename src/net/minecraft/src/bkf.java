package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Random;
/*   4:    */ 
/*   5:    */ public class bkf
/*   6:    */   extends bjp
/*   7:    */ {
/*   8:    */   public bkc b;
/*   9:    */   public List c;
/*  10:    */   public List d;
/*  11:314 */   public List e = Lists.newArrayList();
/*  12:    */   
/*  13:    */   public bkf() {}
/*  14:    */   
/*  15:    */   public bkf(Random paramRandom, int paramInt1, int paramInt2)
/*  16:    */   {
/*  17:321 */     super(paramRandom, paramInt1, paramInt2);
/*  18:    */     
/*  19:323 */     this.c = Lists.newArrayList();
/*  20:    */     
/*  21:324 */     for (bkc localbkc : bjn.b())
/*  22:    */     {
/*  23:325 */       localbkc.c = 0;
/*  24:326 */       this.c.add(localbkc);
/*  25:    */     }
/*  26:329 */     this.d = Lists.newArrayList();
/*  27:330 */     for (bkc localbkc : bjn.c())
/*  28:    */     {
/*  29:331 */       localbkc.c = 0;
/*  30:332 */       this.d.add(localbkc);
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void b(NBTTagCompound paramfn)
/*  35:    */   {
/*  36:338 */     super.b(paramfn);
/*  37:    */   }
/*  38:    */   
/*  39:    */   protected void a(NBTTagCompound paramfn)
/*  40:    */   {
/*  41:343 */     super.a(paramfn);
/*  42:    */   }
/*  43:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkf
 * JD-Core Version:    0.7.0.1
 */