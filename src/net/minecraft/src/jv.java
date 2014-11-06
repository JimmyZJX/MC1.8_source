package net.minecraft.src;
/*  1:   */ import org.apache.commons.lang3.Validate;
/*  2:   */ 
/*  3:   */ public class jv
/*  4:   */   implements id<ik>
/*  5:   */ {
/*  6:   */   private String a;
/*  7:   */   private int b;
/*  8:18 */   private int c = 2147483647;
/*  9:   */   private int d;
/* 10:   */   private float e;
/* 11:   */   private int f;
/* 12:   */   
/* 13:   */   public jv() {}
/* 14:   */   
/* 15:   */   public jv(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 16:   */   {
/* 17:28 */     Validate.notNull(paramString, "name", new Object[0]);
/* 18:29 */     this.a = paramString;
/* 19:30 */     this.b = ((int)(paramDouble1 * 8.0D));
/* 20:31 */     this.c = ((int)(paramDouble2 * 8.0D));
/* 21:32 */     this.d = ((int)(paramDouble3 * 8.0D));
/* 22:33 */     this.e = paramFloat1;
/* 23:34 */     this.f = ((int)(paramFloat2 * 63.0F));
/* 24:   */     
/* 25:36 */     paramFloat2 = MathUtils.clamp(paramFloat2, 0.0F, 255.0F);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 29:   */   {
/* 30:41 */     this.a = paramhd.c(256);
/* 31:42 */     this.b = paramhd.readInt();
/* 32:43 */     this.c = paramhd.readInt();
/* 33:44 */     this.d = paramhd.readInt();
/* 34:45 */     this.e = paramhd.readFloat();
/* 35:46 */     this.f = paramhd.readUnsignedByte();
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 39:   */   {
/* 40:51 */     paramhd.a(this.a);
/* 41:52 */     paramhd.writeInt(this.b);
/* 42:53 */     paramhd.writeInt(this.c);
/* 43:54 */     paramhd.writeInt(this.d);
/* 44:55 */     paramhd.writeFloat(this.e);
/* 45:56 */     paramhd.writeByte(this.f);
/* 46:   */   }
/* 47:   */   
/* 48:   */   public String a()
/* 49:   */   {
/* 50:60 */     return this.a;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public double b()
/* 54:   */   {
/* 55:64 */     return this.b / 8.0F;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public double c()
/* 59:   */   {
/* 60:68 */     return this.c / 8.0F;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public double d()
/* 64:   */   {
/* 65:72 */     return this.d / 8.0F;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public float e()
/* 69:   */   {
/* 70:76 */     return this.e;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public float f()
/* 74:   */   {
/* 75:80 */     return this.f / 63.0F;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public void a(ik paramik)
/* 79:   */   {
/* 80:85 */     paramik.a(this);
/* 81:   */   }
/* 82:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jv
 * JD-Core Version:    0.7.0.1
 */