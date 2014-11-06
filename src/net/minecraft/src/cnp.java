package net.minecraft.src;
/*  1:   */ public abstract class cnp<T extends bcm>
/*  2:   */ {
/*  3:10 */   protected static final oa[] a = { new oa("textures/blocks/destroy_stage_0.png"), new oa("textures/blocks/destroy_stage_1.png"), new oa("textures/blocks/destroy_stage_2.png"), new oa("textures/blocks/destroy_stage_3.png"), new oa("textures/blocks/destroy_stage_4.png"), new oa("textures/blocks/destroy_stage_5.png"), new oa("textures/blocks/destroy_stage_6.png"), new oa("textures/blocks/destroy_stage_7.png"), new oa("textures/blocks/destroy_stage_8.png"), new oa("textures/blocks/destroy_stage_9.png") };
/*  4:   */   protected cno b;
/*  5:   */   
/*  6:   */   public abstract void a(T parambcm, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt);
/*  7:   */   
/*  8:   */   protected void a(oa paramoa)
/*  9:   */   {
/* 10:28 */     cug localcug = this.b.e;
/* 11:29 */     if (localcug != null) {
/* 12:30 */       localcug.a(paramoa);
/* 13:   */     }
/* 14:   */   }
/* 15:   */   
/* 16:   */   protected World a()
/* 17:   */   {
/* 18:35 */     return this.b.f;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(cno paramcno)
/* 22:   */   {
/* 23:39 */     this.b = paramcno;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public bty b()
/* 27:   */   {
/* 28:43 */     return this.b.a();
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnp
 * JD-Core Version:    0.7.0.1
 */