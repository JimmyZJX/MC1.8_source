package net.minecraft.src;
/*  1:   */ public class bos
/*  2:   */   extends bpa
/*  3:   */ {
/*  4: 8 */   private arm[] c = { arm.r, arm.r, arm.r, arm.Y, arm.Y, arm.q };
/*  5:12 */   private arm[] d = { arm.t, arm.S, arm.s, arm.q, arm.Q, arm.v };
/*  6:16 */   private arm[] e = { arm.t, arm.s, arm.u, arm.q };
/*  7:20 */   private arm[] f = { arm.B, arm.B, arm.B, arm.T };
/*  8:   */   private final bgl g;
/*  9:   */   
/* 10:   */   public bos(long paramLong, bpa parambpa, WorldType paramare, String paramString)
/* 11:   */   {
/* 12:27 */     super(paramLong);
/* 13:28 */     this.a = parambpa;
/* 14:30 */     if (paramare == WorldType.DEFAULT_1_1)
/* 15:   */     {
/* 16:31 */       this.c = new arm[] { arm.r, arm.t, arm.s, arm.v, arm.q, arm.u };
/* 17:   */       
/* 18:   */ 
/* 19:34 */       this.g = null;
/* 20:   */     }
/* 21:35 */     else if (paramare == WorldType.f)
/* 22:   */     {
/* 23:36 */       this.g = bgn.a(paramString).b();
/* 24:   */     }
/* 25:   */     else
/* 26:   */     {
/* 27:38 */       this.g = null;
/* 28:   */     }
/* 29:   */   }
/* 30:   */   
/* 31:   */   public int[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 32:   */   {
/* 33:44 */     int[] arrayOfInt1 = this.a.a(paramInt1, paramInt2, paramInt3, paramInt4);
/* 34:   */     
/* 35:46 */     int[] arrayOfInt2 = boy.a(paramInt3 * paramInt4);
/* 36:47 */     for (int i = 0; i < paramInt4; i++) {
/* 37:48 */       for (int j = 0; j < paramInt3; j++)
/* 38:   */       {
/* 39:49 */         a(j + paramInt1, i + paramInt2);
/* 40:50 */         int k = arrayOfInt1[(j + i * paramInt3)];
/* 41:51 */         int m = (k & 0xF00) >> 8;
/* 42:52 */         k &= 0xFFFFF0FF;
/* 43:53 */         if ((this.g != null) && (this.g.F >= 0)) {
/* 44:54 */           arrayOfInt2[(j + i * paramInt3)] = this.g.F;
/* 45:55 */         } else if (b(k)) {
/* 46:56 */           arrayOfInt2[(j + i * paramInt3)] = k;
/* 47:57 */         } else if (k == arm.D.az) {
/* 48:58 */           arrayOfInt2[(j + i * paramInt3)] = k;
/* 49:59 */         } else if (k == 1)
/* 50:   */         {
/* 51:60 */           if (m > 0)
/* 52:   */           {
/* 53:61 */             if (a(3) == 0) {
/* 54:62 */               arrayOfInt2[(j + i * paramInt3)] = arm.ac.az;
/* 55:   */             } else {
/* 56:64 */               arrayOfInt2[(j + i * paramInt3)] = arm.ab.az;
/* 57:   */             }
/* 58:   */           }
/* 59:   */           else {
/* 60:67 */             arrayOfInt2[(j + i * paramInt3)] = this.c[a(this.c.length)].az;
/* 61:   */           }
/* 62:   */         }
/* 63:69 */         else if (k == 2)
/* 64:   */         {
/* 65:70 */           if (m > 0) {
/* 66:71 */             arrayOfInt2[(j + i * paramInt3)] = arm.K.az;
/* 67:   */           } else {
/* 68:73 */             arrayOfInt2[(j + i * paramInt3)] = this.d[a(this.d.length)].az;
/* 69:   */           }
/* 70:   */         }
/* 71:75 */         else if (k == 3)
/* 72:   */         {
/* 73:76 */           if (m > 0) {
/* 74:77 */             arrayOfInt2[(j + i * paramInt3)] = arm.V.az;
/* 75:   */           } else {
/* 76:79 */             arrayOfInt2[(j + i * paramInt3)] = this.e[a(this.e.length)].az;
/* 77:   */           }
/* 78:   */         }
/* 79:81 */         else if (k == 4) {
/* 80:82 */           arrayOfInt2[(j + i * paramInt3)] = this.f[a(this.f.length)].az;
/* 81:   */         } else {
/* 82:84 */           arrayOfInt2[(j + i * paramInt3)] = arm.D.az;
/* 83:   */         }
/* 84:   */       }
/* 85:   */     }
/* 86:89 */     return arrayOfInt2;
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bos
 * JD-Core Version:    0.7.0.1
 */