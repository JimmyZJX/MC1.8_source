package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class cmm
/*   4:    */ {
/*   5:    */   private final String a;
/*   6:    */   private final List<cmk> b;
/*   7:    */   
/*   8:    */   public cmm(String paramString, List<cmk> paramList)
/*   9:    */   {
/*  10: 80 */     this.a = paramString;
/*  11: 81 */     this.b = paramList;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public List<cmk> b()
/*  15:    */   {
/*  16: 89 */     return this.b;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public boolean equals(Object paramObject)
/*  20:    */   {
/*  21: 94 */     if (this == paramObject) {
/*  22: 95 */       return true;
/*  23:    */     }
/*  24: 97 */     if (!(paramObject instanceof cmm)) {
/*  25: 98 */       return false;
/*  26:    */     }
/*  27:101 */     cmm localcmm = (cmm)paramObject;
/*  28:103 */     if (!this.a.equals(localcmm.a)) {
/*  29:104 */       return false;
/*  30:    */     }
/*  31:106 */     if (!this.b.equals(localcmm.b)) {
/*  32:107 */       return false;
/*  33:    */     }
/*  34:110 */     return true;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public int hashCode()
/*  38:    */   {
/*  39:115 */     int i = this.a.hashCode();
/*  40:116 */     i = 31 * i + this.b.hashCode();
/*  41:117 */     return i;
/*  42:    */   }
				static String a(cmm arg0) {return arg0.a;}
/*  43:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmm
 * JD-Core Version:    0.7.0.1
 */