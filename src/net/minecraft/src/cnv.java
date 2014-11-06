package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import org.lwjgl.opengl.GL11;
/*   3:    */ 
/*   4:    */ public class cnv
/*   5:    */   extends cnp<bdj>
/*   6:    */ {
/*   7: 19 */   private static final oa c = new oa("textures/entity/sign.png");
/*   8: 22 */   private final ccz d = new ccz();
/*   9:    */   
/*  10:    */   public void a(bdj parambdj, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  11:    */   {
/*  12: 26 */     ProtoBlock localatr = parambdj.w();
/*  13:    */     
/*  14: 28 */     cjm.glPushMatrix();
/*  15: 29 */     float f1 = 0.6666667F;
/*  16: 30 */     if (localatr == BlockList.an)
/*  17:    */     {
/*  18: 31 */       cjm.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F * f1, (float)paramDouble3 + 0.5F);
/*  19: 32 */       float f2 = parambdj.u() * 360 / 16.0F;
/*  20: 33 */       cjm.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
/*  21: 34 */       this.d.b.j = true;
/*  22:    */     }
/*  23:    */     else
/*  24:    */     {
/*  25: 36 */       int i = parambdj.u();
/*  26: 37 */       float f3 = 0.0F;
/*  27: 39 */       if (i == 2) {
/*  28: 40 */         f3 = 180.0F;
/*  29:    */       }
/*  30: 42 */       if (i == 4) {
/*  31: 43 */         f3 = 90.0F;
/*  32:    */       }
/*  33: 45 */       if (i == 5) {
/*  34: 46 */         f3 = -90.0F;
/*  35:    */       }
/*  36: 49 */       cjm.glTranslatef((float)paramDouble1 + 0.5F, (float)paramDouble2 + 0.75F * f1, (float)paramDouble3 + 0.5F);
/*  37: 50 */       cjm.glRotatef(-f3, 0.0F, 1.0F, 0.0F);
/*  38: 51 */       cjm.glTranslatef(0.0F, -0.3125F, -0.4375F);
/*  39:    */       
/*  40: 53 */       this.d.b.j = false;
/*  41:    */     }
/*  42: 56 */     if (paramInt >= 0)
/*  43:    */     {
/*  44: 57 */       a(a[paramInt]);
/*  45: 58 */       cjm.glMatrixMode(5890);
/*  46: 59 */       cjm.glPushMatrix();
/*  47: 60 */       cjm.glScalef(4.0F, 2.0F, 1.0F);
/*  48: 61 */       cjm.glTranslatef(0.0625F, 0.0625F, 0.0625F);
/*  49: 62 */       cjm.glMatrixMode(5888);
/*  50:    */     }
/*  51:    */     else
/*  52:    */     {
/*  53: 64 */       a(c);
/*  54:    */     }
/*  55: 67 */     cjm.B();
/*  56: 68 */     cjm.glPushMatrix();
/*  57: 69 */     cjm.glScalef(f1, -f1, -f1);
/*  58: 70 */     this.d.a();
/*  59: 71 */     cjm.glPopMatrix();
/*  60: 72 */     bty localbty = b();
/*  61:    */     
/*  62: 74 */     float f3 = 0.015625F * f1;
/*  63: 75 */     cjm.glTranslatef(0.0F, 0.5F * f1, 0.07F * f1);
/*  64: 76 */     cjm.glScalef(f3, -f3, f3);
/*  65: 77 */     GL11.glNormal3f(0.0F, 0.0F, -1.0F * f3);
/*  66: 78 */     cjm.a(false);
/*  67:    */     
/*  68: 80 */     int j = 0;
/*  69: 81 */     if (paramInt < 0) {
/*  70: 82 */       for (int k = 0; k < parambdj.a.length; k++) {
/*  71: 83 */         if (parambdj.a[k] != null)
/*  72:    */         {
/*  73: 87 */           ho localho = parambdj.a[k];
/*  74: 88 */           List localList = bui.a(localho, 90, localbty, false, true);
/*  75: 89 */           String str = (localList != null) && (localList.size() > 0) ? ((ho)localList.get(0)).d() : "";
/*  76: 90 */           if (k == parambdj.f)
/*  77:    */           {
/*  78: 91 */             str = "> " + str + " <";
/*  79: 92 */             localbty.a(str, -localbty.a(str) / 2, k * 10 - parambdj.a.length * 5, j);
/*  80:    */           }
/*  81:    */           else
/*  82:    */           {
/*  83: 94 */             localbty.a(str, -localbty.a(str) / 2, k * 10 - parambdj.a.length * 5, j);
/*  84:    */           }
/*  85:    */         }
/*  86:    */       }
/*  87:    */     }
/*  88: 98 */     cjm.a(true);
/*  89: 99 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  90:100 */     cjm.glPopMatrix();
/*  91:102 */     if (paramInt >= 0)
/*  92:    */     {
/*  93:103 */       cjm.glMatrixMode(5890);
/*  94:104 */       cjm.glPopMatrix();
/*  95:105 */       cjm.glMatrixMode(5888);
/*  96:    */     }
/*  97:    */   }
/*  98:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnv
 * JD-Core Version:    0.7.0.1
 */