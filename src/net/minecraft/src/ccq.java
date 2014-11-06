package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import com.google.common.collect.Maps;
/*  3:   */ import java.util.List;
/*  4:   */ import java.util.Map;
/*  5:   */ import java.util.Random;
/*  6:   */ 
/*  7:   */ public abstract class ccq
/*  8:   */ {
/*  9:   */   public float p;
/* 10:   */   public boolean q;
/* 11:17 */   public boolean r = true;
/* 12:19 */   public List s = Lists.newArrayList();
/* 13:20 */   private Map a = Maps.newHashMap();
/* 14:21 */   public int t = 64;
/* 15:22 */   public int u = 32;
/* 16:   */   
/* 17:   */   public void a(Entity paramwv, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
/* 18:   */   
/* 19:   */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramwv) {}
/* 20:   */   
/* 21:   */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3) {}
/* 22:   */   
/* 23:   */   public cdy a(Random paramRandom)
/* 24:   */   {
/* 25:34 */     return (cdy)this.s.get(paramRandom.nextInt(this.s.size()));
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected void a(String paramString, int paramInt1, int paramInt2)
/* 29:   */   {
/* 30:38 */     this.a.put(paramString, new cdz(paramInt1, paramInt2));
/* 31:   */   }
/* 32:   */   
/* 33:   */   public cdz a(String paramString)
/* 34:   */   {
/* 35:42 */     return (cdz)this.a.get(paramString);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public static void a(cdy paramcdy1, cdy paramcdy2)
/* 39:   */   {
/* 40:46 */     paramcdy2.f = paramcdy1.f;
/* 41:47 */     paramcdy2.g = paramcdy1.g;
/* 42:48 */     paramcdy2.h = paramcdy1.h;
/* 43:49 */     paramcdy2.c = paramcdy1.c;
/* 44:50 */     paramcdy2.d = paramcdy1.d;
/* 45:51 */     paramcdy2.e = paramcdy1.e;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public void a(ccq paramccq)
/* 49:   */   {
/* 50:55 */     this.p = paramccq.p;
/* 51:56 */     this.q = paramccq.q;
/* 52:57 */     this.r = paramccq.r;
/* 53:   */   }
/* 54:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ccq
 * JD-Core Version:    0.7.0.1
 */