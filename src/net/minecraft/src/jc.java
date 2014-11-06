package net.minecraft.src;
/*  1:   */ public class jc
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private short b;
/*  6:   */   private boolean c;
/*  7:   */   
/*  8:   */   public jc() {}
/*  9:   */   
/* 10:   */   public jc(int paramInt, short paramShort, boolean paramBoolean)
/* 11:   */   {
/* 12:19 */     this.a = paramInt;
/* 13:20 */     this.b = paramShort;
/* 14:21 */     this.c = paramBoolean;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(ik paramik)
/* 18:   */   {
/* 19:26 */     paramik.a(this);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 23:   */   {
/* 24:31 */     this.a = paramhd.readUnsignedByte();
/* 25:32 */     this.b = paramhd.readShort();
/* 26:33 */     this.c = paramhd.readBoolean();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 30:   */   {
/* 31:38 */     paramhd.writeByte(this.a);
/* 32:39 */     paramhd.writeShort(this.b);
/* 33:40 */     paramhd.writeBoolean(this.c);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int a()
/* 37:   */   {
/* 38:44 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public short b()
/* 42:   */   {
/* 43:48 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public boolean c()
/* 47:   */   {
/* 48:52 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jc
 * JD-Core Version:    0.7.0.1
 */