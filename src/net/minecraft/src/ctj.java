package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ 
/*   4:    */ public enum ctj
/*   5:    */ { a("vertex",".vsh",dax.n),b("fragment",".fsh",dax.o);
/*   6:    */   private final String c;
/*   7:    */   private final String d;
/*   8:    */   private final int e;
/*   9: 94 */   private final Map f = Maps.newHashMap();
/*  10:    */   
/*  11:    */   private ctj(String paramString1, String paramString2, int paramInt)
/*  12:    */   {
/*  13: 97 */     this.c = paramString1;
/*  14: 98 */     this.d = paramString2;
/*  15: 99 */     this.e = paramInt;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public String a()
/*  19:    */   {
/*  20:103 */     return this.c;
/*  21:    */   }
/*  22:    */   
/*  23:    */   protected String b()
/*  24:    */   {
/*  25:107 */     return this.d;
/*  26:    */   }
/*  27:    */   
/*  28:    */   protected int c()
/*  29:    */   {
/*  30:111 */     return this.e;
/*  31:    */   }
/*  32:    */   
/*  33:    */   protected Map d()
/*  34:    */   {
/*  35:115 */     return this.f;
/*  36:    */   }
/*  37:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ctj
 * JD-Core Version:    0.7.0.1
 */