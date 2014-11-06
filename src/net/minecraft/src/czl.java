package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public class czl
/*  5:   */   extends fb<oa,czg>
/*  6:   */ {
/*  7:   */   private Map<oa,czg> a;
/*  8:   */   
/*  9:   */   protected Map<oa,czg> b()
/* 10:   */   {
/* 11:14 */     this.a = Maps.newHashMap();
/* 12:15 */     return this.a;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(czg paramczg)
/* 16:   */   {
/* 17:19 */     a(paramczg.c(), paramczg);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void a()
/* 21:   */   {
/* 22:23 */     this.a.clear();
/* 23:   */   }
/* 24:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     czl
 * JD-Core Version:    0.7.0.1
 */