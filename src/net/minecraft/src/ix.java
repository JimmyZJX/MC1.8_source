package net.minecraft.src;
/*  1:   */ public class ix
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private EnumDifficulty a;
/*  5:   */   private boolean b;
/*  6:   */   
/*  7:   */   public ix() {}
/*  8:   */   
/*  9:   */   public ix(EnumDifficulty paramvt, boolean paramBoolean)
/* 10:   */   {
/* 11:19 */     this.a = paramvt;
/* 12:20 */     this.b = paramBoolean;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(ik paramik)
/* 16:   */   {
/* 17:25 */     paramik.a(this);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 21:   */   {
/* 22:30 */     this.a = EnumDifficulty.a(paramhd.readUnsignedByte());
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 26:   */   {
/* 27:35 */     paramhd.writeByte(this.a.a());
/* 28:   */   }
/* 29:   */   
/* 30:   */   public boolean a()
/* 31:   */   {
/* 32:39 */     return this.b;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public EnumDifficulty b()
/* 36:   */   {
/* 37:43 */     return this.a;
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ix
 * JD-Core Version:    0.7.0.1
 */