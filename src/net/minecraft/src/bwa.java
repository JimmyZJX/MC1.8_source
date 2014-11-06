package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;

/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class bwa
/*  5:   */   extends bxf
/*  6:   */ {
/*  7:   */   protected bvz a;
/*  8:   */   protected String f;
/*  9:   */   private String r;
/* 10:14 */   private final List<String> s = Lists.newArrayList();
/* 11:   */   protected String g;
/* 12:   */   protected String h;
/* 13:   */   protected int i;
/* 14:   */   private int t;
/* 15:   */   
/* 16:   */   public bwa(bvz parambvz, String paramString1, String paramString2, int paramInt)
/* 17:   */   {
/* 18:21 */     this.a = parambvz;
/* 19:22 */     this.f = paramString1;
/* 20:23 */     this.r = paramString2;
/* 21:24 */     this.i = paramInt;
/* 22:   */     
/* 23:26 */     this.g = cwc.a("gui.yes", new Object[0]);
/* 24:27 */     this.h = cwc.a("gui.no", new Object[0]);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public bwa(bvz parambvz, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
/* 28:   */   {
/* 29:31 */     this.a = parambvz;
/* 30:32 */     this.f = paramString1;
/* 31:33 */     this.r = paramString2;
/* 32:34 */     this.g = paramString3;
/* 33:35 */     this.h = paramString4;
/* 34:36 */     this.i = paramInt;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void b()
/* 38:   */   {
/* 39:41 */     this.n.add(new buw(0, this.l / 2 - 155, this.m / 6 + 96, this.g));
/* 40:42 */     this.n.add(new buw(1, this.l / 2 - 155 + 160, this.m / 6 + 96, this.h));
/* 41:   */     
/* 42:44 */     this.s.clear();
/* 43:45 */     this.s.addAll(this.q.c(this.r, this.l - 50));
/* 44:   */   }
/* 45:   */   
/* 46:   */   protected void a(bug parambug)
/* 47:   */   {
/* 48:50 */     this.a.a(parambug.k == 0, this.i);
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 52:   */   {
/* 53:55 */     c();
/* 54:   */     
/* 55:57 */     a(this.q, this.f, this.l / 2, 70, 16777215);
/* 56:   */     
/* 57:59 */     int j = 90;
/* 58:60 */     for (String str : this.s)
/* 59:   */     {
/* 60:61 */       a(this.q, str, this.l / 2, j, 16777215);
/* 61:62 */       j += this.q.a;
/* 62:   */     }
/* 63:65 */     super.a(paramInt1, paramInt2, paramFloat);
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void b(int paramInt)
/* 67:   */   {
/* 68:69 */     this.t = paramInt;
/* 69:71 */     for (bug localbug : this.n) {
/* 70:72 */       localbug.l = false;
/* 71:   */     }
/* 72:   */   }
/* 73:   */   
/* 74:   */   public void e()
/* 75:   */   {
/* 76:78 */     super.e();
/* 77:80 */     if (--this.t == 0) {
/* 78:81 */       for (bug localbug : this.n) {
/* 79:82 */         localbug.l = true;
/* 80:   */       }
/* 81:   */     }
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwa
 * JD-Core Version:    0.7.0.1
 */