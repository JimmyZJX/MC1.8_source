package net.minecraft.src;
/*  1:   */ import com.google.common.base.Objects;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class cay
/*  5:   */ {
/*  6:   */   private final cav a;
/*  7:   */   private final List b;
/*  8:   */   private final int c;
/*  9:   */   
/* 10:   */   public cay(cav paramcav, List paramList, int paramInt)
/* 11:   */   {
/* 12:18 */     this.a = paramcav;
/* 13:19 */     this.b = paramList;
/* 14:20 */     this.c = paramInt;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public caw a(int paramInt)
/* 18:   */   {
/* 19:28 */     if ((paramInt < 0) || (paramInt >= this.b.size())) {
/* 20:29 */       return car.a;
/* 21:   */     }
/* 22:32 */     return (caw)Objects.firstNonNull(this.b.get(paramInt), car.a);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public int b()
/* 26:   */   {
/* 27:36 */     return this.c;
/* 28:   */   }
/* 29:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cay
 * JD-Core Version:    0.7.0.1
 */