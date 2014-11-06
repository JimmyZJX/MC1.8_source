package net.minecraft.src;
/*  1:   */ public class jk
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private byte b;
/*  6:   */   
/*  7:   */   public jk() {}
/*  8:   */   
/*  9:   */   public jk(Entity paramwv, byte paramByte)
/* 10:   */   {
/* 11:20 */     this.a = paramwv.getID();
/* 12:21 */     this.b = paramByte;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 16:   */   {
/* 17:26 */     this.a = paramhd.readInt();
/* 18:27 */     this.b = paramhd.readByte();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 22:   */   {
/* 23:32 */     paramhd.writeInt(this.a);
/* 24:33 */     paramhd.writeByte(this.b);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(ik paramik)
/* 28:   */   {
/* 29:38 */     paramik.a(this);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public Entity a(World paramaqu)
/* 33:   */   {
/* 34:42 */     return paramaqu.a(this.a);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public byte a()
/* 38:   */   {
/* 39:46 */     return this.b;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jk
 * JD-Core Version:    0.7.0.1
 */