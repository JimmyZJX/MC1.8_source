package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.net.InetAddress;
/*  3:   */ import java.util.Collections;
/*  4:   */ import java.util.List;
/*  5:   */ 
/*  6:   */ public class cys
/*  7:   */ {
/*  8:22 */   private List<cyq> b = Lists.newArrayList();
/*  9:   */   boolean a;
/* 10:   */   
/* 11:   */   public synchronized boolean a()
/* 12:   */   {
/* 13:26 */     return this.a;
/* 14:   */   }
/* 15:   */   
/* 16:   */   public synchronized void b()
/* 17:   */   {
/* 18:30 */     this.a = false;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public synchronized List<cyq> c()
/* 22:   */   {
/* 23:34 */     return Collections.unmodifiableList(this.b);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public synchronized void a(String paramString, InetAddress paramInetAddress)
/* 27:   */   {
/* 28:38 */     String str1 = cyt.a(paramString);
/* 29:39 */     String str2 = cyt.b(paramString);
/* 30:40 */     if (str2 == null) {
/* 31:41 */       return;
/* 32:   */     }
/* 33:44 */     str2 = paramInetAddress.getHostAddress() + ":" + str2;
/* 34:   */     
/* 35:46 */     int i = 0;
/* 36:47 */     for (cyq localcyq : this.b) {
/* 37:48 */       if (localcyq.b().equals(str2))
/* 38:   */       {
/* 39:49 */         localcyq.c();
/* 40:50 */         i = 1;
/* 41:51 */         break;
/* 42:   */       }
/* 43:   */     }
/* 44:55 */     if (i == 0)
/* 45:   */     {
/* 46:56 */       this.b.add(new cyq(str1, str2));
/* 47:57 */       this.a = true;
/* 48:   */     }
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cys
 * JD-Core Version:    0.7.0.1
 */