package net.minecraft.src;
/*  1:   */ public class cpe
/*  2:   */   extends cqv<EntityArmorStand>
/*  3:   */ {
/*  4:13 */   public static final oa a = new oa("textures/entity/armorstand/wood.png");
/*  5:   */   
/*  6:   */   public cpe(cpt paramcpt)
/*  7:   */   {
/*  8:16 */     super(paramcpt, new cbv(), 0.0F);
/*  9:17 */     cpf localcpf = new cpf(this, this);
/* 10:   */     
/* 11:   */ 
/* 12:   */ 
/* 13:   */ 
/* 14:   */ 
/* 15:   */ 
/* 16:24 */     a(localcpf);
/* 17:25 */     a(new csn(this));
/* 18:26 */     a(new csh(a().e));
/* 19:   */   }
/* 20:   */   
/* 21:   */   protected oa a(EntityArmorStand paramadi)
/* 22:   */   {
/* 23:31 */     return a;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public cbv a()
/* 27:   */   {
/* 28:36 */     return (cbv)super.b();
/* 29:   */   }
/* 30:   */   
/* 31:   */   protected void a(EntityArmorStand paramadi, float paramFloat1, float paramFloat2, float paramFloat3)
/* 32:   */   {
/* 33:41 */     cjm.glRotatef(180.0F - paramFloat2, 0.0F, 1.0F, 0.0F);
/* 34:   */   }
/* 35:   */   
/* 36:   */   protected boolean b(EntityArmorStand paramadi)
/* 37:   */   {
/* 38:46 */     return paramadi.aM();
/* 39:   */   }
/* 40:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpe
 * JD-Core Version:    0.7.0.1
 */