package net.minecraft.src;
/*  1:   */ import java.util.Map;
/*  2:   */ 
/*  3:   */ public class to
/*  4:   */   extends PlayerStat
/*  5:   */ {
/*  6:   */   private final Item a;
/*  7:   */   
/*  8:   */   public to(String paramString1, String paramString2, ho paramho, Item paramalq)
/*  9:   */   {
/* 10:11 */     super(paramString1 + paramString2, paramho);
/* 11:12 */     this.a = paramalq;
/* 12:   */     
/* 13:14 */     int i = Item.b(paramalq);
/* 14:15 */     if (i != 0) {
/* 15:16 */       bsk.a.put(paramString1 + i, k());
/* 16:   */     }
/* 17:   */   }
/* 18:   */   
/* 19:   */   public Item a()
/* 20:   */   {
/* 21:21 */     return this.a;
/* 22:   */   }
/* 23:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     to
 * JD-Core Version:    0.7.0.1
 */