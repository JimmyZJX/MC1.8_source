package net.minecraft.src;
/*   2:    */ 
/*   3:    */ class bwi
/*   4:    */   extends bvk
/*   5:    */ {
/*   6:154 */   public int u = -1;
				private final bwg v;
/*   7:    */   
/*   8:    */   public bwi(bwg parambwg)
/*   9:    */   {
/*  10:157 */     super(parambwg.j, parambwg.l, parambwg.m, 80, parambwg.m - 32, 38);
				  v=parambwg;
/*  11:    */   }
/*  12:    */   
/*  13:    */   protected int b()
/*  14:    */   {
/*  15:162 */     return bwg.f().size();
/*  16:    */   }
/*  17:    */   
/*  18:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*  19:    */   {
/*  20:167 */     this.u = paramInt1;
/*  21:168 */     this.v.a();
/*  22:169 */     bwg.b(this.v).a(((bwh)bwg.f().get(bwg.a(this.v).u)).c.toString());
/*  23:    */   }
/*  24:    */   
/*  25:    */   protected boolean a(int paramInt)
/*  26:    */   {
/*  27:174 */     return paramInt == this.u;
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected void a() {}
/*  31:    */   
/*  32:    */   private void a(int paramInt1, int paramInt2, oa paramoa)
/*  33:    */   {
/*  34:182 */     int i = paramInt1 + 5;
/*  35:183 */     int j = paramInt2;
/*  36:184 */     bwg.a(this.v, i - 1, i + 32, j - 1, -2039584);
/*  37:185 */     bwg.b(this.v, i - 1, i + 32, j + 32, -6250336);
/*  38:186 */     bwg.c(this.v, i - 1, j - 1, j + 32, -2039584);
/*  39:187 */     bwg.d(this.v, i + 32, j - 1, j + 32, -6250336);
/*  40:    */     
/*  41:189 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  42:190 */     this.a.N().a(paramoa);
/*  43:    */     
/*  44:192 */     int k = 32;
/*  45:193 */     int m = 32;
/*  46:194 */     ckx localckx = ckx.getInstance();
/*  47:195 */     VertexBuffer localciv = localckx.getBuffer();
/*  48:196 */     localciv.begin();
/*  49:197 */     localciv.addVertexWithUV(i + 0, j + 32, 0.0D, 0.0D, 1.0D);
/*  50:198 */     localciv.addVertexWithUV(i + 32, j + 32, 0.0D, 1.0D, 1.0D);
/*  51:199 */     localciv.addVertexWithUV(i + 32, j + 0, 0.0D, 1.0D, 0.0D);
/*  52:200 */     localciv.addVertexWithUV(i + 0, j + 0, 0.0D, 0.0D, 0.0D);
/*  53:201 */     localckx.draw();
/*  54:    */   }
/*  55:    */   
/*  56:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  57:    */   {
/*  58:206 */     bwh localbwh = (bwh)bwg.f().get(paramInt1);
/*  59:207 */     a(paramInt2, paramInt3, localbwh.b);
/*  60:208 */     this.v.q.a(localbwh.a, paramInt2 + 32 + 10, paramInt3 + 14, 16777215);
/*  61:    */   }
/*  62:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwi
 * JD-Core Version:    0.7.0.1
 */