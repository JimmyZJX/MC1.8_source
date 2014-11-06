package net.minecraft.src;
/*   1:    */ import java.util.Collection;
/*   3:    */ 
/*   4:    */ public class jx
/*   5:    */   implements id<ik>
/*   6:    */ {
/*   7:    */   private int a;
/*   8:    */   private byte scale;
/*   9:    */   private MapIcon[] icons;
/*  10:    */   private int d;
/*  11:    */   private int e;
/*  12:    */   private int f;
/*  13:    */   private int g;
/*  14:    */   private byte[] h;
/*  15:    */   
/*  16:    */   public jx() {}
/*  17:    */   
/*  18:    */   public jx(int paramInt1, byte paramByte, Collection<MapIcon> paramCollection, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*  19:    */   {
/*  20: 29 */     this.a = paramInt1;
/*  21: 30 */     this.scale = paramByte;
/*  22: 31 */     this.icons = paramCollection.toArray(new MapIcon[paramCollection.size()]);
/*  23: 32 */     this.d = paramInt2;
/*  24: 33 */     this.e = paramInt3;
/*  25: 34 */     this.f = paramInt4;
/*  26: 35 */     this.g = paramInt5;
/*  27:    */     
/*  28: 37 */     this.h = new byte[paramInt4 * paramInt5];
/*  29: 38 */     for (int i = 0; i < paramInt4; i++) {
/*  30: 39 */       for (int j = 0; j < paramInt5; j++) {
/*  31: 40 */         this.h[(i + j * paramInt4)] = paramArrayOfByte[(paramInt2 + i + (paramInt3 + j) * 128)];
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
/*  46: 54 */     this.f = buffer.readUnsignedByte();
/*  47: 55 */     if (this.f > 0)
/*  48:    */     {
/*  49: 56 */       this.g = buffer.readUnsignedByte();
/*  50: 57 */       this.d = buffer.readUnsignedByte();
/*  51: 58 */       this.e = buffer.readUnsignedByte();
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
/*  67: 73 */     paramhd.writeByte(this.f);
/*  68: 74 */     if (this.f > 0)
/*  69:    */     {
/*  70: 75 */       paramhd.writeByte(this.g);
/*  71: 76 */       paramhd.writeByte(this.d);
/*  72: 77 */       paramhd.writeByte(this.e);
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
/*  87:    */   public void pushInfo(MapInfo parambqe)
/*  88:    */   {
/*  89: 92 */     parambqe.scale = this.scale;
/*  90: 93 */     parambqe.icons.clear();
/*  91: 94 */     for (int i = 0; i < this.icons.length; i++)
/*  92:    */     {
/*  93: 95 */       MapIcon localbqd = this.icons[i];
/*  94: 96 */       parambqe.icons.put("icon-" + i, localbqd);
/*  95:    */     }
/*  96: 98 */     for (int i = 0; i < this.f; i++) {
/*  97: 99 */       for (int j = 0; j < this.g; j++) {
/*  98:100 */         parambqe.f[(this.d + i + (this.e + j) * 128)] = this.h[(i + j * this.f)];
/*  99:    */       }
/* 100:    */     }
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jx
 * JD-Core Version:    0.7.0.1
 */