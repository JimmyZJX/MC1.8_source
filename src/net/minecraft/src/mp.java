package net.minecraft.src;
/*  1:   */ public class mp
/*  2:   */   implements id<ls>
/*  3:   */ {
/*  4:   */   private float a;
/*  5:   */   private float b;
/*  6:   */   private boolean c;
/*  7:   */   private boolean d;
/*  8:   */   
/*  9:   */   public mp() {}
/* 10:   */   
/* 11:   */   public mp(float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
/* 12:   */   {
/* 13:21 */     this.a = paramFloat1;
/* 14:22 */     this.b = paramFloat2;
/* 15:23 */     this.c = paramBoolean1;
/* 16:24 */     this.d = paramBoolean2;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 20:   */   {
/* 21:29 */     this.a = paramhd.readFloat();
/* 22:30 */     this.b = paramhd.readFloat();
/* 23:   */     
/* 24:32 */     int i = paramhd.readByte();
/* 25:33 */     this.c = ((i & 0x1) > 0);
/* 26:34 */     this.d = ((i & 0x2) > 0);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 30:   */   {
/* 31:39 */     paramhd.writeFloat(this.a);
/* 32:40 */     paramhd.writeFloat(this.b);
/* 33:   */     
/* 34:42 */     int i = 0;
/* 35:43 */     if (this.c) {
/* 36:44 */       i = (byte)(i | 0x1);
/* 37:   */     }
/* 38:46 */     if (this.d) {
/* 39:47 */       i = (byte)(i | 0x2);
/* 40:   */     }
/* 41:49 */     paramhd.writeByte(i);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void a(ls paramls)
/* 45:   */   {
/* 46:54 */     paramls.a(this);
/* 47:   */   }
/* 48:   */   
/* 49:   */   public float a()
/* 50:   */   {
/* 51:58 */     return this.a;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public float b()
/* 55:   */   {
/* 56:62 */     return this.b;
/* 57:   */   }
/* 58:   */   
/* 59:   */   public boolean c()
/* 60:   */   {
/* 61:66 */     return this.c;
/* 62:   */   }
/* 63:   */   
/* 64:   */   public boolean d()
/* 65:   */   {
/* 66:70 */     return this.d;
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mp
 * JD-Core Version:    0.7.0.1
 */