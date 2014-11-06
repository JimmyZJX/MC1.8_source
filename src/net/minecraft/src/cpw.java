package net.minecraft.src;
/*  1:   */ public class cpw
/*  2:   */   extends cpu<adv>
/*  3:   */ {
/*  4:   */   public cpw(cpt paramcpt)
/*  5:   */   {
/*  6:20 */     super(paramcpt);
/*  7:21 */     this.c = 0.5F;
/*  8:   */   }
/*  9:   */   
/* 10:   */   public void a(adv paramadv, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 11:   */   {
/* 12:26 */     if (paramadv.l() == null) {
/* 13:27 */       return;
/* 14:   */     }
/* 15:30 */     a(cua.g);
/* 16:   */     
/* 17:   */ 
/* 18:33 */     Block localbec = paramadv.l();
/* 19:34 */     ProtoBlock localatr = localbec.getProto();
/* 20:   */     
/* 21:36 */     BlockPosition localdt = new BlockPosition(paramadv);
/* 22:37 */     World localaqu = paramadv.j();
/* 23:38 */     if ((localbec == localaqu.getBlock(localdt)) || (localatr.b() == -1)) {
/* 24:39 */       return;
/* 25:   */     }
/* 26:42 */     if (localatr.b() != 3) {
/* 27:43 */       return;
/* 28:   */     }
/* 29:46 */     cjm.glPushMatrix();
/* 30:47 */     cjm.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 31:   */     
/* 32:49 */     cjm.disableLighting();
/* 33:   */     
/* 34:51 */     ckx localckx = ckx.getInstance();
/* 35:52 */     VertexBuffer localciv = localckx.getBuffer();
/* 36:   */     
/* 37:54 */     localciv.begin();
/* 38:55 */     localciv.setFormat(cuq.a);
/* 39:56 */     int i = localdt.getX();
/* 40:57 */     int j = localdt.getY();
/* 41:58 */     int k = localdt.getZ();
/* 42:59 */     localciv.c(-i - 0.5F, -j, -k - 0.5F);
/* 43:   */     
/* 44:61 */     cll localcll = bsu.z().ab();
/* 45:62 */     cxe localcxe = localcll.a(localbec, localaqu, null);
/* 46:63 */     localcll.b().a(localaqu, localcxe, localbec, localdt, localciv, false);
/* 47:64 */     localciv.c(0.0D, 0.0D, 0.0D);
/* 48:65 */     localckx.draw();
/* 49:66 */     cjm.enableLighting();
/* 50:67 */     cjm.glPopMatrix();
/* 51:   */     
/* 52:69 */     super.a(paramadv, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 53:   */   }
/* 54:   */   
/* 55:   */   protected oa a(adv paramadv)
/* 56:   */   {
/* 57:74 */     return cua.g;
/* 58:   */   }
/* 59:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cpw
 * JD-Core Version:    0.7.0.1
 */