package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;

/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public class tz
/*  5:   */ {
/*  6: 9 */   protected final Map<tq,tw> a = Maps.newConcurrentMap();
/*  7:   */   
/*  8:   */   public boolean a(tk paramtk)
/*  9:   */   {
/* 10:12 */     return a((tq)paramtk) > 0;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public boolean b(tk paramtk)
/* 14:   */   {
/* 15:16 */     return (paramtk.c == null) || (a(paramtk.c));
/* 16:   */   }
/* 17:   */   
/* 18:   */   public int c(tk paramtk)
/* 19:   */   {
/* 20:20 */     if (a(paramtk)) {
/* 21:21 */       return 0;
/* 22:   */     }
/* 23:23 */     int i = 0;
/* 24:24 */     tk localtk = paramtk.c;
/* 25:26 */     while ((localtk != null) && (!a(localtk)))
/* 26:   */     {
/* 27:27 */       localtk = localtk.c;
/* 28:28 */       i++;
/* 29:   */     }
/* 30:31 */     return i;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void b(EntityPlayer paramahd, tq paramtq, int paramInt)
/* 34:   */   {
/* 35:35 */     if ((paramtq.d()) && (!b((tk)paramtq))) {
/* 36:36 */       return;
/* 37:   */     }
/* 38:38 */     a(paramahd, paramtq, a(paramtq) + paramInt);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void a(EntityPlayer paramahd, tq paramtq, int paramInt)
/* 42:   */   {
/* 43:42 */     tw localtw = (tw)this.a.get(paramtq);
/* 44:44 */     if (localtw == null)
/* 45:   */     {
/* 46:45 */       localtw = new tw();
/* 47:46 */       this.a.put(paramtq, localtw);
/* 48:   */     }
/* 49:49 */     localtw.a(paramInt);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int a(tq paramtq)
/* 53:   */   {
/* 54:53 */     tw localtw = (tw)this.a.get(paramtq);
/* 55:54 */     return localtw == null ? 0 : localtw.a();
/* 56:   */   }
/* 57:   */   
/* 58:   */   public tx b(tq paramtq)
/* 59:   */   {
/* 60:58 */     tw localtw = (tw)this.a.get(paramtq);
/* 61:60 */     if (localtw != null) {
/* 62:61 */       return localtw.b();
/* 63:   */     }
/* 64:63 */     return null;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public tx a(tq paramtq, tx paramtx)
/* 68:   */   {
/* 69:68 */     tw localtw = (tw)this.a.get(paramtq);
/* 70:70 */     if (localtw == null)
/* 71:   */     {
/* 72:71 */       localtw = new tw();
/* 73:72 */       this.a.put(paramtq, localtw);
/* 74:   */     }
/* 75:75 */     localtw.a(paramtx);
/* 76:   */     
/* 77:77 */     return paramtx;
/* 78:   */   }
/* 79:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     tz
 * JD-Core Version:    0.7.0.1
 */