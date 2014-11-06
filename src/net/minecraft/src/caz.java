package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import com.google.common.collect.Ordering;
/*  3:   */ import java.util.Collection;
/*  4:   */ import java.util.List;
/*  5:   */ 
/*  6:   */ public class caz
/*  7:   */   implements cav, caw
/*  8:   */ {
/*  9:23 */   private static final Ordering<ces> a = Ordering.from(new cba());
/* 10:34 */   private final List<cap> b = Lists.newArrayList();
/* 11:   */   
/* 12:   */   public caz()
/* 13:   */   {
/* 14:37 */     this(a.sortedCopy(bsu.z().t().d()));
/* 15:   */   }
/* 16:   */   
/* 17:   */   public caz(Collection<ces> paramCollection)
/* 18:   */   {
/* 19:41 */     for (ces localces : a.sortedCopy(paramCollection)) {
/* 20:42 */       if (localces.b() != EnumGameType.e) {
/* 21:43 */         this.b.add(new cap(localces.a()));
/* 22:   */       }
/* 23:   */     }
/* 24:   */   }
/* 25:   */   
/* 26:   */   public List<cap> a()
/* 27:   */   {
/* 28:50 */     return this.b;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public ho b()
/* 32:   */   {
/* 33:55 */     return new hy("Select a player to teleport to");
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a(car paramcar)
/* 37:   */   {
/* 38:60 */     paramcar.a(this);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public ho z_()
/* 42:   */   {
/* 43:65 */     return new hy("Teleport to player");
/* 44:   */   }
/* 45:   */   
/* 46:   */   public void a(float paramFloat, int paramInt)
/* 47:   */   {
/* 48:70 */     bsu.z().N().a(bvo.a);
/* 49:71 */     bub.a(0, 0, 0.0F, 0.0F, 16, 16, 256.0F, 256.0F);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public boolean A_()
/* 53:   */   {
/* 54:76 */     return !this.b.isEmpty();
/* 55:   */   }
/* 56:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     caz
 * JD-Core Version:    0.7.0.1
 */