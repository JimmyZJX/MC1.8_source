package net.minecraft.src;
/*   1:    */ import java.util.Arrays;
/*   3:    */ import org.apache.commons.lang3.ArrayUtils;
/*   4:    */ 
/*   5:    */ public class byf
/*   6:    */   extends buu
/*   7:    */ {
/*   8:    */   private final byj u;
/*   9:    */   private final bsu v;
/*  10:    */   private final buv[] w;
/*  11: 19 */   private int x = 0;
/*  12:    */   
/*  13:    */   public byf(byj parambyj, bsu parambsu)
/*  14:    */   {
/*  15: 22 */     super(parambsu, parambyj.l, parambyj.m, 63, parambyj.m - 32, 20);
/*  16: 23 */     this.u = parambyj;
/*  17: 24 */     this.v = parambsu;
/*  18:    */     
/*  19: 26 */     bsr[] arrayOfbsr1 = (bsr[])ArrayUtils.clone(parambsu.t.at);
/*  20: 27 */     this.w = new buv[arrayOfbsr1.length + bsr.c().size()];
/*  21:    */     
/*  22: 29 */     Arrays.sort(arrayOfbsr1);
/*  23:    */     
/*  24: 31 */     int i = 0;
/*  25: 32 */     Object localObject = null;
/*  26: 34 */     for (bsr localbsr : arrayOfbsr1)
/*  27:    */     {
/*  28: 35 */       String str = localbsr.e();
/*  29: 37 */       if (!str.equals(localObject))
/*  30:    */       {
/*  31: 38 */         localObject = str;
/*  32: 39 */         this.w[(i++)] = new byh(this, str);
/*  33:    */       }
/*  34: 42 */       int m = parambsu.k.a(cwc.a(localbsr.g(), new Object[0]));
/*  35: 43 */       if (m > this.x) {
/*  36: 44 */         this.x = m;
/*  37:    */       }
/*  38: 46 */       this.w[(i++)] = new byi(this, localbsr, null);
/*  39:    */     }
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected int b()
/*  43:    */   {
/*  44: 52 */     return this.w.length;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public buv b(int paramInt)
/*  48:    */   {
/*  49: 57 */     return this.w[paramInt];
/*  50:    */   }
/*  51:    */   
/*  52:    */   protected int d()
/*  53:    */   {
/*  54:161 */     return super.d() + 15;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public int c()
/*  58:    */   {
/*  59:166 */     return super.c() + 32;
/*  60:    */   }
				static bsu a(byf arg0) {return arg0.v;}
				static byj b(byf arg0) {return arg0.u;}
				static int c(byf arg0) {return arg0.h;}
/*  61:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     byf
 * JD-Core Version:    0.7.0.1
 */