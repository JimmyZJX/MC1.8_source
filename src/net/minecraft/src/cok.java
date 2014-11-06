package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class cok
/*  5:   */ {
/*  6:12 */   public static final cok a = new col();
/*  7:18 */   private final boolean[] b = new boolean[aql.values().length];
/*  8:19 */   private final boolean[] c = new boolean[aql.values().length];
/*  9:20 */   private boolean d = true;
/* 10:21 */   private final List<bcm> e = Lists.newArrayList();
/* 11:22 */   private cou f = new cou();
/* 12:   */   private cix g;
/* 13:   */   
/* 14:   */   public boolean a()
/* 15:   */   {
/* 16:26 */     return this.d;
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void a(aql paramaql)
/* 20:   */   {
/* 21:30 */     this.d = false;
/* 22:   */     
/* 23:32 */     this.b[paramaql.ordinal()] = true;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public boolean b(aql paramaql)
/* 27:   */   {
/* 28:36 */     return !this.b[paramaql.ordinal()];
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void c(aql paramaql)
/* 32:   */   {
/* 33:40 */     this.c[paramaql.ordinal()] = true;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public boolean d(aql paramaql)
/* 37:   */   {
/* 38:44 */     return this.c[paramaql.ordinal()];
/* 39:   */   }
/* 40:   */   
/* 41:   */   public List<bcm> b()
/* 42:   */   {
/* 43:48 */     return this.e;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void a(bcm parambcm)
/* 47:   */   {
/* 48:52 */     this.e.add(parambcm);
/* 49:   */   }
/* 50:   */   
/* 51:   */   public boolean a(EnumDirection paramej1, EnumDirection paramej2)
/* 52:   */   {
/* 53:56 */     return this.f.a(paramej1, paramej2);
/* 54:   */   }
/* 55:   */   
/* 56:   */   public void a(cou paramcou)
/* 57:   */   {
/* 58:60 */     this.f = paramcou;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public cix c()
/* 62:   */   {
/* 63:64 */     return this.g;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void a(cix paramcix)
/* 67:   */   {
/* 68:68 */     this.g = paramcix;
/* 69:   */   }
/* 70:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cok
 * JD-Core Version:    0.7.0.1
 */