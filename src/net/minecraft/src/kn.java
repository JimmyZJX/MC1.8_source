package net.minecraft.src;
/*  1:   */ public class kn
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   
/*  7:   */   public kn() {}
/*  8:   */   
/*  9:   */   public kn(int paramInt, wq paramwq)
/* 10:   */   {
/* 11:18 */     this.a = paramInt;
/* 12:19 */     this.b = paramwq.a();
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 16:   */   {
/* 17:24 */     this.a = paramhd.e();
/* 18:25 */     this.b = paramhd.readUnsignedByte();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 22:   */   {
/* 23:30 */     paramhd.b(this.a);
/* 24:31 */     paramhd.writeByte(this.b);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(ik paramik)
/* 28:   */   {
/* 29:36 */     paramik.a(this);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public int a()
/* 33:   */   {
/* 34:40 */     return this.a;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public int b()
/* 38:   */   {
/* 39:44 */     return this.b;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kn
 * JD-Core Version:    0.7.0.1
 */