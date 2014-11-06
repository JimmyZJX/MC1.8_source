package net.minecraft.src;
/*  1:   */ public class lo
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private int b;
/*  6:   */   private int c;
/*  7:   */   private int d;
/*  8:   */   private byte e;
/*  9:   */   private byte f;
/* 10:   */   private boolean g;
/* 11:   */   
/* 12:   */   public lo() {}
/* 13:   */   
/* 14:   */   public lo(Entity paramwv)
/* 15:   */   {
/* 16:23 */     this.a = paramwv.getID();
/* 17:24 */     this.b = MathUtils.floor(paramwv.xPos * 32.0D);
/* 18:25 */     this.c = MathUtils.floor(paramwv.yPos * 32.0D);
/* 19:26 */     this.d = MathUtils.floor(paramwv.zPos * 32.0D);
/* 20:27 */     this.e = ((byte)(int)(paramwv.yaw * 256.0F / 360.0F));
/* 21:28 */     this.f = ((byte)(int)(paramwv.pitch * 256.0F / 360.0F));
/* 22:29 */     this.g = paramwv.C;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public lo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, byte paramByte1, byte paramByte2, boolean paramBoolean)
/* 26:   */   {
/* 27:33 */     this.a = paramInt1;
/* 28:34 */     this.b = paramInt2;
/* 29:35 */     this.c = paramInt3;
/* 30:36 */     this.d = paramInt4;
/* 31:37 */     this.e = paramByte1;
/* 32:38 */     this.f = paramByte2;
/* 33:39 */     this.g = paramBoolean;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 37:   */   {
/* 38:44 */     this.a = paramhd.e();
/* 39:45 */     this.b = paramhd.readInt();
/* 40:46 */     this.c = paramhd.readInt();
/* 41:47 */     this.d = paramhd.readInt();
/* 42:48 */     this.e = paramhd.readByte();
/* 43:49 */     this.f = paramhd.readByte();
/* 44:50 */     this.g = paramhd.readBoolean();
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 48:   */   {
/* 49:55 */     paramhd.b(this.a);
/* 50:56 */     paramhd.writeInt(this.b);
/* 51:57 */     paramhd.writeInt(this.c);
/* 52:58 */     paramhd.writeInt(this.d);
/* 53:59 */     paramhd.writeByte(this.e);
/* 54:60 */     paramhd.writeByte(this.f);
/* 55:61 */     paramhd.writeBoolean(this.g);
/* 56:   */   }
/* 57:   */   
/* 58:   */   public void a(ik paramik)
/* 59:   */   {
/* 60:66 */     paramik.a(this);
/* 61:   */   }
/* 62:   */   
/* 63:   */   public int a()
/* 64:   */   {
/* 65:70 */     return this.a;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public int b()
/* 69:   */   {
/* 70:74 */     return this.b;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public int c()
/* 74:   */   {
/* 75:78 */     return this.c;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public int d()
/* 79:   */   {
/* 80:82 */     return this.d;
/* 81:   */   }
/* 82:   */   
/* 83:   */   public byte e()
/* 84:   */   {
/* 85:86 */     return this.e;
/* 86:   */   }
/* 87:   */   
/* 88:   */   public byte f()
/* 89:   */   {
/* 90:90 */     return this.f;
/* 91:   */   }
/* 92:   */   
/* 93:   */   public boolean g()
/* 94:   */   {
/* 95:94 */     return this.g;
/* 96:   */   }
/* 97:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lo
 * JD-Core Version:    0.7.0.1
 */