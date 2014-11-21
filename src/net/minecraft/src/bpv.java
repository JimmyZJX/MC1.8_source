package net.minecraft.src;
/*  1:   */ public class bpv
/*  2:   */ {
/*  3:   */   private final bpt[] a;
/*  4:   */   private int b;
/*  5:   */   private int c;
/*  6:   */   
/*  7:   */   public bpv(bpt[] paramArrayOfbpt)
/*  8:   */   {
/*  9:12 */     this.a = paramArrayOfbpt;
/* 10:13 */     this.c = paramArrayOfbpt.length;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a()
/* 14:   */   {
/* 15:17 */     this.b += 1;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean b()
/* 19:   */   {
/* 20:21 */     return this.b >= this.c;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public bpt c()
/* 24:   */   {
/* 25:25 */     if (this.c > 0) {
/* 26:26 */       return this.a[(this.c - 1)];
/* 27:   */     }
/* 28:28 */     return null;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public bpt a(int paramInt)
/* 32:   */   {
/* 33:32 */     return this.a[paramInt];
/* 34:   */   }
/* 35:   */   
/* 36:   */   public int d()
/* 37:   */   {
/* 38:36 */     return this.c;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void b(int paramInt)
/* 42:   */   {
/* 43:40 */     this.c = paramInt;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public int e()
/* 47:   */   {
/* 48:44 */     return this.b;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void c(int paramInt)
/* 52:   */   {
/* 53:48 */     this.b = paramInt;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public Vec3 a(Entity paramwv, int paramInt)
/* 57:   */   {
/* 58:52 */     double d1 = this.a[paramInt].a + (int)(paramwv.width + 1.0F) * 0.5D;
/* 59:53 */     double d2 = this.a[paramInt].b;
/* 60:54 */     double d3 = this.a[paramInt].c + (int)(paramwv.width + 1.0F) * 0.5D;
/* 61:55 */     return new Vec3(d1, d2, d3);
/* 62:   */   }
/* 63:   */   
/* 64:   */   public Vec3 a(Entity paramwv)
/* 65:   */   {
/* 66:59 */     return a(paramwv, this.b);
/* 67:   */   }
/* 68:   */   
/* 69:   */   public boolean a(bpv parambpv)
/* 70:   */   {
/* 71:63 */     if (parambpv == null) {
/* 72:64 */       return false;
/* 73:   */     }
/* 74:66 */     if (parambpv.a.length != this.a.length) {
/* 75:67 */       return false;
/* 76:   */     }
/* 77:69 */     for (int i = 0; i < this.a.length; i++) {
/* 78:70 */       if ((this.a[i].a != parambpv.a[i].a) || (this.a[i].b != parambpv.a[i].b) || (this.a[i].c != parambpv.a[i].c)) {
/* 79:71 */         return false;
/* 80:   */       }
/* 81:   */     }
/* 82:74 */     return true;
/* 83:   */   }
/* 84:   */   
/* 85:   */   public boolean b(Vec3 parambrw)
/* 86:   */   {
/* 87:86 */     bpt localbpt = c();
/* 88:87 */     if (localbpt == null) {
/* 89:88 */       return false;
/* 90:   */     }
/* 91:90 */     return (localbpt.a == (int)parambrw.x) && (localbpt.c == (int)parambrw.z);
/* 92:   */   }
/* 93:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bpv
 * JD-Core Version:    0.7.0.1
 */