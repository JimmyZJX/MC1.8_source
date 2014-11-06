package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ class bwe
/*   4:    */   extends bvk
/*   5:    */ {
/*   6:138 */   public int u = -1;
/*   7:    */   private final bwd v;
/*   8:    */   public bwe(bwd parambwd)
/*   9:    */   {
/*  10:141 */     super(parambwd.j, parambwd.l, parambwd.m, 43, parambwd.m - 60, 24);
				  v=parambwd;
/*  11:    */   }
/*  12:    */   
/*  13:    */   private void a(int paramInt1, int paramInt2, ItemStack paramamj)
/*  14:    */   {
/*  15:145 */     e(paramInt1 + 1, paramInt2 + 1);
/*  16:    */     
/*  17:147 */     cjm.B();
/*  18:149 */     if ((paramamj != null) && (paramamj.getItem() != null))
/*  19:    */     {
/*  20:150 */       bss.c();
/*  21:151 */       this.v.k.a(paramamj, paramInt1 + 2, paramInt2 + 2);
/*  22:152 */       bss.a();
/*  23:    */     }
/*  24:155 */     cjm.C();
/*  25:    */   }
/*  26:    */   
/*  27:    */   private void e(int paramInt1, int paramInt2)
/*  28:    */   {
/*  29:159 */     d(paramInt1, paramInt2, 0, 0);
/*  30:    */   }
/*  31:    */   
/*  32:    */   private void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*  33:    */   {
/*  34:163 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  35:164 */     this.a.N().a(bub.c);
/*  36:    */     
/*  37:166 */     float f1 = 0.007813F;
/*  38:167 */     float f2 = 0.007813F;
/*  39:168 */     int i = 18;
/*  40:169 */     int j = 18;
/*  41:170 */     ckx localckx = ckx.getInstance();
/*  42:171 */     VertexBuffer localciv = localckx.getBuffer();
/*  43:172 */     localciv.begin();
/*  44:173 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + 18, bwd.a(this.v), (paramInt3 + 0) * 0.007813F, (paramInt4 + 18) * 0.007813F);
/*  45:174 */     localciv.addVertexWithUV(paramInt1 + 18, paramInt2 + 18, bwd.b(this.v), (paramInt3 + 18) * 0.007813F, (paramInt4 + 18) * 0.007813F);
/*  46:175 */     localciv.addVertexWithUV(paramInt1 + 18, paramInt2 + 0, bwd.c(this.v), (paramInt3 + 18) * 0.007813F, (paramInt4 + 0) * 0.007813F);
/*  47:176 */     localciv.addVertexWithUV(paramInt1 + 0, paramInt2 + 0, bwd.d(this.v), (paramInt3 + 0) * 0.007813F, (paramInt4 + 0) * 0.007813F);
/*  48:177 */     localckx.draw();
/*  49:    */   }
/*  50:    */   
/*  51:    */   protected int b()
/*  52:    */   {
/*  53:182 */     return bwd.e(this.v).c().size();
/*  54:    */   }
/*  55:    */   
/*  56:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*  57:    */   {
/*  58:187 */     this.u = paramInt1;
/*  59:188 */     this.v.f();
/*  60:    */   }
/*  61:    */   
/*  62:    */   protected boolean a(int paramInt)
/*  63:    */   {
/*  64:193 */     return paramInt == this.u;
/*  65:    */   }
/*  66:    */   
/*  67:    */   protected void a() {}
/*  68:    */   
/*  69:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  70:    */   {
/*  71:202 */     biw localbiw = (biw)bwd.e(this.v).c().get(bwd.e(this.v).c().size() - paramInt1 - 1);
/*  72:    */     
/*  73:    */ 
/*  74:205 */     Block localbec = localbiw.c();
/*  75:206 */     ProtoBlock localatr = localbec.getProto();
/*  76:207 */     Item localalq = Item.fromProtoBlock(localatr);
/*  77:208 */     ItemStack localamj = (localatr == BlockList.air) || (localalq == null) ? null : new ItemStack(localalq, 1, localatr.c(localbec));
/*  78:209 */     String str1 = localamj == null ? "Air" : localalq.a(localamj);
/*  79:210 */     if (localalq == null)
/*  80:    */     {
/*  81:211 */       if ((localatr == BlockList.j) || (localatr == BlockList.i)) {
/*  82:212 */         localalq = ItemList.ax;
/*  83:213 */       } else if ((localatr == BlockList.l) || (localatr == BlockList.k)) {
/*  84:214 */         localalq = ItemList.ay;
/*  85:    */       }
/*  86:216 */       if (localalq != null)
/*  87:    */       {
/*  88:217 */         localamj = new ItemStack(localalq, 1, localatr.c(localbec));
/*  89:218 */         str1 = localatr.H();
/*  90:    */       }
/*  91:    */     }
/*  92:222 */     a(paramInt2, paramInt3, localamj);
/*  93:223 */     this.v.q.a(str1, paramInt2 + 18 + 5, paramInt3 + 3, 16777215);
/*  94:    */     String str2;
/*  95:227 */     if (paramInt1 == 0) {
/*  96:228 */       str2 = cwc.a("createWorld.customize.flat.layer.top", new Object[] { Integer.valueOf(localbiw.b()) });
/*  97:229 */     } else if (paramInt1 == bwd.e(this.v).c().size() - 1) {
/*  98:230 */       str2 = cwc.a("createWorld.customize.flat.layer.bottom", new Object[] { Integer.valueOf(localbiw.b()) });
/*  99:    */     } else {
/* 100:232 */       str2 = cwc.a("createWorld.customize.flat.layer", new Object[] { Integer.valueOf(localbiw.b()) });
/* 101:    */     }
/* 102:235 */     this.v.q.a(str2, paramInt2 + 2 + 213 - this.v.q.a(str2), paramInt3 + 3, 16777215);
/* 103:    */   }
/* 104:    */   
/* 105:    */   protected int d()
/* 106:    */   {
/* 107:240 */     return this.b - 70;
/* 108:    */   }
/* 109:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwe
 * JD-Core Version:    0.7.0.1
 */