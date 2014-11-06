package net.minecraft.src;
/*  1:   */ public class in
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   private int c;
/*  7:   */   private int d;
/*  8:   */   private int e;
/*  9:   */   
/* 10:   */   public in() {}
/* 11:   */   
/* 12:   */   public in(Entity paramwv)
/* 13:   */   {
/* 14:26 */     this.a = paramwv.getID();
/* 15:27 */     this.b = MathUtils.floor(paramwv.xPos * 32.0D);
/* 16:28 */     this.c = MathUtils.floor(paramwv.yPos * 32.0D);
/* 17:29 */     this.d = MathUtils.floor(paramwv.zPos * 32.0D);
/* 18:30 */     if ((paramwv instanceof ads)) {
/* 19:31 */       this.e = 1;
/* 20:   */     }
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 24:   */   {
/* 25:37 */     this.a = paramhd.e();
/* 26:38 */     this.e = paramhd.readByte();
/* 27:39 */     this.b = paramhd.readInt();
/* 28:40 */     this.c = paramhd.readInt();
/* 29:41 */     this.d = paramhd.readInt();
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 33:   */   {
/* 34:46 */     paramhd.b(this.a);
/* 35:47 */     paramhd.writeByte(this.e);
/* 36:48 */     paramhd.writeInt(this.b);
/* 37:49 */     paramhd.writeInt(this.c);
/* 38:50 */     paramhd.writeInt(this.d);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void a(ik paramik)
/* 42:   */   {
/* 43:55 */     paramik.a(this);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int a()
/* 47:   */   {
/* 48:59 */     return this.a;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public int b()
/* 52:   */   {
/* 53:63 */     return this.b;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public int c()
/* 57:   */   {
/* 58:67 */     return this.c;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public int d()
/* 62:   */   {
/* 63:71 */     return this.d;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public int e()
/* 67:   */   {
/* 68:75 */     return this.e;
/* 69:   */   }
/* 70:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     in
 * JD-Core Version:    0.7.0.1
 */