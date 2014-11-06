package net.minecraft.src;
/*  1:   */ public abstract class oc
/*  2:   */   extends eg
/*  3:   */ {
/*  4:   */   public ItemStack b(dz paramdz, ItemStack paramamj)
/*  5:   */   {
/*  6:17 */     World localaqu = paramdz.i();
/*  7:18 */     ex localex = ave.a(paramdz);
/*  8:19 */     EnumDirection localej = ave.b(paramdz.f());
/*  9:   */     
/* 10:21 */     aho localaho = a(localaqu, localex);
/* 11:22 */     localaho.c(localej.g(), localej.h() + 0.1F, localej.i(), b(), a());
/* 12:23 */     localaqu.spawnEntity((Entity)localaho);
/* 13:   */     
/* 14:25 */     paramamj.split(1);
/* 15:   */     
/* 16:27 */     return paramamj;
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void a(dz paramdz)
/* 20:   */   {
/* 21:32 */     paramdz.i().playLevelEvent(1002, paramdz.d(), 0);
/* 22:   */   }
/* 23:   */   
/* 24:   */   protected abstract aho a(World paramaqu, ex paramex);
/* 25:   */   
/* 26:   */   protected float a()
/* 27:   */   {
/* 28:38 */     return 6.0F;
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected float b()
/* 32:   */   {
/* 33:42 */     return 1.1F;
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     oc
 * JD-Core Version:    0.7.0.1
 */