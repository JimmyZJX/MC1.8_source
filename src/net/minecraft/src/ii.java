package net.minecraft.src;
/*  1:   */ import java.util.Set;
/*  2:   */ 
/*  3:   */ public class ii
/*  4:   */   implements id<ik>
/*  5:   */ {
/*  6:   */   private double a;
/*  7:   */   private double b;
/*  8:   */   private double c;
/*  9:   */   private float d;
/* 10:   */   private float e;
/* 11:   */   private Set f;
/* 12:   */   
/* 13:   */   public ii() {}
/* 14:   */   
/* 15:   */   public ii(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, Set paramSet)
/* 16:   */   {
/* 17:23 */     this.a = paramDouble1;
/* 18:24 */     this.b = paramDouble2;
/* 19:25 */     this.c = paramDouble3;
/* 20:26 */     this.d = paramFloat1;
/* 21:27 */     this.e = paramFloat2;
/* 22:28 */     this.f = paramSet;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 26:   */   {
/* 27:33 */     this.a = paramhd.readDouble();
/* 28:34 */     this.b = paramhd.readDouble();
/* 29:35 */     this.c = paramhd.readDouble();
/* 30:36 */     this.d = paramhd.readFloat();
/* 31:37 */     this.e = paramhd.readFloat();
/* 32:38 */     this.f = ij.a(paramhd.readUnsignedByte());
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 36:   */   {
/* 37:43 */     paramhd.writeDouble(this.a);
/* 38:44 */     paramhd.writeDouble(this.b);
/* 39:45 */     paramhd.writeDouble(this.c);
/* 40:46 */     paramhd.writeFloat(this.d);
/* 41:47 */     paramhd.writeFloat(this.e);
/* 42:48 */     paramhd.writeByte(ij.a(this.f));
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void a(ik paramik)
/* 46:   */   {
/* 47:53 */     paramik.a(this);
/* 48:   */   }
/* 49:   */   
/* 50:   */   public double a()
/* 51:   */   {
/* 52:57 */     return this.a;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public double b()
/* 56:   */   {
/* 57:61 */     return this.b;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public double c()
/* 61:   */   {
/* 62:65 */     return this.c;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public float d()
/* 66:   */   {
/* 67:69 */     return this.d;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public float e()
/* 71:   */   {
/* 72:73 */     return this.e;
/* 73:   */   }
/* 74:   */   
/* 75:   */   public Set f()
/* 76:   */   {
/* 77:77 */     return this.f;
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ii
 * JD-Core Version:    0.7.0.1
 */