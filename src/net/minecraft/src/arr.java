package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;

/*  2:   */ import java.util.List;

/*  3:   */ import net.minecraft.server.MinecraftServer;
/*  4:   */ 
/*  5:   */ public class arr
/*  6:   */ {
/*  7:   */   private final arz a;
/*  8:   */   private long b;
/*  9:40 */   private LongHashMap c = new LongHashMap();
/* 10:41 */   private List<ars> d = Lists.newArrayList();
/* 11:   */   
/* 12:   */   public arr(arz paramarz)
/* 13:   */   {
/* 14:44 */     this.a = paramarz;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public ars a(int paramInt1, int paramInt2)
/* 18:   */   {
/* 19:48 */     paramInt1 >>= 4;
/* 20:49 */     paramInt2 >>= 4;
/* 21:50 */     long l = paramInt1 & 0xFFFFFFFF | (paramInt2 & 0xFFFFFFFF) << 32;
/* 22:51 */     ars localars = (ars)this.c.getValueByKey(l);
/* 23:52 */     if (localars == null)
/* 24:   */     {
/* 25:53 */       localars = new ars(this, paramInt1, paramInt2);
/* 26:54 */       this.c.add(l, localars);
/* 27:55 */       this.d.add(localars);
/* 28:   */     }
/* 29:57 */     localars.e = MinecraftServer.ax();
/* 30:58 */     return localars;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public arm a(int paramInt1, int paramInt2, arm paramarm)
/* 34:   */   {
/* 35:62 */     arm localarm = a(paramInt1, paramInt2).a(paramInt1, paramInt2);
/* 36:63 */     if (localarm == null) {
/* 37:64 */       return paramarm;
/* 38:   */     }
/* 39:66 */     return localarm;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void a()
/* 43:   */   {
/* 44:74 */     long l1 = MinecraftServer.ax();
/* 45:75 */     long l2 = l1 - this.b;
/* 46:76 */     if ((l2 > 7500L) || (l2 < 0L))
/* 47:   */     {
/* 48:77 */       this.b = l1;
/* 49:79 */       for (int i = 0; i < this.d.size(); i++)
/* 50:   */       {
/* 51:80 */         ars localars = (ars)this.d.get(i);
/* 52:81 */         long l3 = l1 - localars.e;
/* 53:82 */         if ((l3 > 30000L) || (l3 < 0L))
/* 54:   */         {
/* 55:83 */           this.d.remove(i--);
/* 56:84 */           long l4 = localars.c & 0xFFFFFFFF | (localars.d & 0xFFFFFFFF) << 32;
/* 57:85 */           this.c.remove(l4);
/* 58:   */         }
/* 59:   */       }
/* 60:   */     }
/* 61:   */   }
/* 62:   */   
/* 63:   */   public arm[] c(int paramInt1, int paramInt2)
/* 64:   */   {
/* 65:92 */     return a(paramInt1, paramInt2).b;
/* 66:   */   }
			  static arz a(arr arg0) {return arg0.a;}
/* 67:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     arr
 * JD-Core Version:    0.7.0.1
 */