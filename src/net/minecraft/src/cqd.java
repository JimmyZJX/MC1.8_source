package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ 
/*  4:   */ public class cqd
/*  5:   */   extends cqz<EntityHorse>
/*  6:   */ {
/*  7:15 */   private static final Map<String,oa> a = Maps.newHashMap();
/*  8:16 */   private static final oa e = new oa("textures/entity/horse/horse_white.png");
/*  9:17 */   private static final oa j = new oa("textures/entity/horse/mule.png");
/* 10:18 */   private static final oa k = new oa("textures/entity/horse/donkey.png");
/* 11:19 */   private static final oa l = new oa("textures/entity/horse/horse_zombie.png");
/* 12:20 */   private static final oa m = new oa("textures/entity/horse/horse_skeleton.png");
/* 13:   */   
/* 14:   */   public cqd(cpt paramcpt, ccj paramccj, float paramFloat)
/* 15:   */   {
/* 16:23 */     super(paramcpt, paramccj, paramFloat);
/* 17:   */   }
/* 18:   */   
/* 19:   */   protected void a(EntityHorse paramabt, float paramFloat)
/* 20:   */   {
/* 21:28 */     float f = 1.0F;
/* 22:   */     
/* 23:30 */     int i = paramabt.cj();
/* 24:31 */     if (i == 1) {
/* 25:32 */       f *= 0.87F;
/* 26:33 */     } else if (i == 2) {
/* 27:34 */       f *= 0.92F;
/* 28:   */     }
/* 29:36 */     cjm.glScalef(f, f, f);
/* 30:37 */     super.a(paramabt, paramFloat);
/* 31:   */   }
/* 32:   */   
/* 33:   */   protected oa a(EntityHorse paramabt)
/* 34:   */   {
/* 35:43 */     if (!paramabt.cH())
/* 36:   */     {
/* 37:44 */       switch (paramabt.cj())
/* 38:   */       {
/* 39:   */       case 0: 
/* 40:   */       default: 
/* 41:47 */         return e;
/* 42:   */       case 2: 
/* 43:49 */         return j;
/* 44:   */       case 1: 
/* 45:51 */         return k;
/* 46:   */       case 3: 
/* 47:53 */         return l;
/* 48:   */       }
/* 49:55 */       //return m;
/* 50:   */     }
/* 51:59 */     return cqd_b(paramabt);
/* 52:   */   }
/* 53:   */   
/* 54:   */   private oa cqd_b(EntityHorse paramabt)
/* 55:   */   {
/* 56:64 */     String str = paramabt.cJ();
/* 57:66 */     if (!paramabt.cI()) {
/* 58:67 */       return null;
/* 59:   */     }
/* 60:70 */     oa localoa = (oa)a.get(str);
/* 61:71 */     if (localoa == null)
/* 62:   */     {
/* 63:72 */       localoa = new oa(str);
/* 64:73 */       bsu.z().N().a(localoa, new ctu(paramabt.cK()));
/* 65:   */       
/* 66:75 */       a.put(str, localoa);
/* 67:   */     }
/* 68:78 */     return localoa;
/* 69:   */   }
/* 70:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cqd
 * JD-Core Version:    0.7.0.1
 */