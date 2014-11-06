package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ import java.util.concurrent.locks.ReentrantLock;
/*  4:   */ 
/*  5:   */ public class coa
/*  6:   */ {
/*  7:   */   private final cop a;
/*  8:11 */   private final ReentrantLock b = new ReentrantLock();
/*  9:12 */   private final List<Runnable> c = Lists.newArrayList();
/* 10:   */   private final coc d;
/* 11:   */   private cjb e;
/* 12:   */   private cok f;
/* 13:16 */   private cob g = cob.a;
/* 14:   */   private boolean h;
/* 15:   */   
/* 16:   */   public coa(cop paramcop, coc paramcoc)
/* 17:   */   {
/* 18:20 */     this.a = paramcop;
/* 19:21 */     this.d = paramcoc;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public cob a()
/* 23:   */   {
/* 24:25 */     return this.g;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public cop b()
/* 28:   */   {
/* 29:29 */     return this.a;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public cok c()
/* 33:   */   {
/* 34:33 */     return this.f;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void a(cok paramcok)
/* 38:   */   {
/* 39:37 */     this.f = paramcok;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public cjb d()
/* 43:   */   {
/* 44:41 */     return this.e;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void a(cjb paramcjb)
/* 48:   */   {
/* 49:45 */     this.e = paramcjb;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void a(cob paramcob)
/* 53:   */   {
/* 54:49 */     this.b.lock();
/* 55:   */     try
/* 56:   */     {
/* 57:51 */       this.g = paramcob;
/* 58:   */     }
/* 59:   */     finally
/* 60:   */     {
/* 61:53 */       this.b.unlock();
/* 62:   */     }
/* 63:   */   }
/* 64:   */   
/* 65:   */   public void e()
/* 66:   */   {
/* 67:58 */     this.b.lock();
/* 68:   */     try
/* 69:   */     {
/* 70:60 */       this.h = true;
/* 71:61 */       this.g = cob.d;
/* 72:62 */       for (Runnable localRunnable : this.c) {
/* 73:63 */         localRunnable.run();
/* 74:   */       }
/* 75:   */     }
/* 76:   */     finally
/* 77:   */     {
/* 78:66 */       this.b.unlock();
/* 79:   */     }
/* 80:   */   }
/* 81:   */   
/* 82:   */   public void a(Runnable paramRunnable)
/* 83:   */   {
/* 84:71 */     this.b.lock();
/* 85:   */     try
/* 86:   */     {
/* 87:73 */       this.c.add(paramRunnable);
/* 88:74 */       if (this.h) {
/* 89:75 */         paramRunnable.run();
/* 90:   */       }
/* 91:   */     }
/* 92:   */     finally
/* 93:   */     {
/* 94:78 */       this.b.unlock();
/* 95:   */     }
/* 96:   */   }
/* 97:   */   
/* 98:   */   public ReentrantLock f()
/* 99:   */   {
/* :0:83 */     return this.b;
/* :1:   */   }
/* :2:   */   
/* :3:   */   public coc g()
/* :4:   */   {
/* :5:87 */     return this.d;
/* :6:   */   }
/* :7:   */   
/* :8:   */   public boolean h()
/* :9:   */   {
/* ;0:91 */     return this.h;
/* ;1:   */   }
/* ;2:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     coa
 * JD-Core Version:    0.7.0.1
 */