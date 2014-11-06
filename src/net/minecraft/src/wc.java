package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.HashMap;
/*  3:   */ import java.util.Map;
/*  4:   */ import java.util.TimerTask;
/*  5:   */ 
/*  6:   */ class wc
/*  7:   */   extends TimerTask
/*  8:   */ {
			  private final wb a;
/*  9:   */   wc(wb paramwb) {a=paramwb;}
/* 10:   */   
/* 11:   */   public void run()
/* 12:   */   {
/* 13:52 */     if (!wb.a(this.a).ac()) {
/* 14:   */       return;
/* 15:   */     }
/* 16:   */     HashMap<String,Object> localHashMap;
/* 17:57 */     synchronized (wb.b(this.a))
/* 18:   */     {
/* 19:58 */       localHashMap = Maps.newHashMap(wb.c(this.a));
/* 20:59 */       if (wb.d(this.a) == 0) {
/* 21:60 */         localHashMap.putAll(wb.e(this.a));
/* 22:   */       }
/* 23:62 */       localHashMap.put("snooper_count", Integer.valueOf(wb.f(this.a)));
/* 24:63 */       localHashMap.put("snooper_token", wb.g(this.a));
/* 25:   */     }
/* 26:66 */     ui.a(wb.h(this.a), localHashMap, true);
/* 27:   */   }
/* 28:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     wc
 * JD-Core Version:    0.7.0.1
 */