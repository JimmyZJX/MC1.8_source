package net.minecraft.src;
/*   1:    */ public enum btr
/*   2:    */ { a("options.invertMouse",false,true),
				b("options.sensitivity",true,false),
				c("options.fov",true,false,30.0f,110.0f,1.0f),
				d("options.gamma",true,false),
				e("options.saturation",true,false),
				f("options.renderDistance",true,false,2.0f,16.0f,1.0f),
				g("options.viewBobbing",false,true),
				h("options.anaglyph",false,true),
				i("options.framerateLimit",true,false,10.0f,260.0f,10.0f),
				j("options.fboEnable",false,true),
				k("options.renderClouds",false,true),
				l("options.graphics",false,false),
				m("options.ao",false,false),
				n("options.guiScale",false,false),
				o("options.particles",false,false),
				p("options.chat.visibility",false,false),
				q("options.chat.color",false,true),
				r("options.chat.links",false,true),
				s("options.chat.opacity",true,false),
				t("options.chat.links.prompt",false,true),
				u("options.snooper",false,true),
				v("options.fullscreen",false,true),
				w("options.vsync",false,true),
				x("options.vbo",false,true),
				y("options.touchscreen",false,true),
				z("options.chat.scale",true,false),
				A("options.chat.width",true,false),
				B("options.chat.height.focused",true,false),
				C("options.chat.height.unfocused",true,false),
				D("options.mipmapLevels",true,false,0.0f,4.0f,1.0f),
				E("options.forceUnicodeFont",false,true),
				F("options.stream.bytesPerPixel",true,false),
				G("options.stream.micVolumne",true,false),
				H("options.stream.systemVolume",true,false),
				I("options.stream.kbps",true,false),
				J("options.stream.fps",true,false),
				K("options.stream.compression",false,false),
				L("options.stream.sendMetadata",false,true),
				M("options.stream.chat.enabled",false,false),
				N("options.stream.chat.userFilter",false,false),
				O("options.stream.micToggleBehavior",false,false),
				P("options.blockAlternatives",false,true),
				Q("options.reducedDebugInfo",false,true);
/*   3:    */   private final boolean R;
/*   4:    */   private final boolean S;
/*   5:    */   private final String T;
/*   6:    */   private final float U;
/*   7:    */   private float V;
/*   8:    */   private float W;
/*   9:    */   
/*  10:    */   public static btr a(int paramInt)
/*  11:    */   {
/*  12:138 */     for (btr localbtr : values()) {
/*  13:139 */       if (localbtr.c() == paramInt) {
/*  14:140 */         return localbtr;
/*  15:    */       }
/*  16:    */     }
/*  17:143 */     return null;
/*  18:    */   }
/*  19:    */   
/*  20:    */   private btr(String paramString, boolean paramBoolean1, boolean paramBoolean2)
/*  21:    */   {
/*  22:147 */     this(paramString, paramBoolean1, paramBoolean2, 0.0F, 1.0F, 0.0F);
/*  23:    */   }
/*  24:    */   
/*  25:    */   private btr(String paramString, boolean paramBoolean1, boolean paramBoolean2, float paramFloat1, float paramFloat2, float paramFloat3)
/*  26:    */   {
/*  27:151 */     this.T = paramString;
/*  28:152 */     this.R = paramBoolean1;
/*  29:153 */     this.S = paramBoolean2;
/*  30:154 */     this.V = paramFloat1;
/*  31:155 */     this.W = paramFloat2;
/*  32:156 */     this.U = paramFloat3;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public boolean a()
/*  36:    */   {
/*  37:160 */     return this.R;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean b()
/*  41:    */   {
/*  42:164 */     return this.S;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public int c()
/*  46:    */   {
/*  47:168 */     return ordinal();
/*  48:    */   }
/*  49:    */   
/*  50:    */   public String d()
/*  51:    */   {
/*  52:172 */     return this.T;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public float f()
/*  56:    */   {
/*  57:180 */     return this.W;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void a(float paramFloat)
/*  61:    */   {
/*  62:188 */     this.W = paramFloat;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public float c(float paramFloat)
/*  66:    */   {
/*  67:196 */     return MathUtils.clamp((e(paramFloat) - this.V) / (this.W - this.V), 0.0F, 1.0F);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public float d(float paramFloat)
/*  71:    */   {
/*  72:200 */     return e(this.V + (this.W - this.V) * MathUtils.clamp(paramFloat, 0.0F, 1.0F));
/*  73:    */   }
/*  74:    */   
/*  75:    */   public float e(float paramFloat)
/*  76:    */   {
/*  77:204 */     paramFloat = f(paramFloat);
/*  78:205 */     return MathUtils.clamp(paramFloat, this.V, this.W);
/*  79:    */   }
/*  80:    */   
/*  81:    */   protected float f(float paramFloat)
/*  82:    */   {
/*  83:209 */     if (this.U > 0.0F) {
/*  84:210 */       paramFloat = this.U * Math.round(paramFloat / this.U);
/*  85:    */     }
/*  86:212 */     return paramFloat;
/*  87:    */   }
				static float a(btr arg0) {return arg0.W;}
				static float b(btr arg0) {return arg0.V;}
/*  88:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     btr
 * JD-Core Version:    0.7.0.1
 */