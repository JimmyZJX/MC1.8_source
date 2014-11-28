package net.minecraft.src;
/*   1:    */ public class kd
/*   2:    */   implements id<ik>
/*   3:    */ {
/*   4:    */   private boolean a;
/*   5:    */   private boolean b;
/*   6:    */   private boolean c;
/*   7:    */   private boolean d;
/*   8:    */   private float e;
/*   9:    */   private float f;
/*  10:    */   
/*  11:    */   public kd() {}
/*  12:    */   
/*  13:    */   public kd(PlayerAbilities paramaha)
/*  14:    */   {
/*  15: 28 */     a(paramaha.invulnerable);
/*  16: 29 */     b(paramaha.flying);
/*  17: 30 */     c(paramaha.mayfly);
/*  18: 31 */     d(paramaha.instabuild);
/*  19: 32 */     a(paramaha.getFlySpeed());
/*  20: 33 */     b(paramaha.getWalkSpeed());
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  24:    */   {
/*  25: 38 */     int i = paramhd.readByte();
/*  26:    */     
/*  27: 40 */     a((i & 0x1) > 0);
/*  28: 41 */     b((i & 0x2) > 0);
/*  29: 42 */     c((i & 0x4) > 0);
/*  30: 43 */     d((i & 0x8) > 0);
/*  31: 44 */     a(paramhd.readFloat());
/*  32: 45 */     b(paramhd.readFloat());
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  36:    */   {
/*  37: 50 */     int i = 0;
/*  38: 52 */     if (a()) {
/*  39: 53 */       i = (byte)(i | 0x1);
/*  40:    */     }
/*  41: 55 */     if (b()) {
/*  42: 56 */       i = (byte)(i | 0x2);
/*  43:    */     }
/*  44: 58 */     if (c()) {
/*  45: 59 */       i = (byte)(i | 0x4);
/*  46:    */     }
/*  47: 61 */     if (d()) {
/*  48: 62 */       i = (byte)(i | 0x8);
/*  49:    */     }
/*  50: 65 */     paramhd.writeByte(i);
/*  51: 66 */     paramhd.writeFloat(this.e);
/*  52: 67 */     paramhd.writeFloat(this.f);
/*  53:    */   }
/*  54:    */   
/*  55:    */   public void a(ik paramik)
/*  56:    */   {
/*  57: 72 */     paramik.a(this);
/*  58:    */   }
/*  59:    */   
/*  60:    */   public boolean a()
/*  61:    */   {
/*  62: 76 */     return this.a;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void a(boolean paramBoolean)
/*  66:    */   {
/*  67: 80 */     this.a = paramBoolean;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public boolean b()
/*  71:    */   {
/*  72: 84 */     return this.b;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void b(boolean paramBoolean)
/*  76:    */   {
/*  77: 88 */     this.b = paramBoolean;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean c()
/*  81:    */   {
/*  82: 92 */     return this.c;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void c(boolean paramBoolean)
/*  86:    */   {
/*  87: 96 */     this.c = paramBoolean;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean d()
/*  91:    */   {
/*  92:100 */     return this.d;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void d(boolean paramBoolean)
/*  96:    */   {
/*  97:104 */     this.d = paramBoolean;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public float e()
/* 101:    */   {
/* 102:108 */     return this.e;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public void a(float paramFloat)
/* 106:    */   {
/* 107:112 */     this.e = paramFloat;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public float f()
/* 111:    */   {
/* 112:116 */     return this.f;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public void b(float paramFloat)
/* 116:    */   {
/* 117:120 */     this.f = paramFloat;
/* 118:    */   }
/* 119:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kd
 * JD-Core Version:    0.7.0.1
 */