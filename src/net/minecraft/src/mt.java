package net.minecraft.src;

import java.io.IOException;

/*  1:   */ public class mt
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private ItemStack b;
/*  6:   */   
/*  7:   */   public mt() {}
/*  8:   */   
/*  9:   */   public mt(int paramInt, ItemStack paramamj)
/* 10:   */   {
/* 11:17 */     this.a = paramInt;
/* 12:18 */     this.b = (paramamj != null ? paramamj.k() : null);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(ls paramls)
/* 16:   */   {
/* 17:23 */     paramls.a(this);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void fromBuffer(ByteBufWrapper paramhd) throws IOException
/* 21:   */   {
/* 22:28 */     this.a = paramhd.readShort();
/* 23:29 */     this.b = paramhd.i();
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 27:   */   {
/* 28:34 */     paramhd.writeShort(this.a);
/* 29:35 */     paramhd.a(this.b);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public int a()
/* 33:   */   {
/* 34:39 */     return this.a;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public ItemStack b()
/* 38:   */   {
/* 39:43 */     return this.b;
/* 40:   */   }
/* 41:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mt
 * JD-Core Version:    0.7.0.1
 */