package net.minecraft.src;
/*   2:    */ import java.util.List;
/*   3:    */ import org.lwjgl.input.Keyboard;
/*   4:    */ 
/*   5:    */ public class bwg
/*   6:    */   extends bxf
/*   7:    */ {
/*   8: 22 */   private static final List<bwh> f = null; //BROKEN
/*   9:    */   private bwi g;
/*  10:    */   private bug h;
/*  11:    */   private bul i;
/*  12:    */   private bwj r;
/*  13: 28 */   protected String a = "Customize World Presets";
/*  14:    */   private String s;
/*  15:    */   private String t;
/*  16:    */   
/*  17:    */   static
/*  18:    */   {
/*  19: 36 */     bgn localbgn = bgn.a("{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }");
/*  20: 37 */     oa localoa = new oa("textures/gui/presets/water.png");
/*  21: 38 */     f.add(new bwh(cwc.a("createWorld.customize.custom.preset.waterWorld", new Object[0]), localoa, localbgn));
/*  22:    */     
/*  23: 40 */     localbgn = bgn.a("{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
/*  24: 41 */     localoa = new oa("textures/gui/presets/isles.png");
/*  25: 42 */     f.add(new bwh(cwc.a("createWorld.customize.custom.preset.isleLand", new Object[0]), localoa, localbgn));
/*  26:    */     
/*  27: 44 */     localbgn = bgn.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
/*  28: 45 */     localoa = new oa("textures/gui/presets/delight.png");
/*  29: 46 */     f.add(new bwh(cwc.a("createWorld.customize.custom.preset.caveDelight", new Object[0]), localoa, localbgn));
/*  30:    */     
/*  31: 48 */     localbgn = bgn.a("{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
/*  32: 49 */     localoa = new oa("textures/gui/presets/madness.png");
/*  33: 50 */     f.add(new bwh(cwc.a("createWorld.customize.custom.preset.mountains", new Object[0]), localoa, localbgn));
/*  34:    */     
/*  35: 52 */     localbgn = bgn.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }");
/*  36: 53 */     localoa = new oa("textures/gui/presets/drought.png");
/*  37: 54 */     f.add(new bwh(cwc.a("createWorld.customize.custom.preset.drought", new Object[0]), localoa, localbgn));
/*  38:    */     
/*  39: 56 */     localbgn = bgn.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }");
/*  40: 57 */     localoa = new oa("textures/gui/presets/chaos.png");
/*  41: 58 */     f.add(new bwh(cwc.a("createWorld.customize.custom.preset.caveChaos", new Object[0]), localoa, localbgn));
/*  42:    */     
/*  43: 60 */     localbgn = bgn.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }");
/*  44: 61 */     localoa = new oa("textures/gui/presets/luck.png");
/*  45: 62 */     f.add(new bwh(cwc.a("createWorld.customize.custom.preset.goodLuck", new Object[0]), localoa, localbgn));
/*  46:    */   }
/*  47:    */   
/*  48:    */   public bwg(bwj parambwj)
/*  49:    */   {
/*  50: 66 */     this.r = parambwj;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void b()
/*  54:    */   {
/*  55: 71 */     this.n.clear();
/*  56: 72 */     Keyboard.enableRepeatEvents(true);
/*  57:    */     
/*  58: 74 */     this.a = cwc.a("createWorld.customize.custom.presets.title", new Object[0]);
/*  59: 75 */     this.s = cwc.a("createWorld.customize.presets.share", new Object[0]);
/*  60: 76 */     this.t = cwc.a("createWorld.customize.presets.list", new Object[0]);
/*  61: 77 */     this.i = new bul(2, this.q, 50, 40, this.l - 100, 20);
/*  62: 78 */     this.g = new bwi(this);
/*  63:    */     
/*  64: 80 */     this.i.f(2000);
/*  65: 81 */     this.i.a(this.r.a());
/*  66:    */     
/*  67: 83 */     this.n.add(this.h = new bug(0, this.l / 2 - 102, this.m - 27, 100, 20, cwc.a("createWorld.customize.presets.select", new Object[0])));
/*  68: 84 */     this.n.add(new bug(1, this.l / 2 + 3, this.m - 27, 100, 20, cwc.a("gui.cancel", new Object[0])));
/*  69:    */     
/*  70: 86 */     a();
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void k()
/*  74:    */   {
/*  75: 91 */     super.k();
/*  76: 92 */     this.g.p();
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void m()
/*  80:    */   {
/*  81: 97 */     Keyboard.enableRepeatEvents(false);
/*  82:    */   }
/*  83:    */   
/*  84:    */   protected void a(int paramInt1, int paramInt2, int paramInt3)
/*  85:    */   {
/*  86:102 */     this.i.a(paramInt1, paramInt2, paramInt3);
/*  87:103 */     super.a(paramInt1, paramInt2, paramInt3);
/*  88:    */   }
/*  89:    */   
/*  90:    */   protected void a(char paramChar, int paramInt)
/*  91:    */   {
/*  92:108 */     if (!this.i.a(paramChar, paramInt)) {
/*  93:109 */       super.a(paramChar, paramInt);
/*  94:    */     }
/*  95:    */   }
/*  96:    */   
/*  97:    */   protected void a(bug parambug)
/*  98:    */   {
/*  99:115 */     switch (parambug.k)
/* 100:    */     {
/* 101:    */     case 0: 
/* 102:117 */       this.r.a(this.i.b());
/* 103:118 */       this.j.a(this.r);
/* 104:119 */       break;
/* 105:    */     case 1: 
/* 106:121 */       this.j.a(this.r);
/* 107:    */     }
/* 108:    */   }
/* 109:    */   
/* 110:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/* 111:    */   {
/* 112:128 */     c();
/* 113:    */     
/* 114:130 */     this.g.a(paramInt1, paramInt2, paramFloat);
/* 115:131 */     a(this.q, this.a, this.l / 2, 8, 16777215);
/* 116:132 */     c(this.q, this.s, 50, 30, 10526880);
/* 117:133 */     c(this.q, this.t, 50, 70, 10526880);
/* 118:    */     
/* 119:135 */     this.i.g();
/* 120:136 */     super.a(paramInt1, paramInt2, paramFloat);
/* 121:    */   }
/* 122:    */   
/* 123:    */   public void e()
/* 124:    */   {
/* 125:141 */     this.i.a();
/* 126:142 */     super.e();
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void a()
/* 130:    */   {
/* 131:146 */     this.h.l = g();
/* 132:    */   }
/* 133:    */   
/* 134:    */   private boolean g()
/* 135:    */   {
/* 136:150 */     return ((this.g.u > -1) && (this.g.u < f.size())) || (this.i.b().length() > 1);
/* 137:    */   }
				static List<bwh> f() {return f;}
				static bwi a(bwg arg0) {return arg0.g;}
				static bul b(bwg arg0) {return arg0.i;}
				static void a(bwg arg0, int arg1, int arg2, int arg3, int arg4) {arg0.a(arg1,arg2,arg3,arg4);}
				static void b(bwg arg0, int arg1, int arg2, int arg3, int arg4) {arg0.a(arg1,arg2,arg3,arg4);}
				static void c(bwg arg0, int arg1, int arg2, int arg3, int arg4) {arg0.b(arg1,arg2,arg3,arg4);}
				static void d(bwg arg0, int arg1, int arg2, int arg3, int arg4) {arg0.b(arg1,arg2,arg3,arg4);}
/* 138:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwg
 * JD-Core Version:    0.7.0.1
 */