package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class tk
/*   4:    */   extends PlayerStat
/*   5:    */ {
/*   6:    */   public final int a;
/*   7:    */   public final int b;
/*   8:    */   public final tk c;
/*   9:    */   private final String k;
/*  10:    */   private tm l;
/*  11:    */   public final ItemStack d;
/*  12:    */   private boolean m;
/*  13:    */   
/*  14:    */   public tk(String paramString1, String paramString2, int paramInt1, int paramInt2, Item paramalq, tk paramtk)
/*  15:    */   {
/*  16: 20 */     this(paramString1, paramString2, paramInt1, paramInt2, new ItemStack(paramalq), paramtk);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public tk(String paramString1, String paramString2, int paramInt1, int paramInt2, BlockType paramatr, tk paramtk)
/*  20:    */   {
/*  21: 24 */     this(paramString1, paramString2, paramInt1, paramInt2, new ItemStack(paramatr), paramtk);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public tk(String paramString1, String paramString2, int paramInt1, int paramInt2, ItemStack paramamj, tk paramtk)
/*  25:    */   {
/*  26: 28 */     super(paramString1, new hz("achievement." + paramString2, new Object[0]));
/*  27: 29 */     this.d = paramamj;
/*  28:    */     
/*  29: 31 */     this.k = ("achievement." + paramString2 + ".desc");
/*  30: 32 */     this.a = paramInt1;
/*  31: 33 */     this.b = paramInt2;
/*  32: 35 */     if (paramInt1 < AchievementList.a) {
/*  33: 36 */       AchievementList.a = paramInt1;
/*  34:    */     }
/*  35: 38 */     if (paramInt2 < AchievementList.b) {
/*  36: 39 */       AchievementList.b = paramInt2;
/*  37:    */     }
/*  38: 41 */     if (paramInt1 > AchievementList.c) {
/*  39: 42 */       AchievementList.c = paramInt1;
/*  40:    */     }
/*  41: 44 */     if (paramInt2 > AchievementList.d) {
/*  42: 45 */       AchievementList.d = paramInt2;
/*  43:    */     }
/*  44: 47 */     this.c = paramtk;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public tk a()
/*  48:    */   {
/*  49: 52 */     this.f = true;
/*  50: 53 */     return this;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public tk b()
/*  54:    */   {
/*  55: 57 */     this.m = true;
/*  56: 58 */     return this;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public tk c()
/*  60:    */   {
/*  61: 63 */     super.h();
/*  62:    */     
/*  63: 65 */     AchievementList.e.add(this);
/*  64:    */     
/*  65: 67 */     return this;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public boolean d()
/*  69:    */   {
/*  70: 72 */     return true;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public ho e()
/*  74:    */   {
/*  75: 77 */     ho localho = super.e();
/*  76: 78 */     localho.b().a(g() ? net.minecraft.src.a.f : net.minecraft.src.a.k);
/*  77: 79 */     return localho;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public tk a(Class paramClass)
/*  81:    */   {
/*  82: 84 */     return (tk)super.b(paramClass);
/*  83:    */   }
/*  84:    */   
/*  85:    */   public String f()
/*  86:    */   {
/*  87: 88 */     if (this.l != null) {
/*  88: 89 */       return this.l.a(fi.a(this.k));
/*  89:    */     }
/*  90: 91 */     return fi.a(this.k);
/*  91:    */   }
/*  92:    */   
/*  93:    */   public tk a(tm paramtm)
/*  94:    */   {
/*  95: 95 */     this.l = paramtm;
/*  96: 96 */     return this;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public boolean g()
/* 100:    */   {
/* 101:100 */     return this.m;
/* 102:    */   }
/* 103:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     tk
 * JD-Core Version:    0.7.0.1
 */