package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class bsh
/*  5:   */   implements bsk
/*  6:   */ {
/*  7:   */   private final String j;
/*  8:   */   
/*  9:   */   public bsh(String paramString, a parama)
/* 10:   */   {
/* 11:12 */     this.j = (paramString + parama.e());
/* 12:13 */     bsk.a.put(this.j, this);
/* 13:   */   }
/* 14:   */   
/* 15:   */   public String a()
/* 16:   */   {
/* 17:18 */     return this.j;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public int a(List<EntityPlayer> paramList)
/* 21:   */   {
/* 22:23 */     return 0;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public boolean b()
/* 26:   */   {
/* 27:28 */     return false;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public bsl c()
/* 31:   */   {
/* 32:33 */     return bsl.a;
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bsh
 * JD-Core Version:    0.7.0.1
 */