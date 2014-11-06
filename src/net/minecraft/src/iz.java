package net.minecraft.src;
/*  1:   */ public class iz
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private ho a;
/*  5:   */   private byte b;
/*  6:   */   
/*  7:   */   public iz() {}
/*  8:   */   
/*  9:   */   public iz(ho paramho)
/* 10:   */   {
/* 11:22 */     this(paramho, (byte)1);
/* 12:   */   }
/* 13:   */   
/* 14:   */   public iz(ho paramho, byte paramByte)
/* 15:   */   {
/* 16:26 */     this.a = paramho;
/* 17:27 */     this.b = paramByte;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 21:   */   {
/* 22:32 */     this.a = paramhd.d();
/* 23:33 */     this.b = paramhd.readByte();
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 27:   */   {
/* 28:38 */     paramhd.a(this.a);
/* 29:39 */     paramhd.writeByte(this.b);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void a(ik paramik)
/* 33:   */   {
/* 34:44 */     paramik.a(this);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public ho a()
/* 38:   */   {
/* 39:48 */     return this.a;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean b()
/* 43:   */   {
/* 44:52 */     return (this.b == 1) || (this.b == 2);
/* 45:   */   }
/* 46:   */   
/* 47:   */   public byte c()
/* 48:   */   {
/* 49:56 */     return this.b;
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     iz
 * JD-Core Version:    0.7.0.1
 */