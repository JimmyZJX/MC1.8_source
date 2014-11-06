package net.minecraft.src;
/*   1:    */ public class il
/*   2:    */   implements id<ik>
/*   3:    */ {
/*   4:    */   private int a;
/*   5:    */   private int b;
/*   6:    */   private int c;
/*   7:    */   private int d;
/*   8:    */   private int e;
/*   9:    */   private int f;
/*  10:    */   private int g;
/*  11:    */   private int h;
/*  12:    */   private int i;
/*  13:    */   private int j;
/*  14:    */   private int k;
/*  15:    */   
/*  16:    */   public il() {}
/*  17:    */   
/*  18:    */   public il(Entity paramwv, int paramInt)
/*  19:    */   {
/*  20: 51 */     this(paramwv, paramInt, 0);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public il(Entity paramwv, int paramInt1, int paramInt2)
/*  24:    */   {
/*  25: 55 */     this.a = paramwv.getID();
/*  26: 56 */     this.b = MathUtils.floor(paramwv.xPos * 32.0D);
/*  27: 57 */     this.c = MathUtils.floor(paramwv.yPos * 32.0D);
/*  28: 58 */     this.d = MathUtils.floor(paramwv.zPos * 32.0D);
/*  29: 59 */     this.h = MathUtils.floor(paramwv.pitch * 256.0F / 360.0F);
/*  30: 60 */     this.i = MathUtils.floor(paramwv.yaw * 256.0F / 360.0F);
/*  31: 61 */     this.j = paramInt1;
/*  32: 62 */     this.k = paramInt2;
/*  33: 63 */     if (paramInt2 > 0)
/*  34:    */     {
/*  35: 64 */       double d1 = paramwv.xVelocity;
/*  36: 65 */       double d2 = paramwv.yVelocity;
/*  37: 66 */       double d3 = paramwv.zVelocity;
/*  38: 67 */       double d4 = 3.9D;
/*  39: 68 */       if (d1 < -d4) {
/*  40: 69 */         d1 = -d4;
/*  41:    */       }
/*  42: 71 */       if (d2 < -d4) {
/*  43: 72 */         d2 = -d4;
/*  44:    */       }
/*  45: 74 */       if (d3 < -d4) {
/*  46: 75 */         d3 = -d4;
/*  47:    */       }
/*  48: 77 */       if (d1 > d4) {
/*  49: 78 */         d1 = d4;
/*  50:    */       }
/*  51: 80 */       if (d2 > d4) {
/*  52: 81 */         d2 = d4;
/*  53:    */       }
/*  54: 83 */       if (d3 > d4) {
/*  55: 84 */         d3 = d4;
/*  56:    */       }
/*  57: 86 */       this.e = ((int)(d1 * 8000.0D));
/*  58: 87 */       this.f = ((int)(d2 * 8000.0D));
/*  59: 88 */       this.g = ((int)(d3 * 8000.0D));
/*  60:    */     }
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  64:    */   {
/*  65: 94 */     this.a = paramhd.e();
/*  66: 95 */     this.j = paramhd.readByte();
/*  67: 96 */     this.b = paramhd.readInt();
/*  68: 97 */     this.c = paramhd.readInt();
/*  69: 98 */     this.d = paramhd.readInt();
/*  70: 99 */     this.h = paramhd.readByte();
/*  71:100 */     this.i = paramhd.readByte();
/*  72:101 */     this.k = paramhd.readInt();
/*  73:102 */     if (this.k > 0)
/*  74:    */     {
/*  75:103 */       this.e = paramhd.readShort();
/*  76:104 */       this.f = paramhd.readShort();
/*  77:105 */       this.g = paramhd.readShort();
/*  78:    */     }
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  82:    */   {
/*  83:111 */     paramhd.b(this.a);
/*  84:112 */     paramhd.writeByte(this.j);
/*  85:113 */     paramhd.writeInt(this.b);
/*  86:114 */     paramhd.writeInt(this.c);
/*  87:115 */     paramhd.writeInt(this.d);
/*  88:116 */     paramhd.writeByte(this.h);
/*  89:117 */     paramhd.writeByte(this.i);
/*  90:118 */     paramhd.writeInt(this.k);
/*  91:119 */     if (this.k > 0)
/*  92:    */     {
/*  93:120 */       paramhd.writeShort(this.e);
/*  94:121 */       paramhd.writeShort(this.f);
/*  95:122 */       paramhd.writeShort(this.g);
/*  96:    */     }
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void a(ik paramik)
/* 100:    */   {
/* 101:128 */     paramik.a(this);
/* 102:    */   }
/* 103:    */   
/* 104:    */   public int a()
/* 105:    */   {
/* 106:132 */     return this.a;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public int b()
/* 110:    */   {
/* 111:136 */     return this.b;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public int c()
/* 115:    */   {
/* 116:140 */     return this.c;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public int d()
/* 120:    */   {
/* 121:144 */     return this.d;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public int e()
/* 125:    */   {
/* 126:148 */     return this.e;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public int f()
/* 130:    */   {
/* 131:152 */     return this.f;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public int g()
/* 135:    */   {
/* 136:156 */     return this.g;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public int h()
/* 140:    */   {
/* 141:160 */     return this.h;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public int i()
/* 145:    */   {
/* 146:164 */     return this.i;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public int j()
/* 150:    */   {
/* 151:168 */     return this.j;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public int k()
/* 155:    */   {
/* 156:172 */     return this.k;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void a(int paramInt)
/* 160:    */   {
/* 161:176 */     this.b = paramInt;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void b(int paramInt)
/* 165:    */   {
/* 166:180 */     this.c = paramInt;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void c(int paramInt)
/* 170:    */   {
/* 171:184 */     this.d = paramInt;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public void d(int paramInt)
/* 175:    */   {
/* 176:188 */     this.e = paramInt;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void e(int paramInt)
/* 180:    */   {
/* 181:192 */     this.f = paramInt;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public void f(int paramInt)
/* 185:    */   {
/* 186:196 */     this.g = paramInt;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void g(int paramInt)
/* 190:    */   {
/* 191:200 */     this.k = paramInt;
/* 192:    */   }
/* 193:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     il
 * JD-Core Version:    0.7.0.1
 */