package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ class bxb
/*   4:    */   extends bvk
/*   5:    */ {
/*   6:225 */   public int u = -1;
				private final bwz v;
/*   7:    */   
/*   8:    */   public bxb(bwz parambwz)
/*   9:    */   {
/*  10:228 */     super(parambwz.j, parambwz.l, parambwz.m, 80, parambwz.m - 37, 24);
				  v=parambwz;
/*  11:    */   }
/*  12:    */   
/*  13:    */   private void a(int paramInt1, int paramInt2, Item paramalq, int paramInt3)
/*  14:    */   {
/*  15:232 */     e(paramInt1 + 1, paramInt2 + 1);
/*  16:    */     
/*  17:234 */     cjm.B();
/*  18:    */     
/*  19:236 */     bss.c();
/*  20:    */     
/*  21:238 */     this.v.k.a(new ItemStack(paramalq, 1, paramInt3), paramInt1 + 2, paramInt2 + 2);
/*  22:239 */     bss.a();
/*  23:    */     
/*  24:241 */     cjm.C();
/*  25:    */   }
/*  26:    */   
/*  27:    */   private void e(int paramInt1, int paramInt2)
/*  28:    */   {
/*  29:245 */     d(paramInt1, paramInt2, 0, 0);
/*  30:    */   }
/*  31:    */   
/*  32:    */   private void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  33:    */   {
/*  34:249 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  35:250 */     this.a.N().a(bub.c);
/*  36:    */     
/*  37:252 */     float f1 = 0.007813F;
/*  38:253 */     float f2 = 0.007813F;
/*  39:254 */     int i = 18;
/*  40:255 */     int j = 18;
/*  41:256 */     ckx localckx = ckx.getInstance();
/*  42:257 */     VertexBuffer localciv = localckx.getBuffer();
/*  43:258 */     localciv.begin();
/*  44:259 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + 18, bwz.a(this.v), (paramInt3 + 0) * 0.007813F, (paramInt4 + 18) * 0.007813F);
/*  45:260 */     localciv.addVertexWithUV(paramInt1 + 18, paramInt2 + 18, bwz.b(this.v), (paramInt3 + 18) * 0.007813F, (paramInt4 + 18) * 0.007813F);
/*  46:261 */     localciv.addVertexWithUV(paramInt1 + 18, paramInt2 + 0, bwz.c(this.v), (paramInt3 + 18) * 0.007813F, (paramInt4 + 0) * 0.007813F);
/*  47:262 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + 0, bwz.d(this.v), (paramInt3 + 0) * 0.007813F, (paramInt4 + 0) * 0.007813F);
/*  48:263 */     localckx.draw();
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected int b()
/*  52:    */   {
/*  53:268 */     return bwz.f().size();
/*  54:    */   }
/*  55:    */   
/*  56:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*  57:    */   {
/*  58:273 */     this.u = paramInt1;
/*  59:274 */     this.v.a();
/*  60:275 */     bwz.f(this.v).a(((bxa)bwz.f().get(bwz.e(this.v).u)).d);
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected boolean a(int paramInt)
/*  64:    */   {
/*  65:280 */     return paramInt == this.u;
/*  66:    */   }
/*  67:    */   
/*  68:    */   protected void a() {}
/*  69:    */   
/*  70:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  71:    */   {
/*  72:289 */     bxa localbxa = (bxa)bwz.f().get(paramInt1);
/*  73:290 */     a(paramInt2, paramInt3, localbxa.a, localbxa.b);
/*  74:291 */     this.v.q.a(localbxa.c, paramInt2 + 18 + 5, paramInt3 + 6, 16777215);
/*  75:    */   }
/*  76:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxb
 * JD-Core Version:    0.7.0.1
 */