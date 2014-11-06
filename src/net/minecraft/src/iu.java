package net.minecraft.src;

import java.io.IOException;

/*  1:   */ public class iu
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private BlockPosition a;
/*  5:   */   private int b;
/*  6:   */   private NBTTagCompound c;
/*  7:   */   
/*  8:   */   public iu() {}
/*  9:   */   
/* 10:   */   public iu(BlockPosition paramdt, int paramInt, NBTTagCompound paramfn)
/* 11:   */   {
/* 12:28 */     this.a = paramdt;
/* 13:29 */     this.b = paramInt;
/* 14:30 */     this.c = paramfn;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void fromBuffer(ByteBufWrapper paramhd) throws IOException
/* 18:   */   {
/* 19:35 */     this.a = paramhd.readBlockPosition();
/* 20:36 */     this.b = paramhd.readUnsignedByte();
/* 21:37 */     this.c = paramhd.h();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:42 */     paramhd.writeBlockPosition(this.a);
/* 27:43 */     paramhd.writeByte((byte)this.b);
/* 28:44 */     paramhd.a(this.c);
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(ik paramik)
/* 32:   */   {
/* 33:49 */     paramik.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public BlockPosition a()
/* 37:   */   {
/* 38:53 */     return this.a;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public int b()
/* 42:   */   {
/* 43:57 */     return this.b;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public NBTTagCompound c()
/* 47:   */   {
/* 48:61 */     return this.c;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     iu
 * JD-Core Version:    0.7.0.1
 */