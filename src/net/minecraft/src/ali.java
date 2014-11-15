package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ 
/*   4:    */ public enum ali
/*   5:    */ { a(0, "", 0, 0.0f), b(0, "", 0, 0.0f), c(0, "", 0, 0.0f), d(0, "", 0, 0.0f); // TODO: BROKEN
/*   6:    */   private static final Map<Integer, ali> e;
/*   7:    */   private final int f;
/*   8:    */   private final String g;
/*   9:    */   private final int h;
/*  10:    */   private final float i;
/*  11:    */   private final int j;
/*  12:    */   private final float k;
/*  13: 96 */   private boolean l = false;
/*  14:    */   
/*  15:    */   static
/*  16:    */   {
/*  17: 89 */     e = Maps.newHashMap();
/*  18: 99 */     for (ali localali : values()) {
/*  19:100 */       e.put(Integer.valueOf(localali.a()), localali);
/*  20:    */     }
/*  21:    */   }
/*  22:    */   
/*  23:    */   private ali(int paramInt1, String paramString, int paramInt2, float paramFloat1, int paramInt3, float paramFloat2)
/*  24:    */   {
/*  25:105 */     this.f = paramInt1;
/*  26:106 */     this.g = paramString;
/*  27:107 */     this.h = paramInt2;
/*  28:108 */     this.i = paramFloat1;
/*  29:109 */     this.j = paramInt3;
/*  30:110 */     this.k = paramFloat2;
/*  31:111 */     this.l = true;
/*  32:    */   }
/*  33:    */   
/*  34:    */   private ali(int paramInt1, String paramString, int paramInt2, float paramFloat)
/*  35:    */   {
/*  36:115 */     this.f = paramInt1;
/*  37:116 */     this.g = paramString;
/*  38:117 */     this.h = paramInt2;
/*  39:118 */     this.i = paramFloat;
/*  40:119 */     this.j = 0;
/*  41:120 */     this.k = 0.0F;
/*  42:121 */     this.l = false;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public int a()
/*  46:    */   {
/*  47:125 */     return this.f;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String b()
/*  51:    */   {
/*  52:129 */     return this.g;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public int c()
/*  56:    */   {
/*  57:133 */     return this.h;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public float d()
/*  61:    */   {
/*  62:137 */     return this.i;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public int e()
/*  66:    */   {
/*  67:141 */     return this.j;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public float f()
/*  71:    */   {
/*  72:145 */     return this.k;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean g()
/*  76:    */   {
/*  77:149 */     return this.l;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public static ali a(int paramInt)
/*  81:    */   {
/*  82:153 */     ali localali = (ali)e.get(Integer.valueOf(paramInt));
/*  83:155 */     if (localali == null) {
/*  84:156 */       return a;
/*  85:    */     }
/*  86:158 */     return localali;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public static ali a(ItemStack paramamj)
/*  90:    */   {
/*  91:163 */     if ((paramamj.getItem() instanceof ItemFish)) {
/*  92:164 */       return a(paramamj.getDamage2());
/*  93:    */     }
/*  94:166 */     return a;
/*  95:    */   }
/*  96:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ali
 * JD-Core Version:    0.7.0.1
 */