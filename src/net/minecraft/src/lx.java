package net.minecraft.src;
/*  1:   */ public class lx
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:   */   private String a;
/*  5:   */   private int b;
/*  6:   */   private ahg c;
/*  7:   */   private boolean d;
/*  8:   */   private int e;
/*  9:   */   
/* 10:   */   public lx() {}
/* 11:   */   
/* 12:   */   public lx(String paramString, int paramInt1, ahg paramahg, boolean paramBoolean, int paramInt2)
/* 13:   */   {
/* 14:23 */     this.a = paramString;
/* 15:24 */     this.b = paramInt1;
/* 16:25 */     this.c = paramahg;
/* 17:26 */     this.d = paramBoolean;
/* 18:27 */     this.e = paramInt2;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 22:   */   {
/* 23:32 */     this.a = paramhd.c(7);
/* 24:33 */     this.b = paramhd.readByte();
/* 25:   */     
/* 26:35 */     this.c = ahg.a(paramhd.readByte());
/* 27:36 */     this.d = paramhd.readBoolean();
/* 28:   */     
/* 29:38 */     this.e = paramhd.readUnsignedByte();
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 33:   */   {
/* 34:43 */     paramhd.a(this.a);
/* 35:44 */     paramhd.writeByte(this.b);
/* 36:45 */     paramhd.writeByte(this.c.a());
/* 37:46 */     paramhd.writeBoolean(this.d);
/* 38:47 */     paramhd.writeByte(this.e);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void a(ls paramls)
/* 42:   */   {
/* 43:52 */     paramls.a(this);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String a()
/* 47:   */   {
/* 48:56 */     return this.a;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public ahg c()
/* 52:   */   {
/* 53:64 */     return this.c;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public boolean d()
/* 57:   */   {
/* 58:68 */     return this.d;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public int e()
/* 62:   */   {
/* 63:72 */     return this.e;
/* 64:   */   }
/* 65:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lx
 * JD-Core Version:    0.7.0.1
 */