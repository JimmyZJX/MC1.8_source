package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;

/*  2:   */ import java.util.Collections;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class brp
/*  6:   */   implements Runnable
/*  7:   */ {
/*  8: 9 */   private static final brp a = new brp();
/*  9:11 */   private List b = Collections.synchronizedList(Lists.newArrayList());
/* 10:   */   private volatile long c;
/* 11:   */   private volatile long d;
/* 12:   */   private volatile boolean e;
/* 13:   */   
/* 14:   */   private brp()
/* 15:   */   {
/* 16:18 */     Thread localThread = new Thread(this, "File IO Thread");
/* 17:19 */     localThread.setPriority(1);
/* 18:20 */     localThread.start();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public static brp a()
/* 22:   */   {
/* 23:24 */     return a;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public void run()
/* 27:   */   {
/* 28:   */     for (;;)
/* 29:   */     {
/* 30:30 */       c();
/* 31:   */     }
/* 32:   */   }
/* 33:   */   
/* 34:   */   private void c()
/* 35:   */   {
/* 36:35 */     for (int i = 0; i < this.b.size(); i++)
/* 37:   */     {
/* 38:36 */       brq localbrq = (brq)this.b.get(i);
/* 39:37 */       boolean bool = localbrq.c();
/* 40:38 */       if (!bool)
/* 41:   */       {
/* 42:39 */         this.b.remove(i--);
/* 43:40 */         this.d += 1L;
/* 44:   */       }
/* 45:   */       try
/* 46:   */       {
/* 47:44 */         Thread.sleep(this.e ? 0L : 10L);
/* 48:   */       }
/* 49:   */       catch (InterruptedException localInterruptedException2)
/* 50:   */       {
/* 51:46 */         localInterruptedException2.printStackTrace();
/* 52:   */       }
/* 53:   */     }
/* 54:49 */     if (this.b.isEmpty()) {
/* 55:   */       try
/* 56:   */       {
/* 57:51 */         Thread.sleep(25L);
/* 58:   */       }
/* 59:   */       catch (InterruptedException localInterruptedException1)
/* 60:   */       {
/* 61:53 */         localInterruptedException1.printStackTrace();
/* 62:   */       }
/* 63:   */     }
/* 64:   */   }
/* 65:   */   
/* 66:   */   public void a(brq parambrq)
/* 67:   */   {
/* 68:59 */     if (this.b.contains(parambrq)) {
/* 69:60 */       return;
/* 70:   */     }
/* 71:62 */     this.c += 1L;
/* 72:63 */     this.b.add(parambrq);
/* 73:   */   }
/* 74:   */   
/* 75:   */   public void b() throws InterruptedException
/* 76:   */   {
/* 77:67 */     this.e = true;
/* 78:68 */     while (this.c != this.d) {
/* 79:69 */       Thread.sleep(10L);
/* 80:   */     }
/* 81:71 */     this.e = false;
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     brp
 * JD-Core Version:    0.7.0.1
 */