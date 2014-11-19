package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.Map;
/*   4:    */ 
/*   5:    */ public enum EnumAxis
/*   6:    */   implements Predicate<EnumDirection>, va
/*   7:    */ { X("x",en.HORIZONTAL),Y("y",en.VERTICAL),Z("z",en.HORIZONTAL);
/*   8:    */   private static final Map<String,EnumAxis> d;
/*   9:    */   private final String e;
/*  10:    */   private final en f;
/*  11:    */   
/*  12:    */   static
/*  13:    */   {
/*  14:312 */     d = Maps.newHashMap();
/*  15:318 */     for (EnumAxis localel : values()) {
/*  16:319 */       d.put(localel.a().toLowerCase(), localel);
/*  17:    */     }
/*  18:    */   }
/*  19:    */   
/*  20:    */   private EnumAxis(String paramString, en paramen)
/*  21:    */   {
/*  22:324 */     this.e = paramString;
/*  23:325 */     this.f = paramen;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public static EnumAxis a(String paramString)
/*  27:    */   {
/*  28:330 */     if (paramString == null) {
/*  29:331 */       return null;
/*  30:    */     }
/*  31:333 */     return (EnumAxis)d.get(paramString.toLowerCase());
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String a()
/*  35:    */   {
/*  36:337 */     return this.e;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public boolean b()
/*  40:    */   {
/*  41:341 */     return this.f == en.VERTICAL;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean c()
/*  45:    */   {
/*  46:345 */     return this.f == en.HORIZONTAL;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public String toString()
/*  50:    */   {
/*  51:350 */     return this.e;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public boolean apply(EnumDirection paramej)
/*  55:    */   {
/*  56:355 */     return (paramej != null) && (paramej.k() == this);
/*  57:    */   }
/*  58:    */   
/*  59:    */   public en d()
/*  60:    */   {
/*  61:359 */     return this.f;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public String toString2()
/*  65:    */   {
/*  66:364 */     return this.e;
/*  67:    */   }
/*  68:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     el
 * JD-Core Version:    0.7.0.1
 */