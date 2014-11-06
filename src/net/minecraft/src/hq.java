package net.minecraft.src;
/*  1:   */ import java.util.Iterator;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class hq
/*  5:   */ {
/*  6:   */   public static ho a(ICommandSender paramae, ho paramho, Entity paramwv) throws dj
/*  7:   */   {
/*  8:15 */     ho localObject1 = null;
/*  9:   */     Object localObject3;
/* 10:16 */     if ((paramho instanceof ht))
/* 11:   */     {
/* 12:17 */       ht localObject2 = (ht)paramho;
/* 13:18 */       String str = localObject2.g();
/* 14:19 */       if (ah.b(str))
/* 15:   */       {
/* 16:20 */         localObject3 = ah.b(paramae, str, Entity.class);
/* 17:21 */         if (((List)localObject3).size() == 1) {
/* 18:22 */           str = ((Entity)((List)localObject3).get(0)).getName();
/* 19:   */         } else {
/* 20:24 */           throw new dj();
/* 21:   */         }
/* 22:   */       }
/* 23:27 */       localObject1 = (paramwv != null) && (str.equals("*")) ? new ht(paramwv.getName(), localObject2.h()) : new ht(str, ((ht)localObject2).h());
/* 24:   */       
/* 25:   */ 
/* 26:   */ 
/* 27:31 */       ((ht)localObject1).b(localObject2.e());
/* 28:   */     }
/* 29:32 */     else if ((paramho instanceof hu))
/* 30:   */     {
/* 31:33 */       String localObject2 = ((hu)paramho).g();
/* 32:34 */       localObject1 = ah.b(paramae, localObject2);
/* 33:35 */       if (localObject1 == null) {
/* 34:36 */         localObject1 = new hy("");
/* 35:   */       }
/* 36:   */     }
/* 37:38 */     else if ((paramho instanceof hy))
/* 38:   */     {
/* 39:39 */       localObject1 = new hy(((hy)paramho).g());
/* 40:   */     }
/* 41:40 */     else if ((paramho instanceof hz))
/* 42:   */     {
/* 43:41 */       Object[] localObject2 = ((hz)paramho).j();
/* 44:42 */       for (int i = 0; i < localObject2.length; i++)
/* 45:   */       {
/* 46:43 */         localObject3 = localObject2[i];
/* 47:44 */         if ((localObject3 instanceof ho)) {
/* 48:45 */           localObject2[i] = a(paramae, (ho)localObject3, paramwv);
/* 49:   */         }
/* 50:   */       }
/* 51:48 */       localObject1 = new hz(((hz)paramho).i(), localObject2);
/* 52:   */     }
/* 53:   */     else
/* 54:   */     {
/* 55:50 */       return paramho;
/* 56:   */     }
/* 57:52 */     Object localObject2 = paramho.b();
/* 58:53 */     if (localObject2 != null) {
/* 59:54 */       ((ho)localObject1).a(((hv)localObject2).m());
/* 60:   */     }
/* 61:56 */     for (Iterator localIterator = paramho.a().iterator(); localIterator.hasNext();)
/* 62:   */     {
/* 63:56 */       localObject3 = (ho)localIterator.next();
/* 64:57 */       ((ho)localObject1).a(a(paramae, (ho)localObject3, paramwv));
/* 65:   */     }
/* 66:59 */     return localObject1;
/* 67:   */   }
/* 68:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     hq
 * JD-Core Version:    0.7.0.1
 */