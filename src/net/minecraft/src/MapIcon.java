package net.minecraft.src;
/*  1:   */ public class MapIcon
/*  2:   */ {
/*  3:   */   private byte type;
/*  4:   */   private byte x;
/*  5:   */   private byte y;
/*  6:   */   private byte orientation;
/*  7:   */   
/*  8:   */   public MapIcon(byte type, byte x, byte y, byte orientation)
/*  9:   */   {
/* 10:10 */     this.type = type;
/* 11:11 */     this.x = x;
/* 12:12 */     this.y = y;
/* 13:13 */     this.orientation = orientation;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public MapIcon(MapIcon icon)
/* 17:   */   {
/* 18:17 */     this.type = icon.type;
/* 19:18 */     this.x = icon.x;
/* 20:19 */     this.y = icon.y;
/* 21:20 */     this.orientation = icon.orientation;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public byte getType()
/* 25:   */   {
/* 26:24 */     return this.type;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public byte getX()
/* 30:   */   {
/* 31:32 */     return this.x;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public byte getY()
/* 35:   */   {
/* 36:40 */     return this.y;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public byte getOrientation()
/* 40:   */   {
/* 41:48 */     return this.orientation;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public boolean equals(Object paramObject)
/* 45:   */   {
/* 46:57 */     if (this == paramObject) {
/* 47:58 */       return true;
/* 48:   */     }
/* 49:60 */     if (!(paramObject instanceof MapIcon)) {
/* 50:61 */       return false;
/* 51:   */     }
/* 52:64 */     MapIcon localbqd = (MapIcon)paramObject;
/* 53:66 */     if (this.type != localbqd.type) {
/* 54:67 */       return false;
/* 55:   */     }
/* 56:69 */     if (this.orientation != localbqd.orientation) {
/* 57:70 */       return false;
/* 58:   */     }
/* 59:72 */     if (this.x != localbqd.x) {
/* 60:73 */       return false;
/* 61:   */     }
/* 62:75 */     if (this.y != localbqd.y) {
/* 63:76 */       return false;
/* 64:   */     }
/* 65:79 */     return true;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public int hashCode()
/* 69:   */   {
/* 70:84 */     int i = this.type;
/* 71:85 */     i = 31 * i + this.x;
/* 72:86 */     i = 31 * i + this.y;
/* 73:87 */     i = 31 * i + this.orientation;
/* 74:88 */     return i;
/* 75:   */   }
/* 76:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bqd
 * JD-Core Version:    0.7.0.1
 */