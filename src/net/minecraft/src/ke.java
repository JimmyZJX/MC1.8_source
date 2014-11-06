package net.minecraft.src;
/*  1:   */ public class ke
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   public kg a;
/*  5:   */   public int b;
/*  6:   */   public int c;
/*  7:   */   public int d;
/*  8:   */   public String e;
/*  9:   */   
/* 10:   */   public ke() {}
/* 11:   */   
/* 12:   */   public ke(wg paramwg, kg paramkg)
/* 13:   */   {
/* 14:29 */     this.a = paramkg;
/* 15:   */     
/* 16:31 */     EntityLiving localxm = paramwg.c();
/* 17:33 */     switch (kf.a[paramkg.ordinal()])
/* 18:   */     {
/* 19:   */     case 1: 
/* 20:35 */       this.d = paramwg.f();
/* 21:36 */       this.c = (localxm == null ? -1 : localxm.getID());
/* 22:37 */       break;
/* 23:   */     case 2: 
/* 24:39 */       this.b = paramwg.h().getID();
/* 25:40 */       this.c = (localxm == null ? -1 : localxm.getID());
/* 26:41 */       this.e = paramwg.b().c();
/* 27:   */     }
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 31:   */   {
/* 32:48 */     this.a = ((kg)paramhd.a(kg.class));
/* 33:50 */     if (this.a == kg.b)
/* 34:   */     {
/* 35:51 */       this.d = paramhd.e();
/* 36:52 */       this.c = paramhd.readInt();
/* 37:   */     }
/* 38:53 */     else if (this.a == kg.c)
/* 39:   */     {
/* 40:54 */       this.b = paramhd.e();
/* 41:55 */       this.c = paramhd.readInt();
/* 42:56 */       this.e = paramhd.c(32767);
/* 43:   */     }
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 47:   */   {
/* 48:62 */     paramhd.a(this.a);
/* 49:64 */     if (this.a == kg.b)
/* 50:   */     {
/* 51:65 */       paramhd.b(this.d);
/* 52:66 */       paramhd.writeInt(this.c);
/* 53:   */     }
/* 54:67 */     else if (this.a == kg.c)
/* 55:   */     {
/* 56:68 */       paramhd.b(this.b);
/* 57:69 */       paramhd.writeInt(this.c);
/* 58:70 */       paramhd.a(this.e);
/* 59:   */     }
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void a(ik paramik)
/* 63:   */   {
/* 64:76 */     paramik.a(this);
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ke
 * JD-Core Version:    0.7.0.1
 */