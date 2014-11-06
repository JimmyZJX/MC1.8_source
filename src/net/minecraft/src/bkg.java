package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.util.Arrays;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Map;
/*   5:    */ import java.util.Map.Entry;
/*   6:    */ import java.util.Random;
/*   7:    */ 
/*   8:    */ public class bkg
/*   9:    */   extends bmm
/*  10:    */ {
/*  11: 24 */   private int f = 32;
/*  12: 25 */   private int g = 5;
/*  13: 27 */   public static final List d = Arrays.asList(new arm[] { arm.p, arm.N, arm.w, arm.z, arm.A });
/*  14: 29 */   private static final List h = Lists.newArrayList();
/*  15:    */   
/*  16:    */   static
/*  17:    */   {
/*  18: 31 */     h.add(new SpawnListEntry(EntityGuardian.class, 1, 2, 4));
/*  19:    */   }
/*  20:    */   
/*  21:    */   public bkg(Map<String,String> paramMap)
/*  22:    */   {
/*  23: 39 */     this();
/*  24: 40 */     for (Map.Entry<String,String> localEntry : paramMap.entrySet()) {
/*  25: 41 */       if (((String)localEntry.getKey()).equals("spacing")) {
/*  26: 42 */         this.f = MathUtils.getInt((String)localEntry.getValue(), this.f, 1);
/*  27: 43 */       } else if (((String)localEntry.getKey()).equals("separation")) {
/*  28: 44 */         this.g = MathUtils.getInt((String)localEntry.getValue(), this.g, 1);
/*  29:    */       }
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33:    */   public String a()
/*  34:    */   {
/*  35: 51 */     return "Monument";
/*  36:    */   }
/*  37:    */   
/*  38:    */   protected boolean a(int paramInt1, int paramInt2)
/*  39:    */   {
/*  40: 56 */     int i = paramInt1;
/*  41: 57 */     int j = paramInt2;
/*  42: 58 */     if (paramInt1 < 0) {
/*  43: 59 */       paramInt1 -= this.f - 1;
/*  44:    */     }
/*  45: 61 */     if (paramInt2 < 0) {
/*  46: 62 */       paramInt2 -= this.f - 1;
/*  47:    */     }
/*  48: 65 */     int k = paramInt1 / this.f;
/*  49: 66 */     int m = paramInt2 / this.f;
/*  50:    */     
/*  51: 68 */     Random localRandom = this.c.a(k, m, 10387313);
/*  52: 69 */     k *= this.f;
/*  53: 70 */     m *= this.f;
/*  54: 71 */     k += (localRandom.nextInt(this.f - this.g) + localRandom.nextInt(this.f - this.g)) / 2;
/*  55: 72 */     m += (localRandom.nextInt(this.f - this.g) + localRandom.nextInt(this.f - this.g)) / 2;
/*  56:    */     
/*  57: 74 */     paramInt1 = i;
/*  58: 75 */     paramInt2 = j;
/*  59: 76 */     if ((paramInt1 == k) && (paramInt2 == m))
/*  60:    */     {
/*  61: 78 */       if (this.c.v().a(new BlockPosition(paramInt1 * 16 + 8, 64, paramInt2 * 16 + 8), null) != arm.N) {
/*  62: 79 */         return false;
/*  63:    */       }
/*  64: 82 */       boolean bool = this.c.v().a(paramInt1 * 16 + 8, paramInt2 * 16 + 8, 29, d);
/*  65: 83 */       if (bool) {
/*  66: 84 */         return true;
/*  67:    */       }
/*  68:    */     }
/*  69: 88 */     return false;
/*  70:    */   }
/*  71:    */   
/*  72:    */   protected bmv b(int paramInt1, int paramInt2)
/*  73:    */   {
/*  74: 93 */     return new bkh(this.c, this.b, paramInt1, paramInt2);
/*  75:    */   }
/*  76:    */   
/*  77:    */   public List b()
/*  78:    */   {
/*  79:183 */     return h;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public bkg() {}
/*  83:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bkg
 * JD-Core Version:    0.7.0.1
 */