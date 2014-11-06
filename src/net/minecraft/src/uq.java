package net.minecraft.src;
/*  1:   */ import java.lang.reflect.Array;
/*  2:   */ import java.util.concurrent.locks.Lock;
/*  3:   */ import java.util.concurrent.locks.ReadWriteLock;
/*  4:   */ import java.util.concurrent.locks.ReentrantReadWriteLock;
/*  5:   */ 
/*  6:   */ public class uq
/*  7:   */ {
/*  8:   */   private final Object[] a;
/*  9:   */   private final Class b;
/* 10:10 */   private final ReadWriteLock c = new ReentrantReadWriteLock();
/* 11:   */   private int d;
/* 12:   */   private int e;
/* 13:   */   
/* 14:   */   public uq(Class paramClass, int paramInt)
/* 15:   */   {
/* 16:16 */     this.b = paramClass;
/* 17:17 */     this.a = ((Object[])Array.newInstance(paramClass, paramInt));
/* 18:   */   }
/* 19:   */   
/* 20:   */   public Object a(Object paramObject)
/* 21:   */   {
/* 22:21 */     this.c.writeLock().lock();
/* 23:   */     
/* 24:23 */     this.a[this.e] = paramObject;
/* 25:24 */     this.e = ((this.e + 1) % b());
/* 26:25 */     if (this.d < b()) {
/* 27:26 */       this.d += 1;
/* 28:   */     }
/* 29:29 */     this.c.writeLock().unlock();
/* 30:30 */     return paramObject;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public int b()
/* 34:   */   {
/* 35:41 */     this.c.readLock().lock();
/* 36:42 */     int i = this.a.length;
/* 37:43 */     this.c.readLock().unlock();
/* 38:44 */     return i;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public Object[] c()
/* 42:   */   {
/* 43:49 */     Object[] arrayOfObject = (Object[])Array.newInstance(this.b, this.d);
/* 44:   */     
/* 45:51 */     this.c.readLock().lock();
/* 46:52 */     for (int i = 0; i < this.d; i++)
/* 47:   */     {
/* 48:53 */       int j = (this.e - this.d + i) % b();
/* 49:54 */       if (j < 0) {
/* 50:55 */         j += b();
/* 51:   */       }
/* 52:57 */       arrayOfObject[i] = this.a[j];
/* 53:   */     }
/* 54:59 */     this.c.readLock().unlock();
/* 55:   */     
/* 56:61 */     return arrayOfObject;
/* 57:   */   }
/* 58:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     uq
 * JD-Core Version:    0.7.0.1
 */