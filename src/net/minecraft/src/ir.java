package net.minecraft.src;
/*  1:   */ public class ir
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   
/*  7:   */   public ir() {}
/*  8:   */   
/*  9:   */   public ir(Entity paramwv, int paramInt)
/* 10:   */   {
/* 11:26 */     this.a = paramwv.getID();
/* 12:27 */     this.b = paramInt;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 16:   */   {
/* 17:32 */     this.a = paramhd.e();
/* 18:33 */     this.b = paramhd.readUnsignedByte();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 22:   */   {
/* 23:38 */     paramhd.b(this.a);
/* 24:39 */     paramhd.writeByte(this.b);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(ik paramik)
/* 28:   */   {
/* 29:44 */     paramik.a(this);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public int a()
/* 33:   */   {
/* 34:48 */     return this.a;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public int b()
/* 38:   */   {
/* 39:52 */     return this.b;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ir
 * JD-Core Version:    0.7.0.1
 */