package net.minecraft.src;
/*  1:   */ public class zi
/*  2:   */   extends zh
/*  3:   */ {
/*  4:   */   private final EntityVillager e;
/*  5:   */   
/*  6:   */   public zi(EntityVillager paramagp)
/*  7:   */   {
/*  8:10 */     super(paramagp, EntityPlayer.class, 8.0F);
/*  9:11 */     this.e = paramagp;
/* 10:   */   }
/* 11:   */   
/* 12:   */   public boolean a()
/* 13:   */   {
/* 14:16 */     if (this.e.cm())
/* 15:   */     {
/* 16:17 */       this.b = this.e.u_();
/* 17:18 */       return true;
/* 18:   */     }
/* 19:20 */     return false;
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     zi
 * JD-Core Version:    0.7.0.1
 */