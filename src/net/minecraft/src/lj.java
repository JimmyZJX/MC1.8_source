package net.minecraft.src;
/*  1:   */ public class lj
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private lk a;
/*  5:   */   private ho b;
/*  6:   */   private int c;
/*  7:   */   private int d;
/*  8:   */   private int e;
/*  9:   */   
/* 10:   */   public lj() {}
/* 11:   */   
/* 12:   */   public lj(lk paramlk, ho paramho)
/* 13:   */   {
/* 14:22 */     this(paramlk, paramho, -1, -1, -1);
/* 15:   */   }
/* 16:   */   
/* 17:   */   public lj(int paramInt1, int paramInt2, int paramInt3)
/* 18:   */   {
/* 19:26 */     this(lk.c, null, paramInt1, paramInt2, paramInt3);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public lj(lk paramlk, ho paramho, int paramInt1, int paramInt2, int paramInt3)
/* 23:   */   {
/* 24:30 */     this.a = paramlk;
/* 25:31 */     this.b = paramho;
/* 26:32 */     this.c = paramInt1;
/* 27:33 */     this.d = paramInt2;
/* 28:34 */     this.e = paramInt3;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 32:   */   {
/* 33:39 */     this.a = ((lk)paramhd.a(lk.class));
/* 34:40 */     if ((this.a == lk.a) || (this.a == lk.b)) {
/* 35:41 */       this.b = paramhd.d();
/* 36:   */     }
/* 37:43 */     if (this.a == lk.c)
/* 38:   */     {
/* 39:44 */       this.c = paramhd.readInt();
/* 40:45 */       this.d = paramhd.readInt();
/* 41:46 */       this.e = paramhd.readInt();
/* 42:   */     }
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 46:   */   {
/* 47:52 */     paramhd.a(this.a);
/* 48:53 */     if ((this.a == lk.a) || (this.a == lk.b)) {
/* 49:54 */       paramhd.a(this.b);
/* 50:   */     }
/* 51:56 */     if (this.a == lk.c)
/* 52:   */     {
/* 53:57 */       paramhd.writeInt(this.c);
/* 54:58 */       paramhd.writeInt(this.d);
/* 55:59 */       paramhd.writeInt(this.e);
/* 56:   */     }
/* 57:   */   }
/* 58:   */   
/* 59:   */   public void a(ik paramik)
/* 60:   */   {
/* 61:65 */     paramik.a(this);
/* 62:   */   }
/* 63:   */   
/* 64:   */   public lk a()
/* 65:   */   {
/* 66:69 */     return this.a;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public ho b()
/* 70:   */   {
/* 71:73 */     return this.b;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public int c()
/* 75:   */   {
/* 76:77 */     return this.c;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public int d()
/* 80:   */   {
/* 81:81 */     return this.d;
/* 82:   */   }
/* 83:   */   
/* 84:   */   public int e()
/* 85:   */   {
/* 86:85 */     return this.e;
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lj
 * JD-Core Version:    0.7.0.1
 */