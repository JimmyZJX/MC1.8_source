package net.minecraft.src;
/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import com.google.common.base.Predicates;
/*  3:   */ import java.util.Collections;
/*  4:   */ import java.util.List;
/*  5:   */ import java.util.Random;
/*  6:   */ 
/*  7:   */ public class aaq
/*  8:   */   extends aaw
/*  9:   */ {
/* 10:   */   protected final Class a;
/* 11:   */   private final int g;
/* 12:   */   protected final aas b;
/* 13:   */   protected Predicate c;
/* 14:   */   protected EntityLiving d;
/* 15:   */   
/* 16:   */   public aaq(EntityWalkingMob paramxu, Class paramClass, boolean paramBoolean)
/* 17:   */   {
/* 18:23 */     this(paramxu, paramClass, paramBoolean, false);
/* 19:   */   }
/* 20:   */   
/* 21:   */   public aaq(EntityWalkingMob paramxu, Class paramClass, boolean paramBoolean1, boolean paramBoolean2)
/* 22:   */   {
/* 23:27 */     this(paramxu, paramClass, 10, paramBoolean1, paramBoolean2, null);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public aaq(EntityWalkingMob paramxu, Class paramClass, int paramInt, boolean paramBoolean1, boolean paramBoolean2, Predicate paramPredicate)
/* 27:   */   {
/* 28:31 */     super(paramxu, paramBoolean1, paramBoolean2);
/* 29:32 */     this.a = paramClass;
/* 30:33 */     this.g = paramInt;
/* 31:34 */     this.b = new aas(paramxu);
/* 32:35 */     a(1);
/* 33:   */     
/* 34:37 */     this.c = new aar(this, paramPredicate);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public boolean a()
/* 38:   */   {
/* 39:67 */     if ((this.g > 0) && (this.e.getRNG().nextInt(this.g) != 0)) {
/* 40:68 */       return false;
/* 41:   */     }
/* 42:71 */     double d1 = f();
/* 43:72 */     List localList = this.e.world.a(this.a, this.e.getAABB().expand(d1, 4.0D, d1), Predicates.and(this.c, xe.d));
/* 44:73 */     Collections.sort(localList, this.b);
/* 45:75 */     if (localList.isEmpty()) {
/* 46:76 */       return false;
/* 47:   */     }
/* 48:78 */     this.d = ((EntityLiving)localList.get(0));
/* 49:79 */     return true;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void c()
/* 53:   */   {
/* 54:85 */     this.e.d(this.d);
/* 55:86 */     super.c();
/* 56:   */   }
/* 57:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aaq
 * JD-Core Version:    0.7.0.1
 */