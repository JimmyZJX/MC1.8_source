package net.minecraft.src;

import java.io.IOException;

/*  1:   */ public class ma
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   private int c;
/*  7:   */   private short d;
/*  8:   */   private ItemStack e;
/*  9:   */   private int f;
/* 10:   */   
/* 11:   */   public ma() {}
/* 12:   */   
/* 13:   */   public ma(int paramInt1, int paramInt2, int paramInt3, int paramInt4, ItemStack paramamj, short paramShort)
/* 14:   */   {
/* 15:21 */     this.a = paramInt1;
/* 16:22 */     this.b = paramInt2;
/* 17:23 */     this.c = paramInt3;
/* 18:24 */     this.e = (paramamj != null ? paramamj.k() : null);
/* 19:25 */     this.d = paramShort;
/* 20:26 */     this.f = paramInt4;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(ls paramls)
/* 24:   */   {
/* 25:31 */     paramls.a(this);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void fromBuffer(ByteBufWrapper paramhd) throws IOException
/* 29:   */   {
/* 30:36 */     this.a = paramhd.readByte();
/* 31:37 */     this.b = paramhd.readShort();
/* 32:38 */     this.c = paramhd.readByte();
/* 33:39 */     this.d = paramhd.readShort();
/* 34:40 */     this.f = paramhd.readByte();
/* 35:   */     
/* 36:42 */     this.e = paramhd.i();
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 40:   */   {
/* 41:47 */     paramhd.writeByte(this.a);
/* 42:48 */     paramhd.writeShort(this.b);
/* 43:49 */     paramhd.writeByte(this.c);
/* 44:50 */     paramhd.writeShort(this.d);
/* 45:51 */     paramhd.writeByte(this.f);
/* 46:   */     
/* 47:53 */     paramhd.a(this.e);
/* 48:   */   }
/* 49:   */   
/* 50:   */   public int a()
/* 51:   */   {
/* 52:57 */     return this.a;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public int b()
/* 56:   */   {
/* 57:61 */     return this.b;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public int c()
/* 61:   */   {
/* 62:65 */     return this.c;
/* 63:   */   }
/* 64:   */   
/* 65:   */   public short d()
/* 66:   */   {
/* 67:69 */     return this.d;
/* 68:   */   }
/* 69:   */   
/* 70:   */   public ItemStack e()
/* 71:   */   {
/* 72:73 */     return this.e;
/* 73:   */   }
/* 74:   */   
/* 75:   */   public int f()
/* 76:   */   {
/* 77:77 */     return this.f;
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ma
 * JD-Core Version:    0.7.0.1
 */