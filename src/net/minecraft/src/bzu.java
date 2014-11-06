package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class bzu
/*  5:   */   extends buu
/*  6:   */ {
/*  7:   */   private final bzp u;
/*  8:13 */   private final List<bzs> v = Lists.newArrayList();
/*  9:14 */   private final List<bzr> w = Lists.newArrayList();
/* 10:15 */   private final buv x = new bzq();
/* 11:16 */   private int y = -1;
/* 12:   */   
/* 13:   */   public bzu(bzp parambzp, bsu parambsu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/* 14:   */   {
/* 15:19 */     super(parambsu, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 16:20 */     this.u = parambzp;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public buv b(int paramInt)
/* 20:   */   {
/* 21:25 */     if (paramInt < this.v.size()) {
/* 22:26 */       return (buv)this.v.get(paramInt);
/* 23:   */     }
/* 24:28 */     paramInt -= this.v.size();
/* 25:30 */     if (paramInt == 0) {
/* 26:31 */       return this.x;
/* 27:   */     }
/* 28:33 */     paramInt--;
/* 29:   */     
/* 30:35 */     return (buv)this.w.get(paramInt);
/* 31:   */   }
/* 32:   */   
/* 33:   */   protected int b()
/* 34:   */   {
/* 35:40 */     return this.v.size() + 1 + this.w.size();
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void c(int paramInt)
/* 39:   */   {
/* 40:44 */     this.y = paramInt;
/* 41:   */   }
/* 42:   */   
/* 43:   */   protected boolean a(int paramInt)
/* 44:   */   {
/* 45:49 */     return paramInt == this.y;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public int e()
/* 49:   */   {
/* 50:53 */     return this.y;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public void a(cey paramcey)
/* 54:   */   {
/* 55:57 */     this.v.clear();
/* 56:59 */     for (int i = 0; i < paramcey.c(); i++) {
/* 57:60 */       this.v.add(new bzs(this.u, paramcey.a(i)));
/* 58:   */     }
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void a(List<cyq> paramList)
/* 62:   */   {
/* 63:65 */     this.w.clear();
/* 64:67 */     for (cyq localcyq : paramList) {
/* 65:68 */       this.w.add(new bzr(this.u, localcyq));
/* 66:   */     }
/* 67:   */   }
/* 68:   */   
/* 69:   */   protected int d()
/* 70:   */   {
/* 71:74 */     return super.d() + 30;
/* 72:   */   }
/* 73:   */   
/* 74:   */   public int c()
/* 75:   */   {
/* 76:79 */     return super.c() + 85;
/* 77:   */   }
/* 78:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzu
 * JD-Core Version:    0.7.0.1
 */