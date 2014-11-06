package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import java.util.Collections;
/*   3:    */ import java.util.List;
/*   4:    */ import org.apache.logging.log4j.LogManager;
/*   5:    */ import org.apache.logging.log4j.Logger;
/*   6:    */ 
/*   7:    */ public class aao
/*   8:    */   extends zb
/*   9:    */ {
/*  10: 27 */   private static final Logger a = LogManager.getLogger();
/*  11:    */   private EntityMob b;
/*  12:    */   private final Predicate<Entity> c;
/*  13:    */   private final aas d;
/*  14:    */   private EntityLiving e;
/*  15:    */   
/*  16:    */   public aao(EntityMob paramxn)
/*  17:    */   {
/*  18: 35 */     this.b = paramxn;
/*  19: 37 */     if ((paramxn instanceof EntityWalkingMob)) {
/*  20: 38 */       a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
/*  21:    */     }
/*  22: 41 */     this.c = new aap(this);
/*  23:    */     
/*  24:    */ 
/*  25:    */ 
/*  26:    */ 
/*  27:    */ 
/*  28:    */ 
/*  29:    */ 
/*  30:    */ 
/*  31:    */ 
/*  32:    */ 
/*  33:    */ 
/*  34:    */ 
/*  35:    */ 
/*  36:    */ 
/*  37:    */ 
/*  38:    */ 
/*  39:    */ 
/*  40:    */ 
/*  41:    */ 
/*  42:    */ 
/*  43:    */ 
/*  44:    */ 
/*  45:    */ 
/*  46:    */ 
/*  47: 66 */     this.d = new aas(paramxn);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public boolean a()
/*  51:    */   {
/*  52: 71 */     double d1 = f();
/*  53: 72 */     List<EntityPlayer> localList = this.b.world.a(EntityPlayer.class, this.b.getAABB().expand(d1, 4.0D, d1), this.c);
/*  54: 73 */     Collections.sort(localList, this.d);
/*  55: 75 */     if (localList.isEmpty()) {
/*  56: 76 */       return false;
/*  57:    */     }
/*  58: 78 */     this.e = ((EntityLiving)localList.get(0));
/*  59: 79 */     return true;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public boolean b()
/*  63:    */   {
/*  64: 85 */     EntityLiving localxm = this.b.u();
/*  65: 86 */     if (localxm == null) {
/*  66: 87 */       return false;
/*  67:    */     }
/*  68: 89 */     if (!localxm.ai()) {
/*  69: 90 */       return false;
/*  70:    */     }
/*  71: 93 */     bsf localbsf1 = this.b.bN();
/*  72: 94 */     bsf localbsf2 = localxm.bN();
/*  73: 95 */     if ((localbsf1 != null) && (localbsf2 == localbsf1)) {
/*  74: 96 */       return false;
/*  75:    */     }
/*  76: 99 */     double d1 = f();
/*  77:100 */     if (this.b.h(localxm) > d1 * d1) {
/*  78:101 */       return false;
/*  79:    */     }
/*  80:103 */     if (((localxm instanceof qw)) && 
/*  81:104 */       (((qw)localxm).c.d())) {
/*  82:105 */       return false;
/*  83:    */     }
/*  84:108 */     return true;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void c()
/*  88:    */   {
/*  89:113 */     this.b.d(this.e);
/*  90:114 */     super.c();
/*  91:    */   }
/*  92:    */   
/*  93:    */   public void d()
/*  94:    */   {
/*  95:119 */     this.b.d((EntityLiving)null);
/*  96:120 */     super.c();
/*  97:    */   }
/*  98:    */   
/*  99:    */   protected double f()
/* 100:    */   {
/* 101:124 */     xz localxz = this.b.a(afs.b);
/* 102:125 */     return localxz == null ? 16.0D : localxz.e();
/* 103:    */   }

				static EntityMob a(aao paramaao)
				{
					return paramaao.b;
				}
/* 104:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aao
 * JD-Core Version:    0.7.0.1
 */