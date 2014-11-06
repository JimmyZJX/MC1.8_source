package net.minecraft.src;
/*  1:   */ public class ip
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private BlockPosition b;
/*  6:   */   private EnumDirection c;
/*  7:   */   private String d;
/*  8:   */   
/*  9:   */   public ip() {}
/* 10:   */   
/* 11:   */   public ip(adm paramadm)
/* 12:   */   {
/* 13:23 */     this.a = paramadm.getID();
/* 14:24 */     this.b = paramadm.n();
/* 15:25 */     this.c = paramadm.b;
/* 16:26 */     this.d = paramadm.c.B;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 20:   */   {
/* 21:31 */     this.a = paramhd.e();
/* 22:32 */     this.d = paramhd.c(EnumArt.A);
/* 23:33 */     this.b = paramhd.readBlockPosition();
/* 24:34 */     this.c = EnumDirection.b(paramhd.readUnsignedByte());
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 28:   */   {
/* 29:39 */     paramhd.b(this.a);
/* 30:40 */     paramhd.a(this.d);
/* 31:41 */     paramhd.writeBlockPosition(this.b);
/* 32:42 */     paramhd.writeByte(this.c.b());
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void a(ik paramik)
/* 36:   */   {
/* 37:47 */     paramik.a(this);
/* 38:   */   }
/* 39:   */   
/* 40:   */   public int a()
/* 41:   */   {
/* 42:51 */     return this.a;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public BlockPosition b()
/* 46:   */   {
/* 47:55 */     return this.b;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public EnumDirection c()
/* 51:   */   {
/* 52:59 */     return this.c;
/* 53:   */   }
/* 54:   */   
/* 55:   */   public String d()
/* 56:   */   {
/* 57:63 */     return this.d;
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ip
 * JD-Core Version:    0.7.0.1
 */