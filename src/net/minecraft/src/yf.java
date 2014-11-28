package net.minecraft.src;
/*  2:   */ import com.google.common.collect.Sets;
/*  3:   */ import java.util.Collection;
/*  4:   */ import java.util.HashSet;
/*  5:   */ import java.util.Map;
/*  6:   */ import java.util.Set;
/*  7:   */ 
/*  8:   */ public class yf
/*  9:   */   extends yc
/* 10:   */ {
/* 11:11 */   private final Set<xz> e = Sets.newHashSet();
/* 12:12 */   protected final Map<String,xz> d = new StringLinkedHashMap<xz>();
/* 13:   */   
/* 14:   */   public ye e(xy paramxy)
/* 15:   */   {
/* 16:16 */     return (ye)super.a(paramxy);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public ye b(String paramString)
/* 20:   */   {
/* 21:21 */     xz localxz = super.a(paramString);
/* 22:22 */     if (localxz == null) {
/* 23:23 */       localxz = (xz)this.d.get(paramString);
/* 24:   */     }
/* 25:25 */     return (ye)localxz;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public xz b(xy paramxy)
/* 29:   */   {
/* 30:30 */     xz localxz = super.b(paramxy);
/* 31:32 */     if (((paramxy instanceof yg)) && (((yg)paramxy).g() != null)) {
/* 32:33 */       this.d.put(((yg)paramxy).g(), localxz);
/* 33:   */     }
/* 34:36 */     return localxz;
/* 35:   */   }
/* 36:   */   
/* 37:   */   protected xz c(xy paramxy)
/* 38:   */   {
/* 39:41 */     return new ye(this, paramxy);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void a(xz paramxz)
/* 43:   */   {
/* 44:46 */     if (paramxz.a().c()) {
/* 45:47 */       this.e.add(paramxz);
/* 46:   */     }
/* 47:50 */     for (xy localxy : this.c.get(paramxz.a()))
/* 48:   */     {
/* 49:51 */       ye localye = e(localxy);
/* 50:52 */       if (localye != null) {
/* 51:53 */         localye.f();
/* 52:   */       }
/* 53:   */     }
/* 54:   */   }
/* 55:   */   
/* 56:   */   public Set<xz> b()
/* 57:   */   {
/* 58:59 */     return this.e;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public Collection<xz> c()
/* 62:   */   {
/* 63:63 */     HashSet<xz> localHashSet = Sets.newHashSet();
/* 64:65 */     for (xz localxz : a()) {
/* 65:66 */       if (localxz.a().c()) {
/* 66:67 */         localHashSet.add(localxz);
/* 67:   */       }
/* 68:   */     }
/* 69:71 */     return localHashSet;
/* 70:   */   }
/* 71:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     yf
 * JD-Core Version:    0.7.0.1
 */