package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class jm
/*   5:    */   implements id<ik>
/*   6:    */ {
/*   7:    */   private double a;
/*   8:    */   private double b;
/*   9:    */   private double c;
/*  10:    */   private float d;
/*  11:    */   private List<BlockPosition> e;
/*  12:    */   private float f;
/*  13:    */   private float g;
/*  14:    */   private float h;
/*  15:    */   
/*  16:    */   public jm() {}
/*  17:    */   
/*  18:    */   public jm(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, List<BlockPosition> paramList, Vec3 parambrw)
/*  19:    */   {
/*  20: 28 */     this.a = paramDouble1;
/*  21: 29 */     this.b = paramDouble2;
/*  22: 30 */     this.c = paramDouble3;
/*  23: 31 */     this.d = paramFloat;
/*  24: 32 */     this.e = Lists.newArrayList(paramList);
/*  25: 34 */     if (parambrw != null)
/*  26:    */     {
/*  27: 35 */       this.f = ((float)parambrw.x);
/*  28: 36 */       this.g = ((float)parambrw.y);
/*  29: 37 */       this.h = ((float)parambrw.z);
/*  30:    */     }
/*  31:    */   }
/*  32:    */   
/*  33:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  34:    */   {
/*  35: 43 */     this.a = paramhd.readFloat();
/*  36: 44 */     this.b = paramhd.readFloat();
/*  37: 45 */     this.c = paramhd.readFloat();
/*  38: 46 */     this.d = paramhd.readFloat();
/*  39: 47 */     int i = paramhd.readInt();
/*  40:    */     
/*  41: 49 */     this.e = Lists.newArrayListWithCapacity(i);
/*  42:    */     
/*  43: 51 */     int j = (int)this.a;
/*  44: 52 */     int k = (int)this.b;
/*  45: 53 */     int m = (int)this.c;
/*  46: 54 */     for (int n = 0; n < i; n++)
/*  47:    */     {
/*  48: 55 */       int i1 = paramhd.readByte() + j;
/*  49: 56 */       int i2 = paramhd.readByte() + k;
/*  50: 57 */       int i3 = paramhd.readByte() + m;
/*  51: 58 */       this.e.add(new BlockPosition(i1, i2, i3));
/*  52:    */     }
/*  53: 61 */     this.f = paramhd.readFloat();
/*  54: 62 */     this.g = paramhd.readFloat();
/*  55: 63 */     this.h = paramhd.readFloat();
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  59:    */   {
/*  60: 68 */     paramhd.writeFloat((float)this.a);
/*  61: 69 */     paramhd.writeFloat((float)this.b);
/*  62: 70 */     paramhd.writeFloat((float)this.c);
/*  63: 71 */     paramhd.writeFloat(this.d);
/*  64: 72 */     paramhd.writeInt(this.e.size());
/*  65:    */     
/*  66: 74 */     int i = (int)this.a;
/*  67: 75 */     int j = (int)this.b;
/*  68: 76 */     int k = (int)this.c;
/*  69: 77 */     for (BlockPosition localdt : this.e)
/*  70:    */     {
/*  71: 78 */       int m = localdt.getX() - i;
/*  72: 79 */       int n = localdt.getY() - j;
/*  73: 80 */       int i1 = localdt.getZ() - k;
/*  74: 81 */       paramhd.writeByte(m);
/*  75: 82 */       paramhd.writeByte(n);
/*  76: 83 */       paramhd.writeByte(i1);
/*  77:    */     }
/*  78: 86 */     paramhd.writeFloat(this.f);
/*  79: 87 */     paramhd.writeFloat(this.g);
/*  80: 88 */     paramhd.writeFloat(this.h);
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void a(ik paramik)
/*  84:    */   {
/*  85: 93 */     paramik.a(this);
/*  86:    */   }
/*  87:    */   
/*  88:    */   public float a()
/*  89:    */   {
/*  90: 97 */     return this.f;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public float b()
/*  94:    */   {
/*  95:101 */     return this.g;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public float c()
/*  99:    */   {
/* 100:105 */     return this.h;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public double d()
/* 104:    */   {
/* 105:109 */     return this.a;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public double e()
/* 109:    */   {
/* 110:113 */     return this.b;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public double f()
/* 114:    */   {
/* 115:117 */     return this.c;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public float g()
/* 119:    */   {
/* 120:121 */     return this.d;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public List<BlockPosition> h()
/* 124:    */   {
/* 125:125 */     return this.e;
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jm
 * JD-Core Version:    0.7.0.1
 */