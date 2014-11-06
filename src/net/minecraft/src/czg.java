package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ import java.util.Random;
/*  4:   */ 
/*  5:   */ public class czg
/*  6:   */   implements czm<cyz>
/*  7:   */ {
/*  8:11 */   private final List<czm> a = Lists.newArrayList();
/*  9:13 */   private final Random b = new Random();
/* 10:   */   private final oa c;
/* 11:   */   private final cxz d;
/* 12:   */   private double e;
/* 13:   */   private double f;
/* 14:   */   
/* 15:   */   public czg(oa paramoa, double paramDouble1, double paramDouble2, cxz paramcxz)
/* 16:   */   {
/* 17:21 */     this.c = paramoa;
/* 18:22 */     this.f = paramDouble2;
/* 19:23 */     this.e = paramDouble1;
/* 20:24 */     this.d = paramcxz;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int a()
/* 24:   */   {
/* 25:29 */     int i = 0;
/* 26:30 */     for (czm localczm : this.a) {
/* 27:31 */       i += localczm.a();
/* 28:   */     }
/* 29:33 */     return i;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public cyz g()
/* 33:   */   {
/* 34:38 */     int i = a();
/* 35:40 */     if ((this.a.isEmpty()) || (i == 0)) {
/* 36:41 */       return czh.a;
/* 37:   */     }
/* 38:44 */     int j = this.b.nextInt(i);
/* 39:45 */     for (czm localczm : this.a)
/* 40:   */     {
/* 41:46 */       j -= localczm.a();
/* 42:48 */       if (j < 0)
/* 43:   */       {
/* 44:49 */         cyz localcyz = (cyz)localczm.g();
/* 45:   */         
/* 46:   */ 
/* 47:52 */         localcyz.a(localcyz.b() * this.e);
/* 48:53 */         localcyz.b(localcyz.c() * this.f);
/* 49:   */         
/* 50:55 */         return localcyz;
/* 51:   */       }
/* 52:   */     }
/* 53:59 */     return czh.a;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void a(czm paramczm)
/* 57:   */   {
/* 58:63 */     this.a.add(paramczm);
/* 59:   */   }
/* 60:   */   
/* 61:   */   public oa c()
/* 62:   */   {
/* 63:67 */     return this.c;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public cxz d()
/* 67:   */   {
/* 68:71 */     return this.d;
/* 69:   */   }
/* 70:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czg
 * JD-Core Version:    0.7.0.1
 */