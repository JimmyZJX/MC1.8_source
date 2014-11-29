package net.minecraft.src;
/*  1:   */ public class cqy
/*  2:   */   extends cqx<aeh>
/*  3:   */ {
/*  4:   */   public cqy(cpt paramcpt)
/*  5:   */   {
/*  6:10 */     super(paramcpt);
/*  7:   */   }
/*  8:   */   
/*  9:   */   protected void a(aeh paramaeh, float paramFloat, Block parambec)
/* 10:   */   {
/* 11:15 */     super.a(paramaeh, paramFloat, parambec);
/* 12:17 */     if (parambec.getType() == BlockList.mobSpawner) {
/* 13:18 */       cnt.a(paramaeh.j(), paramaeh.xPos, paramaeh.yPos, paramaeh.zPos, paramFloat);
/* 14:   */     }
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqy
 * JD-Core Version:    0.7.0.1
 */