package net.minecraft.src;

import java.io.IOException;

/*  1:   */ public class mx
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:12 */   private static final BlockPosition a = new BlockPosition(-1, -1, -1);
/*  5:   */   private BlockPosition b;
/*  6:   */   private int c;
/*  7:   */   private ItemStack d;
/*  8:   */   private float e;
/*  9:   */   private float f;
/* 10:   */   private float g;
/* 11:   */   
/* 12:   */   public mx() {}
/* 13:   */   
/* 14:   */   public mx(ItemStack paramamj)
/* 15:   */   {
/* 16:25 */     this(a, 255, paramamj, 0.0F, 0.0F, 0.0F);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public mx(BlockPosition paramdt, int paramInt, ItemStack paramamj, float paramFloat1, float paramFloat2, float paramFloat3)
/* 20:   */   {
/* 21:29 */     this.b = paramdt;
/* 22:30 */     this.c = paramInt;
/* 23:31 */     this.d = (paramamj != null ? paramamj.k() : null);
/* 24:32 */     this.e = paramFloat1;
/* 25:33 */     this.f = paramFloat2;
/* 26:34 */     this.g = paramFloat3;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void fromBuffer(ByteBufWrapper paramhd) throws IOException
/* 30:   */   {
/* 31:39 */     this.b = paramhd.readBlockPosition();
/* 32:40 */     this.c = paramhd.readUnsignedByte();
/* 33:41 */     this.d = paramhd.i();
/* 34:42 */     this.e = (paramhd.readUnsignedByte() / 16.0F);
/* 35:43 */     this.f = (paramhd.readUnsignedByte() / 16.0F);
/* 36:44 */     this.g = (paramhd.readUnsignedByte() / 16.0F);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 40:   */   {
/* 41:49 */     paramhd.writeBlockPosition(this.b);
/* 42:50 */     paramhd.writeByte(this.c);
/* 43:51 */     paramhd.a(this.d);
/* 44:52 */     paramhd.writeByte((int)(this.e * 16.0F));
/* 45:53 */     paramhd.writeByte((int)(this.f * 16.0F));
/* 46:54 */     paramhd.writeByte((int)(this.g * 16.0F));
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void a(ls paramls)
/* 50:   */   {
/* 51:59 */     paramls.a(this);
/* 52:   */   }
/* 53:   */   
/* 54:   */   public BlockPosition a()
/* 55:   */   {
/* 56:63 */     return this.b;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public int b()
/* 60:   */   {
/* 61:67 */     return this.c;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public ItemStack c()
/* 65:   */   {
/* 66:71 */     return this.d;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public float d()
/* 70:   */   {
/* 71:75 */     return this.e;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public float e()
/* 75:   */   {
/* 76:79 */     return this.f;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public float f()
/* 80:   */   {
/* 81:83 */     return this.g;
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mx
 * JD-Core Version:    0.7.0.1
 */