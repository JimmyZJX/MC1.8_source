package net.minecraft.src;
/*  1:   */ public class ChunkID
/*  2:   */ {
/*  3:   */   public final int x;
/*  4:   */   public final int z;
/*  5:   */   
/*  6:   */   public ChunkID(int x, int z)
/*  7:   */   {
/*  8:10 */     this.x = x;
/*  9:11 */     this.z = z;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public static long toLong(int paramInt1, int paramInt2)
/* 13:   */   {
/* 14:15 */     return paramInt1 & 0xFFFFFFFF | (paramInt2 & 0xFFFFFFFF) << 32;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public int hashCode()
/* 18:   */   {
/* 19:24 */     int i = 1664525 * this.x + 1013904223;
/* 20:25 */     int j = 1664525 * (this.z ^ 0xDEADBEEF) + 1013904223;
/* 21:26 */     return i ^ j;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public boolean equals(Object paramObject)
/* 25:   */   {
/* 26:31 */     if (this == paramObject) {
/* 27:32 */       return true;
/* 28:   */     }
/* 29:35 */     if ((paramObject instanceof ChunkID))
/* 30:   */     {
/* 31:36 */       ChunkID localaqm = (ChunkID)paramObject;
/* 32:   */       
/* 33:38 */       return (this.x == localaqm.x) && (this.z == localaqm.z);
/* 34:   */     }
/* 35:41 */     return false;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public int getCenterX()
/* 39:   */   {
/* 40:55 */     return (this.x << 4) + 8;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int getCenterZ()
/* 44:   */   {
/* 45:59 */     return (this.z << 4) + 8;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public int c()
/* 49:   */   {
/* 50:63 */     return this.x << 4;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public int d()
/* 54:   */   {
/* 55:67 */     return this.z << 4;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public int e()
/* 59:   */   {
/* 60:71 */     return (this.x << 4) + 15;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public int f()
/* 64:   */   {
/* 65:75 */     return (this.z << 4) + 15;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public BlockPosition getBlockPos(int dx, int y, int dz)
/* 69:   */   {
/* 70:79 */     return new BlockPosition((this.x << 4) + dx, y, (this.z << 4) + dz);
/* 71:   */   }
/* 72:   */   
/* 73:   */   public BlockPosition getCenterBlockPos(int y)
/* 74:   */   {
/* 75:83 */     return new BlockPosition(getCenterX(), y, getCenterZ());
/* 76:   */   }
/* 77:   */   
/* 78:   */   public String toString()
/* 79:   */   {
/* 80:87 */     return "[" + this.x + ", " + this.z + "]";
/* 81:   */   }
/* 82:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aqm
 * JD-Core Version:    0.7.0.1
 */