package net.minecraft.src;
/*   1:    */ import com.google.common.base.Objects;
/*   2:    */ import com.google.common.collect.Lists;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.List;
/*   5:    */ 
/*   6:    */ public class car
/*   7:    */ {
/*   8: 15 */   private static final caw b = new cat(null);
/*   9: 16 */   private static final caw c = new cau(-1, true);
/*  10: 17 */   private static final caw d = new cau(1, true);
/*  11: 18 */   private static final caw e = new cau(1, false);
/*  12: 22 */   public static final caw a = new cas();
/*  13:    */   private final cax f;
/*  14: 30 */   private final List<cay> g = Lists.newArrayList();
/*  15:    */   private cav h;
/*  16: 32 */   private int i = -1;
/*  17:    */   private int j;
/*  18:    */   
/*  19:    */   public car(cax paramcax)
/*  20:    */   {
/*  21: 36 */     this.h = new caq();
/*  22: 37 */     this.f = paramcax;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public caw a(int paramInt)
/*  26:    */   {
/*  27: 41 */     int k = paramInt + this.j * 6;
/*  28: 43 */     if ((this.j > 0) && (paramInt == 0)) {
/*  29: 44 */       return c;
/*  30:    */     }
/*  31: 45 */     if (paramInt == 7)
/*  32:    */     {
/*  33: 46 */       if (k < this.h.a().size()) {
/*  34: 47 */         return d;
/*  35:    */       }
/*  36: 49 */       return e;
/*  37:    */     }
/*  38: 53 */     if (paramInt == 8) {
/*  39: 54 */       return b;
/*  40:    */     }
/*  41: 57 */     if ((k < 0) || (k >= this.h.a().size())) {
/*  42: 58 */       return a;
/*  43:    */     }
/*  44: 60 */     return (caw)Objects.firstNonNull(this.h.a().get(k), a);
/*  45:    */   }
/*  46:    */   
/*  47:    */   public List<caw> a()
/*  48:    */   {
/*  49: 64 */     ArrayList<caw> localArrayList = Lists.newArrayList();
/*  50: 66 */     for (int k = 0; k <= 8; k++) {
/*  51: 67 */       localArrayList.add(a(k));
/*  52:    */     }
/*  53: 70 */     return localArrayList;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public caw b()
/*  57:    */   {
/*  58: 74 */     return a(this.i);
/*  59:    */   }
/*  60:    */   
/*  61:    */   public cav c()
/*  62:    */   {
/*  63: 78 */     return this.h;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void b(int paramInt)
/*  67:    */   {
/*  68: 82 */     caw localcaw = a(paramInt);
/*  69: 84 */     if (localcaw != a) {
/*  70: 85 */       if ((this.i == paramInt) && (localcaw.A_())) {
/*  71: 86 */         localcaw.a(this);
/*  72:    */       } else {
/*  73: 88 */         this.i = paramInt;
/*  74:    */       }
/*  75:    */     }
/*  76:    */   }
/*  77:    */   
/*  78:    */   public void d()
/*  79:    */   {
/*  80: 94 */     this.f.a(this);
/*  81:    */   }
/*  82:    */   
/*  83:    */   public int e()
/*  84:    */   {
/*  85: 98 */     return this.i;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void a(cav paramcav)
/*  89:    */   {
/*  90:102 */     this.g.add(f());
/*  91:    */     
/*  92:104 */     this.h = paramcav;
/*  93:105 */     this.i = -1;
/*  94:106 */     this.j = 0;
/*  95:    */   }
/*  96:    */   
/*  97:    */   public cay f()
/*  98:    */   {
/*  99:110 */     return new cay(this.h, a(), this.i);
/* 100:    */   }
				static int a(car arg0,int arg1) {return arg0.j+=arg1;}
/* 101:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     car
 * JD-Core Version:    0.7.0.1
 */