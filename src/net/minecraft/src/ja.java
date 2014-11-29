package net.minecraft.src;
/*  1:   */ public class ja
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private ChunkID a;
/*  5:   */   private jb[] b;
/*  6:   */   
/*  7:   */   public ja() {}
/*  8:   */   
/*  9:   */   public ja(int paramInt, short[] paramArrayOfShort, Chunk parambfh)
/* 10:   */   {
/* 11:22 */     this.a = new ChunkID(parambfh.x, parambfh.z);
/* 12:   */     
/* 13:24 */     this.b = new jb[paramInt];
/* 14:25 */     for (int i = 0; i < this.b.length; i++) {
/* 15:26 */       this.b[i] = new jb(this, paramArrayOfShort[i], parambfh);
/* 16:   */     }
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 20:   */   {
/* 21:32 */     this.a = new ChunkID(paramhd.readInt(), paramhd.readInt());
/* 22:33 */     this.b = new jb[paramhd.e()];
/* 23:35 */     for (int i = 0; i < this.b.length; i++) {
/* 24:36 */       this.b[i] = new jb(this, paramhd.readShort(), (Block)BlockType.d.a(paramhd.e()));
/* 25:   */     }
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 29:   */   {
/* 30:42 */     paramhd.writeInt(this.a.x);
/* 31:43 */     paramhd.writeInt(this.a.z);
/* 32:44 */     paramhd.b(this.b.length);
/* 33:45 */     for (jb localjb : this.b)
/* 34:   */     {
/* 35:46 */       paramhd.writeShort(localjb.b());
/* 36:47 */       paramhd.b(BlockType.d.b(localjb.c()));
/* 37:   */     }
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void a(ik paramik)
/* 41:   */   {
/* 42:53 */     paramik.a(this);
/* 43:   */   }
/* 44:   */   
/* 45:   */   public jb[] a()
/* 46:   */   {
/* 47:57 */     return this.b;
/* 48:   */   }
			  static ChunkID a(ja arg0) {return arg0.a;}
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ja
 * JD-Core Version:    0.7.0.1
 */