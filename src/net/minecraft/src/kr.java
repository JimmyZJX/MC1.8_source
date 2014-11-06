package net.minecraft.src;
/*   1:    */ public class kr
/*   2:    */   implements id<ik>
/*   3:    */ {
/*   4:    */   private kt a;
/*   5:    */   private int b;
/*   6:    */   private double c;
/*   7:    */   private double d;
/*   8:    */   private double e;
/*   9:    */   private double f;
/*  10:    */   private long g;
/*  11:    */   private int h;
/*  12:    */   private int i;
/*  13:    */   
/*  14:    */   public kr() {}
/*  15:    */   
/*  16:    */   public kr(bfb parambfb, kt paramkt)
/*  17:    */   {
/*  18: 25 */     this.a = paramkt;
/*  19: 26 */     this.c = parambfb.f();
/*  20: 27 */     this.d = parambfb.g();
/*  21: 28 */     this.f = parambfb.h();
/*  22: 29 */     this.e = parambfb.j();
/*  23: 30 */     this.g = parambfb.i();
/*  24: 31 */     this.b = parambfb.l();
/*  25: 32 */     this.i = parambfb.q();
/*  26: 33 */     this.h = parambfb.p();
/*  27:    */   }
/*  28:    */   
/*  29:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  30:    */   {
/*  31: 38 */     this.a = ((kt)paramhd.a(kt.class));
/*  32: 40 */     switch (ks.a[this.a.ordinal()])
/*  33:    */     {
/*  34:    */     case 1: 
/*  35: 42 */       this.e = paramhd.readDouble();
/*  36: 43 */       break;
/*  37:    */     case 2: 
/*  38: 45 */       this.f = paramhd.readDouble();
/*  39: 46 */       this.e = paramhd.readDouble();
/*  40: 47 */       this.g = paramhd.f();
/*  41: 48 */       break;
/*  42:    */     case 3: 
/*  43: 50 */       this.c = paramhd.readDouble();
/*  44: 51 */       this.d = paramhd.readDouble();
/*  45: 52 */       break;
/*  46:    */     case 4: 
/*  47: 54 */       this.i = paramhd.e();
/*  48: 55 */       break;
/*  49:    */     case 5: 
/*  50: 57 */       this.h = paramhd.e();
/*  51: 58 */       break;
/*  52:    */     case 6: 
/*  53: 60 */       this.c = paramhd.readDouble();
/*  54: 61 */       this.d = paramhd.readDouble();
/*  55: 62 */       this.f = paramhd.readDouble();
/*  56: 63 */       this.e = paramhd.readDouble();
/*  57: 64 */       this.g = paramhd.f();
/*  58: 65 */       this.b = paramhd.e();
/*  59: 66 */       this.i = paramhd.e();
/*  60: 67 */       this.h = paramhd.e();
/*  61:    */     }
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  65:    */   {
/*  66: 74 */     paramhd.a(this.a);
/*  67: 76 */     switch (ks.a[this.a.ordinal()])
/*  68:    */     {
/*  69:    */     case 1: 
/*  70: 78 */       paramhd.writeDouble(this.e);
/*  71: 79 */       break;
/*  72:    */     case 2: 
/*  73: 81 */       paramhd.writeDouble(this.f);
/*  74: 82 */       paramhd.writeDouble(this.e);
/*  75: 83 */       paramhd.b(this.g);
/*  76: 84 */       break;
/*  77:    */     case 3: 
/*  78: 86 */       paramhd.writeDouble(this.c);
/*  79: 87 */       paramhd.writeDouble(this.d);
/*  80: 88 */       break;
/*  81:    */     case 5: 
/*  82: 90 */       paramhd.b(this.h);
/*  83: 91 */       break;
/*  84:    */     case 4: 
/*  85: 93 */       paramhd.b(this.i);
/*  86: 94 */       break;
/*  87:    */     case 6: 
/*  88: 96 */       paramhd.writeDouble(this.c);
/*  89: 97 */       paramhd.writeDouble(this.d);
/*  90: 98 */       paramhd.writeDouble(this.f);
/*  91: 99 */       paramhd.writeDouble(this.e);
/*  92:100 */       paramhd.b(this.g);
/*  93:101 */       paramhd.b(this.b);
/*  94:102 */       paramhd.b(this.i);
/*  95:103 */       paramhd.b(this.h);
/*  96:    */     }
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void a(ik paramik)
/* 100:    */   {
/* 101:110 */     paramik.a(this);
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void a(bfb parambfb)
/* 105:    */   {
/* 106:114 */     switch (ks.a[this.a.ordinal()])
/* 107:    */     {
/* 108:    */     case 1: 
/* 109:116 */       parambfb.a(this.e);
/* 110:117 */       break;
/* 111:    */     case 2: 
/* 112:119 */       parambfb.a(this.f, this.e, this.g);
/* 113:120 */       break;
/* 114:    */     case 3: 
/* 115:122 */       parambfb.c(this.c, this.d);
/* 116:123 */       break;
/* 117:    */     case 6: 
/* 118:125 */       parambfb.c(this.c, this.d);
/* 119:127 */       if (this.g > 0L) {
/* 120:128 */         parambfb.a(this.f, this.e, this.g);
/* 121:    */       } else {
/* 122:130 */         parambfb.a(this.e);
/* 123:    */       }
/* 124:133 */       parambfb.a(this.b);
/* 125:134 */       parambfb.c(this.i);
/* 126:135 */       parambfb.b(this.h);
/* 127:136 */       break;
/* 128:    */     case 5: 
/* 129:138 */       parambfb.b(this.h);
/* 130:139 */       break;
/* 131:    */     case 4: 
/* 132:141 */       parambfb.c(this.i);
/* 133:    */     }
/* 134:    */   }
/* 135:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kr
 * JD-Core Version:    0.7.0.1
 */