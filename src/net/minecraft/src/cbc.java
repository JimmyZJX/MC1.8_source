package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.mojang.authlib.GameProfile;
/*   3:    */ import java.util.Collection;
/*   4:    */ import java.util.Iterator;
/*   5:    */ import java.util.List;
/*   6:    */ import java.util.Random;
/*   7:    */ 
/*   8:    */ class cbc
/*   9:    */   implements caw
/*  10:    */ {
/*  11:    */   private final brz b;
/*  12:    */   private final oa c;
/*  13:    */   private final List d;
/*  14:    */   
/*  15:    */   public cbc(cbb paramcbb, brz parambrz)
/*  16:    */   {
/*  17: 78 */     this.b = parambrz;
/*  18:    */     
/*  19: 80 */     this.d = Lists.newArrayList();
/*  20: 82 */     for (Object localObject = parambrz.d().iterator(); ((Iterator)localObject).hasNext();)
/*  21:    */     {
/*  22: 82 */       String str = (String)((Iterator)localObject).next();
/*  23: 83 */       ces localces = bsu.z().t().a(str);
/*  24: 85 */       if (localces != null) {
/*  25: 86 */         this.d.add(localces);
/*  26:    */       }
/*  27:    */     }
/*  28: 90 */     if (!this.d.isEmpty())
/*  29:    */     {
/*  30: 91 */       String localObject = ((ces)this.d.get(new Random().nextInt(this.d.size()))).a().getName();
/*  31: 92 */       this.c = cil.c((String)localObject);
/*  32: 93 */       cil.a(this.c, (String)localObject);
/*  33:    */     }
/*  34:    */     else
/*  35:    */     {
/*  36: 95 */       this.c = cva.a();
/*  37:    */     }
/*  38:    */   }
/*  39:    */   
/*  40:    */   public void a(car paramcar)
/*  41:    */   {
/*  42:101 */     paramcar.a(new caz(this.d));
/*  43:    */   }
/*  44:    */   
/*  45:    */   public ho z_()
/*  46:    */   {
/*  47:106 */     return new hy(this.b.c());
/*  48:    */   }
/*  49:    */   
/*  50:    */   public void a(float paramFloat, int paramInt)
/*  51:    */   {
/*  52:111 */     int i = -1;
/*  53:112 */     String str = bty.b(this.b.e());
/*  54:113 */     if (str.length() >= 2) {
/*  55:114 */       i = bsu.z().k.b(str.charAt(1));
/*  56:    */     }
/*  57:117 */     if (i >= 0)
/*  58:    */     {
/*  59:118 */       float f1 = (i >> 16 & 0xFF) / 255.0F;
/*  60:119 */       float f2 = (i >> 8 & 0xFF) / 255.0F;
/*  61:120 */       float f3 = (i & 0xFF) / 255.0F;
/*  62:121 */       bub.a(1, 1, 15, 15, MathUtils.b(f1 * paramFloat, f2 * paramFloat, f3 * paramFloat) | paramInt << 24);
/*  63:    */     }
/*  64:124 */     bsu.z().N().a(this.c);
/*  65:125 */     cjm.c(paramFloat, paramFloat, paramFloat, paramInt / 255.0F);
/*  66:126 */     bub.a(2, 2, 8.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
/*  67:127 */     bub.a(2, 2, 40.0F, 8.0F, 8, 8, 12, 12, 64.0F, 64.0F);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public boolean A_()
/*  71:    */   {
/*  72:132 */     return !this.d.isEmpty();
/*  73:    */   }
/*  74:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cbc
 * JD-Core Version:    0.7.0.1
 */