package net.minecraft.src;
/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class bze
/*  4:   */ {
/*  5: 6 */   private static final bze a = new bze();
/*  6: 7 */   private Random b = new Random();
/*  7: 9 */   private String[] c = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");
/*  8:   */   
/*  9:   */   public static bze a()
/* 10:   */   {
/* 11:34 */     return a;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public String b()
/* 15:   */   {
/* 16:38 */     int i = this.b.nextInt(2) + 3;
/* 17:39 */     String str = "";
/* 18:40 */     for (int j = 0; j < i; j++)
/* 19:   */     {
/* 20:41 */       if (j > 0) {
/* 21:42 */         str = str + " ";
/* 22:   */       }
/* 23:44 */       str = str + this.c[this.b.nextInt(this.c.length)];
/* 24:   */     }
/* 25:46 */     return str;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(long paramLong)
/* 29:   */   {
/* 30:50 */     this.b.setSeed(paramLong);
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bze
 * JD-Core Version:    0.7.0.1
 */