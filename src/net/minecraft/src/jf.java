package net.minecraft.src;
import java.io.IOException;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class jf
/*  4:   */   implements id<ik>
/*  5:   */ {
/*  6:   */   private int a;
/*  7:   */   private ItemStack[] b;
/*  8:   */   
/*  9:   */   public jf() {}
/* 10:   */   
/* 11:   */   public jf(int paramInt, List paramList)
/* 12:   */   {
/* 13:20 */     this.a = paramInt;
/* 14:21 */     this.b = new ItemStack[paramList.size()];
/* 15:22 */     for (int i = 0; i < this.b.length; i++)
/* 16:   */     {
/* 17:23 */       ItemStack localamj = (ItemStack)paramList.get(i);
/* 18:24 */       this.b[i] = (localamj == null ? null : localamj.k());
/* 19:   */     }
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void fromBuffer(ByteBufWrapper paramhd) throws IOException
/* 23:   */   {
/* 24:30 */     this.a = paramhd.readUnsignedByte();
/* 25:31 */     int i = paramhd.readShort();
/* 26:32 */     this.b = new ItemStack[i];
/* 27:33 */     for (int j = 0; j < i; j++) {
/* 28:34 */       this.b[j] = paramhd.i();
/* 29:   */     }
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 33:   */   {
/* 34:40 */     paramhd.writeByte(this.a);
/* 35:41 */     paramhd.writeShort(this.b.length);
/* 36:42 */     for (ItemStack localamj : this.b) {
/* 37:43 */       paramhd.a(localamj);
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void a(ik paramik)
/* 42:   */   {
/* 43:49 */     paramik.a(this);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int a()
/* 47:   */   {
/* 48:53 */     return this.a;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public ItemStack[] b()
/* 52:   */   {
/* 53:57 */     return this.b;
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jf
 * JD-Core Version:    0.7.0.1
 */