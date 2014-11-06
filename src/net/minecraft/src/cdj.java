package net.minecraft.src;
/*  1:   */ public class cdj
/*  2:   */   extends ccq
/*  3:   */ {
/*  4:   */   public cdy a;
/*  5:   */   public cdy b;
/*  6:   */   public cdy c;
/*  7:   */   public cdy d;
/*  8:   */   public cdy e;
/*  9:   */   public cdy f;
/* 10:   */   
/* 11:   */   public cdj()
/* 12:   */   {
/* 13:13 */     this(0.0F);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public cdj(float paramFloat)
/* 17:   */   {
/* 18:17 */     this(paramFloat, -7.0F);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public cdj(float paramFloat1, float paramFloat2)
/* 22:   */   {
/* 23:21 */     int i = 128;
/* 24:22 */     int j = 128;
/* 25:   */     
/* 26:24 */     this.a = new cdy(this).b(i, j);
/* 27:25 */     this.a.a(0.0F, 0.0F + paramFloat2, -2.0F);
/* 28:26 */     this.a.a(0, 0).a(-4.0F, -12.0F, -5.5F, 8, 10, 8, paramFloat1);
/* 29:27 */     this.a.a(24, 0).a(-1.0F, -5.0F, -7.5F, 2, 4, 2, paramFloat1);
/* 30:   */     
/* 31:29 */     this.b = new cdy(this).b(i, j);
/* 32:30 */     this.b.a(0.0F, 0.0F + paramFloat2, 0.0F);
/* 33:31 */     this.b.a(0, 40).a(-9.0F, -2.0F, -6.0F, 18, 12, 11, paramFloat1);
/* 34:32 */     this.b.a(0, 70).a(-4.5F, 10.0F, -3.0F, 9, 5, 6, paramFloat1 + 0.5F);
/* 35:   */     
/* 36:34 */     this.c = new cdy(this).b(i, j);
/* 37:35 */     this.c.a(0.0F, -7.0F, 0.0F);
/* 38:36 */     this.c.a(60, 21).a(-13.0F, -2.5F, -3.0F, 4, 30, 6, paramFloat1);
/* 39:   */     
/* 40:38 */     this.d = new cdy(this).b(i, j);
/* 41:39 */     this.d.a(0.0F, -7.0F, 0.0F);
/* 42:40 */     this.d.a(60, 58).a(9.0F, -2.5F, -3.0F, 4, 30, 6, paramFloat1);
/* 43:   */     
/* 44:42 */     this.e = new cdy(this, 0, 22).b(i, j);
/* 45:43 */     this.e.a(-4.0F, 18.0F + paramFloat2, 0.0F);
/* 46:44 */     this.e.a(37, 0).a(-3.5F, -3.0F, -3.0F, 6, 16, 5, paramFloat1);
/* 47:   */     
/* 48:46 */     this.f = new cdy(this, 0, 22).b(i, j);
/* 49:47 */     this.f.i = true;
/* 50:48 */     this.f.a(60, 0).a(5.0F, 18.0F + paramFloat2, 0.0F);
/* 51:49 */     this.f.a(-3.5F, -3.0F, -3.0F, 6, 16, 5, paramFloat1);
/* 52:   */   }
/* 53:   */   
/* 54:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/* 55:   */   {
/* 56:54 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramwv);
/* 57:   */     
/* 58:56 */     this.a.a(paramFloat6);
/* 59:57 */     this.b.a(paramFloat6);
/* 60:58 */     this.e.a(paramFloat6);
/* 61:59 */     this.f.a(paramFloat6);
/* 62:60 */     this.c.a(paramFloat6);
/* 63:61 */     this.d.a(paramFloat6);
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv)
/* 67:   */   {
/* 68:66 */     this.a.g = (paramFloat4 / 57.295776F);
/* 69:67 */     this.a.f = (paramFloat5 / 57.295776F);
/* 70:   */     
/* 71:69 */     this.e.f = (-1.5F * a(paramFloat1, 13.0F) * paramFloat2);
/* 72:70 */     this.f.f = (1.5F * a(paramFloat1, 13.0F) * paramFloat2);
/* 73:71 */     this.e.g = 0.0F;
/* 74:72 */     this.f.g = 0.0F;
/* 75:   */   }
/* 76:   */   
/* 77:   */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3)
/* 78:   */   {
/* 79:77 */     EntityIronGolem localacq = (EntityIronGolem)paramxm;
/* 80:   */     
/* 81:79 */     int i = localacq.cj();
/* 82:80 */     if (i > 0)
/* 83:   */     {
/* 84:81 */       this.c.f = (-2.0F + 1.5F * a(i - paramFloat3, 10.0F));
/* 85:82 */       this.d.f = (-2.0F + 1.5F * a(i - paramFloat3, 10.0F));
/* 86:   */     }
/* 87:   */     else
/* 88:   */     {
/* 89:84 */       int j = localacq.ck();
/* 90:85 */       if (j > 0)
/* 91:   */       {
/* 92:86 */         this.c.f = (-0.8F + 0.025F * a(j, 70.0F));
/* 93:87 */         this.d.f = 0.0F;
/* 94:   */       }
/* 95:   */       else
/* 96:   */       {
/* 97:89 */         this.c.f = ((-0.2F + 1.5F * a(paramFloat1, 13.0F)) * paramFloat2);
/* 98:90 */         this.d.f = ((-0.2F - 1.5F * a(paramFloat1, 13.0F)) * paramFloat2);
/* 99:   */       }
/* :0:   */     }
/* :1:   */   }
/* :2:   */   
/* :3:   */   private float a(float paramFloat1, float paramFloat2)
/* :4:   */   {
/* :5:96 */     return (Math.abs(paramFloat1 % paramFloat2 - paramFloat2 * 0.5F) - paramFloat2 * 0.25F) / (paramFloat2 * 0.25F);
/* :6:   */   }
/* :7:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cdj
 * JD-Core Version:    0.7.0.1
 */