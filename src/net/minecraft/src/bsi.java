package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class bsi
/*  5:   */   implements bsk
/*  6:   */ {
/*  7:   */   private final String j;
/*  8:   */   
/*  9:   */   public bsi(String paramString)
/* 10:   */   {
/* 11:11 */     this.j = paramString;
/* 12:12 */     bsk.a.put(paramString, this);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public String a()
/* 16:   */   {
/* 17:17 */     return this.j;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public int a(List<EntityPlayer> paramList)
/* 21:   */   {
/* 22:22 */     return 0;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public boolean b()
/* 26:   */   {
/* 27:27 */     return false;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public bsl c()
/* 31:   */   {
/* 32:32 */     return bsl.a;
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsi
 * JD-Core Version:    0.7.0.1
 */