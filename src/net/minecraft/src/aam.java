package net.minecraft.src;
/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import java.util.Collections;
/*   3:    */ import java.util.List;
/*   4:    */ import org.apache.logging.log4j.LogManager;
/*   5:    */ import org.apache.logging.log4j.Logger;
/*   6:    */ 
/*   7:    */ public class aam <T extends EntityLiving>
/*   8:    */   extends GoalType
/*   9:    */ {
/*  10: 24 */   private static final Logger a = LogManager.getLogger();
/*  11:    */   private EntityMob b;
/*  12:    */   private final Predicate<EntityLiving> c;
/*  13:    */   private final aas d;
/*  14:    */   private EntityLiving e;
/*  15:    */   private Class<T> f;
/*  16:    */   
/*  17:    */   public aam(EntityMob paramxn, Class<T> paramClass)
/*  18:    */   {
/*  19: 33 */     this.b = paramxn;
/*  20: 34 */     this.f = paramClass;
/*  21: 36 */     if ((paramxn instanceof EntityWalkingMob)) {
/*  22: 37 */       a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
/*  23:    */     }
/*  24: 40 */     this.c = new aan<T>(this);
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
/*  42: 58 */     this.d = new aas(paramxn);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public boolean canStart()
/*  46:    */   {
/*  47: 63 */     double d1 = f();
/*  48: 64 */     List<T> localList = this.b.world.a(this.f, this.b.getAABB().expand(d1, 4.0D, d1), this.c);
/*  49: 65 */     Collections.sort(localList, this.d);
/*  50: 67 */     if (localList.isEmpty()) {
/*  51: 68 */       return false;
/*  52:    */     }
/*  53: 70 */     this.e = ((EntityLiving)localList.get(0));
/*  54: 71 */     return true;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean canContinue()
/*  58:    */   {
/*  59: 77 */     EntityLiving localxm = this.b.u();
/*  60: 78 */     if (localxm == null) {
/*  61: 79 */       return false;
/*  62:    */     }
/*  63: 81 */     if (!localxm.ai()) {
/*  64: 82 */       return false;
/*  65:    */     }
/*  66: 85 */     double d1 = f();
/*  67: 86 */     if (this.b.h(localxm) > d1 * d1) {
/*  68: 87 */       return false;
/*  69:    */     }
/*  70: 89 */     if (((localxm instanceof qw)) && 
/*  71: 90 */       (((qw)localxm).c.d())) {
/*  72: 91 */       return false;
/*  73:    */     }
/*  74: 94 */     return true;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void start()
/*  78:    */   {
/*  79: 99 */     this.b.d(this.e);
/*  80:100 */     super.start();
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void stop()
/*  84:    */   {
/*  85:105 */     this.b.d((EntityLiving)null);
/*  86:106 */     super.start();
/*  87:    */   }
/*  88:    */   
/*  89:    */   protected double f()
/*  90:    */   {
/*  91:110 */     xz localxz = this.b.getAttribute(MobAttribute.followRange);
/*  92:111 */     return localxz == null ? 16.0D : localxz.e();
/*  93:    */   }
				static <T extends EntityLiving> EntityMob a(aam<T> paramaam) {return paramaam.b;}
/*  94:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aam
 * JD-Core Version:    0.7.0.1
 */