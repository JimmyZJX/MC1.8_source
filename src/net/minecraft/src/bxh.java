package net.minecraft.src;
/*   2:    */ import java.util.Date;
/*   4:    */ import org.apache.commons.lang3.StringUtils;
/*   5:    */ 
/*   6:    */ class bxh
/*   7:    */   extends bvk
/*   8:    */ {
				private final bxg u;
/*   9:    */   public bxh(bxg parambxg, bsu parambsu)
/*  10:    */   {
/*  11:206 */     super(parambsu, parambxg.l, parambxg.m, 32, parambxg.m - 64, 36);
				  u=parambxg;
/*  12:    */   }
/*  13:    */   
/*  14:    */   protected int b()
/*  15:    */   {
/*  16:211 */     return bxg.a(this.u).size();
/*  17:    */   }
/*  18:    */   
/*  19:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*  20:    */   {
/*  21:216 */     bxg.a(this.u, paramInt1);
/*  22:217 */     boolean bool = (bxg.b(this.u) >= 0) && (bxg.b(this.u) < b());
/*  23:218 */     bxg.c(this.u).l = bool;
/*  24:219 */     bxg.d(this.u).l = bool;
/*  25:220 */     bxg.e(this.u).l = bool;
/*  26:221 */     bxg.f(this.u).l = bool;
/*  27:223 */     if ((paramBoolean) && (bool)) {
/*  28:224 */       this.u.i(paramInt1);
/*  29:    */     }
/*  30:    */   }
/*  31:    */   
/*  32:    */   protected boolean a(int paramInt)
/*  33:    */   {
/*  34:230 */     return paramInt == bxg.b(this.u);
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected int k()
/*  38:    */   {
/*  39:235 */     return bxg.a(this.u).size() * 36;
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected void a()
/*  43:    */   {
/*  44:240 */     this.u.c();
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  48:    */   {
/*  49:245 */     brb localbrb = (brb)bxg.a(this.u).get(paramInt1);
/*  50:    */     
/*  51:247 */     String str1 = localbrb.b();
/*  52:248 */     if (StringUtils.isEmpty(str1)) {
/*  53:249 */       str1 = bxg.g(this.u) + " " + (paramInt1 + 1);
/*  54:    */     }
/*  55:252 */     String str2 = localbrb.a();
/*  56:253 */     str2 = str2 + " (" + bxg.h(this.u).format(new Date(localbrb.e()));
/*  57:254 */     str2 = str2 + ")";
/*  58:255 */     String str3 = "";
/*  59:257 */     if (localbrb.d())
/*  60:    */     {
/*  61:258 */       str3 = bxg.i(this.u) + " " + str3;
/*  62:    */     }
/*  63:    */     else
/*  64:    */     {
/*  65:260 */       str3 = bxg.j(this.u)[localbrb.f().a()];
/*  66:262 */       if (localbrb.g()) {
/*  67:263 */         str3 = a.e + cwc.a("gameMode.hardcore", new Object[0]) + a.v;
/*  68:    */       }
/*  69:266 */       if (localbrb.h()) {
/*  70:267 */         str3 = str3 + ", " + cwc.a("selectWorld.cheats", new Object[0]);
/*  71:    */       }
/*  72:    */     }
/*  73:271 */     this.u.c(this.u.q, str1, paramInt2 + 2, paramInt3 + 1, 16777215);
/*  74:272 */     this.u.c(this.u.q, str2, paramInt2 + 2, paramInt3 + 12, 8421504);
/*  75:273 */     this.u.c(this.u.q, str3, paramInt2 + 2, paramInt3 + 12 + 10, 8421504);
/*  76:    */   }
/*  77:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxh
 * JD-Core Version:    0.7.0.1
 */