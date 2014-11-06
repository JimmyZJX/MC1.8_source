package net.minecraft.src;

import java.io.IOException;

/*  1:   */ public class jh
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   private ItemStack c;
/*  7:   */   
/*  8:   */   public jh() {}
/*  9:   */   
/* 10:   */   public jh(int paramInt1, int paramInt2, ItemStack paramamj)
/* 11:   */   {
/* 12:20 */     this.a = paramInt1;
/* 13:21 */     this.b = paramInt2;
/* 14:22 */     this.c = (paramamj == null ? null : paramamj.k());
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void a(ik paramik)
/* 18:   */   {
/* 19:27 */     paramik.a(this);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void fromBuffer(ByteBufWrapper paramhd) throws IOException
/* 23:   */   {
/* 24:32 */     this.a = paramhd.readByte();
/* 25:33 */     this.b = paramhd.readShort();
/* 26:34 */     this.c = paramhd.i();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 30:   */   {
/* 31:39 */     paramhd.writeByte(this.a);
/* 32:40 */     paramhd.writeShort(this.b);
/* 33:41 */     paramhd.a(this.c);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int a()
/* 37:   */   {
/* 38:45 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int b()
/* 42:   */   {
/* 43:49 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public ItemStack c()
/* 47:   */   {
/* 48:53 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jh
 * JD-Core Version:    0.7.0.1
 */