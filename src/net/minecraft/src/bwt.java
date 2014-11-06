package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Map;
/*   5:    */ 
/*   6:    */ class bwt
/*   7:    */   extends bvk
/*   8:    */ {
/*   9: 88 */   private final List<String> v = Lists.newArrayList();
/*  10: 89 */   private final Map<String,cwd> w = Maps.newHashMap();
				private final bws u;
/*  11:    */   
/*  12:    */   public bwt(bws parambws, bsu parambsu)
/*  13:    */   {
/*  14: 92 */     super(parambsu, parambws.l, parambws.m, 32, parambws.m - 65 + 4, 18);
				  u=parambws;
/*  15: 94 */     for (cwd localcwd : bws.a(parambws).d())
/*  16:    */     {
/*  17: 95 */       this.w.put(localcwd.a(), localcwd);
/*  18: 96 */       this.v.add(localcwd.a());
/*  19:    */     }
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected int b()
/*  23:    */   {
/*  24:102 */     return this.v.size();
/*  25:    */   }
/*  26:    */   
/*  27:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*  28:    */   {
/*  29:107 */     cwd localcwd = (cwd)this.w.get(this.v.get(paramInt1));
/*  30:    */     
/*  31:109 */     bws.a(this.u).a(localcwd);
/*  32:110 */     bws.b(this.u).aI = localcwd.a();
/*  33:    */     
/*  34:112 */     this.a.e();
/*  35:    */     
/*  36:114 */     this.u.q.a((bws.a(this.u).a()) || (bws.b(this.u).aJ));
/*  37:115 */     this.u.q.b(bws.a(this.u).b());
/*  38:    */     
/*  39:117 */     bws.c(this.u).j = cwc.a("gui.done", new Object[0]);
/*  40:118 */     bws.d(this.u).j = bws.b(this.u).c(btr.E);
/*  41:119 */     bws.b(this.u).b();
/*  42:    */   }
/*  43:    */   
/*  44:    */   protected boolean a(int paramInt)
/*  45:    */   {
/*  46:124 */     return ((String)this.v.get(paramInt)).equals(bws.a(this.u).c().a());
/*  47:    */   }
/*  48:    */   
/*  49:    */   protected int k()
/*  50:    */   {
/*  51:129 */     return b() * 18;
/*  52:    */   }
/*  53:    */   
/*  54:    */   protected void a()
/*  55:    */   {
/*  56:134 */     this.u.c();
/*  57:    */   }
/*  58:    */   
/*  59:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  60:    */   {
/*  61:139 */     this.u.q.b(true);
/*  62:140 */     this.u.a(this.u.q, ((cwd)this.w.get(this.v.get(paramInt1))).toString(), this.b / 2, paramInt3 + 1, 16777215);
/*  63:141 */     this.u.q.b(bws.a(this.u).c().b());
/*  64:    */   }
/*  65:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwt
 * JD-Core Version:    0.7.0.1
 */