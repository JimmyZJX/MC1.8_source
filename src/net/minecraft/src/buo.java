package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class buo
/*   5:    */   extends bub
/*   6:    */ {
/*   7: 17 */   protected int a = 200;
/*   8: 18 */   protected int f = 20;
/*   9:    */   public int g;
/*  10:    */   public int h;
/*  11:    */   private List k;
/*  12:    */   public int i;
/*  13:    */   private boolean l;
/*  14: 24 */   public boolean j = true;
/*  15:    */   private boolean m;
/*  16:    */   private int n;
/*  17:    */   private int o;
/*  18:    */   private int p;
/*  19:    */   private int q;
/*  20:    */   private bty r;
/*  21:    */   private int s;
/*  22:    */   
/*  23:    */   public buo(bty parambty, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  24:    */   {
/*  25: 38 */     this.r = parambty;
/*  26: 39 */     this.i = paramInt1;
/*  27: 40 */     this.g = paramInt2;
/*  28: 41 */     this.h = paramInt3;
/*  29: 42 */     this.a = paramInt4;
/*  30: 43 */     this.f = paramInt5;
/*  31: 44 */     this.k = Lists.newArrayList();
/*  32: 45 */     this.l = false;
/*  33: 46 */     this.m = false;
/*  34: 47 */     this.n = paramInt6;
/*  35: 48 */     this.o = -1;
/*  36: 49 */     this.p = -1;
/*  37: 50 */     this.q = -1;
/*  38: 51 */     this.s = 0;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void a(String paramString)
/*  42:    */   {
/*  43: 55 */     this.k.add(cwc.a(paramString, new Object[0]));
/*  44:    */   }
/*  45:    */   
/*  46:    */   public buo a()
/*  47:    */   {
/*  48: 59 */     this.l = true;
/*  49: 60 */     return this;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void a(bsu parambsu, int paramInt1, int paramInt2)
/*  53:    */   {
/*  54: 77 */     if (!this.j) {
/*  55: 78 */       return;
/*  56:    */     }
/*  57: 81 */     cjm.enableBlend();
/*  58: 82 */     cjm.glBlendFuncSeparate(770, 771, 1, 0);
/*  59:    */     
/*  60: 84 */     b(parambsu, paramInt1, paramInt2);
/*  61: 85 */     int i1 = this.h + this.f / 2 + this.s / 2;
/*  62: 86 */     int i2 = i1 - this.k.size() * 10 / 2;
/*  63: 87 */     for (int i3 = 0; i3 < this.k.size(); i3++) {
/*  64: 88 */       if (this.l) {
/*  65: 89 */         a(this.r, (String)this.k.get(i3), this.g + this.a / 2, i2 + i3 * 10, this.n);
/*  66:    */       } else {
/*  67: 91 */         c(this.r, (String)this.k.get(i3), this.g, i2 + i3 * 10, this.n);
/*  68:    */       }
/*  69:    */     }
/*  70:    */   }
/*  71:    */   
/*  72:    */   protected void b(bsu parambsu, int paramInt1, int paramInt2)
/*  73:    */   {
/*  74: 97 */     if (this.m)
/*  75:    */     {
/*  76: 98 */       int i1 = this.a + this.s * 2;
/*  77: 99 */       int i2 = this.f + this.s * 2;
/*  78:100 */       int i3 = this.g - this.s;
/*  79:101 */       int i4 = this.h - this.s;
/*  80:102 */       a(i3, i4, i3 + i1, i4 + i2, this.o);
/*  81:103 */       a(i3, i3 + i1, i4, this.p);
/*  82:104 */       a(i3, i3 + i1, i4 + i2, this.q);
/*  83:105 */       b(i3, i4, i4 + i2, this.p);
/*  84:106 */       b(i3 + i1, i4, i4 + i2, this.q);
/*  85:    */     }
/*  86:    */   }
/*  87:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     buo
 * JD-Core Version:    0.7.0.1
 */