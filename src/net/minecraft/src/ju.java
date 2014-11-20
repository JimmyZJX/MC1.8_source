package net.minecraft.src;
/*   1:    */ public class ju
/*   2:    */   implements id<ik>
/*   3:    */ {
/*   4:    */   private EnumParticleEffect a;
/*   5:    */   private float b;
/*   6:    */   private float c;
/*   7:    */   private float d;
/*   8:    */   private float e;
/*   9:    */   private float f;
/*  10:    */   private float g;
/*  11:    */   private float h;
/*  12:    */   private int i;
/*  13:    */   private boolean j;
/*  14:    */   private int[] k;
/*  15:    */   
/*  16:    */   public ju() {}
/*  17:    */   
/*  18:    */   public ju(EnumParticleEffect paramew, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, int paramInt, int... paramVarArgs)
/*  19:    */   {
/*  20: 28 */     this.a = paramew;
/*  21: 29 */     this.j = paramBoolean;
/*  22: 30 */     this.b = paramFloat1;
/*  23: 31 */     this.c = paramFloat2;
/*  24: 32 */     this.d = paramFloat3;
/*  25: 33 */     this.e = paramFloat4;
/*  26: 34 */     this.f = paramFloat5;
/*  27: 35 */     this.g = paramFloat6;
/*  28: 36 */     this.h = paramFloat7;
/*  29: 37 */     this.i = paramInt;
/*  30: 38 */     this.k = paramVarArgs;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  34:    */   {
/*  35: 43 */     this.a = EnumParticleEffect.a(paramhd.readInt());
/*  36: 44 */     if (this.a == null) {
/*  37: 45 */       this.a = EnumParticleEffect.J;
/*  38:    */     }
/*  39: 47 */     this.j = paramhd.readBoolean();
/*  40: 48 */     this.b = paramhd.readFloat();
/*  41: 49 */     this.c = paramhd.readFloat();
/*  42: 50 */     this.d = paramhd.readFloat();
/*  43: 51 */     this.e = paramhd.readFloat();
/*  44: 52 */     this.f = paramhd.readFloat();
/*  45: 53 */     this.g = paramhd.readFloat();
/*  46: 54 */     this.h = paramhd.readFloat();
/*  47: 55 */     this.i = paramhd.readInt();
/*  48: 56 */     int m = this.a.d();
/*  49: 57 */     this.k = new int[m];
/*  50: 58 */     for (int n = 0; n < m; n++) {
/*  51: 59 */       this.k[n] = paramhd.e();
/*  52:    */     }
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  56:    */   {
/*  57: 65 */     paramhd.writeInt(this.a.c());
/*  58: 66 */     paramhd.writeBoolean(this.j);
/*  59: 67 */     paramhd.writeFloat(this.b);
/*  60: 68 */     paramhd.writeFloat(this.c);
/*  61: 69 */     paramhd.writeFloat(this.d);
/*  62: 70 */     paramhd.writeFloat(this.e);
/*  63: 71 */     paramhd.writeFloat(this.f);
/*  64: 72 */     paramhd.writeFloat(this.g);
/*  65: 73 */     paramhd.writeFloat(this.h);
/*  66: 74 */     paramhd.writeInt(this.i);
/*  67: 75 */     int m = this.a.d();
/*  68: 76 */     for (int n = 0; n < m; n++) {
/*  69: 77 */       paramhd.b(this.k[n]);
/*  70:    */     }
/*  71:    */   }
/*  72:    */   
/*  73:    */   public EnumParticleEffect a()
/*  74:    */   {
/*  75: 82 */     return this.a;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public boolean b()
/*  79:    */   {
/*  80: 86 */     return this.j;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public double c()
/*  84:    */   {
/*  85: 91 */     return this.b;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public double d()
/*  89:    */   {
/*  90: 95 */     return this.c;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public double e()
/*  94:    */   {
/*  95: 99 */     return this.d;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public float f()
/*  99:    */   {
/* 100:103 */     return this.e;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public float g()
/* 104:    */   {
/* 105:107 */     return this.f;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public float h()
/* 109:    */   {
/* 110:111 */     return this.g;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public float i()
/* 114:    */   {
/* 115:115 */     return this.h;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public int j()
/* 119:    */   {
/* 120:119 */     return this.i;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public int[] k()
/* 124:    */   {
/* 125:123 */     return this.k;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void a(ik paramik)
/* 129:    */   {
/* 130:128 */     paramik.a(this);
/* 131:    */   }
/* 132:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ju
 * JD-Core Version:    0.7.0.1
 */