package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class crz
/*  5:   */   extends cqe<EntityZombie>
/*  6:   */ {
/*  7:14 */   private static final oa j = new oa("textures/entity/zombie/zombie.png");
/*  8:15 */   private static final oa k = new oa("textures/entity/zombie/zombie_villager.png");
/*  9:   */   private final ccl l;
/* 10:   */   private final cdl m;
/* 11:   */   private final List<csq> n;
/* 12:   */   private final List<csq> o;
/* 13:   */   
/* 14:   */   public crz(cpt paramcpt)
/* 15:   */   {
/* 16:22 */     super(paramcpt, new cdp(), 0.5F, 1.0F);
/* 17:23 */     csq localcsq = (csq)this.h.get(0);
/* 18:   */     
/* 19:25 */     this.l = this.a;
/* 20:26 */     this.m = new cdl();
/* 21:   */     
/* 22:28 */     a(new csn(this));
/* 23:   */     
/* 24:   */ 
/* 25:31 */     csa localcsa = new csa(this, this);
/* 26:   */     
/* 27:   */ 
/* 28:   */ 
/* 29:   */ 
/* 30:   */ 
/* 31:   */ 
/* 32:38 */     a(localcsa);
/* 33:39 */     this.o = Lists.newArrayList(this.h);
/* 34:41 */     if ((localcsq instanceof csh))
/* 35:   */     {
/* 36:42 */       b(localcsq);
/* 37:43 */       a(new csh(this.m.e));
/* 38:   */     }
/* 39:45 */     b(localcsa);
/* 40:46 */     a(new csv(this));
/* 41:47 */     this.n = Lists.newArrayList(this.h);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void a(EntityZombie paramagj, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 45:   */   {
/* 46:52 */     crz_b(paramagj);
/* 47:53 */     super.a(paramagj, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 48:   */   }
/* 49:   */   
/* 50:   */   protected oa a(EntityZombie paramagj)
/* 51:   */   {
/* 52:58 */     if (paramagj.cm()) {
/* 53:59 */       return k;
/* 54:   */     }
/* 55:61 */     return j;
/* 56:   */   }
/* 57:   */   
/* 58:   */   private void crz_b(EntityZombie paramagj)
/* 59:   */   {
/* 60:65 */     if (paramagj.cm())
/* 61:   */     {
/* 62:66 */       this.f = this.m;
/* 63:67 */       this.h = this.n;
/* 64:   */     }
/* 65:   */     else
/* 66:   */     {
/* 67:69 */       this.f = this.l;
/* 68:70 */       this.h = this.o;
/* 69:   */     }
/* 70:73 */     this.a = ((ccl)this.f);
/* 71:   */   }
/* 72:   */   
/* 73:   */   protected void a(EntityZombie paramagj, float paramFloat1, float paramFloat2, float paramFloat3)
/* 74:   */   {
/* 75:78 */     if (paramagj.cn()) {
/* 76:79 */       paramFloat2 += (float)(Math.cos(paramagj.W * 3.25D) * 3.141592653589793D * 0.25D);
/* 77:   */     }
/* 78:81 */     super.a(paramagj, paramFloat1, paramFloat2, paramFloat3);
/* 79:   */   }
/* 80:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     crz
 * JD-Core Version:    0.7.0.1
 */