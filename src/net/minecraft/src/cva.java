package net.minecraft.src;
/*  1:   */ import java.util.UUID;
/*  2:   */ 
/*  3:   */ public class cva
/*  4:   */ {
/*  5: 9 */   private static final oa a = new oa("textures/entity/steve.png");
/*  6:10 */   private static final oa b = new oa("textures/entity/alex.png");
/*  7:   */   
/*  8:   */   public static oa a()
/*  9:   */   {
/* 10:16 */     return a;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public static oa a(UUID paramUUID)
/* 14:   */   {
/* 15:20 */     if (c(paramUUID)) {
/* 16:21 */       return b;
/* 17:   */     }
/* 18:23 */     return a;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public static String b(UUID paramUUID)
/* 22:   */   {
/* 23:31 */     if (c(paramUUID)) {
/* 24:32 */       return "slim";
/* 25:   */     }
/* 26:34 */     return "default";
/* 27:   */   }
/* 28:   */   
/* 29:   */   private static boolean c(UUID paramUUID)
/* 30:   */   {
/* 31:38 */     return (paramUUID.hashCode() & 0x1) == 1;
/* 32:   */   }
/* 33:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cva
 * JD-Core Version:    0.7.0.1
 */