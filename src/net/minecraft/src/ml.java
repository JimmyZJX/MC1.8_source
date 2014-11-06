package net.minecraft.src;
/*  1:   */ public class ml
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:   */   private BlockPosition a;
/*  5:   */   private EnumDirection b;
/*  6:   */   private mm c;
/*  7:   */   
/*  8:   */   public ml() {}
/*  9:   */   
/* 10:   */   public ml(mm parammm, BlockPosition paramdt, EnumDirection paramej)
/* 11:   */   {
/* 12:19 */     this.c = parammm;
/* 13:20 */     this.a = paramdt;
/* 14:21 */     this.b = paramej;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 18:   */   {
/* 19:26 */     this.c = ((mm)paramhd.a(mm.class));
/* 20:27 */     this.a = paramhd.readBlockPosition();
/* 21:28 */     this.b = EnumDirection.a(paramhd.readUnsignedByte());
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:33 */     paramhd.a(this.c);
/* 27:34 */     paramhd.writeBlockPosition(this.a);
/* 28:35 */     paramhd.writeByte(this.b.a());
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(ls paramls)
/* 32:   */   {
/* 33:40 */     paramls.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public BlockPosition a()
/* 37:   */   {
/* 38:44 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public EnumDirection b()
/* 42:   */   {
/* 43:48 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public mm c()
/* 47:   */   {
/* 48:52 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ml
 * JD-Core Version:    0.7.0.1
 */