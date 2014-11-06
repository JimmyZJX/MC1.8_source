package net.minecraft.src;
/*   1:    */ public class mk
/*   2:    */   implements id<ls>
/*   3:    */ {
/*   4:    */   private boolean a;
/*   5:    */   private boolean b;
/*   6:    */   private boolean c;
/*   7:    */   private boolean d;
/*   8:    */   private float e;
/*   9:    */   private float f;
/*  10:    */   
/*  11:    */   public mk() {}
/*  12:    */   
/*  13:    */   public mk(aha paramaha)
/*  14:    */   {
/*  15: 26 */     a(paramaha.a);
/*  16: 27 */     b(paramaha.b);
/*  17: 28 */     c(paramaha.c);
/*  18: 29 */     d(paramaha.d);
/*  19: 30 */     a(paramaha.a());
/*  20: 31 */     b(paramaha.b());
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  24:    */   {
/*  25: 36 */     int i = paramhd.readByte();
/*  26:    */     
/*  27: 38 */     a((i & 0x1) > 0);
/*  28: 39 */     b((i & 0x2) > 0);
/*  29: 40 */     c((i & 0x4) > 0);
/*  30: 41 */     d((i & 0x8) > 0);
/*  31: 42 */     a(paramhd.readFloat());
/*  32: 43 */     b(paramhd.readFloat());
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  36:    */   {
/*  37: 48 */     int i = 0;
/*  38: 50 */     if (a()) {
/*  39: 51 */       i = (byte)(i | 0x1);
/*  40:    */     }
/*  41: 53 */     if (b()) {
/*  42: 54 */       i = (byte)(i | 0x2);
/*  43:    */     }
/*  44: 56 */     if (c()) {
/*  45: 57 */       i = (byte)(i | 0x4);
/*  46:    */     }
/*  47: 59 */     if (d()) {
/*  48: 60 */       i = (byte)(i | 0x8);
/*  49:    */     }
/*  50: 63 */     paramhd.writeByte(i);
/*  51: 64 */     paramhd.writeFloat(this.e);
/*  52: 65 */     paramhd.writeFloat(this.f);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void a(ls paramls)
/*  56:    */   {
/*  57: 70 */     paramls.a(this);
/*  58:    */   }
/*  59:    */   
/*  60:    */   public boolean a()
/*  61:    */   {
/*  62: 74 */     return this.a;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void a(boolean paramBoolean)
/*  66:    */   {
/*  67: 78 */     this.a = paramBoolean;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public boolean b()
/*  71:    */   {
/*  72: 82 */     return this.b;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void b(boolean paramBoolean)
/*  76:    */   {
/*  77: 86 */     this.b = paramBoolean;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean c()
/*  81:    */   {
/*  82: 90 */     return this.c;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void c(boolean paramBoolean)
/*  86:    */   {
/*  87: 94 */     this.c = paramBoolean;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean d()
/*  91:    */   {
/*  92: 98 */     return this.d;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void d(boolean paramBoolean)
/*  96:    */   {
/*  97:102 */     this.d = paramBoolean;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void a(float paramFloat)
/* 101:    */   {
/* 102:110 */     this.e = paramFloat;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void b(float paramFloat)
/* 106:    */   {
/* 107:118 */     this.f = paramFloat;
/* 108:    */   }
/* 109:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mk
 * JD-Core Version:    0.7.0.1
 */