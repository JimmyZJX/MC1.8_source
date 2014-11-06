package net.minecraft.src;
/*  1:   */ public class crg
/*  2:   */   extends cqz<EntityRabbit>
/*  3:   */ {
/*  4: 9 */   private static final oa a = new oa("textures/entity/rabbit/brown.png");
/*  5:10 */   private static final oa e = new oa("textures/entity/rabbit/white.png");
/*  6:11 */   private static final oa j = new oa("textures/entity/rabbit/black.png");
/*  7:12 */   private static final oa k = new oa("textures/entity/rabbit/gold.png");
/*  8:13 */   private static final oa l = new oa("textures/entity/rabbit/salt.png");
/*  9:14 */   private static final oa m = new oa("textures/entity/rabbit/white_splotched.png");
/* 10:15 */   private static final oa n = new oa("textures/entity/rabbit/toast.png");
/* 11:16 */   private static final oa o = new oa("textures/entity/rabbit/caerbannog.png");
/* 12:   */   
/* 13:   */   public crg(cpt paramcpt, ccq paramccq, float paramFloat)
/* 14:   */   {
/* 15:19 */     super(paramcpt, paramccq, paramFloat);
/* 16:   */   }
/* 17:   */   
/* 18:   */   protected oa a(EntityRabbit paramacb)
/* 19:   */   {
/* 20:24 */     String str = net.minecraft.src.a.a(paramacb.getName());
/* 21:25 */     if ((str != null) && (str.equals("Toast"))) {
/* 22:26 */       return n;
/* 23:   */     }
/* 24:29 */     switch (paramacb.cl())
/* 25:   */     {
/* 26:   */     case 0: 
/* 27:   */     default: 
/* 28:32 */       return a;
/* 29:   */     case 1: 
/* 30:34 */       return e;
/* 31:   */     case 2: 
/* 32:36 */       return j;
/* 33:   */     case 4: 
/* 34:38 */       return k;
/* 35:   */     case 5: 
/* 36:40 */       return l;
/* 37:   */     case 3: 
/* 38:42 */       return m;
/* 39:   */     }
/* 40:44 */     //return o;
/* 41:   */   }
/* 42:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     crg
 * JD-Core Version:    0.7.0.1
 */