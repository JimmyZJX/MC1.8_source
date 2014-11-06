package net.minecraft.src;
/*  1:   */ public class kz
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   private int c;
/*  7:   */   private int d;
/*  8:   */   
/*  9:   */   public kz() {}
/* 10:   */   
/* 11:   */   public kz(Entity paramwv)
/* 12:   */   {
/* 13:19 */     this(paramwv.getID(), paramwv.xVelocity, paramwv.yVelocity, paramwv.zVelocity);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public kz(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
/* 17:   */   {
/* 18:23 */     this.a = paramInt;
/* 19:24 */     double d1 = 3.9D;
/* 20:25 */     if (paramDouble1 < -d1) {
/* 21:26 */       paramDouble1 = -d1;
/* 22:   */     }
/* 23:28 */     if (paramDouble2 < -d1) {
/* 24:29 */       paramDouble2 = -d1;
/* 25:   */     }
/* 26:31 */     if (paramDouble3 < -d1) {
/* 27:32 */       paramDouble3 = -d1;
/* 28:   */     }
/* 29:34 */     if (paramDouble1 > d1) {
/* 30:35 */       paramDouble1 = d1;
/* 31:   */     }
/* 32:37 */     if (paramDouble2 > d1) {
/* 33:38 */       paramDouble2 = d1;
/* 34:   */     }
/* 35:40 */     if (paramDouble3 > d1) {
/* 36:41 */       paramDouble3 = d1;
/* 37:   */     }
/* 38:43 */     this.b = ((int)(paramDouble1 * 8000.0D));
/* 39:44 */     this.c = ((int)(paramDouble2 * 8000.0D));
/* 40:45 */     this.d = ((int)(paramDouble3 * 8000.0D));
/* 41:   */   }
/* 42:   */   
/* 43:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 44:   */   {
/* 45:50 */     this.a = paramhd.e();
/* 46:51 */     this.b = paramhd.readShort();
/* 47:52 */     this.c = paramhd.readShort();
/* 48:53 */     this.d = paramhd.readShort();
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 52:   */   {
/* 53:58 */     paramhd.b(this.a);
/* 54:59 */     paramhd.writeShort(this.b);
/* 55:60 */     paramhd.writeShort(this.c);
/* 56:61 */     paramhd.writeShort(this.d);
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void a(ik paramik)
/* 60:   */   {
/* 61:66 */     paramik.a(this);
/* 62:   */   }
/* 63:   */   
/* 64:   */   public int a()
/* 65:   */   {
/* 66:70 */     return this.a;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public int b()
/* 70:   */   {
/* 71:74 */     return this.b;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public int c()
/* 75:   */   {
/* 76:78 */     return this.c;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public int d()
/* 80:   */   {
/* 81:82 */     return this.d;
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kz
 * JD-Core Version:    0.7.0.1
 */