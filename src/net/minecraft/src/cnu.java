package net.minecraft.src;
/*  1:   */ public class cnu
/*  2:   */   extends cnp<bdv>
/*  3:   */ {
/*  4:24 */   private final cll c = bsu.z().ab();
/*  5:   */   
/*  6:   */   public void a(bdv parambdv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  7:   */   {
/*  8:28 */     BlockPosition localdt = parambdv.v();
/*  9:29 */     Block localbec1 = parambdv.b();
/* 10:30 */     ProtoBlock localatr = localbec1.getProto();
/* 11:31 */     if ((localatr.getMaterial() == Material.air) || (parambdv.a(paramFloat) >= 1.0F)) {
/* 12:32 */       return;
/* 13:   */     }
/* 14:35 */     ckx localckx = ckx.getInstance();
/* 15:36 */     VertexBuffer localciv = localckx.getBuffer();
/* 16:   */     
/* 17:38 */     a(cua.g);
/* 18:   */     
/* 19:40 */     bss.a();
/* 20:   */     
/* 21:42 */     cjm.glBlendFunc(770, 771);
/* 22:43 */     cjm.enableBlend();
/* 23:44 */     cjm.p();
/* 24:45 */     if (bsu.w()) {
/* 25:46 */       cjm.j(7425);
/* 26:   */     } else {
/* 27:48 */       cjm.j(7424);
/* 28:   */     }
/* 29:51 */     localciv.begin();
/* 30:52 */     localciv.setFormat(cuq.a);
/* 31:53 */     localciv.c((float)paramDouble1 - localdt.getX() + parambdv.b(paramFloat), (float)paramDouble2 - localdt.getY() + parambdv.c(paramFloat), (float)paramDouble3 - localdt.getZ() + parambdv.d(paramFloat));
/* 32:54 */     localciv.setColor(1.0F, 1.0F, 1.0F);
/* 33:55 */     World localaqu = a();
/* 34:56 */     if ((localatr == BlockList.K) && (parambdv.a(paramFloat) < 0.5F))
/* 35:   */     {
/* 36:58 */       localbec1 = localbec1.a(bds.M, Boolean.valueOf(true));
/* 37:59 */       this.c.b().a(localaqu, this.c.a(localbec1, localaqu, localdt), localbec1, localdt, localciv, true);
/* 38:   */     }
/* 39:60 */     else if ((parambdv.g()) && (!parambdv.d()))
/* 40:   */     {
/* 41:62 */       bdu localbdu = localatr == BlockList.F ? bdu.b : bdu.a;
/* 42:63 */       Block localbec2 = BlockList.K.instance().a(bds.b, localbdu).a(bds.a, localbec1.getProperty(bdq.a));
/* 43:64 */       localbec2 = localbec2.a(bds.M, Boolean.valueOf(parambdv.a(paramFloat) >= 0.5F));
/* 44:65 */       this.c.b().a(localaqu, this.c.a(localbec2, localaqu, localdt), localbec2, localdt, localciv, true);
/* 45:   */       
/* 46:   */ 
/* 47:68 */       localciv.c((float)paramDouble1 - localdt.getX(), (float)paramDouble2 - localdt.getY(), (float)paramDouble3 - localdt.getZ());
/* 48:69 */       localbec1.a(bdq.b, Boolean.valueOf(true));
/* 49:70 */       this.c.b().a(localaqu, this.c.a(localbec1, localaqu, localdt), localbec1, localdt, localciv, true);
/* 50:   */     }
/* 51:   */     else
/* 52:   */     {
/* 53:72 */       this.c.b().a(localaqu, this.c.a(localbec1, localaqu, localdt), localbec1, localdt, localciv, false);
/* 54:   */     }
/* 55:74 */     localciv.c(0.0D, 0.0D, 0.0D);
/* 56:75 */     localckx.draw();
/* 57:   */     
/* 58:77 */     bss.b();
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnu
 * JD-Core Version:    0.7.0.1
 */