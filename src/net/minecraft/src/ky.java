package net.minecraft.src;
/*  1:   */ public class ky
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   private int c;
/*  7:   */   
/*  8:   */   public ky() {}
/*  9:   */   
/* 10:   */   public ky(int paramInt, Entity paramwv1, Entity paramwv2)
/* 11:   */   {
/* 12:21 */     this.a = paramInt;
/* 13:22 */     this.b = paramwv1.getID();
/* 14:23 */     this.c = (paramwv2 != null ? paramwv2.getID() : -1);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 18:   */   {
/* 19:28 */     this.b = paramhd.readInt();
/* 20:29 */     this.c = paramhd.readInt();
/* 21:30 */     this.a = paramhd.readUnsignedByte();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:35 */     paramhd.writeInt(this.b);
/* 27:36 */     paramhd.writeInt(this.c);
/* 28:37 */     paramhd.writeByte(this.a);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(ik paramik)
/* 32:   */   {
/* 33:42 */     paramik.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int a()
/* 37:   */   {
/* 38:46 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int b()
/* 42:   */   {
/* 43:50 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int c()
/* 47:   */   {
/* 48:54 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ky
 * JD-Core Version:    0.7.0.1
 */