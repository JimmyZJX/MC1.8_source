package net.minecraft.src;
/*  1:   */ public class lr
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private byte b;
/*  6:   */   private byte c;
/*  7:   */   private int d;
/*  8:   */   private byte e;
/*  9:   */   
/* 10:   */   public lr() {}
/* 11:   */   
/* 12:   */   public lr(int paramInt, wq paramwq)
/* 13:   */   {
/* 14:23 */     this.a = paramInt;
/* 15:24 */     this.b = ((byte)(paramwq.getID() & 0xFF));
/* 16:25 */     this.c = ((byte)(paramwq.getAmplifier() & 0xFF));
/* 17:26 */     if (paramwq.getDuration() > 32767) {
/* 18:27 */       this.d = 32767;
/* 19:   */     } else {
/* 20:30 */       this.d = paramwq.getDuration();
/* 21:   */     }
/* 22:32 */     this.e = ((byte)(paramwq.getShowParticles() ? 1 : 0));
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 26:   */   {
/* 27:37 */     this.a = paramhd.e();
/* 28:38 */     this.b = paramhd.readByte();
/* 29:39 */     this.c = paramhd.readByte();
/* 30:40 */     this.d = paramhd.e();
/* 31:41 */     this.e = paramhd.readByte();
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 35:   */   {
/* 36:46 */     paramhd.b(this.a);
/* 37:47 */     paramhd.writeByte(this.b);
/* 38:48 */     paramhd.writeByte(this.c);
/* 39:49 */     paramhd.b(this.d);
/* 40:50 */     paramhd.writeByte(this.e);
/* 41:   */   }
/* 42:   */   
/* 43:   */   public boolean a()
/* 44:   */   {
/* 45:54 */     return this.d == 32767;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void a(ik paramik)
/* 49:   */   {
/* 50:59 */     paramik.a(this);
/* 51:   */   }
/* 52:   */   
/* 53:   */   public int b()
/* 54:   */   {
/* 55:63 */     return this.a;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public byte c()
/* 59:   */   {
/* 60:67 */     return this.b;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public byte d()
/* 64:   */   {
/* 65:71 */     return this.c;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public int e()
/* 69:   */   {
/* 70:75 */     return this.d;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public boolean f()
/* 74:   */   {
/* 75:79 */     return this.e != 0;
/* 76:   */   }
/* 77:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lr
 * JD-Core Version:    0.7.0.1
 */