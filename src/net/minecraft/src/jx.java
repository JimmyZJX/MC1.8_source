package net.minecraft.src;
/*   1:    */ import java.util.Collection;
/*   3:    */ 
/*   4:    */ public class jx
/*   5:    */   implements id<ik>
/*   6:    */ {
/*   7:    */   private int a;
/*   8:    */   private byte scale;
/*   9:    */   private MapIcon[] icons;
/*  10:    */   private int xmin;
/*  11:    */   private int ymin;
/*  12:    */   private int xlen;
/*  13:    */   private int ylen;
/*  14:    */   private byte[] h;
/*  15:    */   
/*  16:    */   public jx() {}
/*  17:    */   
/*  18:    */   public jx(int paramInt1, byte paramByte, Collection<MapIcon> paramCollection, byte[] paramArrayOfByte, int xmin, int ymin, int xlen, int ylen)
/*  19:    */   {
/*  20: 29 */     this.a = paramInt1;
/*  21: 30 */     this.scale = paramByte;
/*  22: 31 */     this.icons = paramCollection.toArray(new MapIcon[paramCollection.size()]);
/*  23: 32 */     this.xmin = xmin;
/*  24: 33 */     this.ymin = ymin;
/*  25: 34 */     this.xlen = xlen;
/*  26: 35 */     this.ylen = ylen;
/*  27:    */     
/*  28: 37 */     this.h = new byte[xlen * ylen];
/*  29: 38 */     for (int i = 0; i < xlen; i++) {
/*  30: 39 */       for (int j = 0; j < ylen; j++) {
/*  31: 40 */         this.h[(i + j * xlen)] = paramArrayOfByte[(xmin + i + (ymin + j) * 128)];
/*  32:    */       }
/*  33:    */     }
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void fromBuffer(ByteBufWrapper buffer)
/*  37:    */   {
/*  38: 47 */     this.a = buffer.e();
/*  39: 48 */     this.scale = buffer.readByte();
/*  40: 49 */     this.icons = new MapIcon[buffer.e()];
/*  41: 50 */     for (int i = 0; i < this.icons.length; i++)
/*  42:    */     {
/*  43: 51 */       int j = (short)buffer.readByte();
/*  44: 52 */       this.icons[i] = new MapIcon((byte)(j >> 4 & 0xF), buffer.readByte(), buffer.readByte(), (byte)(j & 0xF));
/*  45:    */     }
/*  46: 54 */     this.xlen = buffer.readUnsignedByte();
/*  47: 55 */     if (this.xlen > 0)
/*  48:    */     {
/*  49: 56 */       this.ylen = buffer.readUnsignedByte();
/*  50: 57 */       this.xmin = buffer.readUnsignedByte();
/*  51: 58 */       this.ymin = buffer.readUnsignedByte();
/*  52: 59 */       this.h = buffer.readByteArray();
/*  53:    */     }
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  57:    */   {
/*  58: 65 */     paramhd.b(this.a);
/*  59: 66 */     paramhd.writeByte(this.scale);
/*  60: 67 */     paramhd.b(this.icons.length);
/*  61: 68 */     for (MapIcon localbqd : this.icons)
/*  62:    */     {
/*  63: 69 */       paramhd.writeByte((localbqd.getType() & 0xF) << 4 | localbqd.getOrientation() & 0xF);
/*  64: 70 */       paramhd.writeByte(localbqd.getX());
/*  65: 71 */       paramhd.writeByte(localbqd.getY());
/*  66:    */     }
/*  67: 73 */     paramhd.writeByte(this.xlen);
/*  68: 74 */     if (this.xlen > 0)
/*  69:    */     {
/*  70: 75 */       paramhd.writeByte(this.ylen);
/*  71: 76 */       paramhd.writeByte(this.xmin);
/*  72: 77 */       paramhd.writeByte(this.ymin);
/*  73: 78 */       paramhd.writeByteArray(this.h);
/*  74:    */     }
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a(ik paramik)
/*  78:    */   {
/*  79: 84 */     paramik.a(this);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public int a()
/*  83:    */   {
/*  84: 88 */     return this.a;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void pushInfo(MapInfo mapInfo)
/*  88:    */   {
/*  89: 92 */     mapInfo.scale = this.scale;
/*  90: 93 */     mapInfo.icons.clear();
/*  91: 94 */     for (int i = 0; i < this.icons.length; i++)
/*  92:    */     {
/*  93: 95 */       MapIcon localbqd = this.icons[i];
/*  94: 96 */       mapInfo.icons.put("icon-" + i, localbqd);
/*  95:    */     }
/*  96: 98 */     for (int i = 0; i < this.xlen; i++) {
/*  97: 99 */       for (int j = 0; j < this.ylen; j++) {
/*  98:100 */         mapInfo.content[(this.xmin + i + (this.ymin + j) * 128)] = this.h[(i + j * this.xlen)];
/*  99:    */       }
/* 100:    */     }
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jx
 * JD-Core Version:    0.7.0.1
 */