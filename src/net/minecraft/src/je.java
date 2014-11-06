package net.minecraft.src;
/*  1:   */ public class je
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private String b;
/*  6:   */   private ho c;
/*  7:   */   private int d;
/*  8:   */   private int e;
/*  9:   */   
/* 10:   */   public je() {}
/* 11:   */   
/* 12:   */   public je(int paramInt, String paramString, ho paramho)
/* 13:   */   {
/* 14:26 */     this(paramInt, paramString, paramho, 0);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public je(int paramInt1, String paramString, ho paramho, int paramInt2)
/* 18:   */   {
/* 19:30 */     this.a = paramInt1;
/* 20:31 */     this.b = paramString;
/* 21:32 */     this.c = paramho;
/* 22:33 */     this.d = paramInt2;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public je(int paramInt1, String paramString, ho paramho, int paramInt2, int paramInt3)
/* 26:   */   {
/* 27:37 */     this(paramInt1, paramString, paramho, paramInt2);
/* 28:38 */     this.e = paramInt3;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void a(ik paramik)
/* 32:   */   {
/* 33:43 */     paramik.a(this);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 37:   */   {
/* 38:48 */     this.a = paramhd.readUnsignedByte();
/* 39:49 */     this.b = paramhd.c(32);
/* 40:50 */     this.c = paramhd.d();
/* 41:51 */     this.d = paramhd.readUnsignedByte();
/* 42:52 */     if (this.b.equals("EntityHorse")) {
/* 43:53 */       this.e = paramhd.readInt();
/* 44:   */     }
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 48:   */   {
/* 49:59 */     paramhd.writeByte(this.a);
/* 50:60 */     paramhd.a(this.b);
/* 51:61 */     paramhd.a(this.c);
/* 52:62 */     paramhd.writeByte(this.d);
/* 53:63 */     if (this.b.equals("EntityHorse")) {
/* 54:64 */       paramhd.writeInt(this.e);
/* 55:   */     }
/* 56:   */   }
/* 57:   */   
/* 58:   */   public int a()
/* 59:   */   {
/* 60:69 */     return this.a;
/* 61:   */   }
/* 62:   */   
/* 63:   */   public String b()
/* 64:   */   {
/* 65:73 */     return this.b;
/* 66:   */   }
/* 67:   */   
/* 68:   */   public ho c()
/* 69:   */   {
/* 70:77 */     return this.c;
/* 71:   */   }
/* 72:   */   
/* 73:   */   public int d()
/* 74:   */   {
/* 75:81 */     return this.d;
/* 76:   */   }
/* 77:   */   
/* 78:   */   public int e()
/* 79:   */   {
/* 80:85 */     return this.e;
/* 81:   */   }
/* 82:   */   
/* 83:   */   public boolean f()
/* 84:   */   {
/* 85:89 */     return this.d > 0;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     je
 * JD-Core Version:    0.7.0.1
 */