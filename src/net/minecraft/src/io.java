package net.minecraft.src;
import java.io.IOException;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class io
/*   4:    */   implements id<ik>
/*   5:    */ {
/*   6:    */   private int a;
/*   7:    */   private int b;
/*   8:    */   private int c;
/*   9:    */   private int d;
/*  10:    */   private int e;
/*  11:    */   private int f;
/*  12:    */   private int g;
/*  13:    */   private int h;
/*  14:    */   private byte i;
/*  15:    */   private byte j;
/*  16:    */   private byte k;
/*  17:    */   private xv l;
/*  18:    */   private List<xw> m;
/*  19:    */   
/*  20:    */   public io() {}
/*  21:    */   
/*  22:    */   public io(EntityLiving paramxm)
/*  23:    */   {
/*  24: 35 */     this.a = paramxm.getID();
/*  25:    */     
/*  26: 37 */     this.b = ((byte)EntityList.a(paramxm));
/*  27: 38 */     this.c = MathUtils.floor(paramxm.xPos * 32.0D);
/*  28: 39 */     this.d = MathUtils.floor(paramxm.yPos * 32.0D);
/*  29: 40 */     this.e = MathUtils.floor(paramxm.zPos * 32.0D);
/*  30: 41 */     this.i = ((byte)(int)(paramxm.yaw * 256.0F / 360.0F));
/*  31: 42 */     this.j = ((byte)(int)(paramxm.pitch * 256.0F / 360.0F));
/*  32: 43 */     this.k = ((byte)(int)(paramxm.aI * 256.0F / 360.0F));
/*  33:    */     
/*  34:    */ 
/*  35: 46 */     double d1 = 3.9D;
/*  36: 47 */     double d2 = paramxm.xVelocity;
/*  37: 48 */     double d3 = paramxm.yVelocity;
/*  38: 49 */     double d4 = paramxm.zVelocity;
/*  39: 50 */     if (d2 < -d1) {
/*  40: 51 */       d2 = -d1;
/*  41:    */     }
/*  42: 53 */     if (d3 < -d1) {
/*  43: 54 */       d3 = -d1;
/*  44:    */     }
/*  45: 56 */     if (d4 < -d1) {
/*  46: 57 */       d4 = -d1;
/*  47:    */     }
/*  48: 59 */     if (d2 > d1) {
/*  49: 60 */       d2 = d1;
/*  50:    */     }
/*  51: 62 */     if (d3 > d1) {
/*  52: 63 */       d3 = d1;
/*  53:    */     }
/*  54: 65 */     if (d4 > d1) {
/*  55: 66 */       d4 = d1;
/*  56:    */     }
/*  57: 68 */     this.f = ((int)(d2 * 8000.0D));
/*  58: 69 */     this.g = ((int)(d3 * 8000.0D));
/*  59: 70 */     this.h = ((int)(d4 * 8000.0D));
/*  60:    */     
/*  61: 72 */     this.l = paramxm.H();
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void fromBuffer(ByteBufWrapper paramhd) throws IOException
/*  65:    */   {
/*  66: 77 */     this.a = paramhd.e();
/*  67: 78 */     this.b = (paramhd.readByte() & 0xFF);
/*  68: 79 */     this.c = paramhd.readInt();
/*  69: 80 */     this.d = paramhd.readInt();
/*  70: 81 */     this.e = paramhd.readInt();
/*  71: 82 */     this.i = paramhd.readByte();
/*  72: 83 */     this.j = paramhd.readByte();
/*  73: 84 */     this.k = paramhd.readByte();
/*  74: 85 */     this.f = paramhd.readShort();
/*  75: 86 */     this.g = paramhd.readShort();
/*  76: 87 */     this.h = paramhd.readShort();
/*  77: 88 */     this.m = xv.b(paramhd);
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  81:    */   {
/*  82: 93 */     paramhd.b(this.a);
/*  83: 94 */     paramhd.writeByte(this.b & 0xFF);
/*  84: 95 */     paramhd.writeInt(this.c);
/*  85: 96 */     paramhd.writeInt(this.d);
/*  86: 97 */     paramhd.writeInt(this.e);
/*  87: 98 */     paramhd.writeByte(this.i);
/*  88: 99 */     paramhd.writeByte(this.j);
/*  89:100 */     paramhd.writeByte(this.k);
/*  90:101 */     paramhd.writeShort(this.f);
/*  91:102 */     paramhd.writeShort(this.g);
/*  92:103 */     paramhd.writeShort(this.h);
/*  93:104 */     this.l.a(paramhd);
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void a(ik paramik)
/*  97:    */   {
/*  98:109 */     paramik.a(this);
/*  99:    */   }
/* 100:    */   
/* 101:    */   public List<xw> a()
/* 102:    */   {
/* 103:113 */     if (this.m == null) {
/* 104:114 */       this.m = this.l.c();
/* 105:    */     }
/* 106:116 */     return this.m;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public int b()
/* 110:    */   {
/* 111:120 */     return this.a;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public int c()
/* 115:    */   {
/* 116:124 */     return this.b;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public int d()
/* 120:    */   {
/* 121:128 */     return this.c;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public int e()
/* 125:    */   {
/* 126:132 */     return this.d;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public int f()
/* 130:    */   {
/* 131:136 */     return this.e;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public int g()
/* 135:    */   {
/* 136:140 */     return this.f;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public int h()
/* 140:    */   {
/* 141:144 */     return this.g;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public int i()
/* 145:    */   {
/* 146:148 */     return this.h;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public byte j()
/* 150:    */   {
/* 151:152 */     return this.i;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public byte k()
/* 155:    */   {
/* 156:156 */     return this.j;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public byte l()
/* 160:    */   {
/* 161:160 */     return this.k;
/* 162:    */   }
/* 163:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     io
 * JD-Core Version:    0.7.0.1
 */