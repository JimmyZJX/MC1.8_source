package net.minecraft.src;
/*  1:   */ public class biw
/*  2:   */ {
/*  3:   */   private final int a;
/*  4:   */   private Block b;
/*  5:10 */   private int c = 1;
/*  6:   */   private int d;
/*  7:   */   
/*  8:   */   public biw(int paramInt, ProtoBlock paramatr)
/*  9:   */   {
/* 10:14 */     this(3, paramInt, paramatr);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public biw(int paramInt1, int paramInt2, ProtoBlock paramatr)
/* 14:   */   {
/* 15:18 */     this.a = paramInt1;
/* 16:19 */     this.c = paramInt2;
/* 17:20 */     this.b = paramatr.instance();
/* 18:   */   }
/* 19:   */   
/* 20:   */   public biw(int paramInt1, int paramInt2, ProtoBlock paramatr, int paramInt3)
/* 21:   */   {
/* 22:24 */     this(paramInt1, paramInt2, paramatr);
/* 23:25 */     this.b = paramatr.a(paramInt3);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public int b()
/* 27:   */   {
/* 28:33 */     return this.c;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public Block c()
/* 32:   */   {
/* 33:45 */     return this.b;
/* 34:   */   }
/* 35:   */   
/* 36:   */   private ProtoBlock e()
/* 37:   */   {
/* 38:49 */     return this.b.getProto();
/* 39:   */   }
/* 40:   */   
/* 41:   */   private int f()
/* 42:   */   {
/* 43:53 */     return this.b.getProto().c(this.b);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int d()
/* 47:   */   {
/* 48:57 */     return this.d;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void b(int paramInt)
/* 52:   */   {
/* 53:61 */     this.d = paramInt;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public String toString()
/* 57:   */   {
/* 58:   */     String str;
/* 59:67 */     if (this.a >= 3)
/* 60:   */     {
/* 61:68 */       oa localoa = (oa)ProtoBlock.c.c(e());
/* 62:69 */       str = localoa == null ? "null" : localoa.toString();
/* 63:71 */       if (this.c > 1) {
/* 64:72 */         str = this.c + "*" + str;
/* 65:   */       }
/* 66:   */     }
/* 67:   */     else
/* 68:   */     {
/* 69:75 */       str = Integer.toString(ProtoBlock.a(e()));
/* 70:77 */       if (this.c > 1) {
/* 71:78 */         str = this.c + "x" + str;
/* 72:   */       }
/* 73:   */     }
/* 74:82 */     int i = f();
/* 75:83 */     if (i > 0) {
/* 76:84 */       str = str + ":" + i;
/* 77:   */     }
/* 78:87 */     return str;
/* 79:   */   }
/* 80:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     biw
 * JD-Core Version:    0.7.0.1
 */