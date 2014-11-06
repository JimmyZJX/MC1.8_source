package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Sets;
/*  2:   */ import java.util.HashSet;
/*  3:   */ import java.util.List;
/*  4:   */ import java.util.Set;
/*  5:   */ 
/*  6:   */ public class cwo
/*  7:   */   implements cwi
/*  8:   */ {
/*  9:   */   private final List<cwn> a;
/* 10:   */   private final int b;
/* 11:   */   private final int c;
/* 12:   */   private final int d;
/* 13:   */   private final boolean e;
/* 14:   */   
/* 15:   */   public cwo(List<cwn> paramList, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/* 16:   */   {
/* 17:23 */     this.a = paramList;
/* 18:24 */     this.b = paramInt1;
/* 19:25 */     this.c = paramInt2;
/* 20:26 */     this.d = paramInt3;
/* 21:27 */     this.e = paramBoolean;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public int a()
/* 25:   */   {
/* 26:31 */     return this.c;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public int b()
/* 30:   */   {
/* 31:35 */     return this.b;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public int c()
/* 35:   */   {
/* 36:39 */     return this.a.size();
/* 37:   */   }
/* 38:   */   
/* 39:   */   public int d()
/* 40:   */   {
/* 41:43 */     return this.d;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public boolean e()
/* 45:   */   {
/* 46:47 */     return this.e;
/* 47:   */   }
/* 48:   */   
/* 49:   */   private cwn d(int paramInt)
/* 50:   */   {
/* 51:51 */     return (cwn)this.a.get(paramInt);
/* 52:   */   }
/* 53:   */   
/* 54:   */   public int a(int paramInt)
/* 55:   */   {
/* 56:55 */     cwn localcwn = d(paramInt);
/* 57:57 */     if (localcwn.a()) {
/* 58:58 */       return this.d;
/* 59:   */     }
/* 60:60 */     return localcwn.b();
/* 61:   */   }
/* 62:   */   
/* 63:   */   public boolean b(int paramInt)
/* 64:   */   {
/* 65:65 */     return !((cwn)this.a.get(paramInt)).a();
/* 66:   */   }
/* 67:   */   
/* 68:   */   public int c(int paramInt)
/* 69:   */   {
/* 70:69 */     return ((cwn)this.a.get(paramInt)).c();
/* 71:   */   }
/* 72:   */   
/* 73:   */   public Set<Integer> f()
/* 74:   */   {
/* 75:73 */     HashSet<Integer> localHashSet = Sets.newHashSet();
/* 76:74 */     for (cwn localcwn : this.a) {
/* 77:75 */       localHashSet.add(Integer.valueOf(localcwn.c()));
/* 78:   */     }
/* 79:78 */     return localHashSet;
/* 80:   */   }
/* 81:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cwo
 * JD-Core Version:    0.7.0.1
 */