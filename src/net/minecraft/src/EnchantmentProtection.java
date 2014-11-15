package net.minecraft.src;
/*   1:    */ public class EnchantmentProtection
/*   2:    */   extends Enchantment
/*   3:    */ {
/*   4: 15 */   private static final String[] E = { "all", "fire", "fall", "explosion", "projectile" };
/*   5: 19 */   private static final int[] F = { 1, 10, 5, 5, 3 };
/*   6: 23 */   private static final int[] G = { 11, 8, 6, 8, 6 };
/*   7: 27 */   private static final int[] H = { 20, 12, 10, 12, 15 };
/*   8:    */   public final int a;
/*   9:    */   
/*  10:    */   public EnchantmentProtection(int paramInt1, oa paramoa, int paramInt2, int paramInt3)
/*  11:    */   {
/*  12: 34 */     super(paramInt1, paramoa, paramInt2, apg.b);
/*  13: 35 */     this.a = paramInt3;
/*  14: 37 */     if (paramInt3 == 2) {
/*  15: 38 */       this.C = apg.c;
/*  16:    */     }
/*  17:    */   }
/*  18:    */   
/*  19:    */   public int a(int paramInt)
/*  20:    */   {
/*  21: 44 */     return F[this.a] + (paramInt - 1) * G[this.a];
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int b(int paramInt)
/*  25:    */   {
/*  26: 49 */     return a(paramInt) + H[this.a];
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int b()
/*  30:    */   {
/*  31: 54 */     return 4;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public int a(int paramInt, DamageSource paramwh)
/*  35:    */   {
/*  36: 59 */     if (paramwh.g()) {
/*  37: 60 */       return 0;
/*  38:    */     }
/*  39: 63 */     float f = (6 + paramInt * paramInt) / 3.0F;
/*  40: 65 */     if (this.a == 0) {
/*  41: 66 */       return MathUtils.floor(f * 0.75F);
/*  42:    */     }
/*  43: 68 */     if ((this.a == 1) && (paramwh.o())) {
/*  44: 69 */       return MathUtils.floor(f * 1.25F);
/*  45:    */     }
/*  46: 71 */     if ((this.a == 2) && (paramwh == DamageSource.i)) {
/*  47: 72 */       return MathUtils.floor(f * 2.5F);
/*  48:    */     }
/*  49: 74 */     if ((this.a == 3) && (paramwh.c())) {
/*  50: 75 */       return MathUtils.floor(f * 1.5F);
/*  51:    */     }
/*  52: 77 */     if ((this.a == 4) && (paramwh.a())) {
/*  53: 78 */       return MathUtils.floor(f * 1.5F);
/*  54:    */     }
/*  55: 80 */     return 0;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public String a()
/*  59:    */   {
/*  60: 85 */     return "enchantment.protect." + E[this.a];
/*  61:    */   }
/*  62:    */   
/*  63:    */   public boolean a(Enchantment paramapf)
/*  64:    */   {
/*  65: 90 */     if ((paramapf instanceof EnchantmentProtection))
/*  66:    */     {
/*  67: 91 */       EnchantmentProtection localapu = (EnchantmentProtection)paramapf;
/*  68: 93 */       if (localapu.a == this.a) {
/*  69: 94 */         return false;
/*  70:    */       }
/*  71: 96 */       if ((this.a == 2) || (localapu.a == 2)) {
/*  72: 97 */         return true;
/*  73:    */       }
/*  74: 99 */       return false;
/*  75:    */     }
/*  76:101 */     return super.a(paramapf);
/*  77:    */   }
/*  78:    */   
/*  79:    */   public static int a(Entity paramwv, int paramInt)
/*  80:    */   {
/*  81:105 */     int i = aph.a(Enchantment.d.B, paramwv.at());
/*  82:107 */     if (i > 0) {
/*  83:108 */       paramInt -= MathUtils.floor(paramInt * (i * 0.15F));
/*  84:    */     }
/*  85:111 */     return paramInt;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public static double a(Entity paramwv, double paramDouble)
/*  89:    */   {
/*  90:115 */     int i = aph.a(Enchantment.f.B, paramwv.at());
/*  91:117 */     if (i > 0) {
/*  92:118 */       paramDouble -= MathUtils.floor(paramDouble * (i * 0.15F));
/*  93:    */     }
/*  94:121 */     return paramDouble;
/*  95:    */   }
/*  96:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     apu
 * JD-Core Version:    0.7.0.1
 */